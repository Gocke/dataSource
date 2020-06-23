package com.sojson.datasource.common.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WysNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WysNewsExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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

        public Criteria andClass1IsNull() {
            addCriterion("class1 is null");
            return (Criteria) this;
        }

        public Criteria andClass1IsNotNull() {
            addCriterion("class1 is not null");
            return (Criteria) this;
        }

        public Criteria andClass1EqualTo(Integer value) {
            addCriterion("class1 =", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1NotEqualTo(Integer value) {
            addCriterion("class1 <>", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1GreaterThan(Integer value) {
            addCriterion("class1 >", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1GreaterThanOrEqualTo(Integer value) {
            addCriterion("class1 >=", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1LessThan(Integer value) {
            addCriterion("class1 <", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1LessThanOrEqualTo(Integer value) {
            addCriterion("class1 <=", value, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1In(List<Integer> values) {
            addCriterion("class1 in", values, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1NotIn(List<Integer> values) {
            addCriterion("class1 not in", values, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1Between(Integer value1, Integer value2) {
            addCriterion("class1 between", value1, value2, "class1");
            return (Criteria) this;
        }

        public Criteria andClass1NotBetween(Integer value1, Integer value2) {
            addCriterion("class1 not between", value1, value2, "class1");
            return (Criteria) this;
        }

        public Criteria andClass2IsNull() {
            addCriterion("class2 is null");
            return (Criteria) this;
        }

        public Criteria andClass2IsNotNull() {
            addCriterion("class2 is not null");
            return (Criteria) this;
        }

        public Criteria andClass2EqualTo(Integer value) {
            addCriterion("class2 =", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2NotEqualTo(Integer value) {
            addCriterion("class2 <>", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2GreaterThan(Integer value) {
            addCriterion("class2 >", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2GreaterThanOrEqualTo(Integer value) {
            addCriterion("class2 >=", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2LessThan(Integer value) {
            addCriterion("class2 <", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2LessThanOrEqualTo(Integer value) {
            addCriterion("class2 <=", value, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2In(List<Integer> values) {
            addCriterion("class2 in", values, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2NotIn(List<Integer> values) {
            addCriterion("class2 not in", values, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2Between(Integer value1, Integer value2) {
            addCriterion("class2 between", value1, value2, "class2");
            return (Criteria) this;
        }

        public Criteria andClass2NotBetween(Integer value1, Integer value2) {
            addCriterion("class2 not between", value1, value2, "class2");
            return (Criteria) this;
        }

        public Criteria andClass3IsNull() {
            addCriterion("class3 is null");
            return (Criteria) this;
        }

        public Criteria andClass3IsNotNull() {
            addCriterion("class3 is not null");
            return (Criteria) this;
        }

        public Criteria andClass3EqualTo(Integer value) {
            addCriterion("class3 =", value, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3NotEqualTo(Integer value) {
            addCriterion("class3 <>", value, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3GreaterThan(Integer value) {
            addCriterion("class3 >", value, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3GreaterThanOrEqualTo(Integer value) {
            addCriterion("class3 >=", value, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3LessThan(Integer value) {
            addCriterion("class3 <", value, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3LessThanOrEqualTo(Integer value) {
            addCriterion("class3 <=", value, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3In(List<Integer> values) {
            addCriterion("class3 in", values, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3NotIn(List<Integer> values) {
            addCriterion("class3 not in", values, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3Between(Integer value1, Integer value2) {
            addCriterion("class3 between", value1, value2, "class3");
            return (Criteria) this;
        }

        public Criteria andClass3NotBetween(Integer value1, Integer value2) {
            addCriterion("class3 not between", value1, value2, "class3");
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

        public Criteria andImgOkIsNull() {
            addCriterion("img_ok is null");
            return (Criteria) this;
        }

        public Criteria andImgOkIsNotNull() {
            addCriterion("img_ok is not null");
            return (Criteria) this;
        }

        public Criteria andImgOkEqualTo(Integer value) {
            addCriterion("img_ok =", value, "imgOk");
            return (Criteria) this;
        }

        public Criteria andImgOkNotEqualTo(Integer value) {
            addCriterion("img_ok <>", value, "imgOk");
            return (Criteria) this;
        }

        public Criteria andImgOkGreaterThan(Integer value) {
            addCriterion("img_ok >", value, "imgOk");
            return (Criteria) this;
        }

        public Criteria andImgOkGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_ok >=", value, "imgOk");
            return (Criteria) this;
        }

        public Criteria andImgOkLessThan(Integer value) {
            addCriterion("img_ok <", value, "imgOk");
            return (Criteria) this;
        }

        public Criteria andImgOkLessThanOrEqualTo(Integer value) {
            addCriterion("img_ok <=", value, "imgOk");
            return (Criteria) this;
        }

        public Criteria andImgOkIn(List<Integer> values) {
            addCriterion("img_ok in", values, "imgOk");
            return (Criteria) this;
        }

        public Criteria andImgOkNotIn(List<Integer> values) {
            addCriterion("img_ok not in", values, "imgOk");
            return (Criteria) this;
        }

        public Criteria andImgOkBetween(Integer value1, Integer value2) {
            addCriterion("img_ok between", value1, value2, "imgOk");
            return (Criteria) this;
        }

        public Criteria andImgOkNotBetween(Integer value1, Integer value2) {
            addCriterion("img_ok not between", value1, value2, "imgOk");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("imgurl is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("imgurl =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("imgurl <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("imgurl >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("imgurl >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("imgurl <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("imgurl <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("imgurl like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("imgurl not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("imgurl in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("imgurl not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("imgurl between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("imgurl not between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlsIsNull() {
            addCriterion("imgurls is null");
            return (Criteria) this;
        }

        public Criteria andImgurlsIsNotNull() {
            addCriterion("imgurls is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlsEqualTo(String value) {
            addCriterion("imgurls =", value, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsNotEqualTo(String value) {
            addCriterion("imgurls <>", value, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsGreaterThan(String value) {
            addCriterion("imgurls >", value, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsGreaterThanOrEqualTo(String value) {
            addCriterion("imgurls >=", value, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsLessThan(String value) {
            addCriterion("imgurls <", value, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsLessThanOrEqualTo(String value) {
            addCriterion("imgurls <=", value, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsLike(String value) {
            addCriterion("imgurls like", value, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsNotLike(String value) {
            addCriterion("imgurls not like", value, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsIn(List<String> values) {
            addCriterion("imgurls in", values, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsNotIn(List<String> values) {
            addCriterion("imgurls not in", values, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsBetween(String value1, String value2) {
            addCriterion("imgurls between", value1, value2, "imgurls");
            return (Criteria) this;
        }

        public Criteria andImgurlsNotBetween(String value1, String value2) {
            addCriterion("imgurls not between", value1, value2, "imgurls");
            return (Criteria) this;
        }

        public Criteria andComOkIsNull() {
            addCriterion("com_ok is null");
            return (Criteria) this;
        }

        public Criteria andComOkIsNotNull() {
            addCriterion("com_ok is not null");
            return (Criteria) this;
        }

        public Criteria andComOkEqualTo(Integer value) {
            addCriterion("com_ok =", value, "comOk");
            return (Criteria) this;
        }

        public Criteria andComOkNotEqualTo(Integer value) {
            addCriterion("com_ok <>", value, "comOk");
            return (Criteria) this;
        }

        public Criteria andComOkGreaterThan(Integer value) {
            addCriterion("com_ok >", value, "comOk");
            return (Criteria) this;
        }

        public Criteria andComOkGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_ok >=", value, "comOk");
            return (Criteria) this;
        }

        public Criteria andComOkLessThan(Integer value) {
            addCriterion("com_ok <", value, "comOk");
            return (Criteria) this;
        }

        public Criteria andComOkLessThanOrEqualTo(Integer value) {
            addCriterion("com_ok <=", value, "comOk");
            return (Criteria) this;
        }

        public Criteria andComOkIn(List<Integer> values) {
            addCriterion("com_ok in", values, "comOk");
            return (Criteria) this;
        }

        public Criteria andComOkNotIn(List<Integer> values) {
            addCriterion("com_ok not in", values, "comOk");
            return (Criteria) this;
        }

        public Criteria andComOkBetween(Integer value1, Integer value2) {
            addCriterion("com_ok between", value1, value2, "comOk");
            return (Criteria) this;
        }

        public Criteria andComOkNotBetween(Integer value1, Integer value2) {
            addCriterion("com_ok not between", value1, value2, "comOk");
            return (Criteria) this;
        }

        public Criteria andIssueIsNull() {
            addCriterion("issue is null");
            return (Criteria) this;
        }

        public Criteria andIssueIsNotNull() {
            addCriterion("issue is not null");
            return (Criteria) this;
        }

        public Criteria andIssueEqualTo(String value) {
            addCriterion("issue =", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotEqualTo(String value) {
            addCriterion("issue <>", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThan(String value) {
            addCriterion("issue >", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThanOrEqualTo(String value) {
            addCriterion("issue >=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThan(String value) {
            addCriterion("issue <", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThanOrEqualTo(String value) {
            addCriterion("issue <=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLike(String value) {
            addCriterion("issue like", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotLike(String value) {
            addCriterion("issue not like", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueIn(List<String> values) {
            addCriterion("issue in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotIn(List<String> values) {
            addCriterion("issue not in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueBetween(String value1, String value2) {
            addCriterion("issue between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotBetween(String value1, String value2) {
            addCriterion("issue not between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andHitsIsNull() {
            addCriterion("hits is null");
            return (Criteria) this;
        }

        public Criteria andHitsIsNotNull() {
            addCriterion("hits is not null");
            return (Criteria) this;
        }

        public Criteria andHitsEqualTo(Integer value) {
            addCriterion("hits =", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotEqualTo(Integer value) {
            addCriterion("hits <>", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThan(Integer value) {
            addCriterion("hits >", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("hits >=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThan(Integer value) {
            addCriterion("hits <", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThanOrEqualTo(Integer value) {
            addCriterion("hits <=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsIn(List<Integer> values) {
            addCriterion("hits in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotIn(List<Integer> values) {
            addCriterion("hits not in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsBetween(Integer value1, Integer value2) {
            addCriterion("hits between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotBetween(Integer value1, Integer value2) {
            addCriterion("hits not between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
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

        public Criteria andTopOkIsNull() {
            addCriterion("top_ok is null");
            return (Criteria) this;
        }

        public Criteria andTopOkIsNotNull() {
            addCriterion("top_ok is not null");
            return (Criteria) this;
        }

        public Criteria andTopOkEqualTo(Integer value) {
            addCriterion("top_ok =", value, "topOk");
            return (Criteria) this;
        }

        public Criteria andTopOkNotEqualTo(Integer value) {
            addCriterion("top_ok <>", value, "topOk");
            return (Criteria) this;
        }

        public Criteria andTopOkGreaterThan(Integer value) {
            addCriterion("top_ok >", value, "topOk");
            return (Criteria) this;
        }

        public Criteria andTopOkGreaterThanOrEqualTo(Integer value) {
            addCriterion("top_ok >=", value, "topOk");
            return (Criteria) this;
        }

        public Criteria andTopOkLessThan(Integer value) {
            addCriterion("top_ok <", value, "topOk");
            return (Criteria) this;
        }

        public Criteria andTopOkLessThanOrEqualTo(Integer value) {
            addCriterion("top_ok <=", value, "topOk");
            return (Criteria) this;
        }

        public Criteria andTopOkIn(List<Integer> values) {
            addCriterion("top_ok in", values, "topOk");
            return (Criteria) this;
        }

        public Criteria andTopOkNotIn(List<Integer> values) {
            addCriterion("top_ok not in", values, "topOk");
            return (Criteria) this;
        }

        public Criteria andTopOkBetween(Integer value1, Integer value2) {
            addCriterion("top_ok between", value1, value2, "topOk");
            return (Criteria) this;
        }

        public Criteria andTopOkNotBetween(Integer value1, Integer value2) {
            addCriterion("top_ok not between", value1, value2, "topOk");
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

        public Criteria andRecycleIsNull() {
            addCriterion("recycle is null");
            return (Criteria) this;
        }

        public Criteria andRecycleIsNotNull() {
            addCriterion("recycle is not null");
            return (Criteria) this;
        }

        public Criteria andRecycleEqualTo(Integer value) {
            addCriterion("recycle =", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleNotEqualTo(Integer value) {
            addCriterion("recycle <>", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleGreaterThan(Integer value) {
            addCriterion("recycle >", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("recycle >=", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleLessThan(Integer value) {
            addCriterion("recycle <", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleLessThanOrEqualTo(Integer value) {
            addCriterion("recycle <=", value, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleIn(List<Integer> values) {
            addCriterion("recycle in", values, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleNotIn(List<Integer> values) {
            addCriterion("recycle not in", values, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleBetween(Integer value1, Integer value2) {
            addCriterion("recycle between", value1, value2, "recycle");
            return (Criteria) this;
        }

        public Criteria andRecycleNotBetween(Integer value1, Integer value2) {
            addCriterion("recycle not between", value1, value2, "recycle");
            return (Criteria) this;
        }

        public Criteria andDisplaytypeIsNull() {
            addCriterion("displaytype is null");
            return (Criteria) this;
        }

        public Criteria andDisplaytypeIsNotNull() {
            addCriterion("displaytype is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaytypeEqualTo(Integer value) {
            addCriterion("displaytype =", value, "displaytype");
            return (Criteria) this;
        }

        public Criteria andDisplaytypeNotEqualTo(Integer value) {
            addCriterion("displaytype <>", value, "displaytype");
            return (Criteria) this;
        }

        public Criteria andDisplaytypeGreaterThan(Integer value) {
            addCriterion("displaytype >", value, "displaytype");
            return (Criteria) this;
        }

        public Criteria andDisplaytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("displaytype >=", value, "displaytype");
            return (Criteria) this;
        }

        public Criteria andDisplaytypeLessThan(Integer value) {
            addCriterion("displaytype <", value, "displaytype");
            return (Criteria) this;
        }

        public Criteria andDisplaytypeLessThanOrEqualTo(Integer value) {
            addCriterion("displaytype <=", value, "displaytype");
            return (Criteria) this;
        }

        public Criteria andDisplaytypeIn(List<Integer> values) {
            addCriterion("displaytype in", values, "displaytype");
            return (Criteria) this;
        }

        public Criteria andDisplaytypeNotIn(List<Integer> values) {
            addCriterion("displaytype not in", values, "displaytype");
            return (Criteria) this;
        }

        public Criteria andDisplaytypeBetween(Integer value1, Integer value2) {
            addCriterion("displaytype between", value1, value2, "displaytype");
            return (Criteria) this;
        }

        public Criteria andDisplaytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("displaytype not between", value1, value2, "displaytype");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
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