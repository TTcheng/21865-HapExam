package wcc.core.exam.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wcc.core.exam.dto.OrderSummaryVO;
import wcc.core.exam.mapper.OrderSummaryVoMapper;
import wcc.core.exam.service.OrderSummaryService;

import java.util.List;

/**
 * Copyright @ 2000 Shanghai Hand Co. Ltd.
 * All right reserved.
 *
 * @author chuncehng.wang@hand-china.com
 * @version 1.0
 * @name OrderSummaryServiceImpl
 * @date 2019/1/1
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class OrderSummaryServiceImpl extends BaseServiceImpl<OrderSummaryVO> implements OrderSummaryService {
    /**
     * 条件查询订单汇总信息
     *
     * @param orderSummaryVO 订单汇总信息
     * @return java.util.List<wcc.core.exam.dto.OrderSummaryVO>
     * @author WangChuncheng
     * @date 2019/1/1 13:47
     **/
    @Override
    public List<OrderSummaryVO> selectConditionally(OrderSummaryVO orderSummaryVO, int page, int pagesize) {
        PageHelper.startPage(page, pagesize);
        return ((OrderSummaryVoMapper) this.mapper).selectConditionally(orderSummaryVO);
    }
}
