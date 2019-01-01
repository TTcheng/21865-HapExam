package wcc.core.exam.mapper;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.impl.RequestHelper;
import com.hand.hap.core.impl.ServiceRequest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import wcc.core.exam.dto.OrderSummaryVO;

import java.util.List;

/**
 * Copyright @ 2000 Shanghai Hand Co. Ltd.
 * All right reserved.
 *
 * @author chuncehng.wang@hand-china.com
 * @version 1.0
 * @name OrderSummaryVoMapperTest
 * @date 2018/12/31
 */
@ContextConfiguration(locations = {"classpath:/spring/applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Rollback
@Transactional
public class OrderSummaryVoMapperTest {

    @Autowired
    OrderSummaryVoMapper voMapper;

    OrderSummaryVO orderSummaryVO;

    IRequest request;

    @Before
    public void setUp() {
        request = new ServiceRequest();
        request.setLocale("zh_CN");
        RequestHelper.setCurrentRequest(request);

        orderSummaryVO = new OrderSummaryVO();
//        orderSummaryVO.setCompanyId(101L);
    }

    @Test
    public void testSelectConditionally() throws Exception {
        List<OrderSummaryVO> orderSummaryVos  = voMapper.selectConditionally(orderSummaryVO);
        for (OrderSummaryVO orderSummaryVo : orderSummaryVos) {
            System.out.println(orderSummaryVo);
        }
    }

    @After
    public void tearDown() {

    }
}

