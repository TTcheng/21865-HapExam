package wcc.core.exam.mapper;

import com.hand.hap.mybatis.common.Mapper;
import wcc.core.exam.dto.ArCustomers;

import java.util.List;

public interface ArCustomersMapper extends Mapper<ArCustomers>{
    @Override
    List<ArCustomers> select(ArCustomers record);
}