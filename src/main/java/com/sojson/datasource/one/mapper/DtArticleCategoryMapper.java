package com.sojson.datasource.one.mapper;

import com.sojson.datasource.common.model.DtArticleCategory;
import com.sojson.datasource.common.model.DtArticleCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface DtArticleCategoryMapper {
    long countByExample(DtArticleCategoryExample example);

    int deleteByExample(DtArticleCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DtArticleCategory record);

    int insertSelective(DtArticleCategory record);

    List<DtArticleCategory> selectByExampleWithBLOBs(DtArticleCategoryExample example);

    List<DtArticleCategory> selectByExample(DtArticleCategoryExample example);

    DtArticleCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DtArticleCategory record, @Param("example") DtArticleCategoryExample example);

    int updateByExampleWithBLOBs(@Param("record") DtArticleCategory record, @Param("example") DtArticleCategoryExample example);

    int updateByExample(@Param("record") DtArticleCategory record, @Param("example") DtArticleCategoryExample example);

    int updateByPrimaryKeySelective(DtArticleCategory record);

    int updateByPrimaryKeyWithBLOBs(DtArticleCategory record);

    int updateByPrimaryKey(DtArticleCategory record);
}