package wcc.core.exam.controllers;

import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import wcc.core.exam.dto.OrderSummaryVO;
import wcc.core.exam.service.OrderSummaryService;

import java.util.List;

/**
 * Copyright @ 2000 Shanghai Hand Co. Ltd.
 * All right reserved.
 *
 * @author chuncehng.wang@hand-china.com
 * @version 1.0
 * @name OrderSummaryController
 * @description 订单汇总信息控制器
 * @date 2019/1/1
 */
@RequestMapping(value = "/order")
@Controller
public class OrderSummaryController extends BaseController {

    @Autowired
    private OrderSummaryService orderSummaryService;

    @RequestMapping("/querySummary")
    @ResponseBody
    public ResponseData querySummary(OrderSummaryVO vo, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                                     @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize) {
        List vos = orderSummaryService.selectConditionally(vo, page, pagesize);
        return new ResponseData(vos);
    }
}
