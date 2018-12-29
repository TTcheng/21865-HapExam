package wcc.core.exam.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import wcc.core.exam.dto.ArCustomers;
import wcc.core.exam.service.IArCustomersService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class ArCustomersServiceImpl extends BaseServiceImpl<ArCustomers> implements IArCustomersService{

}