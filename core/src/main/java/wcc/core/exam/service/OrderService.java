package wcc.core.exam.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import wcc.core.exam.dto.OmOrderLines;
import wcc.core.exam.dto.OrderDetailVo;
import wcc.core.exam.dto.OrderSummaryVO;

import java.util.List;

/**
 * Copyright @ 2000 Shanghai Hand Co. Ltd.
 * All right reserved.
 *
 * @author chuncehng.wang@hand-china.com
 * @version 1.0
 * @name OrderService
 * @date 2019/1/1
 */
public interface OrderService extends IBaseService<OrderSummaryVO>, ProxySelf<OrderService> {
    List<OrderSummaryVO> selectSummary(OrderSummaryVO orderSummaryVO, int page, int pagesize);

    List<OrderDetailVo> getDetail(IRequest request, OmOrderLines vo, int page, int pagesize);
}
