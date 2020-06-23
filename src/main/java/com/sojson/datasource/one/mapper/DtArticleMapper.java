package com.sojson.datasource.one.mapper;

import com.sojson.datasource.common.model.DtArticle;
import com.sojson.datasource.common.model.DtArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface DtArticleMapper {
    long countByExample(DtArticleExample example);

    int deleteByExample(DtArticleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DtArticle record);

    int insertSelective(DtArticle record);

    List<DtArticle> selectByExampleWithBLOBs(DtArticleExample example);

    List<DtArticle> selectByExample(DtArticleExample example);

    DtArticle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DtArticle record, @Param("example") DtArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") DtArticle record, @Param("example") DtArticleExample example);

    int updateByExample(@Param("record") DtArticle record, @Param("example") DtArticleExample example);

    int updateByPrimaryKeySelective(DtArticle record);

    int updateByPrimaryKeyWithBLOBs(DtArticle record);

    int updateByPrimaryKey(DtArticle record);
}