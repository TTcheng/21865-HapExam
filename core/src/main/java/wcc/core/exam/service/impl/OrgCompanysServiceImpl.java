package wcc.core.exam.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import wcc.core.exam.dto.OrgCompanys;
import wcc.core.exam.service.IOrgCompanysService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class OrgCompanysServiceImpl extends BaseServiceImpl<OrgCompanys> implements IOrgCompanysService{

}