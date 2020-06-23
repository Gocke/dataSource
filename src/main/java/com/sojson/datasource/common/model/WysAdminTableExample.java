package com.sojson.datasource.common.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WysAdminTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WysAdminTableExample() {
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

        public Criteria andAdminTypeIsNull() {
            addCriterion("admin_type is null");
            return (Criteria) this;
        }

        public Criteria andAdminTypeIsNotNull() {
            addCriterion("admin_type is not null");
            return (Criteria) this;
        }

        public Criteria andAdminTypeEqualTo(String value) {
            addCriterion("admin_type =", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotEqualTo(String value) {
            addCriterion("admin_type <>", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeGreaterThan(String value) {
            addCriterion("admin_type >", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeGreaterThanOrEqualTo(String value) {
            addCriterion("admin_type >=", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeLessThan(String value) {
            addCriterion("admin_type <", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeLessThanOrEqualTo(String value) {
            addCriterion("admin_type <=", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeLike(String value) {
            addCriterion("admin_type like", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotLike(String value) {
            addCriterion("admin_type not like", value, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeIn(List<String> values) {
            addCriterion("admin_type in", values, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotIn(List<String> values) {
            addCriterion("admin_type not in", values, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeBetween(String value1, String value2) {
            addCriterion("admin_type between", value1, value2, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminTypeNotBetween(String value1, String value2) {
            addCriterion("admin_type not between", value1, value2, "adminType");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(String value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(String value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(String value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(String value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(String value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(String value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLike(String value) {
            addCriterion("admin_id like", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotLike(String value) {
            addCriterion("admin_id not like", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<String> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<String> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(String value1, String value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(String value1, String value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminPassIsNull() {
            addCriterion("admin_pass is null");
            return (Criteria) this;
        }

        public Criteria andAdminPassIsNotNull() {
            addCriterion("admin_pass is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPassEqualTo(String value) {
            addCriterion("admin_pass =", value, "adminPass");
            return (Criteria) this;
        }

        public Criteria andAdminPassNotEqualTo(String value) {
            addCriterion("admin_pass <>", value, "adminPass");
            return (Criteria) this;
        }

        public Criteria andAdminPassGreaterThan(String value) {
            addCriterion("admin_pass >", value, "adminPass");
            return (Criteria) this;
        }

        public Criteria andAdminPassGreaterThanOrEqualTo(String value) {
            addCriterion("admin_pass >=", value, "adminPass");
            return (Criteria) this;
        }

        public Criteria andAdminPassLessThan(String value) {
            addCriterion("admin_pass <", value, "adminPass");
            return (Criteria) this;
        }

        public Criteria andAdminPassLessThanOrEqualTo(String value) {
            addCriterion("admin_pass <=", value, "adminPass");
            return (Criteria) this;
        }

        public Criteria andAdminPassLike(String value) {
            addCriterion("admin_pass like", value, "adminPass");
            return (Criteria) this;
        }

        public Criteria andAdminPassNotLike(String value) {
            addCriterion("admin_pass not like", value, "adminPass");
            return (Criteria) this;
        }

        public Criteria andAdminPassIn(List<String> values) {
            addCriterion("admin_pass in", values, "adminPass");
            return (Criteria) this;
        }

        public Criteria andAdminPassNotIn(List<String> values) {
            addCriterion("admin_pass not in", values, "adminPass");
            return (Criteria) this;
        }

        public Criteria andAdminPassBetween(String value1, String value2) {
            addCriterion("admin_pass between", value1, value2, "adminPass");
            return (Criteria) this;
        }

        public Criteria andAdminPassNotBetween(String value1, String value2) {
            addCriterion("admin_pass not between", value1, value2, "adminPass");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminSexIsNull() {
            addCriterion("admin_sex is null");
            return (Criteria) this;
        }

        public Criteria andAdminSexIsNotNull() {
            addCriterion("admin_sex is not null");
            return (Criteria) this;
        }

        public Criteria andAdminSexEqualTo(Boolean value) {
            addCriterion("admin_sex =", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotEqualTo(Boolean value) {
            addCriterion("admin_sex <>", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexGreaterThan(Boolean value) {
            addCriterion("admin_sex >", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("admin_sex >=", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexLessThan(Boolean value) {
            addCriterion("admin_sex <", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexLessThanOrEqualTo(Boolean value) {
            addCriterion("admin_sex <=", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexIn(List<Boolean> values) {
            addCriterion("admin_sex in", values, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotIn(List<Boolean> values) {
            addCriterion("admin_sex not in", values, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexBetween(Boolean value1, Boolean value2) {
            addCriterion("admin_sex between", value1, value2, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("admin_sex not between", value1, value2, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminTelIsNull() {
            addCriterion("admin_tel is null");
            return (Criteria) this;
        }

        public Criteria andAdminTelIsNotNull() {
            addCriterion("admin_tel is not null");
            return (Criteria) this;
        }

        public Criteria andAdminTelEqualTo(String value) {
            addCriterion("admin_tel =", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelNotEqualTo(String value) {
            addCriterion("admin_tel <>", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelGreaterThan(String value) {
            addCriterion("admin_tel >", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelGreaterThanOrEqualTo(String value) {
            addCriterion("admin_tel >=", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelLessThan(String value) {
            addCriterion("admin_tel <", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelLessThanOrEqualTo(String value) {
            addCriterion("admin_tel <=", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelLike(String value) {
            addCriterion("admin_tel like", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelNotLike(String value) {
            addCriterion("admin_tel not like", value, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelIn(List<String> values) {
            addCriterion("admin_tel in", values, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelNotIn(List<String> values) {
            addCriterion("admin_tel not in", values, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelBetween(String value1, String value2) {
            addCriterion("admin_tel between", value1, value2, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminTelNotBetween(String value1, String value2) {
            addCriterion("admin_tel not between", value1, value2, "adminTel");
            return (Criteria) this;
        }

        public Criteria andAdminMobileIsNull() {
            addCriterion("admin_mobile is null");
            return (Criteria) this;
        }

        public Criteria andAdminMobileIsNotNull() {
            addCriterion("admin_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andAdminMobileEqualTo(String value) {
            addCriterion("admin_mobile =", value, "adminMobile");
            return (Criteria) this;
        }

        public Criteria andAdminMobileNotEqualTo(String value) {
            addCriterion("admin_mobile <>", value, "adminMobile");
            return (Criteria) this;
        }

        public Criteria andAdminMobileGreaterThan(String value) {
            addCriterion("admin_mobile >", value, "adminMobile");
            return (Criteria) this;
        }

        public Criteria andAdminMobileGreaterThanOrEqualTo(String value) {
            addCriterion("admin_mobile >=", value, "adminMobile");
            return (Criteria) this;
        }

        public Criteria andAdminMobileLessThan(String value) {
            addCriterion("admin_mobile <", value, "adminMobile");
            return (Criteria) this;
        }

        public Criteria andAdminMobileLessThanOrEqualTo(String value) {
            addCriterion("admin_mobile <=", value, "adminMobile");
            return (Criteria) this;
        }

        public Criteria andAdminMobileLike(String value) {
            addCriterion("admin_mobile like", value, "adminMobile");
            return (Criteria) this;
        }

        public Criteria andAdminMobileNotLike(String value) {
            addCriterion("admin_mobile not like", value, "adminMobile");
            return (Criteria) this;
        }

        public Criteria andAdminMobileIn(List<String> values) {
            addCriterion("admin_mobile in", values, "adminMobile");
            return (Criteria) this;
        }

        public Criteria andAdminMobileNotIn(List<String> values) {
            addCriterion("admin_mobile not in", values, "adminMobile");
            return (Criteria) this;
        }

        public Criteria andAdminMobileBetween(String value1, String value2) {
            addCriterion("admin_mobile between", value1, value2, "adminMobile");
            return (Criteria) this;
        }

        public Criteria andAdminMobileNotBetween(String value1, String value2) {
            addCriterion("admin_mobile not between", value1, value2, "adminMobile");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIsNull() {
            addCriterion("admin_email is null");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIsNotNull() {
            addCriterion("admin_email is not null");
            return (Criteria) this;
        }

        public Criteria andAdminEmailEqualTo(String value) {
            addCriterion("admin_email =", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotEqualTo(String value) {
            addCriterion("admin_email <>", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailGreaterThan(String value) {
            addCriterion("admin_email >", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailGreaterThanOrEqualTo(String value) {
            addCriterion("admin_email >=", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLessThan(String value) {
            addCriterion("admin_email <", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLessThanOrEqualTo(String value) {
            addCriterion("admin_email <=", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLike(String value) {
            addCriterion("admin_email like", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotLike(String value) {
            addCriterion("admin_email not like", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIn(List<String> values) {
            addCriterion("admin_email in", values, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotIn(List<String> values) {
            addCriterion("admin_email not in", values, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailBetween(String value1, String value2) {
            addCriterion("admin_email between", value1, value2, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotBetween(String value1, String value2) {
            addCriterion("admin_email not between", value1, value2, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminQqIsNull() {
            addCriterion("admin_qq is null");
            return (Criteria) this;
        }

        public Criteria andAdminQqIsNotNull() {
            addCriterion("admin_qq is not null");
            return (Criteria) this;
        }

        public Criteria andAdminQqEqualTo(String value) {
            addCriterion("admin_qq =", value, "adminQq");
            return (Criteria) this;
        }

        public Criteria andAdminQqNotEqualTo(String value) {
            addCriterion("admin_qq <>", value, "adminQq");
            return (Criteria) this;
        }

        public Criteria andAdminQqGreaterThan(String value) {
            addCriterion("admin_qq >", value, "adminQq");
            return (Criteria) this;
        }

        public Criteria andAdminQqGreaterThanOrEqualTo(String value) {
            addCriterion("admin_qq >=", value, "adminQq");
            return (Criteria) this;
        }

        public Criteria andAdminQqLessThan(String value) {
            addCriterion("admin_qq <", value, "adminQq");
            return (Criteria) this;
        }

        public Criteria andAdminQqLessThanOrEqualTo(String value) {
            addCriterion("admin_qq <=", value, "adminQq");
            return (Criteria) this;
        }

        public Criteria andAdminQqLike(String value) {
            addCriterion("admin_qq like", value, "adminQq");
            return (Criteria) this;
        }

        public Criteria andAdminQqNotLike(String value) {
            addCriterion("admin_qq not like", value, "adminQq");
            return (Criteria) this;
        }

        public Criteria andAdminQqIn(List<String> values) {
            addCriterion("admin_qq in", values, "adminQq");
            return (Criteria) this;
        }

        public Criteria andAdminQqNotIn(List<String> values) {
            addCriterion("admin_qq not in", values, "adminQq");
            return (Criteria) this;
        }

        public Criteria andAdminQqBetween(String value1, String value2) {
            addCriterion("admin_qq between", value1, value2, "adminQq");
            return (Criteria) this;
        }

        public Criteria andAdminQqNotBetween(String value1, String value2) {
            addCriterion("admin_qq not between", value1, value2, "adminQq");
            return (Criteria) this;
        }

        public Criteria andAdminMsnIsNull() {
            addCriterion("admin_msn is null");
            return (Criteria) this;
        }

        public Criteria andAdminMsnIsNotNull() {
            addCriterion("admin_msn is not null");
            return (Criteria) this;
        }

        public Criteria andAdminMsnEqualTo(String value) {
            addCriterion("admin_msn =", value, "adminMsn");
            return (Criteria) this;
        }

        public Criteria andAdminMsnNotEqualTo(String value) {
            addCriterion("admin_msn <>", value, "adminMsn");
            return (Criteria) this;
        }

        public Criteria andAdminMsnGreaterThan(String value) {
            addCriterion("admin_msn >", value, "adminMsn");
            return (Criteria) this;
        }

        public Criteria andAdminMsnGreaterThanOrEqualTo(String value) {
            addCriterion("admin_msn >=", value, "adminMsn");
            return (Criteria) this;
        }

        public Criteria andAdminMsnLessThan(String value) {
            addCriterion("admin_msn <", value, "adminMsn");
            return (Criteria) this;
        }

        public Criteria andAdminMsnLessThanOrEqualTo(String value) {
            addCriterion("admin_msn <=", value, "adminMsn");
            return (Criteria) this;
        }

        public Criteria andAdminMsnLike(String value) {
            addCriterion("admin_msn like", value, "adminMsn");
            return (Criteria) this;
        }

        public Criteria andAdminMsnNotLike(String value) {
            addCriterion("admin_msn not like", value, "adminMsn");
            return (Criteria) this;
        }

        public Criteria andAdminMsnIn(List<String> values) {
            addCriterion("admin_msn in", values, "adminMsn");
            return (Criteria) this;
        }

        public Criteria andAdminMsnNotIn(List<String> values) {
            addCriterion("admin_msn not in", values, "adminMsn");
            return (Criteria) this;
        }

        public Criteria andAdminMsnBetween(String value1, String value2) {
            addCriterion("admin_msn between", value1, value2, "adminMsn");
            return (Criteria) this;
        }

        public Criteria andAdminMsnNotBetween(String value1, String value2) {
            addCriterion("admin_msn not between", value1, value2, "adminMsn");
            return (Criteria) this;
        }

        public Criteria andAdminTaobaoIsNull() {
            addCriterion("admin_taobao is null");
            return (Criteria) this;
        }

        public Criteria andAdminTaobaoIsNotNull() {
            addCriterion("admin_taobao is not null");
            return (Criteria) this;
        }

        public Criteria andAdminTaobaoEqualTo(String value) {
            addCriterion("admin_taobao =", value, "adminTaobao");
            return (Criteria) this;
        }

        public Criteria andAdminTaobaoNotEqualTo(String value) {
            addCriterion("admin_taobao <>", value, "adminTaobao");
            return (Criteria) this;
        }

        public Criteria andAdminTaobaoGreaterThan(String value) {
            addCriterion("admin_taobao >", value, "adminTaobao");
            return (Criteria) this;
        }

        public Criteria andAdminTaobaoGreaterThanOrEqualTo(String value) {
            addCriterion("admin_taobao >=", value, "adminTaobao");
            return (Criteria) this;
        }

        public Criteria andAdminTaobaoLessThan(String value) {
            addCriterion("admin_taobao <", value, "adminTaobao");
            return (Criteria) this;
        }

        public Criteria andAdminTaobaoLessThanOrEqualTo(String value) {
            addCriterion("admin_taobao <=", value, "adminTaobao");
            return (Criteria) this;
        }

        public Criteria andAdminTaobaoLike(String value) {
            addCriterion("admin_taobao like", value, "adminTaobao");
            return (Criteria) this;
        }

        public Criteria andAdminTaobaoNotLike(String value) {
            addCriterion("admin_taobao not like", value, "adminTaobao");
            return (Criteria) this;
        }

        public Criteria andAdminTaobaoIn(List<String> values) {
            addCriterion("admin_taobao in", values, "adminTaobao");
            return (Criteria) this;
        }

        public Criteria andAdminTaobaoNotIn(List<String> values) {
            addCriterion("admin_taobao not in", values, "adminTaobao");
            return (Criteria) this;
        }

        public Criteria andAdminTaobaoBetween(String value1, String value2) {
            addCriterion("admin_taobao between", value1, value2, "adminTaobao");
            return (Criteria) this;
        }

        public Criteria andAdminTaobaoNotBetween(String value1, String value2) {
            addCriterion("admin_taobao not between", value1, value2, "adminTaobao");
            return (Criteria) this;
        }

        public Criteria andAdminIntroductionIsNull() {
            addCriterion("admin_introduction is null");
            return (Criteria) this;
        }

        public Criteria andAdminIntroductionIsNotNull() {
            addCriterion("admin_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIntroductionEqualTo(String value) {
            addCriterion("admin_introduction =", value, "adminIntroduction");
            return (Criteria) this;
        }

        public Criteria andAdminIntroductionNotEqualTo(String value) {
            addCriterion("admin_introduction <>", value, "adminIntroduction");
            return (Criteria) this;
        }

        public Criteria andAdminIntroductionGreaterThan(String value) {
            addCriterion("admin_introduction >", value, "adminIntroduction");
            return (Criteria) this;
        }

        public Criteria andAdminIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("admin_introduction >=", value, "adminIntroduction");
            return (Criteria) this;
        }

        public Criteria andAdminIntroductionLessThan(String value) {
            addCriterion("admin_introduction <", value, "adminIntroduction");
            return (Criteria) this;
        }

        public Criteria andAdminIntroductionLessThanOrEqualTo(String value) {
            addCriterion("admin_introduction <=", value, "adminIntroduction");
            return (Criteria) this;
        }

        public Criteria andAdminIntroductionLike(String value) {
            addCriterion("admin_introduction like", value, "adminIntroduction");
            return (Criteria) this;
        }

        public Criteria andAdminIntroductionNotLike(String value) {
            addCriterion("admin_introduction not like", value, "adminIntroduction");
            return (Criteria) this;
        }

        public Criteria andAdminIntroductionIn(List<String> values) {
            addCriterion("admin_introduction in", values, "adminIntroduction");
            return (Criteria) this;
        }

        public Criteria andAdminIntroductionNotIn(List<String> values) {
            addCriterion("admin_introduction not in", values, "adminIntroduction");
            return (Criteria) this;
        }

        public Criteria andAdminIntroductionBetween(String value1, String value2) {
            addCriterion("admin_introduction between", value1, value2, "adminIntroduction");
            return (Criteria) this;
        }

        public Criteria andAdminIntroductionNotBetween(String value1, String value2) {
            addCriterion("admin_introduction not between", value1, value2, "adminIntroduction");
            return (Criteria) this;
        }

        public Criteria andAdminLoginIsNull() {
            addCriterion("admin_login is null");
            return (Criteria) this;
        }

        public Criteria andAdminLoginIsNotNull() {
            addCriterion("admin_login is not null");
            return (Criteria) this;
        }

        public Criteria andAdminLoginEqualTo(Integer value) {
            addCriterion("admin_login =", value, "adminLogin");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNotEqualTo(Integer value) {
            addCriterion("admin_login <>", value, "adminLogin");
            return (Criteria) this;
        }

        public Criteria andAdminLoginGreaterThan(Integer value) {
            addCriterion("admin_login >", value, "adminLogin");
            return (Criteria) this;
        }

        public Criteria andAdminLoginGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_login >=", value, "adminLogin");
            return (Criteria) this;
        }

        public Criteria andAdminLoginLessThan(Integer value) {
            addCriterion("admin_login <", value, "adminLogin");
            return (Criteria) this;
        }

        public Criteria andAdminLoginLessThanOrEqualTo(Integer value) {
            addCriterion("admin_login <=", value, "adminLogin");
            return (Criteria) this;
        }

        public Criteria andAdminLoginIn(List<Integer> values) {
            addCriterion("admin_login in", values, "adminLogin");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNotIn(List<Integer> values) {
            addCriterion("admin_login not in", values, "adminLogin");
            return (Criteria) this;
        }

        public Criteria andAdminLoginBetween(Integer value1, Integer value2) {
            addCriterion("admin_login between", value1, value2, "adminLogin");
            return (Criteria) this;
        }

        public Criteria andAdminLoginNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_login not between", value1, value2, "adminLogin");
            return (Criteria) this;
        }

        public Criteria andAdminModifyIpIsNull() {
            addCriterion("admin_modify_ip is null");
            return (Criteria) this;
        }

        public Criteria andAdminModifyIpIsNotNull() {
            addCriterion("admin_modify_ip is not null");
            return (Criteria) this;
        }

        public Criteria andAdminModifyIpEqualTo(String value) {
            addCriterion("admin_modify_ip =", value, "adminModifyIp");
            return (Criteria) this;
        }

        public Criteria andAdminModifyIpNotEqualTo(String value) {
            addCriterion("admin_modify_ip <>", value, "adminModifyIp");
            return (Criteria) this;
        }

        public Criteria andAdminModifyIpGreaterThan(String value) {
            addCriterion("admin_modify_ip >", value, "adminModifyIp");
            return (Criteria) this;
        }

        public Criteria andAdminModifyIpGreaterThanOrEqualTo(String value) {
            addCriterion("admin_modify_ip >=", value, "adminModifyIp");
            return (Criteria) this;
        }

        public Criteria andAdminModifyIpLessThan(String value) {
            addCriterion("admin_modify_ip <", value, "adminModifyIp");
            return (Criteria) this;
        }

        public Criteria andAdminModifyIpLessThanOrEqualTo(String value) {
            addCriterion("admin_modify_ip <=", value, "adminModifyIp");
            return (Criteria) this;
        }

        public Criteria andAdminModifyIpLike(String value) {
            addCriterion("admin_modify_ip like", value, "adminModifyIp");
            return (Criteria) this;
        }

        public Criteria andAdminModifyIpNotLike(String value) {
            addCriterion("admin_modify_ip not like", value, "adminModifyIp");
            return (Criteria) this;
        }

        public Criteria andAdminModifyIpIn(List<String> values) {
            addCriterion("admin_modify_ip in", values, "adminModifyIp");
            return (Criteria) this;
        }

        public Criteria andAdminModifyIpNotIn(List<String> values) {
            addCriterion("admin_modify_ip not in", values, "adminModifyIp");
            return (Criteria) this;
        }

        public Criteria andAdminModifyIpBetween(String value1, String value2) {
            addCriterion("admin_modify_ip between", value1, value2, "adminModifyIp");
            return (Criteria) this;
        }

        public Criteria andAdminModifyIpNotBetween(String value1, String value2) {
            addCriterion("admin_modify_ip not between", value1, value2, "adminModifyIp");
            return (Criteria) this;
        }

        public Criteria andAdminModifyDateIsNull() {
            addCriterion("admin_modify_date is null");
            return (Criteria) this;
        }

        public Criteria andAdminModifyDateIsNotNull() {
            addCriterion("admin_modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andAdminModifyDateEqualTo(Date value) {
            addCriterion("admin_modify_date =", value, "adminModifyDate");
            return (Criteria) this;
        }

        public Criteria andAdminModifyDateNotEqualTo(Date value) {
            addCriterion("admin_modify_date <>", value, "adminModifyDate");
            return (Criteria) this;
        }

        public Criteria andAdminModifyDateGreaterThan(Date value) {
            addCriterion("admin_modify_date >", value, "adminModifyDate");
            return (Criteria) this;
        }

        public Criteria andAdminModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("admin_modify_date >=", value, "adminModifyDate");
            return (Criteria) this;
        }

        public Criteria andAdminModifyDateLessThan(Date value) {
            addCriterion("admin_modify_date <", value, "adminModifyDate");
            return (Criteria) this;
        }

        public Criteria andAdminModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("admin_modify_date <=", value, "adminModifyDate");
            return (Criteria) this;
        }

        public Criteria andAdminModifyDateIn(List<Date> values) {
            addCriterion("admin_modify_date in", values, "adminModifyDate");
            return (Criteria) this;
        }

        public Criteria andAdminModifyDateNotIn(List<Date> values) {
            addCriterion("admin_modify_date not in", values, "adminModifyDate");
            return (Criteria) this;
        }

        public Criteria andAdminModifyDateBetween(Date value1, Date value2) {
            addCriterion("admin_modify_date between", value1, value2, "adminModifyDate");
            return (Criteria) this;
        }

        public Criteria andAdminModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("admin_modify_date not between", value1, value2, "adminModifyDate");
            return (Criteria) this;
        }

        public Criteria andAdminRegisterDateIsNull() {
            addCriterion("admin_register_date is null");
            return (Criteria) this;
        }

        public Criteria andAdminRegisterDateIsNotNull() {
            addCriterion("admin_register_date is not null");
            return (Criteria) this;
        }

        public Criteria andAdminRegisterDateEqualTo(Date value) {
            addCriterion("admin_register_date =", value, "adminRegisterDate");
            return (Criteria) this;
        }

        public Criteria andAdminRegisterDateNotEqualTo(Date value) {
            addCriterion("admin_register_date <>", value, "adminRegisterDate");
            return (Criteria) this;
        }

        public Criteria andAdminRegisterDateGreaterThan(Date value) {
            addCriterion("admin_register_date >", value, "adminRegisterDate");
            return (Criteria) this;
        }

        public Criteria andAdminRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterion("admin_register_date >=", value, "adminRegisterDate");
            return (Criteria) this;
        }

        public Criteria andAdminRegisterDateLessThan(Date value) {
            addCriterion("admin_register_date <", value, "adminRegisterDate");
            return (Criteria) this;
        }

        public Criteria andAdminRegisterDateLessThanOrEqualTo(Date value) {
            addCriterion("admin_register_date <=", value, "adminRegisterDate");
            return (Criteria) this;
        }

        public Criteria andAdminRegisterDateIn(List<Date> values) {
            addCriterion("admin_register_date in", values, "adminRegisterDate");
            return (Criteria) this;
        }

        public Criteria andAdminRegisterDateNotIn(List<Date> values) {
            addCriterion("admin_register_date not in", values, "adminRegisterDate");
            return (Criteria) this;
        }

        public Criteria andAdminRegisterDateBetween(Date value1, Date value2) {
            addCriterion("admin_register_date between", value1, value2, "adminRegisterDate");
            return (Criteria) this;
        }

        public Criteria andAdminRegisterDateNotBetween(Date value1, Date value2) {
            addCriterion("admin_register_date not between", value1, value2, "adminRegisterDate");
            return (Criteria) this;
        }

        public Criteria andAdminApprovalDateIsNull() {
            addCriterion("admin_approval_date is null");
            return (Criteria) this;
        }

        public Criteria andAdminApprovalDateIsNotNull() {
            addCriterion("admin_approval_date is not null");
            return (Criteria) this;
        }

        public Criteria andAdminApprovalDateEqualTo(Date value) {
            addCriterion("admin_approval_date =", value, "adminApprovalDate");
            return (Criteria) this;
        }

        public Criteria andAdminApprovalDateNotEqualTo(Date value) {
            addCriterion("admin_approval_date <>", value, "adminApprovalDate");
            return (Criteria) this;
        }

        public Criteria andAdminApprovalDateGreaterThan(Date value) {
            addCriterion("admin_approval_date >", value, "adminApprovalDate");
            return (Criteria) this;
        }

        public Criteria andAdminApprovalDateGreaterThanOrEqualTo(Date value) {
            addCriterion("admin_approval_date >=", value, "adminApprovalDate");
            return (Criteria) this;
        }

        public Criteria andAdminApprovalDateLessThan(Date value) {
            addCriterion("admin_approval_date <", value, "adminApprovalDate");
            return (Criteria) this;
        }

        public Criteria andAdminApprovalDateLessThanOrEqualTo(Date value) {
            addCriterion("admin_approval_date <=", value, "adminApprovalDate");
            return (Criteria) this;
        }

        public Criteria andAdminApprovalDateIn(List<Date> values) {
            addCriterion("admin_approval_date in", values, "adminApprovalDate");
            return (Criteria) this;
        }

        public Criteria andAdminApprovalDateNotIn(List<Date> values) {
            addCriterion("admin_approval_date not in", values, "adminApprovalDate");
            return (Criteria) this;
        }

        public Criteria andAdminApprovalDateBetween(Date value1, Date value2) {
            addCriterion("admin_approval_date between", value1, value2, "adminApprovalDate");
            return (Criteria) this;
        }

        public Criteria andAdminApprovalDateNotBetween(Date value1, Date value2) {
            addCriterion("admin_approval_date not between", value1, value2, "adminApprovalDate");
            return (Criteria) this;
        }

        public Criteria andAdminOkIsNull() {
            addCriterion("admin_ok is null");
            return (Criteria) this;
        }

        public Criteria andAdminOkIsNotNull() {
            addCriterion("admin_ok is not null");
            return (Criteria) this;
        }

        public Criteria andAdminOkEqualTo(Integer value) {
            addCriterion("admin_ok =", value, "adminOk");
            return (Criteria) this;
        }

        public Criteria andAdminOkNotEqualTo(Integer value) {
            addCriterion("admin_ok <>", value, "adminOk");
            return (Criteria) this;
        }

        public Criteria andAdminOkGreaterThan(Integer value) {
            addCriterion("admin_ok >", value, "adminOk");
            return (Criteria) this;
        }

        public Criteria andAdminOkGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_ok >=", value, "adminOk");
            return (Criteria) this;
        }

        public Criteria andAdminOkLessThan(Integer value) {
            addCriterion("admin_ok <", value, "adminOk");
            return (Criteria) this;
        }

        public Criteria andAdminOkLessThanOrEqualTo(Integer value) {
            addCriterion("admin_ok <=", value, "adminOk");
            return (Criteria) this;
        }

        public Criteria andAdminOkIn(List<Integer> values) {
            addCriterion("admin_ok in", values, "adminOk");
            return (Criteria) this;
        }

        public Criteria andAdminOkNotIn(List<Integer> values) {
            addCriterion("admin_ok not in", values, "adminOk");
            return (Criteria) this;
        }

        public Criteria andAdminOkBetween(Integer value1, Integer value2) {
            addCriterion("admin_ok between", value1, value2, "adminOk");
            return (Criteria) this;
        }

        public Criteria andAdminOkNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_ok not between", value1, value2, "adminOk");
            return (Criteria) this;
        }

        public Criteria andAdminOpIsNull() {
            addCriterion("admin_op is null");
            return (Criteria) this;
        }

        public Criteria andAdminOpIsNotNull() {
            addCriterion("admin_op is not null");
            return (Criteria) this;
        }

        public Criteria andAdminOpEqualTo(String value) {
            addCriterion("admin_op =", value, "adminOp");
            return (Criteria) this;
        }

        public Criteria andAdminOpNotEqualTo(String value) {
            addCriterion("admin_op <>", value, "adminOp");
            return (Criteria) this;
        }

        public Criteria andAdminOpGreaterThan(String value) {
            addCriterion("admin_op >", value, "adminOp");
            return (Criteria) this;
        }

        public Criteria andAdminOpGreaterThanOrEqualTo(String value) {
            addCriterion("admin_op >=", value, "adminOp");
            return (Criteria) this;
        }

        public Criteria andAdminOpLessThan(String value) {
            addCriterion("admin_op <", value, "adminOp");
            return (Criteria) this;
        }

        public Criteria andAdminOpLessThanOrEqualTo(String value) {
            addCriterion("admin_op <=", value, "adminOp");
            return (Criteria) this;
        }

        public Criteria andAdminOpLike(String value) {
            addCriterion("admin_op like", value, "adminOp");
            return (Criteria) this;
        }

        public Criteria andAdminOpNotLike(String value) {
            addCriterion("admin_op not like", value, "adminOp");
            return (Criteria) this;
        }

        public Criteria andAdminOpIn(List<String> values) {
            addCriterion("admin_op in", values, "adminOp");
            return (Criteria) this;
        }

        public Criteria andAdminOpNotIn(List<String> values) {
            addCriterion("admin_op not in", values, "adminOp");
            return (Criteria) this;
        }

        public Criteria andAdminOpBetween(String value1, String value2) {
            addCriterion("admin_op between", value1, value2, "adminOp");
            return (Criteria) this;
        }

        public Criteria andAdminOpNotBetween(String value1, String value2) {
            addCriterion("admin_op not between", value1, value2, "adminOp");
            return (Criteria) this;
        }

        public Criteria andAdminIssueokIsNull() {
            addCriterion("admin_issueok is null");
            return (Criteria) this;
        }

        public Criteria andAdminIssueokIsNotNull() {
            addCriterion("admin_issueok is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIssueokEqualTo(Integer value) {
            addCriterion("admin_issueok =", value, "adminIssueok");
            return (Criteria) this;
        }

        public Criteria andAdminIssueokNotEqualTo(Integer value) {
            addCriterion("admin_issueok <>", value, "adminIssueok");
            return (Criteria) this;
        }

        public Criteria andAdminIssueokGreaterThan(Integer value) {
            addCriterion("admin_issueok >", value, "adminIssueok");
            return (Criteria) this;
        }

        public Criteria andAdminIssueokGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_issueok >=", value, "adminIssueok");
            return (Criteria) this;
        }

        public Criteria andAdminIssueokLessThan(Integer value) {
            addCriterion("admin_issueok <", value, "adminIssueok");
            return (Criteria) this;
        }

        public Criteria andAdminIssueokLessThanOrEqualTo(Integer value) {
            addCriterion("admin_issueok <=", value, "adminIssueok");
            return (Criteria) this;
        }

        public Criteria andAdminIssueokIn(List<Integer> values) {
            addCriterion("admin_issueok in", values, "adminIssueok");
            return (Criteria) this;
        }

        public Criteria andAdminIssueokNotIn(List<Integer> values) {
            addCriterion("admin_issueok not in", values, "adminIssueok");
            return (Criteria) this;
        }

        public Criteria andAdminIssueokBetween(Integer value1, Integer value2) {
            addCriterion("admin_issueok between", value1, value2, "adminIssueok");
            return (Criteria) this;
        }

        public Criteria andAdminIssueokNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_issueok not between", value1, value2, "adminIssueok");
            return (Criteria) this;
        }

        public Criteria andAdminGroupIsNull() {
            addCriterion("admin_group is null");
            return (Criteria) this;
        }

        public Criteria andAdminGroupIsNotNull() {
            addCriterion("admin_group is not null");
            return (Criteria) this;
        }

        public Criteria andAdminGroupEqualTo(Integer value) {
            addCriterion("admin_group =", value, "adminGroup");
            return (Criteria) this;
        }

        public Criteria andAdminGroupNotEqualTo(Integer value) {
            addCriterion("admin_group <>", value, "adminGroup");
            return (Criteria) this;
        }

        public Criteria andAdminGroupGreaterThan(Integer value) {
            addCriterion("admin_group >", value, "adminGroup");
            return (Criteria) this;
        }

        public Criteria andAdminGroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_group >=", value, "adminGroup");
            return (Criteria) this;
        }

        public Criteria andAdminGroupLessThan(Integer value) {
            addCriterion("admin_group <", value, "adminGroup");
            return (Criteria) this;
        }

        public Criteria andAdminGroupLessThanOrEqualTo(Integer value) {
            addCriterion("admin_group <=", value, "adminGroup");
            return (Criteria) this;
        }

        public Criteria andAdminGroupIn(List<Integer> values) {
            addCriterion("admin_group in", values, "adminGroup");
            return (Criteria) this;
        }

        public Criteria andAdminGroupNotIn(List<Integer> values) {
            addCriterion("admin_group not in", values, "adminGroup");
            return (Criteria) this;
        }

        public Criteria andAdminGroupBetween(Integer value1, Integer value2) {
            addCriterion("admin_group between", value1, value2, "adminGroup");
            return (Criteria) this;
        }

        public Criteria andAdminGroupNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_group not between", value1, value2, "adminGroup");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyname is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyname is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyname =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyname <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyname >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyname >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyname <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyname <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyname like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyname not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyname in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyname not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyname between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyname not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIsNull() {
            addCriterion("companyaddress is null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIsNotNull() {
            addCriterion("companyaddress is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressEqualTo(String value) {
            addCriterion("companyaddress =", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotEqualTo(String value) {
            addCriterion("companyaddress <>", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressGreaterThan(String value) {
            addCriterion("companyaddress >", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressGreaterThanOrEqualTo(String value) {
            addCriterion("companyaddress >=", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLessThan(String value) {
            addCriterion("companyaddress <", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLessThanOrEqualTo(String value) {
            addCriterion("companyaddress <=", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLike(String value) {
            addCriterion("companyaddress like", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotLike(String value) {
            addCriterion("companyaddress not like", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIn(List<String> values) {
            addCriterion("companyaddress in", values, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotIn(List<String> values) {
            addCriterion("companyaddress not in", values, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressBetween(String value1, String value2) {
            addCriterion("companyaddress between", value1, value2, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotBetween(String value1, String value2) {
            addCriterion("companyaddress not between", value1, value2, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyfaxIsNull() {
            addCriterion("companyfax is null");
            return (Criteria) this;
        }

        public Criteria andCompanyfaxIsNotNull() {
            addCriterion("companyfax is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyfaxEqualTo(String value) {
            addCriterion("companyfax =", value, "companyfax");
            return (Criteria) this;
        }

        public Criteria andCompanyfaxNotEqualTo(String value) {
            addCriterion("companyfax <>", value, "companyfax");
            return (Criteria) this;
        }

        public Criteria andCompanyfaxGreaterThan(String value) {
            addCriterion("companyfax >", value, "companyfax");
            return (Criteria) this;
        }

        public Criteria andCompanyfaxGreaterThanOrEqualTo(String value) {
            addCriterion("companyfax >=", value, "companyfax");
            return (Criteria) this;
        }

        public Criteria andCompanyfaxLessThan(String value) {
            addCriterion("companyfax <", value, "companyfax");
            return (Criteria) this;
        }

        public Criteria andCompanyfaxLessThanOrEqualTo(String value) {
            addCriterion("companyfax <=", value, "companyfax");
            return (Criteria) this;
        }

        public Criteria andCompanyfaxLike(String value) {
            addCriterion("companyfax like", value, "companyfax");
            return (Criteria) this;
        }

        public Criteria andCompanyfaxNotLike(String value) {
            addCriterion("companyfax not like", value, "companyfax");
            return (Criteria) this;
        }

        public Criteria andCompanyfaxIn(List<String> values) {
            addCriterion("companyfax in", values, "companyfax");
            return (Criteria) this;
        }

        public Criteria andCompanyfaxNotIn(List<String> values) {
            addCriterion("companyfax not in", values, "companyfax");
            return (Criteria) this;
        }

        public Criteria andCompanyfaxBetween(String value1, String value2) {
            addCriterion("companyfax between", value1, value2, "companyfax");
            return (Criteria) this;
        }

        public Criteria andCompanyfaxNotBetween(String value1, String value2) {
            addCriterion("companyfax not between", value1, value2, "companyfax");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("usertype is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("usertype is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(Integer value) {
            addCriterion("usertype =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(Integer value) {
            addCriterion("usertype <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(Integer value) {
            addCriterion("usertype >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("usertype >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(Integer value) {
            addCriterion("usertype <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(Integer value) {
            addCriterion("usertype <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<Integer> values) {
            addCriterion("usertype in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<Integer> values) {
            addCriterion("usertype not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(Integer value1, Integer value2) {
            addCriterion("usertype between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("usertype not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andCheckidIsNull() {
            addCriterion("checkid is null");
            return (Criteria) this;
        }

        public Criteria andCheckidIsNotNull() {
            addCriterion("checkid is not null");
            return (Criteria) this;
        }

        public Criteria andCheckidEqualTo(Integer value) {
            addCriterion("checkid =", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotEqualTo(Integer value) {
            addCriterion("checkid <>", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidGreaterThan(Integer value) {
            addCriterion("checkid >", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkid >=", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidLessThan(Integer value) {
            addCriterion("checkid <", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidLessThanOrEqualTo(Integer value) {
            addCriterion("checkid <=", value, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidIn(List<Integer> values) {
            addCriterion("checkid in", values, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotIn(List<Integer> values) {
            addCriterion("checkid not in", values, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidBetween(Integer value1, Integer value2) {
            addCriterion("checkid between", value1, value2, "checkid");
            return (Criteria) this;
        }

        public Criteria andCheckidNotBetween(Integer value1, Integer value2) {
            addCriterion("checkid not between", value1, value2, "checkid");
            return (Criteria) this;
        }

        public Criteria andCompanycodeIsNull() {
            addCriterion("companycode is null");
            return (Criteria) this;
        }

        public Criteria andCompanycodeIsNotNull() {
            addCriterion("companycode is not null");
            return (Criteria) this;
        }

        public Criteria andCompanycodeEqualTo(String value) {
            addCriterion("companycode =", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotEqualTo(String value) {
            addCriterion("companycode <>", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeGreaterThan(String value) {
            addCriterion("companycode >", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeGreaterThanOrEqualTo(String value) {
            addCriterion("companycode >=", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeLessThan(String value) {
            addCriterion("companycode <", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeLessThanOrEqualTo(String value) {
            addCriterion("companycode <=", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeLike(String value) {
            addCriterion("companycode like", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotLike(String value) {
            addCriterion("companycode not like", value, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeIn(List<String> values) {
            addCriterion("companycode in", values, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotIn(List<String> values) {
            addCriterion("companycode not in", values, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeBetween(String value1, String value2) {
            addCriterion("companycode between", value1, value2, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanycodeNotBetween(String value1, String value2) {
            addCriterion("companycode not between", value1, value2, "companycode");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteIsNull() {
            addCriterion("companywebsite is null");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteIsNotNull() {
            addCriterion("companywebsite is not null");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteEqualTo(String value) {
            addCriterion("companywebsite =", value, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteNotEqualTo(String value) {
            addCriterion("companywebsite <>", value, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteGreaterThan(String value) {
            addCriterion("companywebsite >", value, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("companywebsite >=", value, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteLessThan(String value) {
            addCriterion("companywebsite <", value, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteLessThanOrEqualTo(String value) {
            addCriterion("companywebsite <=", value, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteLike(String value) {
            addCriterion("companywebsite like", value, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteNotLike(String value) {
            addCriterion("companywebsite not like", value, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteIn(List<String> values) {
            addCriterion("companywebsite in", values, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteNotIn(List<String> values) {
            addCriterion("companywebsite not in", values, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteBetween(String value1, String value2) {
            addCriterion("companywebsite between", value1, value2, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCompanywebsiteNotBetween(String value1, String value2) {
            addCriterion("companywebsite not between", value1, value2, "companywebsite");
            return (Criteria) this;
        }

        public Criteria andCookieIsNull() {
            addCriterion("cookie is null");
            return (Criteria) this;
        }

        public Criteria andCookieIsNotNull() {
            addCriterion("cookie is not null");
            return (Criteria) this;
        }

        public Criteria andCookieEqualTo(String value) {
            addCriterion("cookie =", value, "cookie");
            return (Criteria) this;
        }

        public Criteria andCookieNotEqualTo(String value) {
            addCriterion("cookie <>", value, "cookie");
            return (Criteria) this;
        }

        public Criteria andCookieGreaterThan(String value) {
            addCriterion("cookie >", value, "cookie");
            return (Criteria) this;
        }

        public Criteria andCookieGreaterThanOrEqualTo(String value) {
            addCriterion("cookie >=", value, "cookie");
            return (Criteria) this;
        }

        public Criteria andCookieLessThan(String value) {
            addCriterion("cookie <", value, "cookie");
            return (Criteria) this;
        }

        public Criteria andCookieLessThanOrEqualTo(String value) {
            addCriterion("cookie <=", value, "cookie");
            return (Criteria) this;
        }

        public Criteria andCookieLike(String value) {
            addCriterion("cookie like", value, "cookie");
            return (Criteria) this;
        }

        public Criteria andCookieNotLike(String value) {
            addCriterion("cookie not like", value, "cookie");
            return (Criteria) this;
        }

        public Criteria andCookieIn(List<String> values) {
            addCriterion("cookie in", values, "cookie");
            return (Criteria) this;
        }

        public Criteria andCookieNotIn(List<String> values) {
            addCriterion("cookie not in", values, "cookie");
            return (Criteria) this;
        }

        public Criteria andCookieBetween(String value1, String value2) {
            addCriterion("cookie between", value1, value2, "cookie");
            return (Criteria) this;
        }

        public Criteria andCookieNotBetween(String value1, String value2) {
            addCriterion("cookie not between", value1, value2, "cookie");
            return (Criteria) this;
        }

        public Criteria andAdminShortcutIsNull() {
            addCriterion("admin_shortcut is null");
            return (Criteria) this;
        }

        public Criteria andAdminShortcutIsNotNull() {
            addCriterion("admin_shortcut is not null");
            return (Criteria) this;
        }

        public Criteria andAdminShortcutEqualTo(String value) {
            addCriterion("admin_shortcut =", value, "adminShortcut");
            return (Criteria) this;
        }

        public Criteria andAdminShortcutNotEqualTo(String value) {
            addCriterion("admin_shortcut <>", value, "adminShortcut");
            return (Criteria) this;
        }

        public Criteria andAdminShortcutGreaterThan(String value) {
            addCriterion("admin_shortcut >", value, "adminShortcut");
            return (Criteria) this;
        }

        public Criteria andAdminShortcutGreaterThanOrEqualTo(String value) {
            addCriterion("admin_shortcut >=", value, "adminShortcut");
            return (Criteria) this;
        }

        public Criteria andAdminShortcutLessThan(String value) {
            addCriterion("admin_shortcut <", value, "adminShortcut");
            return (Criteria) this;
        }

        public Criteria andAdminShortcutLessThanOrEqualTo(String value) {
            addCriterion("admin_shortcut <=", value, "adminShortcut");
            return (Criteria) this;
        }

        public Criteria andAdminShortcutLike(String value) {
            addCriterion("admin_shortcut like", value, "adminShortcut");
            return (Criteria) this;
        }

        public Criteria andAdminShortcutNotLike(String value) {
            addCriterion("admin_shortcut not like", value, "adminShortcut");
            return (Criteria) this;
        }

        public Criteria andAdminShortcutIn(List<String> values) {
            addCriterion("admin_shortcut in", values, "adminShortcut");
            return (Criteria) this;
        }

        public Criteria andAdminShortcutNotIn(List<String> values) {
            addCriterion("admin_shortcut not in", values, "adminShortcut");
            return (Criteria) this;
        }

        public Criteria andAdminShortcutBetween(String value1, String value2) {
            addCriterion("admin_shortcut between", value1, value2, "adminShortcut");
            return (Criteria) this;
        }

        public Criteria andAdminShortcutNotBetween(String value1, String value2) {
            addCriterion("admin_shortcut not between", value1, value2, "adminShortcut");
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

        public Criteria andLangokIsNull() {
            addCriterion("langok is null");
            return (Criteria) this;
        }

        public Criteria andLangokIsNotNull() {
            addCriterion("langok is not null");
            return (Criteria) this;
        }

        public Criteria andLangokEqualTo(String value) {
            addCriterion("langok =", value, "langok");
            return (Criteria) this;
        }

        public Criteria andLangokNotEqualTo(String value) {
            addCriterion("langok <>", value, "langok");
            return (Criteria) this;
        }

        public Criteria andLangokGreaterThan(String value) {
            addCriterion("langok >", value, "langok");
            return (Criteria) this;
        }

        public Criteria andLangokGreaterThanOrEqualTo(String value) {
            addCriterion("langok >=", value, "langok");
            return (Criteria) this;
        }

        public Criteria andLangokLessThan(String value) {
            addCriterion("langok <", value, "langok");
            return (Criteria) this;
        }

        public Criteria andLangokLessThanOrEqualTo(String value) {
            addCriterion("langok <=", value, "langok");
            return (Criteria) this;
        }

        public Criteria andLangokLike(String value) {
            addCriterion("langok like", value, "langok");
            return (Criteria) this;
        }

        public Criteria andLangokNotLike(String value) {
            addCriterion("langok not like", value, "langok");
            return (Criteria) this;
        }

        public Criteria andLangokIn(List<String> values) {
            addCriterion("langok in", values, "langok");
            return (Criteria) this;
        }

        public Criteria andLangokNotIn(List<String> values) {
            addCriterion("langok not in", values, "langok");
            return (Criteria) this;
        }

        public Criteria andLangokBetween(String value1, String value2) {
            addCriterion("langok between", value1, value2, "langok");
            return (Criteria) this;
        }

        public Criteria andLangokNotBetween(String value1, String value2) {
            addCriterion("langok not between", value1, value2, "langok");
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