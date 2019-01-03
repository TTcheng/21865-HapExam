package wcc.core.exam.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import wcc.core.exam.dto.OrderDetailVo;
import wcc.core.exam.dto.OrderSummaryVO;
import wcc.core.exam.service.OrderService;

import javax.servlet.http.HttpServletRequest;
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
public class OrderController extends BaseController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/querySummary")
    @ResponseBody
    public ResponseData querySummary(OrderSummaryVO vo, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                                     @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize) {
        List vos = orderService.selectSummary(vo, page, pagesize);
        if (vos.size() == 0 || vos.get(0) == null) return new ResponseData();
        return new ResponseData(vos);
    }

    @ResponseBody
    @RequestMapping("/queryDetail")
    public ResponseData queryDetail(OrderDetailVo vo, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                                    @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        List vos = orderService.getDetail(requestContext, vo, page, pagesize);
        if (vos.size() == 0 || vos.get(0) == null) return new ResponseData();
        return new ResponseData(vos);
    }
}
