package com.sojson.datasource.two.mapper;

import com.sojson.datasource.common.model.WysAdminTable;
import com.sojson.datasource.common.model.WysAdminTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface WysAdminTableMapper {
    int countByExample(WysAdminTableExample example);

    int deleteByExample(WysAdminTableExample example);

    int insert(WysAdminTable record);

    int insertSelective(WysAdminTable record);

    List<WysAdminTable> selectByExample(WysAdminTableExample example);

    int updateByExampleSelective(@Param("record") WysAdminTable record, @Param("example") WysAdminTableExample example);

    int updateByExample(@Param("record") WysAdminTable record, @Param("example") WysAdminTableExample example);
}