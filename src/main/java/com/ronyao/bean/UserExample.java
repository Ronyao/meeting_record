package com.ronyao.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserLastlogindateIsNull() {
            addCriterion("user_lastLoginDate is null");
            return (Criteria) this;
        }

        public Criteria andUserLastlogindateIsNotNull() {
            addCriterion("user_lastLoginDate is not null");
            return (Criteria) this;
        }

        public Criteria andUserLastlogindateEqualTo(Date value) {
            addCriterionForJDBCDate("user_lastLoginDate =", value, "userLastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserLastlogindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_lastLoginDate <>", value, "userLastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserLastlogindateGreaterThan(Date value) {
            addCriterionForJDBCDate("user_lastLoginDate >", value, "userLastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserLastlogindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_lastLoginDate >=", value, "userLastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserLastlogindateLessThan(Date value) {
            addCriterionForJDBCDate("user_lastLoginDate <", value, "userLastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserLastlogindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_lastLoginDate <=", value, "userLastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserLastlogindateIn(List<Date> values) {
            addCriterionForJDBCDate("user_lastLoginDate in", values, "userLastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserLastlogindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_lastLoginDate not in", values, "userLastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserLastlogindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_lastLoginDate between", value1, value2, "userLastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserLastlogindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_lastLoginDate not between", value1, value2, "userLastlogindate");
            return (Criteria) this;
        }

        public Criteria andUserLogincountIsNull() {
            addCriterion("user_loginCount is null");
            return (Criteria) this;
        }

        public Criteria andUserLogincountIsNotNull() {
            addCriterion("user_loginCount is not null");
            return (Criteria) this;
        }

        public Criteria andUserLogincountEqualTo(Integer value) {
            addCriterion("user_loginCount =", value, "userLogincount");
            return (Criteria) this;
        }

        public Criteria andUserLogincountNotEqualTo(Integer value) {
            addCriterion("user_loginCount <>", value, "userLogincount");
            return (Criteria) this;
        }

        public Criteria andUserLogincountGreaterThan(Integer value) {
            addCriterion("user_loginCount >", value, "userLogincount");
            return (Criteria) this;
        }

        public Criteria andUserLogincountGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_loginCount >=", value, "userLogincount");
            return (Criteria) this;
        }

        public Criteria andUserLogincountLessThan(Integer value) {
            addCriterion("user_loginCount <", value, "userLogincount");
            return (Criteria) this;
        }

        public Criteria andUserLogincountLessThanOrEqualTo(Integer value) {
            addCriterion("user_loginCount <=", value, "userLogincount");
            return (Criteria) this;
        }

        public Criteria andUserLogincountIn(List<Integer> values) {
            addCriterion("user_loginCount in", values, "userLogincount");
            return (Criteria) this;
        }

        public Criteria andUserLogincountNotIn(List<Integer> values) {
            addCriterion("user_loginCount not in", values, "userLogincount");
            return (Criteria) this;
        }

        public Criteria andUserLogincountBetween(Integer value1, Integer value2) {
            addCriterion("user_loginCount between", value1, value2, "userLogincount");
            return (Criteria) this;
        }

        public Criteria andUserLogincountNotBetween(Integer value1, Integer value2) {
            addCriterion("user_loginCount not between", value1, value2, "userLogincount");
            return (Criteria) this;
        }

        public Criteria andUserRightIsNull() {
            addCriterion("user_right is null");
            return (Criteria) this;
        }

        public Criteria andUserRightIsNotNull() {
            addCriterion("user_right is not null");
            return (Criteria) this;
        }

        public Criteria andUserRightEqualTo(Byte value) {
            addCriterion("user_right =", value, "userRight");
            return (Criteria) this;
        }

        public Criteria andUserRightNotEqualTo(Byte value) {
            addCriterion("user_right <>", value, "userRight");
            return (Criteria) this;
        }

        public Criteria andUserRightGreaterThan(Byte value) {
            addCriterion("user_right >", value, "userRight");
            return (Criteria) this;
        }

        public Criteria andUserRightGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_right >=", value, "userRight");
            return (Criteria) this;
        }

        public Criteria andUserRightLessThan(Byte value) {
            addCriterion("user_right <", value, "userRight");
            return (Criteria) this;
        }

        public Criteria andUserRightLessThanOrEqualTo(Byte value) {
            addCriterion("user_right <=", value, "userRight");
            return (Criteria) this;
        }

        public Criteria andUserRightIn(List<Byte> values) {
            addCriterion("user_right in", values, "userRight");
            return (Criteria) this;
        }

        public Criteria andUserRightNotIn(List<Byte> values) {
            addCriterion("user_right not in", values, "userRight");
            return (Criteria) this;
        }

        public Criteria andUserRightBetween(Byte value1, Byte value2) {
            addCriterion("user_right between", value1, value2, "userRight");
            return (Criteria) this;
        }

        public Criteria andUserRightNotBetween(Byte value1, Byte value2) {
            addCriterion("user_right not between", value1, value2, "userRight");
            return (Criteria) this;
        }

        public Criteria andUserWhetherIsNull() {
            addCriterion("user_whether is null");
            return (Criteria) this;
        }

        public Criteria andUserWhetherIsNotNull() {
            addCriterion("user_whether is not null");
            return (Criteria) this;
        }

        public Criteria andUserWhetherEqualTo(Byte value) {
            addCriterion("user_whether =", value, "userWhether");
            return (Criteria) this;
        }

        public Criteria andUserWhetherNotEqualTo(Byte value) {
            addCriterion("user_whether <>", value, "userWhether");
            return (Criteria) this;
        }

        public Criteria andUserWhetherGreaterThan(Byte value) {
            addCriterion("user_whether >", value, "userWhether");
            return (Criteria) this;
        }

        public Criteria andUserWhetherGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_whether >=", value, "userWhether");
            return (Criteria) this;
        }

        public Criteria andUserWhetherLessThan(Byte value) {
            addCriterion("user_whether <", value, "userWhether");
            return (Criteria) this;
        }

        public Criteria andUserWhetherLessThanOrEqualTo(Byte value) {
            addCriterion("user_whether <=", value, "userWhether");
            return (Criteria) this;
        }

        public Criteria andUserWhetherIn(List<Byte> values) {
            addCriterion("user_whether in", values, "userWhether");
            return (Criteria) this;
        }

        public Criteria andUserWhetherNotIn(List<Byte> values) {
            addCriterion("user_whether not in", values, "userWhether");
            return (Criteria) this;
        }

        public Criteria andUserWhetherBetween(Byte value1, Byte value2) {
            addCriterion("user_whether between", value1, value2, "userWhether");
            return (Criteria) this;
        }

        public Criteria andUserWhetherNotBetween(Byte value1, Byte value2) {
            addCriterion("user_whether not between", value1, value2, "userWhether");
            return (Criteria) this;
        }

        public Criteria andUserDepartIsNull() {
            addCriterion("user_depart is null");
            return (Criteria) this;
        }

        public Criteria andUserDepartIsNotNull() {
            addCriterion("user_depart is not null");
            return (Criteria) this;
        }

        public Criteria andUserDepartEqualTo(Integer value) {
            addCriterion("user_depart =", value, "userDepart");
            return (Criteria) this;
        }

        public Criteria andUserDepartNotEqualTo(Integer value) {
            addCriterion("user_depart <>", value, "userDepart");
            return (Criteria) this;
        }

        public Criteria andUserDepartGreaterThan(Integer value) {
            addCriterion("user_depart >", value, "userDepart");
            return (Criteria) this;
        }

        public Criteria andUserDepartGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_depart >=", value, "userDepart");
            return (Criteria) this;
        }

        public Criteria andUserDepartLessThan(Integer value) {
            addCriterion("user_depart <", value, "userDepart");
            return (Criteria) this;
        }

        public Criteria andUserDepartLessThanOrEqualTo(Integer value) {
            addCriterion("user_depart <=", value, "userDepart");
            return (Criteria) this;
        }

        public Criteria andUserDepartIn(List<Integer> values) {
            addCriterion("user_depart in", values, "userDepart");
            return (Criteria) this;
        }

        public Criteria andUserDepartNotIn(List<Integer> values) {
            addCriterion("user_depart not in", values, "userDepart");
            return (Criteria) this;
        }

        public Criteria andUserDepartBetween(Integer value1, Integer value2) {
            addCriterion("user_depart between", value1, value2, "userDepart");
            return (Criteria) this;
        }

        public Criteria andUserDepartNotBetween(Integer value1, Integer value2) {
            addCriterion("user_depart not between", value1, value2, "userDepart");
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