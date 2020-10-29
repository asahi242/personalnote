package com.asahi.personalnote.domain.base;

import java.util.ArrayList;
import java.util.List;

public class ThemeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThemeExample() {
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

        public Criteria andThemenameIsNull() {
            addCriterion("themename is null");
            return (Criteria) this;
        }

        public Criteria andThemenameIsNotNull() {
            addCriterion("themename is not null");
            return (Criteria) this;
        }

        public Criteria andThemenameEqualTo(String value) {
            addCriterion("themename =", value, "themename");
            return (Criteria) this;
        }

        public Criteria andThemenameNotEqualTo(String value) {
            addCriterion("themename <>", value, "themename");
            return (Criteria) this;
        }

        public Criteria andThemenameGreaterThan(String value) {
            addCriterion("themename >", value, "themename");
            return (Criteria) this;
        }

        public Criteria andThemenameGreaterThanOrEqualTo(String value) {
            addCriterion("themename >=", value, "themename");
            return (Criteria) this;
        }

        public Criteria andThemenameLessThan(String value) {
            addCriterion("themename <", value, "themename");
            return (Criteria) this;
        }

        public Criteria andThemenameLessThanOrEqualTo(String value) {
            addCriterion("themename <=", value, "themename");
            return (Criteria) this;
        }

        public Criteria andThemenameLike(String value) {
            addCriterion("themename like", value, "themename");
            return (Criteria) this;
        }

        public Criteria andThemenameNotLike(String value) {
            addCriterion("themename not like", value, "themename");
            return (Criteria) this;
        }

        public Criteria andThemenameIn(List<String> values) {
            addCriterion("themename in", values, "themename");
            return (Criteria) this;
        }

        public Criteria andThemenameNotIn(List<String> values) {
            addCriterion("themename not in", values, "themename");
            return (Criteria) this;
        }

        public Criteria andThemenameBetween(String value1, String value2) {
            addCriterion("themename between", value1, value2, "themename");
            return (Criteria) this;
        }

