package wcc.core.exam.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import wcc.core.exam.dto.OmOrderLines;
import wcc.core.exam.service.IOmOrderLinesService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class OmOrderLinesServiceImpl extends BaseServiceImpl<OmOrderLines> implements IOmOrderLinesService{

}