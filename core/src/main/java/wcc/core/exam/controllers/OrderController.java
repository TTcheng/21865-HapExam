package wcc.core.exam.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import wcc.core.exam.dto.OmOrderHeaders;
import wcc.core.exam.dto.OmOrderLines;
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

    /**
     * 查询订单汇总信息
     *
     * @param vo       请求参数
     * @param page     第几页
     * @param pagesize 页长
     * @return com.hand.hap.system.dto.ResponseData
     * @author WangChuncheng
     * @date 2019/1/4 16:32
     **/
    @RequestMapping("/querySummary")
    @ResponseBody
    public ResponseData querySummary(OrderSummaryVO vo, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                                     @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        List vos = orderService.selectSummary(requestContext, vo, page, pagesize);
        if (vos.size() == 0 || vos.get(0) == null) return new ResponseData();
        return new ResponseData(vos);
    }

    /**
     * 查询订单详细信息，包括订单行信息及相应的物料信息
     *
     * @param vo       请求参数
     * @param page     页数
     * @param pagesize 页长
     * @param request  请求
     * @return com.hand.hap.system.dto.ResponseData
     * @author WangChuncheng
     * @date 2019/1/4 16:33
     **/
    @ResponseBody
    @RequestMapping("/queryDetail")
    public ResponseData queryDetail(OrderDetailVo vo, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                                    @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pagesize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        List vos = orderService.getDetail(requestContext, vo, page, pagesize);
        if (vos.size() == 0 || vos.get(0) == null) return new ResponseData();
        return new ResponseData(vos);
    }

    /**
     * 保存一个订单的全部信息，包括订单头以及它的行信息
     *
     * @param header  订单头
     * @param lines   订单行
     * @param request 请求信息
     * @return com.hand.hap.system.dto.ResponseData
     * @author WangChuncheng
     * @date 2019/1/4 16:31
     **/
    @ResponseBody
    @RequestMapping("/save")
    public ResponseData save(OmOrderHeaders header, List<OmOrderLines> lines, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(orderService.save(header, lines, requestContext));
    }
}
