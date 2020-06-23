package com.sojson.datasource.two.mapper;

import com.sojson.datasource.common.model.WysNews;
import com.sojson.datasource.common.model.WysNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface WysNewsMapper {
    int countByExample(WysNewsExample example);

    int deleteByExample(WysNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WysNews record);

    int insertSelective(WysNews record);

    List<WysNews> selectByExampleWithBLOBs(WysNewsExample example);

    List<WysNews> selectByExample(WysNewsExample example);

    WysNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WysNews record, @Param("example") WysNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") WysNews record, @Param("example") WysNewsExample example);

    int updateByExample(@Param("record") WysNews record, @Param("example") WysNewsExample example);

    int updateByPrimaryKeySelective(WysNews record);

    int updateByPrimaryKeyWithBLOBs(WysNews record);

    int updateByPrimaryKey(WysNews record);
}