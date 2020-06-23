package com.sojson.datasource.web.controller;


import com.sojson.datasource.common.model.*;
import com.sojson.datasource.one.mapper.DtArticleCategoryMapper;
import com.sojson.datasource.one.mapper.DtArticleMapper;
import com.sojson.datasource.one.mapper.UserMapper;
import com.sojson.datasource.two.mapper.WysAdminTableMapper;
import com.sojson.datasource.two.mapper.WysColumnMapper;
import com.sojson.datasource.two.mapper.WysNewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@RequestMapping("api")
@RestController
public class IndexController {

    @Autowired
    DtArticleMapper dtArticleMapper;

    @Autowired
    WysNewsMapper wysNewsMapper;

    @Autowired
    DtArticleCategoryMapper dtArticleCategoryMapper;

    @Autowired
    WysColumnMapper wysColumnMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    WysAdminTableMapper wysAdminTableMapper;

    @RequestMapping("migration")
    public Map<String,Object> migration(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> result = new HashMap<>();
        //获取category_id
        String title = request.getParameter("title");
        String name = request.getParameter("name");
        DtArticleCategoryExample dcExample = new DtArticleCategoryExample();
        DtArticleCategoryExample.Criteria dcCriteria = dcExample.createCriteria();
        dcCriteria.andTitleEqualTo(title);
        List<DtArticleCategory> dtArticleList = dtArticleCategoryMapper.selectByExample(dcExample);
        List<Integer> cateGoryList = new ArrayList<Integer>();
        for(DtArticleCategory dta : dtArticleList){
            cateGoryList.add(dta.getId());
        }

        //获取需要导出文章列表
        DtArticleExample example = new DtArticleExample();
        DtArticleExample.Criteria criteria = example.createCriteria();
        criteria.andCategoryIdIn(cateGoryList);
        List<DtArticle> list = dtArticleMapper.selectByExample(example);

        //获取导入文章路径
        WysColumnExample wcExample = new WysColumnExample();
        WysColumnExample.Criteria wcCriteria = wcExample.createCriteria();
        wcCriteria.andNameEqualTo(name);
        wcCriteria.andBigclassNotEqualTo(0);
        List<WysColumn> wysColumnList = wysColumnMapper.selectByExample(wcExample);
        if(wysColumnList.size() > 0){
            WysColumn wysColumn = wysColumnList.get(0);
            for (DtArticle one : list) {
                WysNewsExample wneExample = new WysNewsExample();
                WysNewsExample.Criteria wneCriteria = wneExample.createCriteria();
                wneCriteria.andTitleEqualTo(one.getTitle());
                List<WysNews> wysNewsList = wysNewsMapper.selectByExample(wneExample);
                if(wysNewsList.size() > 0){
                    continue;
                }
                WysNews wysNews = new WysNews();
                wysNews.setTitle(one.getTitle());
                wysNews.setDescription(one.getZhaiyao());
                wysNews.setContent(one.getContent());
               // System.err.println(one.getContent());
                wysNews.setImgurl(one.getImgUrl());
                wysNews.setClass1(wysColumn.getBigclass());
                wysNews.setClass2(wysColumn.getId());
                wysNews.setComOk(0);
                wysNews.setIssue("admin");
                wysNews.setUpdatetime(one.getUpdateTime());
                wysNews.setAddtime(one.getAddTime());
                wysNews.setDisplaytype(1);
                wysNews.setLang("cn");
                wysNews.setAccess(one.getChannelId());
                wysNews.setTag(name);
                try{
                    wysNewsMapper.insertSelective(wysNews);
                }catch (Exception e){
                    System.err.println(one.getId());
                    continue;
                }

            }

        }
        result.put("code", "ok");
        return result;
    }

    //导入登录用户数据
    @RequestMapping("user")
    public Map<String,Object> userInfo(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> result = new HashMap<>();
        List<WysAdminTable> userList =  userMapper.selectAll();
        for(WysAdminTable wysAdminTable : userList){
          wysAdminTableMapper.insertSelective(wysAdminTable);
        }
        result.put("code","导入成功");
        return result;
    }






}
