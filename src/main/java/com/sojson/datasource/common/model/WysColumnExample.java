package com.sojson.datasource.common.model;

import java.util.ArrayList;
import java.util.List;

public class WysColumnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WysColumnExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFoldernameIsNull() {
            addCriterion("foldername is null");
            return (Criteria) this;
        }

        public Criteria andFoldernameIsNotNull() {
            addCriterion("foldername is not null");
            return (Criteria) this;
        }

        public Criteria andFoldernameEqualTo(String value) {
            addCriterion("foldername =", value, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameNotEqualTo(String value) {
            addCriterion("foldername <>", value, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameGreaterThan(String value) {
            addCriterion("foldername >", value, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameGreaterThanOrEqualTo(String value) {
            addCriterion("foldername >=", value, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameLessThan(String value) {
            addCriterion("foldername <", value, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameLessThanOrEqualTo(String value) {
            addCriterion("foldername <=", value, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameLike(String value) {
            addCriterion("foldername like", value, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameNotLike(String value) {
            addCriterion("foldername not like", value, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameIn(List<String> values) {
            addCriterion("foldername in", values, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameNotIn(List<String> values) {
            addCriterion("foldername not in", values, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameBetween(String value1, String value2) {
            addCriterion("foldername between", value1, value2, "foldername");
            return (Criteria) this;
        }

        public Criteria andFoldernameNotBetween(String value1, String value2) {
            addCriterion("foldername not between", value1, value2, "foldername");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("filename is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("filename is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("filename =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("filename <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("filename >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("filename >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("filename <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("filename <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("filename like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("filename not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("filename in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("filename not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("filename between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("filename not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andBigclassIsNull() {
            addCriterion("bigclass is null");
            return (Criteria) this;
        }

        public Criteria andBigclassIsNotNull() {
            addCriterion("bigclass is not null");
            return (Criteria) this;
        }

        public Criteria andBigclassEqualTo(Integer value) {
            addCriterion("bigclass =", value, "bigclass");
            return (Criteria) this;
        }

        public Criteria andBigclassNotEqualTo(Integer value) {
            addCriterion("bigclass <>", value, "bigclass");
            return (Criteria) this;
        }

        public Criteria andBigclassGreaterThan(Integer value) {
            addCriterion("bigclass >", value, "bigclass");
            return (Criteria) this;
        }

        public Criteria andBigclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("bigclass >=", value, "bigclass");
            return (Criteria) this;
        }

        public Criteria andBigclassLessThan(Integer value) {
            addCriterion("bigclass <", value, "bigclass");
            return (Criteria) this;
        }

        public Criteria andBigclassLessThanOrEqualTo(Integer value) {
            addCriterion("bigclass <=", value, "bigclass");
            return (Criteria) this;
        }

        public Criteria andBigclassIn(List<Integer> values) {
            addCriterion("bigclass in", values, "bigclass");
            return (Criteria) this;
        }

        public Criteria andBigclassNotIn(List<Integer> values) {
            addCriterion("bigclass not in", values, "bigclass");
            return (Criteria) this;
        }

        public Criteria andBigclassBetween(Integer value1, Integer value2) {
            addCriterion("bigclass between", value1, value2, "bigclass");
            return (Criteria) this;
        }

        public Criteria andBigclassNotBetween(Integer value1, Integer value2) {
            addCriterion("bigclass not between", value1, value2, "bigclass");
            return (Criteria) this;
        }

        public Criteria andSamefileIsNull() {
            addCriterion("samefile is null");
            return (Criteria) this;
        }

        public Criteria andSamefileIsNotNull() {
            addCriterion("samefile is not null");
            return (Criteria) this;
        }

        public Criteria andSamefileEqualTo(Integer value) {
            addCriterion("samefile =", value, "samefile");
            return (Criteria) this;
        }

        public Criteria andSamefileNotEqualTo(Integer value) {
            addCriterion("samefile <>", value, "samefile");
            return (Criteria) this;
        }

        public Criteria andSamefileGreaterThan(Integer value) {
            addCriterion("samefile >", value, "samefile");
            return (Criteria) this;
        }

        public Criteria andSamefileGreaterThanOrEqualTo(Integer value) {
            addCriterion("samefile >=", value, "samefile");
            return (Criteria) this;
        }

        public Criteria andSamefileLessThan(Integer value) {
            addCriterion("samefile <", value, "samefile");
            return (Criteria) this;
        }

        public Criteria andSamefileLessThanOrEqualTo(Integer value) {
            addCriterion("samefile <=", value, "samefile");
            return (Criteria) this;
        }

        public Criteria andSamefileIn(List<Integer> values) {
            addCriterion("samefile in", values, "samefile");
            return (Criteria) this;
        }

        public Criteria andSamefileNotIn(List<Integer> values) {
            addCriterion("samefile not in", values, "samefile");
            return (Criteria) this;
        }

        public Criteria andSamefileBetween(Integer value1, Integer value2) {
            addCriterion("samefile between", value1, value2, "samefile");
            return (Criteria) this;
        }

        public Criteria andSamefileNotBetween(Integer value1, Integer value2) {
            addCriterion("samefile not between", value1, value2, "samefile");
            return (Criteria) this;
        }

        public Criteria andModuleIsNull() {
            addCriterion("module is null");
            return (Criteria) this;
        }

        public Criteria andModuleIsNotNull() {
            addCriterion("module is not null");
            return (Criteria) this;
        }

        public Criteria andModuleEqualTo(Integer value) {
            addCriterion("module =", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotEqualTo(Integer value) {
            addCriterion("module <>", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThan(Integer value) {
            addCriterion("module >", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("module >=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThan(Integer value) {
            addCriterion("module <", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThanOrEqualTo(Integer value) {
            addCriterion("module <=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleIn(List<Integer> values) {
            addCriterion("module in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotIn(List<Integer> values) {
            addCriterion("module not in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleBetween(Integer value1, Integer value2) {
            addCriterion("module between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotBetween(Integer value1, Integer value2) {
            addCriterion("module not between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andNoOrderIsNull() {
            addCriterion("no_order is null");
            return (Criteria) this;
        }

        public Criteria andNoOrderIsNotNull() {
            addCriterion("no_order is not null");
            return (Criteria) this;
        }

        public Criteria andNoOrderEqualTo(Integer value) {
            addCriterion("no_order =", value, "noOrder");
            return (Criteria) this;
        }

        public Criteria andNoOrderNotEqualTo(Integer value) {
            addCriterion("no_order <>", value, "noOrder");
            return (Criteria) this;
        }

        public Criteria andNoOrderGreaterThan(Integer value) {
            addCriterion("no_order >", value, "noOrder");
            return (Criteria) this;
        }

        public Criteria andNoOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("no_order >=", value, "noOrder");
            return (Criteria) this;
        }

        public Criteria andNoOrderLessThan(Integer value) {
            addCriterion("no_order <", value, "noOrder");
            return (Criteria) this;
        }

        public Criteria andNoOrderLessThanOrEqualTo(Integer value) {
            addCriterion("no_order <=", value, "noOrder");
            return (Criteria) this;
        }

        public Criteria andNoOrderIn(List<Integer> values) {
            addCriterion("no_order in", values, "noOrder");
            return (Criteria) this;
        }

        public Criteria andNoOrderNotIn(List<Integer> values) {
            addCriterion("no_order not in", values, "noOrder");
            return (Criteria) this;
        }

        public Criteria andNoOrderBetween(Integer value1, Integer value2) {
            addCriterion("no_order between", value1, value2, "noOrder");
            return (Criteria) this;
        }

        public Criteria andNoOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("no_order not between", value1, value2, "noOrder");
            return (Criteria) this;
        }

        public Criteria andWapOkIsNull() {
            addCriterion("wap_ok is null");
            return (Criteria) this;
        }

        public Criteria andWapOkIsNotNull() {
            addCriterion("wap_ok is not null");
            return (Criteria) this;
        }

        public Criteria andWapOkEqualTo(Integer value) {
            addCriterion("wap_ok =", value, "wapOk");
            return (Criteria) this;
        }

        public Criteria andWapOkNotEqualTo(Integer value) {
            addCriterion("wap_ok <>", value, "wapOk");
            return (Criteria) this;
        }

        public Criteria andWapOkGreaterThan(Integer value) {
            addCriterion("wap_ok >", value, "wapOk");
            return (Criteria) this;
        }

        public Criteria andWapOkGreaterThanOrEqualTo(Integer value) {
            addCriterion("wap_ok >=", value, "wapOk");
            return (Criteria) this;
        }

        public Criteria andWapOkLessThan(Integer value) {
            addCriterion("wap_ok <", value, "wapOk");
            return (Criteria) this;
        }

        public Criteria andWapOkLessThanOrEqualTo(Integer value) {
            addCriterion("wap_ok <=", value, "wapOk");
            return (Criteria) this;
        }

        public Criteria andWapOkIn(List<Integer> values) {
            addCriterion("wap_ok in", values, "wapOk");
            return (Criteria) this;
        }

        public Criteria andWapOkNotIn(List<Integer> values) {
            addCriterion("wap_ok not in", values, "wapOk");
            return (Criteria) this;
        }

        public Criteria andWapOkBetween(Integer value1, Integer value2) {
            addCriterion("wap_ok between", value1, value2, "wapOk");
            return (Criteria) this;
        }

        public Criteria andWapOkNotBetween(Integer value1, Integer value2) {
            addCriterion("wap_ok not between", value1, value2, "wapOk");
            return (Criteria) this;
        }

        public Criteria andIfInIsNull() {
            addCriterion("if_in is null");
            return (Criteria) this;
        }

        public Criteria andIfInIsNotNull() {
            addCriterion("if_in is not null");
            return (Criteria) this;
        }

        public Criteria andIfInEqualTo(Integer value) {
            addCriterion("if_in =", value, "ifIn");
            return (Criteria) this;
        }

        public Criteria andIfInNotEqualTo(Integer value) {
            addCriterion("if_in <>", value, "ifIn");
            return (Criteria) this;
        }

        public Criteria andIfInGreaterThan(Integer value) {
            addCriterion("if_in >", value, "ifIn");
            return (Criteria) this;
        }

        public Criteria andIfInGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_in >=", value, "ifIn");
            return (Criteria) this;
        }

        public Criteria andIfInLessThan(Integer value) {
            addCriterion("if_in <", value, "ifIn");
            return (Criteria) this;
        }

        public Criteria andIfInLessThanOrEqualTo(Integer value) {
            addCriterion("if_in <=", value, "ifIn");
            return (Criteria) this;
        }

        public Criteria andIfInIn(List<Integer> values) {
            addCriterion("if_in in", values, "ifIn");
            return (Criteria) this;
        }

        public Criteria andIfInNotIn(List<Integer> values) {
            addCriterion("if_in not in", values, "ifIn");
            return (Criteria) this;
        }

        public Criteria andIfInBetween(Integer value1, Integer value2) {
            addCriterion("if_in between", value1, value2, "ifIn");
            return (Criteria) this;
        }

        public Criteria andIfInNotBetween(Integer value1, Integer value2) {
            addCriterion("if_in not between", value1, value2, "ifIn");
            return (Criteria) this;
        }

        public Criteria andNavIsNull() {
            addCriterion("nav is null");
            return (Criteria) this;
        }

        public Criteria andNavIsNotNull() {
            addCriterion("nav is not null");
            return (Criteria) this;
        }

        public Criteria andNavEqualTo(Integer value) {
            addCriterion("nav =", value, "nav");
            return (Criteria) this;
        }

        public Criteria andNavNotEqualTo(Integer value) {
            addCriterion("nav <>", value, "nav");
            return (Criteria) this;
        }

        public Criteria andNavGreaterThan(Integer value) {
            addCriterion("nav >", value, "nav");
            return (Criteria) this;
        }

        public Criteria andNavGreaterThanOrEqualTo(Integer value) {
            addCriterion("nav >=", value, "nav");
            return (Criteria) this;
        }

        public Criteria andNavLessThan(Integer value) {
            addCriterion("nav <", value, "nav");
            return (Criteria) this;
        }

        public Criteria andNavLessThanOrEqualTo(Integer value) {
            addCriterion("nav <=", value, "nav");
            return (Criteria) this;
        }

        public Criteria andNavIn(List<Integer> values) {
            addCriterion("nav in", values, "nav");
            return (Criteria) this;
        }

        public Criteria andNavNotIn(List<Integer> values) {
            addCriterion("nav not in", values, "nav");
            return (Criteria) this;
        }

        public Criteria andNavBetween(Integer value1, Integer value2) {
            addCriterion("nav between", value1, value2, "nav");
            return (Criteria) this;
        }

        public Criteria andNavNotBetween(Integer value1, Integer value2) {
            addCriterion("nav not between", value1, value2, "nav");
            return (Criteria) this;
        }

        public Criteria andCtitleIsNull() {
            addCriterion("ctitle is null");
            return (Criteria) this;
        }

        public Criteria andCtitleIsNotNull() {
            addCriterion("ctitle is not null");
            return (Criteria) this;
        }

        public Criteria andCtitleEqualTo(String value) {
            addCriterion("ctitle =", value, "ctitle");
            return (Criteria) this;
        }

        public Criteria andCtitleNotEqualTo(String value) {
            addCriterion("ctitle <>", value, "ctitle");
            return (Criteria) this;
        }

        public Criteria andCtitleGreaterThan(String value) {
            addCriterion("ctitle >", value, "ctitle");
            return (Criteria) this;
        }

        public Criteria andCtitleGreaterThanOrEqualTo(String value) {
            addCriterion("ctitle >=", value, "ctitle");
            return (Criteria) this;
        }

        public Criteria andCtitleLessThan(String value) {
            addCriterion("ctitle <", value, "ctitle");
            return (Criteria) this;
        }

        public Criteria andCtitleLessThanOrEqualTo(String value) {
            addCriterion("ctitle <=", value, "ctitle");
            return (Criteria) this;
        }

        public Criteria andCtitleLike(String value) {
            addCriterion("ctitle like", value, "ctitle");
            return (Criteria) this;
        }

        public Criteria andCtitleNotLike(String value) {
            addCriterion("ctitle not like", value, "ctitle");
            return (Criteria) this;
        }

        public Criteria andCtitleIn(List<String> values) {
            addCriterion("ctitle in", values, "ctitle");
            return (Criteria) this;
        }

        public Criteria andCtitleNotIn(List<String> values) {
            addCriterion("ctitle not in", values, "ctitle");
            return (Criteria) this;
        }

        public Criteria andCtitleBetween(String value1, String value2) {
            addCriterion("ctitle between", value1, value2, "ctitle");
            return (Criteria) this;
        }

        public Criteria andCtitleNotBetween(String value1, String value2) {
            addCriterion("ctitle not between", value1, value2, "ctitle");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andListOrderIsNull() {
            addCriterion("list_order is null");
            return (Criteria) this;
        }

        public Criteria andListOrderIsNotNull() {
            addCriterion("list_order is not null");
            return (Criteria) this;
        }

        public Criteria andListOrderEqualTo(Integer value) {
            addCriterion("list_order =", value, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderNotEqualTo(Integer value) {
            addCriterion("list_order <>", value, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderGreaterThan(Integer value) {
            addCriterion("list_order >", value, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("list_order >=", value, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderLessThan(Integer value) {
            addCriterion("list_order <", value, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderLessThanOrEqualTo(Integer value) {
            addCriterion("list_order <=", value, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderIn(List<Integer> values) {
            addCriterion("list_order in", values, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderNotIn(List<Integer> values) {
            addCriterion("list_order not in", values, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderBetween(Integer value1, Integer value2) {
            addCriterion("list_order between", value1, value2, "listOrder");
            return (Criteria) this;
        }

        public Criteria andListOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("list_order not between", value1, value2, "listOrder");
            return (Criteria) this;
        }

        public Criteria andNewWindowsIsNull() {
            addCriterion("new_windows is null");
            return (Criteria) this;
        }

        public Criteria andNewWindowsIsNotNull() {
            addCriterion("new_windows is not null");
            return (Criteria) this;
        }

        public Criteria andNewWindowsEqualTo(String value) {
            addCriterion("new_windows =", value, "newWindows");
            return (Criteria) this;
        }

        public Criteria andNewWindowsNotEqualTo(String value) {
            addCriterion("new_windows <>", value, "newWindows");
            return (Criteria) this;
        }

        public Criteria andNewWindowsGreaterThan(String value) {
            addCriterion("new_windows >", value, "newWindows");
            return (Criteria) this;
        }

        public Criteria andNewWindowsGreaterThanOrEqualTo(String value) {
            addCriterion("new_windows >=", value, "newWindows");
            return (Criteria) this;
        }

        public Criteria andNewWindowsLessThan(String value) {
            addCriterion("new_windows <", value, "newWindows");
            return (Criteria) this;
        }

        public Criteria andNewWindowsLessThanOrEqualTo(String value) {
            addCriterion("new_windows <=", value, "newWindows");
            return (Criteria) this;
        }

        public Criteria andNewWindowsLike(String value) {
            addCriterion("new_windows like", value, "newWindows");
            return (Criteria) this;
        }

        public Criteria andNewWindowsNotLike(String value) {
            addCriterion("new_windows not like", value, "newWindows");
            return (Criteria) this;
        }

        public Criteria andNewWindowsIn(List<String> values) {
            addCriterion("new_windows in", values, "newWindows");
            return (Criteria) this;
        }

        public Criteria andNewWindowsNotIn(List<String> values) {
            addCriterion("new_windows not in", values, "newWindows");
            return (Criteria) this;
        }

        public Criteria andNewWindowsBetween(String value1, String value2) {
            addCriterion("new_windows between", value1, value2, "newWindows");
            return (Criteria) this;
        }

        public Criteria andNewWindowsNotBetween(String value1, String value2) {
            addCriterion("new_windows not between", value1, value2, "newWindows");
            return (Criteria) this;
        }

        public Criteria andClasstypeIsNull() {
            addCriterion("classtype is null");
            return (Criteria) this;
        }

        public Criteria andClasstypeIsNotNull() {
            addCriterion("classtype is not null");
            return (Criteria) this;
        }

        public Criteria andClasstypeEqualTo(Integer value) {
            addCriterion("classtype =", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotEqualTo(Integer value) {
            addCriterion("classtype <>", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeGreaterThan(Integer value) {
            addCriterion("classtype >", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("classtype >=", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeLessThan(Integer value) {
            addCriterion("classtype <", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeLessThanOrEqualTo(Integer value) {
            addCriterion("classtype <=", value, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeIn(List<Integer> values) {
            addCriterion("classtype in", values, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotIn(List<Integer> values) {
            addCriterion("classtype not in", values, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeBetween(Integer value1, Integer value2) {
            addCriterion("classtype between", value1, value2, "classtype");
            return (Criteria) this;
        }

        public Criteria andClasstypeNotBetween(Integer value1, Integer value2) {
            addCriterion("classtype not between", value1, value2, "classtype");
            return (Criteria) this;
        }

        public Criteria andOutUrlIsNull() {
            addCriterion("out_url is null");
            return (Criteria) this;
        }

        public Criteria andOutUrlIsNotNull() {
            addCriterion("out_url is not null");
            return (Criteria) this;
        }

        public Criteria andOutUrlEqualTo(String value) {
            addCriterion("out_url =", value, "outUrl");
            return (Criteria) this;
        }

        public Criteria andOutUrlNotEqualTo(String value) {
            addCriterion("out_url <>", value, "outUrl");
            return (Criteria) this;
        }

        public Criteria andOutUrlGreaterThan(String value) {
            addCriterion("out_url >", value, "outUrl");
            return (Criteria) this;
        }

        public Criteria andOutUrlGreaterThanOrEqualTo(String value) {
            addCriterion("out_url >=", value, "outUrl");
            return (Criteria) this;
        }

        public Criteria andOutUrlLessThan(String value) {
            addCriterion("out_url <", value, "outUrl");
            return (Criteria) this;
        }

        public Criteria andOutUrlLessThanOrEqualTo(String value) {
            addCriterion("out_url <=", value, "outUrl");
            return (Criteria) this;
        }

        public Criteria andOutUrlLike(String value) {
            addCriterion("out_url like", value, "outUrl");
            return (Criteria) this;
        }

        public Criteria andOutUrlNotLike(String value) {
            addCriterion("out_url not like", value, "outUrl");
            return (Criteria) this;
        }

        public Criteria andOutUrlIn(List<String> values) {
            addCriterion("out_url in", values, "outUrl");
            return (Criteria) this;
        }

        public Criteria andOutUrlNotIn(List<String> values) {
            addCriterion("out_url not in", values, "outUrl");
            return (Criteria) this;
        }

        public Criteria andOutUrlBetween(String value1, String value2) {
            addCriterion("out_url between", value1, value2, "outUrl");
            return (Criteria) this;
        }

        public Criteria andOutUrlNotBetween(String value1, String value2) {
            addCriterion("out_url not between", value1, value2, "outUrl");
            return (Criteria) this;
        }

        public Criteria andIndexNumIsNull() {
            addCriterion("index_num is null");
            return (Criteria) this;
        }

        public Criteria andIndexNumIsNotNull() {
            addCriterion("index_num is not null");
            return (Criteria) this;
        }

        public Criteria andIndexNumEqualTo(Integer value) {
            addCriterion("index_num =", value, "indexNum");
            return (Criteria) this;
        }

        public Criteria andIndexNumNotEqualTo(Integer value) {
            addCriterion("index_num <>", value, "indexNum");
            return (Criteria) this;
        }

        public Criteria andIndexNumGreaterThan(Integer value) {
            addCriterion("index_num >", value, "indexNum");
            return (Criteria) this;
        }

        public Criteria andIndexNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("index_num >=", value, "indexNum");
            return (Criteria) this;
        }

        public Criteria andIndexNumLessThan(Integer value) {
            addCriterion("index_num <", value, "indexNum");
            return (Criteria) this;
        }

        public Criteria andIndexNumLessThanOrEqualTo(Integer value) {
            addCriterion("index_num <=", value, "indexNum");
            return (Criteria) this;
        }

        public Criteria andIndexNumIn(List<Integer> values) {
            addCriterion("index_num in", values, "indexNum");
            return (Criteria) this;
        }

        public Criteria andIndexNumNotIn(List<Integer> values) {
            addCriterion("index_num not in", values, "indexNum");
            return (Criteria) this;
        }

        public Criteria andIndexNumBetween(Integer value1, Integer value2) {
            addCriterion("index_num between", value1, value2, "indexNum");
            return (Criteria) this;
        }

        public Criteria andIndexNumNotBetween(Integer value1, Integer value2) {
            addCriterion("index_num not between", value1, value2, "indexNum");
            return (Criteria) this;
        }

        public Criteria andAccessIsNull() {
            addCriterion("access is null");
            return (Criteria) this;
        }

        public Criteria andAccessIsNotNull() {
            addCriterion("access is not null");
            return (Criteria) this;
        }

        public Criteria andAccessEqualTo(Integer value) {
            addCriterion("access =", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessNotEqualTo(Integer value) {
            addCriterion("access <>", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessGreaterThan(Integer value) {
            addCriterion("access >", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("access >=", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessLessThan(Integer value) {
            addCriterion("access <", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessLessThanOrEqualTo(Integer value) {
            addCriterion("access <=", value, "access");
            return (Criteria) this;
        }

        public Criteria andAccessIn(List<Integer> values) {
            addCriterion("access in", values, "access");
            return (Criteria) this;
        }

        public Criteria andAccessNotIn(List<Integer> values) {
            addCriterion("access not in", values, "access");
            return (Criteria) this;
        }

        public Criteria andAccessBetween(Integer value1, Integer value2) {
            addCriterion("access between", value1, value2, "access");
            return (Criteria) this;
        }

        public Criteria andAccessNotBetween(Integer value1, Integer value2) {
            addCriterion("access not between", value1, value2, "access");
            return (Criteria) this;
        }

        public Criteria andIndeximgIsNull() {
            addCriterion("indeximg is null");
            return (Criteria) this;
        }

        public Criteria andIndeximgIsNotNull() {
            addCriterion("indeximg is not null");
            return (Criteria) this;
        }

        public Criteria andIndeximgEqualTo(String value) {
            addCriterion("indeximg =", value, "indeximg");
            return (Criteria) this;
        }

        public Criteria andIndeximgNotEqualTo(String value) {
            addCriterion("indeximg <>", value, "indeximg");
            return (Criteria) this;
        }

        public Criteria andIndeximgGreaterThan(String value) {
            addCriterion("indeximg >", value, "indeximg");
            return (Criteria) this;
        }

        public Criteria andIndeximgGreaterThanOrEqualTo(String value) {
            addCriterion("indeximg >=", value, "indeximg");
            return (Criteria) this;
        }

        public Criteria andIndeximgLessThan(String value) {
            addCriterion("indeximg <", value, "indeximg");
            return (Criteria) this;
        }

        public Criteria andIndeximgLessThanOrEqualTo(String value) {
            addCriterion("indeximg <=", value, "indeximg");
            return (Criteria) this;
        }

        public Criteria andIndeximgLike(String value) {
            addCriterion("indeximg like", value, "indeximg");
            return (Criteria) this;
        }

        public Criteria andIndeximgNotLike(String value) {
            addCriterion("indeximg not like", value, "indeximg");
            return (Criteria) this;
        }

        public Criteria andIndeximgIn(List<String> values) {
            addCriterion("indeximg in", values, "indeximg");
            return (Criteria) this;
        }

        public Criteria andIndeximgNotIn(List<String> values) {
            addCriterion("indeximg not in", values, "indeximg");
            return (Criteria) this;
        }

        public Criteria andIndeximgBetween(String value1, String value2) {
            addCriterion("indeximg between", value1, value2, "indeximg");
            return (Criteria) this;
        }

        public Criteria andIndeximgNotBetween(String value1, String value2) {
            addCriterion("indeximg not between", value1, value2, "indeximg");
            return (Criteria) this;
        }

        public Criteria andColumnimgIsNull() {
            addCriterion("columnimg is null");
            return (Criteria) this;
        }

        public Criteria andColumnimgIsNotNull() {
            addCriterion("columnimg is not null");
            return (Criteria) this;
        }

        public Criteria andColumnimgEqualTo(String value) {
            addCriterion("columnimg =", value, "columnimg");
            return (Criteria) this;
        }

        public Criteria andColumnimgNotEqualTo(String value) {
            addCriterion("columnimg <>", value, "columnimg");
            return (Criteria) this;
        }

        public Criteria andColumnimgGreaterThan(String value) {
            addCriterion("columnimg >", value, "columnimg");
            return (Criteria) this;
        }

        public Criteria andColumnimgGreaterThanOrEqualTo(String value) {
            addCriterion("columnimg >=", value, "columnimg");
            return (Criteria) this;
        }

        public Criteria andColumnimgLessThan(String value) {
            addCriterion("columnimg <", value, "columnimg");
            return (Criteria) this;
        }

        public Criteria andColumnimgLessThanOrEqualTo(String value) {
            addCriterion("columnimg <=", value, "columnimg");
            return (Criteria) this;
        }

        public Criteria andColumnimgLike(String value) {
            addCriterion("columnimg like", value, "columnimg");
            return (Criteria) this;
        }

        public Criteria andColumnimgNotLike(String value) {
            addCriterion("columnimg not like", value, "columnimg");
            return (Criteria) this;
        }

        public Criteria andColumnimgIn(List<String> values) {
            addCriterion("columnimg in", values, "columnimg");
            return (Criteria) this;
        }

        public Criteria andColumnimgNotIn(List<String> values) {
            addCriterion("columnimg not in", values, "columnimg");
            return (Criteria) this;
        }

        public Criteria andColumnimgBetween(String value1, String value2) {
            addCriterion("columnimg between", value1, value2, "columnimg");
            return (Criteria) this;
        }

        public Criteria andColumnimgNotBetween(String value1, String value2) {
            addCriterion("columnimg not between", value1, value2, "columnimg");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNull() {
            addCriterion("isshow is null");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNotNull() {
            addCriterion("isshow is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowEqualTo(Integer value) {
            addCriterion("isshow =", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotEqualTo(Integer value) {
            addCriterion("isshow <>", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThan(Integer value) {
            addCriterion("isshow >", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThanOrEqualTo(Integer value) {
            addCriterion("isshow >=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThan(Integer value) {
            addCriterion("isshow <", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThanOrEqualTo(Integer value) {
            addCriterion("isshow <=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowIn(List<Integer> values) {
            addCriterion("isshow in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotIn(List<Integer> values) {
            addCriterion("isshow not in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowBetween(Integer value1, Integer value2) {
            addCriterion("isshow between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotBetween(Integer value1, Integer value2) {
            addCriterion("isshow not between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andLangIsNull() {
            addCriterion("lang is null");
            return (Criteria) this;
        }

        public Criteria andLangIsNotNull() {
            addCriterion("lang is not null");
            return (Criteria) this;
        }

        public Criteria andLangEqualTo(String value) {
            addCriterion("lang =", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangNotEqualTo(String value) {
            addCriterion("lang <>", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangGreaterThan(String value) {
            addCriterion("lang >", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangGreaterThanOrEqualTo(String value) {
            addCriterion("lang >=", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangLessThan(String value) {
            addCriterion("lang <", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangLessThanOrEqualTo(String value) {
            addCriterion("lang <=", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangLike(String value) {
            addCriterion("lang like", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangNotLike(String value) {
            addCriterion("lang not like", value, "lang");
            return (Criteria) this;
        }

        public Criteria andLangIn(List<String> values) {
            addCriterion("lang in", values, "lang");
            return (Criteria) this;
        }

        public Criteria andLangNotIn(List<String> values) {
            addCriterion("lang not in", values, "lang");
            return (Criteria) this;
        }

        public Criteria andLangBetween(String value1, String value2) {
            addCriterion("lang between", value1, value2, "lang");
            return (Criteria) this;
        }

        public Criteria andLangNotBetween(String value1, String value2) {
            addCriterion("lang not between", value1, value2, "lang");
            return (Criteria) this;
        }

        public Criteria andNamemarkIsNull() {
            addCriterion("namemark is null");
            return (Criteria) this;
        }

        public Criteria andNamemarkIsNotNull() {
            addCriterion("namemark is not null");
            return (Criteria) this;
        }

        public Criteria andNamemarkEqualTo(String value) {
            addCriterion("namemark =", value, "namemark");
            return (Criteria) this;
        }

        public Criteria andNamemarkNotEqualTo(String value) {
            addCriterion("namemark <>", value, "namemark");
            return (Criteria) this;
        }

        public Criteria andNamemarkGreaterThan(String value) {
            addCriterion("namemark >", value, "namemark");
            return (Criteria) this;
        }

        public Criteria andNamemarkGreaterThanOrEqualTo(String value) {
            addCriterion("namemark >=", value, "namemark");
            return (Criteria) this;
        }

        public Criteria andNamemarkLessThan(String value) {
            addCriterion("namemark <", value, "namemark");
            return (Criteria) this;
        }

        public Criteria andNamemarkLessThanOrEqualTo(String value) {
            addCriterion("namemark <=", value, "namemark");
            return (Criteria) this;
        }

        public Criteria andNamemarkLike(String value) {
            addCriterion("namemark like", value, "namemark");
            return (Criteria) this;
        }

        public Criteria andNamemarkNotLike(String value) {
            addCriterion("namemark not like", value, "namemark");
            return (Criteria) this;
        }

        public Criteria andNamemarkIn(List<String> values) {
            addCriterion("namemark in", values, "namemark");
            return (Criteria) this;
        }

        public Criteria andNamemarkNotIn(List<String> values) {
            addCriterion("namemark not in", values, "namemark");
            return (Criteria) this;
        }

        public Criteria andNamemarkBetween(String value1, String value2) {
            addCriterion("namemark between", value1, value2, "namemark");
            return (Criteria) this;
        }

        public Criteria andNamemarkNotBetween(String value1, String value2) {
            addCriterion("namemark not between", value1, value2, "namemark");
            return (Criteria) this;
        }

        public Criteria andReleclassIsNull() {
            addCriterion("releclass is null");
            return (Criteria) this;
        }

        public Criteria andReleclassIsNotNull() {
            addCriterion("releclass is not null");
            return (Criteria) this;
        }

        public Criteria andReleclassEqualTo(Integer value) {
            addCriterion("releclass =", value, "releclass");
            return (Criteria) this;
        }

        public Criteria andReleclassNotEqualTo(Integer value) {
            addCriterion("releclass <>", value, "releclass");
            return (Criteria) this;
        }

        public Criteria andReleclassGreaterThan(Integer value) {
            addCriterion("releclass >", value, "releclass");
            return (Criteria) this;
        }

        public Criteria andReleclassGreaterThanOrEqualTo(Integer value) {
            addCriterion("releclass >=", value, "releclass");
            return (Criteria) this;
        }

        public Criteria andReleclassLessThan(Integer value) {
            addCriterion("releclass <", value, "releclass");
            return (Criteria) this;
        }

        public Criteria andReleclassLessThanOrEqualTo(Integer value) {
            addCriterion("releclass <=", value, "releclass");
            return (Criteria) this;
        }

        public Criteria andReleclassIn(List<Integer> values) {
            addCriterion("releclass in", values, "releclass");
            return (Criteria) this;
        }

        public Criteria andReleclassNotIn(List<Integer> values) {
            addCriterion("releclass not in", values, "releclass");
            return (Criteria) this;
        }

        public Criteria andReleclassBetween(Integer value1, Integer value2) {
            addCriterion("releclass between", value1, value2, "releclass");
            return (Criteria) this;
        }

        public Criteria andReleclassNotBetween(Integer value1, Integer value2) {
            addCriterion("releclass not between", value1, value2, "releclass");
            return (Criteria) this;
        }

        public Criteria andContent1IsNull() {
            addCriterion("content1 is null");
            return (Criteria) this;
        }

        public Criteria andContent1IsNotNull() {
            addCriterion("content1 is not null");
            return (Criteria) this;
        }

        public Criteria andContent1EqualTo(String value) {
            addCriterion("content1 =", value, "content1");
            return (Criteria) this;
        }

        public Criteria andContent1NotEqualTo(String value) {
            addCriterion("content1 <>", value, "content1");
            return (Criteria) this;
        }

        public Criteria andContent1GreaterThan(String value) {
            addCriterion("content1 >", value, "content1");
            return (Criteria) this;
        }

        public Criteria andContent1GreaterThanOrEqualTo(String value) {
            addCriterion("content1 >=", value, "content1");
            return (Criteria) this;
        }

        public Criteria andContent1LessThan(String value) {
            addCriterion("content1 <", value, "content1");
            return (Criteria) this;
        }

        public Criteria andContent1LessThanOrEqualTo(String value) {
            addCriterion("content1 <=", value, "content1");
            return (Criteria) this;
        }

        public Criteria andContent1Like(String value) {
            addCriterion("content1 like", value, "content1");
            return (Criteria) this;
        }

        public Criteria andContent1NotLike(String value) {
            addCriterion("content1 not like", value, "content1");
            return (Criteria) this;
        }

        public Criteria andContent1In(List<String> values) {
            addCriterion("content1 in", values, "content1");
            return (Criteria) this;
        }

        public Criteria andContent1NotIn(List<String> values) {
            addCriterion("content1 not in", values, "content1");
            return (Criteria) this;
        }

        public Criteria andContent1Between(String value1, String value2) {
            addCriterion("content1 between", value1, value2, "content1");
            return (Criteria) this;
        }

        public Criteria andContent1NotBetween(String value1, String value2) {
            addCriterion("content1 not between", value1, value2, "content1");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}