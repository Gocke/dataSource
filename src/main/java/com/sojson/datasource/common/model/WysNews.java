package com.sojson.datasource.common.model;

import java.util.Date;

public class WysNews {
    private Integer id;

    private String title;

    private String ctitle;

    private String keywords;

    private String description;

    private Integer class1;

    private Integer class2;

    private Integer class3;

    private Integer noOrder;

    private Integer wapOk;

    private Integer imgOk;

    private String imgurl;

    private String imgurls;

    private Integer comOk;

    private String issue;

    private Integer hits;

    private Date updatetime;

    private Date addtime;

    private Integer access;

    private Integer topOk;

    private String filename;

    private String lang;

    private Integer recycle;

    private Integer displaytype;

    private String tag;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCtitle() {
        return ctitle;
    }

    public void setCtitle(String ctitle) {
        this.ctitle = ctitle == null ? null : ctitle.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getClass1() {
        return class1;
    }

    public void setClass1(Integer class1) {
        this.class1 = class1;
    }

    public Integer getClass2() {
        return class2;
    }

    public void setClass2(Integer class2) {
        this.class2 = class2;
    }

    public Integer getClass3() {
        return class3;
    }

    public void setClass3(Integer class3) {
        this.class3 = class3;
    }

    public Integer getNoOrder() {
        return noOrder;
    }

    public void setNoOrder(Integer noOrder) {
        this.noOrder = noOrder;
    }

    public Integer getWapOk() {
        return wapOk;
    }

    public void setWapOk(Integer wapOk) {
        this.wapOk = wapOk;
    }

    public Integer getImgOk() {
        return imgOk;
    }

    public void setImgOk(Integer imgOk) {
        this.imgOk = imgOk;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getImgurls() {
        return imgurls;
    }

    public void setImgurls(String imgurls) {
        this.imgurls = imgurls == null ? null : imgurls.trim();
    }

    public Integer getComOk() {
        return comOk;
    }

    public void setComOk(Integer comOk) {
        this.comOk = comOk;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue == null ? null : issue.trim();
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getAccess() {
        return access;
    }

    public void setAccess(Integer access) {
        this.access = access;
    }

    public Integer getTopOk() {
        return topOk;
    }

    public void setTopOk(Integer topOk) {
        this.topOk = topOk;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang == null ? null : lang.trim();
    }

    public Integer getRecycle() {
        return recycle;
    }

    public void setRecycle(Integer recycle) {
        this.recycle = recycle;
    }

    public Integer getDisplaytype() {
        return displaytype;
    }

    public void setDisplaytype(Integer displaytype) {
        this.displaytype = displaytype;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}