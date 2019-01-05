package wcc.core.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcc.core.exam.dto.*;
import wcc.core.exam.mapper.OrderSummaryVoMapper;
import wcc.core.exam.service.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright @ 2000 Shanghai Hand Co. Ltd.
 * All right reserved.
 *
 * @author chuncehng.wang@hand-china.com
 * @version 1.0
 * @name OrderServiceImpl
 * @date 2019/1/1
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class OrderServiceImpl extends BaseServiceImpl<OrderSummaryVO> implements OrderService {

    @Autowired
    IOmOrderHeadersService headersService;

    @Autowired
    IOmOrderLinesService orderLinesService;

    @Autowired
    IInvInventoryItemsService inventoryItemsService;

    @Autowired
    IOrgCompanysService companysService;

    @Autowired
    IArCustomersService customersService;

    /**
     * 条件查询订单汇总信息
     *
     * @param orderSummaryVO 订单汇总信息
     * @return java.util.List<wcc.core.exam.dto.OrderSummaryVO>
     * @author WangChuncheng
     * @date 2019/1/1 13:47
     **/
    @Override
    public List<OrderSummaryVO> selectSummary(IRequest request,OrderSummaryVO orderSummaryVO, int page, int pagesize) {
        PageHelper.startPage(page, pagesize);
        List<OrderSummaryVO> vos = ((OrderSummaryVoMapper) this.mapper).selectConditionally(orderSummaryVO);
        for (OrderSummaryVO vo : vos) {
            OrgCompanys companysCondtion = new OrgCompanys();
            companysCondtion.setCompanyId(vo.getCompanyId());
            OrgCompanys company = companysService.selectByPrimaryKey(request,companysCondtion);
            if (company!=null){
                vo.setCompanyName(company.getCompanyName());
            }
            ArCustomers customersCondtion = new ArCustomers();
            customersCondtion.setCustomerId(vo.getCustomerId());
            ArCustomers customer = customersService.selectByPrimaryKey(request,customersCondtion);
            if (customer!=null){
                vo.setCustomerName(customer.getCustomerName());
            }
        }
        return vos;
    }

    @Override
    public List<OrderDetailVo> getDetail(IRequest request, OmOrderLines vo, int page, int pagesize) {
        List<OmOrderLines> lines = orderLinesService.select(request, vo, page, pagesize);
        List<OrderDetailVo> results = new ArrayList<>();
        for (OmOrderLines line : lines) {
            OrderDetailVo detailVo = new OrderDetailVo();
            detailVo.setSuperDto(line);
            InvInventoryItems condition = new InvInventoryItems();
            condition.setInventoryItemId(line.getInventoryItemId());
            List<InvInventoryItems> list = inventoryItemsService.select(request, condition, 1, 1);
            if (list.size() > 0) {
                InvInventoryItems item = list.get(0);
                if (item != null) {
                    detailVo.setItemCode(item.getItemCode());
                    detailVo.setItemDescription(item.getItemDescription());
                    detailVo.setItemUom(item.getItemUom());
                }
            }
            detailVo.setOrderPrice(detailVo.getOrderdQuantity() * detailVo.getUnitSellingPrice());
            results.add(detailVo);
        }
        return results;
    }

    @Override
    public boolean save(OmOrderHeaders header, List<OmOrderLines> lines, IRequest request) {
        headersService.insert(request, header);
        for (OmOrderLines line : lines) {
            orderLinesService.insert(request, line);
        }
        return true;
    }
}
