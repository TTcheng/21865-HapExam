package wcc.core.exam.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import wcc.core.exam.dto.InvInventoryItems;
import wcc.core.exam.service.IInvInventoryItemsService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class InvInventoryItemsServiceImpl extends BaseServiceImpl<InvInventoryItems> implements IInvInventoryItemsService{

}