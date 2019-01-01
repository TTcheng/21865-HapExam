package wcc.core.exam.mapper;

import com.hand.hap.mybatis.common.Mapper;
import wcc.core.exam.dto.OrderSummaryVO;

import java.util.List;

/**
 * Copyright @ 2000 Shanghai Hand Co. Ltd.
 * All right reserved.
 *
 * @author chuncehng.wang@hand-china.com
 * @version 1.0
 * @name OrderSummaryVoMapper
 * @description 订单汇总查询数据访问接口
 * @date 2018/12/31
 */
public interface OrderSummaryVoMapper extends Mapper<OrderSummaryVO> {

    /**
     * 条件查询订单汇总信息
     * @author WangChuncheng
     * @date 2018/12/31 18:42
     * @param orderSummary 订单汇总信息VO
     * @return java.util.List<wcc.core.exam.dto.OrderSummaryVO>
     **/
    List<OrderSummaryVO> selectConditionally(OrderSummaryVO orderSummary);
}
