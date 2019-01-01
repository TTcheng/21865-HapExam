package wcc.core.exam.service;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import wcc.core.exam.dto.OrderSummaryVO;

import java.util.List;

/**
 * Copyright @ 2000 Shanghai Hand Co. Ltd.
 * All right reserved.
 *
 * @author chuncehng.wang@hand-china.com
 * @version 1.0
 * @name OrderSummaryService
 * @date 2019/1/1
 */
public interface OrderSummaryService extends IBaseService<OrderSummaryVO>, ProxySelf<OrderSummaryService> {
    List<OrderSummaryVO> selectConditionally(OrderSummaryVO orderSummaryVO, int page, int pagesize);
}
