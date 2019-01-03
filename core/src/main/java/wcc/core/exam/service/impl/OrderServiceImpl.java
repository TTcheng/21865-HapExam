package wcc.core.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcc.core.exam.dto.*;
import wcc.core.exam.mapper.OrderSummaryVoMapper;
import wcc.core.exam.service.IInvInventoryItemsService;
import wcc.core.exam.service.IOmOrderLinesService;
import wcc.core.exam.service.OrderService;

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
    IOmOrderLinesService orderLinesService;

    @Autowired
    IInvInventoryItemsService inventoryItemsService;

    /**
     * 条件查询订单汇总信息
     *
     * @param orderSummaryVO 订单汇总信息
     * @return java.util.List<wcc.core.exam.dto.OrderSummaryVO>
     * @author WangChuncheng
     * @date 2019/1/1 13:47
     **/
    @Override
    public List<OrderSummaryVO> selectSummary(OrderSummaryVO orderSummaryVO, int page, int pagesize) {
        PageHelper.startPage(page, pagesize);
        return ((OrderSummaryVoMapper) this.mapper).selectConditionally(orderSummaryVO);
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
            List<InvInventoryItems> list = inventoryItemsService.select(request, condition, 0, 1);
            if (list.size() > 0) {
                InvInventoryItems item = list.get(0);
                assert item != null;
                detailVo.setItemCode(item.getItemCode());
                detailVo.setItemDescription(item.getItemDescription());
                detailVo.setItemUom(item.getItemUom());
            }
            detailVo.setOrderPrice(detailVo.getOrderdQuantity() * detailVo.getUnitSellingPrice());
            results.add(detailVo);
        }
        return results;
    }
}