        public Criteria andThemenameNotBetween(String value1, String value2) {
            addCriterion("themename not between", value1, value2, "themename");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andIslockIsNull() {
            addCriterion("islock is null");
            return (Criteria) this;
        }

        public Criteria andIslockIsNotNull() {
            addCriterion("islock is not null");
            return (Criteria) this;
        }

        public Criteria andIslockEqualTo(Byte value) {
            addCriterion("islock =", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockNotEqualTo(Byte value) {
            addCriterion("islock <>", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockGreaterThan(Byte value) {
            addCriterion("islock >", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockGreaterThanOrEqualTo(Byte value) {
            addCriterion("islock >=", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockLessThan(Byte value) {
            addCriterion("islock <", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockLessThanOrEqualTo(Byte value) {
            addCriterion("islock <=", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockIn(List<Byte> values) {
            addCriterion("islock in", values, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockNotIn(List<Byte> values) {
            addCriterion("islock not in", values, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockBetween(Byte value1, Byte value2) {
            addCriterion("islock between", value1, value2, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockNotBetween(Byte value1, Byte value2) {
            addCriterion("islock not between", value1, value2, "islock");
            return (Criteria) this;
        }

        public Criteria andLockpasswordIsNull() {
            addCriterion("lockpassword is null");
            return (Criteria) this;
        }

        public Criteria andLockpasswordIsNotNull() {
            addCriterion("lockpassword is not null");
            return (Criteria) this;
        }

        public Criteria andLockpasswordEqualTo(String value) {
            addCriterion("lockpassword =", value, "lockpassword");
            return (Criteria) this;
        }

        public Criteria andLockpasswordNotEqualTo(String value) {
            addCriterion("lockpassword <>", value, "lockpassword");
            return (Criteria) this;
        }

        public Criteria andLockpasswordGreaterThan(String value) {
            addCriterion("lockpassword >", value, "lockpassword");
            return (Criteria) this;
        }

        public Criteria andLockpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("lockpassword >=", value, "lockpassword");
            return (Criteria) this;
        }

        public Criteria andLockpasswordLessThan(String value) {
            addCriterion("lockpassword <", value, "lockpassword");
            return (Criteria) this;
        }

        public Criteria andLockpasswordLessThanOrEqualTo(String value) {
            addCriterion("lockpassword <=", value, "lockpassword");
            return (Criteria) this;
        }

        public Criteria andLockpasswordLike(String value) {
            addCriterion("lockpassword like", value, "lockpassword");
            return (Criteria) this;
        }

        public Criteria andLockpasswordNotLike(String value) {
            addCriterion("lockpassword not like", value, "lockpassword");
            return (Criteria) this;
        }

        public Criteria andLockpasswordIn(List<String> values) {
            addCriterion("lockpassword in", values, "lockpassword");
            return (Criteria) this;
        }

        public Criteria andLockpasswordNotIn(List<String> values) {
            addCriterion("lockpassword not in", values, "lockpassword");
            return (Criteria) this;
        }

        public Criteria andLockpasswordBetween(String value1, String value2) {
            addCriterion("lockpassword between", value1, value2, "lockpassword");
            return (Criteria) this;
        }

        public Criteria andLockpasswordNotBetween(String value1, String value2) {
            addCriterion("lockpassword not between", value1, value2, "lockpassword");
            return (Criteria) this;
        }

        public Criteria andPasswordhintIsNull() {
            addCriterion("passwordhint is null");
            return (Criteria) this;
        }

        public Criteria andPasswordhintIsNotNull() {
            addCriterion("passwordhint is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordhintEqualTo(String value) {
            addCriterion("passwordhint =", value, "passwordhint");
            return (Criteria) this;
        }

        public Criteria andPasswordhintNotEqualTo(String value) {
            addCriterion("passwordhint <>", value, "passwordhint");
            return (Criteria) this;
        }

        public Criteria andPasswordhintGreaterThan(String value) {
            addCriterion("passwordhint >", value, "passwordhint");
            return (Criteria) this;
        }

        public Criteria andPasswordhintGreaterThanOrEqualTo(String value) {
            addCriterion("passwordhint >=", value, "passwordhint");
            return (Criteria) this;
        }

        public Criteria andPasswordhintLessThan(String value) {
            addCriterion("passwordhint <", value, "passwordhint");
            return (Criteria) this;
        }

        public Criteria andPasswordhintLessThanOrEqualTo(String value) {
            addCriterion("passwordhint <=", value, "passwordhint");
            return (Criteria) this;
        }

        public Criteria andPasswordhintLike(String value) {
            addCriterion("passwordhint like", value, "passwordhint");
            return (Criteria) this;
        }

        public Criteria andPasswordhintNotLike(String value) {
            addCriterion("passwordhint not like", value, "passwordhint");
            return (Criteria) this;
        }

        public Criteria andPasswordhintIn(List<String> values) {
            addCriterion("passwordhint in", values, "passwordhint");
            return (Criteria) this;
        }

        public Criteria andPasswordhintNotIn(List<String> values) {
            addCriterion("passwordhint not in", values, "passwordhint");
            return (Criteria) this;
        }

        public Criteria andPasswordhintBetween(String value1, String value2) {
            addCriterion("passwordhint between", value1, value2, "passwordhint");
            return (Criteria) this;
        }

        public Criteria andPasswordhintNotBetween(String value1, String value2) {
            addCriterion("passwordhint not between", value1, value2, "passwordhint");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Long value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Long value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Long value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Long value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Long value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Long> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Long> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Long value1, Long value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Long value1, Long value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNull() {
            addCriterion("modifytime is null");
            return (Criteria) this;
        }

        public Criteria andModifytimeIsNotNull() {
            addCriterion("modifytime is not null");
            return (Criteria) this;
        }

        public Criteria andModifytimeEqualTo(Long value) {
            addCriterion("modifytime =", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotEqualTo(Long value) {
            addCriterion("modifytime <>", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThan(Long value) {
            addCriterion("modifytime >", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeGreaterThanOrEqualTo(Long value) {
            addCriterion("modifytime >=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThan(Long value) {
            addCriterion("modifytime <", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeLessThanOrEqualTo(Long value) {
            addCriterion("modifytime <=", value, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeIn(List<Long> values) {
            addCriterion("modifytime in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotIn(List<Long> values) {
            addCriterion("modifytime not in", values, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeBetween(Long value1, Long value2) {
            addCriterion("modifytime between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andModifytimeNotBetween(Long value1, Long value2) {
            addCriterion("modifytime not between", value1, value2, "modifytime");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isdelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isdelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Byte value) {
            addCriterion("isdelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Byte value) {
            addCriterion("isdelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Byte value) {
            addCriterion("isdelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("isdelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Byte value) {
            addCriterion("isdelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Byte value) {
            addCriterion("isdelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Byte> values) {
            addCriterion("isdelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Byte> values) {
            addCriterion("isdelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Byte value1, Byte value2) {
            addCriterion("isdelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("isdelete not between", value1, value2, "isdelete");
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