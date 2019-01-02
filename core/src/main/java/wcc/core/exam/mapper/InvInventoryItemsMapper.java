package wcc.core.exam.mapper;

import com.hand.hap.mybatis.common.Mapper;
import wcc.core.exam.dto.InvInventoryItems;

import java.util.List;

public interface InvInventoryItemsMapper extends Mapper<InvInventoryItems>{
    @Override
    List<InvInventoryItems> select(InvInventoryItems record);
}