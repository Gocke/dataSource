package com.sojson.datasource.two.mapper;

import com.sojson.datasource.common.model.WysColumn;
import com.sojson.datasource.common.model.WysColumnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface WysColumnMapper {
    int countByExample(WysColumnExample example);

    int deleteByExample(WysColumnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WysColumn record);

    int insertSelective(WysColumn record);

    List<WysColumn> selectByExampleWithBLOBs(WysColumnExample example);

    List<WysColumn> selectByExample(WysColumnExample example);

    WysColumn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WysColumn record, @Param("example") WysColumnExample example);

    int updateByExampleWithBLOBs(@Param("record") WysColumn record, @Param("example") WysColumnExample example);

    int updateByExample(@Param("record") WysColumn record, @Param("example") WysColumnExample example);

    int updateByPrimaryKeySelective(WysColumn record);

    int updateByPrimaryKeyWithBLOBs(WysColumn record);

    int updateByPrimaryKey(WysColumn record);
}