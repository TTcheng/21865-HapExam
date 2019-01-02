package wcc.core.exam.mapper;

import com.hand.hap.mybatis.common.Mapper;
import wcc.core.exam.dto.OrgCompanys;

import java.util.List;

public interface OrgCompanysMapper extends Mapper<OrgCompanys>{
    @Override
    List<OrgCompanys> select(OrgCompanys record);
}