package wcc.core.exam.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import wcc.core.exam.dto.OmOrderHeaders;
import wcc.core.exam.service.IOmOrderHeadersService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class OmOrderHeadersServiceImpl extends BaseServiceImpl<OmOrderHeaders> implements IOmOrderHeadersService{

}