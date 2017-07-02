package com.ronyao.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MeetingInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeetingInfoExample() {
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

        public Criteria andMeetingIdIsNull() {
            addCriterion("meeting_id is null");
            return (Criteria) this;
        }

        public Criteria andMeetingIdIsNotNull() {
            addCriterion("meeting_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingIdEqualTo(Integer value) {
            addCriterion("meeting_id =", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotEqualTo(Integer value) {
            addCriterion("meeting_id <>", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdGreaterThan(Integer value) {
            addCriterion("meeting_id >", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("meeting_id >=", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdLessThan(Integer value) {
            addCriterion("meeting_id <", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdLessThanOrEqualTo(Integer value) {
            addCriterion("meeting_id <=", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdIn(List<Integer> values) {
            addCriterion("meeting_id in", values, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotIn(List<Integer> values) {
            addCriterion("meeting_id not in", values, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdBetween(Integer value1, Integer value2) {
            addCriterion("meeting_id between", value1, value2, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("meeting_id not between", value1, value2, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingNameIsNull() {
            addCriterion("meeting_name is null");
            return (Criteria) this;
        }

        public Criteria andMeetingNameIsNotNull() {
            addCriterion("meeting_name is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingNameEqualTo(String value) {
            addCriterion("meeting_name =", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotEqualTo(String value) {
            addCriterion("meeting_name <>", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameGreaterThan(String value) {
            addCriterion("meeting_name >", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_name >=", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameLessThan(String value) {
            addCriterion("meeting_name <", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameLessThanOrEqualTo(String value) {
            addCriterion("meeting_name <=", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameLike(String value) {
            addCriterion("meeting_name like", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotLike(String value) {
            addCriterion("meeting_name not like", value, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameIn(List<String> values) {
            addCriterion("meeting_name in", values, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotIn(List<String> values) {
            addCriterion("meeting_name not in", values, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameBetween(String value1, String value2) {
            addCriterion("meeting_name between", value1, value2, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingNameNotBetween(String value1, String value2) {
            addCriterion("meeting_name not between", value1, value2, "meetingName");
            return (Criteria) this;
        }

        public Criteria andMeetingDepartmentIsNull() {
            addCriterion("meeting_department is null");
            return (Criteria) this;
        }

        public Criteria andMeetingDepartmentIsNotNull() {
            addCriterion("meeting_department is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingDepartmentEqualTo(Integer value) {
            addCriterion("meeting_department =", value, "meetingDepartment");
            return (Criteria) this;
        }

        public Criteria andMeetingDepartmentNotEqualTo(Integer value) {
            addCriterion("meeting_department <>", value, "meetingDepartment");
            return (Criteria) this;
        }

        public Criteria andMeetingDepartmentGreaterThan(Integer value) {
            addCriterion("meeting_department >", value, "meetingDepartment");
            return (Criteria) this;
        }

        public Criteria andMeetingDepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("meeting_department >=", value, "meetingDepartment");
            return (Criteria) this;
        }

        public Criteria andMeetingDepartmentLessThan(Integer value) {
            addCriterion("meeting_department <", value, "meetingDepartment");
            return (Criteria) this;
        }

        public Criteria andMeetingDepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("meeting_department <=", value, "meetingDepartment");
            return (Criteria) this;
        }

        public Criteria andMeetingDepartmentIn(List<Integer> values) {
            addCriterion("meeting_department in", values, "meetingDepartment");
            return (Criteria) this;
        }

        public Criteria andMeetingDepartmentNotIn(List<Integer> values) {
            addCriterion("meeting_department not in", values, "meetingDepartment");
            return (Criteria) this;
        }

        public Criteria andMeetingDepartmentBetween(Integer value1, Integer value2) {
            addCriterion("meeting_department between", value1, value2, "meetingDepartment");
            return (Criteria) this;
        }

        public Criteria andMeetingDepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("meeting_department not between", value1, value2, "meetingDepartment");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceIsNull() {
            addCriterion("meeting_place is null");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceIsNotNull() {
            addCriterion("meeting_place is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceEqualTo(String value) {
            addCriterion("meeting_place =", value, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceNotEqualTo(String value) {
            addCriterion("meeting_place <>", value, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceGreaterThan(String value) {
            addCriterion("meeting_place >", value, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_place >=", value, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceLessThan(String value) {
            addCriterion("meeting_place <", value, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceLessThanOrEqualTo(String value) {
            addCriterion("meeting_place <=", value, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceLike(String value) {
            addCriterion("meeting_place like", value, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceNotLike(String value) {
            addCriterion("meeting_place not like", value, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceIn(List<String> values) {
            addCriterion("meeting_place in", values, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceNotIn(List<String> values) {
            addCriterion("meeting_place not in", values, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceBetween(String value1, String value2) {
            addCriterion("meeting_place between", value1, value2, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingPlaceNotBetween(String value1, String value2) {
            addCriterion("meeting_place not between", value1, value2, "meetingPlace");
            return (Criteria) this;
        }

        public Criteria andMeetingDateIsNull() {
            addCriterion("meeting_date is null");
            return (Criteria) this;
        }

        public Criteria andMeetingDateIsNotNull() {
            addCriterion("meeting_date is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingDateEqualTo(Date value) {
            addCriterionForJDBCDate("meeting_date =", value, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("meeting_date <>", value, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateGreaterThan(Date value) {
            addCriterionForJDBCDate("meeting_date >", value, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("meeting_date >=", value, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateLessThan(Date value) {
            addCriterionForJDBCDate("meeting_date <", value, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("meeting_date <=", value, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateIn(List<Date> values) {
            addCriterionForJDBCDate("meeting_date in", values, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("meeting_date not in", values, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("meeting_date between", value1, value2, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("meeting_date not between", value1, value2, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingHostIsNull() {
            addCriterion("meeting_host is null");
            return (Criteria) this;
        }

        public Criteria andMeetingHostIsNotNull() {
            addCriterion("meeting_host is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingHostEqualTo(String value) {
            addCriterion("meeting_host =", value, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostNotEqualTo(String value) {
            addCriterion("meeting_host <>", value, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostGreaterThan(String value) {
            addCriterion("meeting_host >", value, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_host >=", value, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostLessThan(String value) {
            addCriterion("meeting_host <", value, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostLessThanOrEqualTo(String value) {
            addCriterion("meeting_host <=", value, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostLike(String value) {
            addCriterion("meeting_host like", value, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostNotLike(String value) {
            addCriterion("meeting_host not like", value, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostIn(List<String> values) {
            addCriterion("meeting_host in", values, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostNotIn(List<String> values) {
            addCriterion("meeting_host not in", values, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostBetween(String value1, String value2) {
            addCriterion("meeting_host between", value1, value2, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingHostNotBetween(String value1, String value2) {
            addCriterion("meeting_host not between", value1, value2, "meetingHost");
            return (Criteria) this;
        }

        public Criteria andMeetingPresentIsNull() {
            addCriterion("meeting_present is null");
            return (Criteria) this;
        }

        public Criteria andMeetingPresentIsNotNull() {
            addCriterion("meeting_present is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingPresentEqualTo(String value) {
            addCriterion("meeting_present =", value, "meetingPresent");
            return (Criteria) this;
        }

        public Criteria andMeetingPresentNotEqualTo(String value) {
            addCriterion("meeting_present <>", value, "meetingPresent");
            return (Criteria) this;
        }

        public Criteria andMeetingPresentGreaterThan(String value) {
            addCriterion("meeting_present >", value, "meetingPresent");
            return (Criteria) this;
        }

        public Criteria andMeetingPresentGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_present >=", value, "meetingPresent");
            return (Criteria) this;
        }

        public Criteria andMeetingPresentLessThan(String value) {
            addCriterion("meeting_present <", value, "meetingPresent");
            return (Criteria) this;
        }

        public Criteria andMeetingPresentLessThanOrEqualTo(String value) {
            addCriterion("meeting_present <=", value, "meetingPresent");
            return (Criteria) this;
        }

        public Criteria andMeetingPresentLike(String value) {
            addCriterion("meeting_present like", value, "meetingPresent");
            return (Criteria) this;
        }

        public Criteria andMeetingPresentNotLike(String value) {
            addCriterion("meeting_present not like", value, "meetingPresent");
            return (Criteria) this;
        }

        public Criteria andMeetingPresentIn(List<String> values) {
            addCriterion("meeting_present in", values, "meetingPresent");
            return (Criteria) this;
        }

        public Criteria andMeetingPresentNotIn(List<String> values) {
            addCriterion("meeting_present not in", values, "meetingPresent");
            return (Criteria) this;
        }

        public Criteria andMeetingPresentBetween(String value1, String value2) {
            addCriterion("meeting_present between", value1, value2, "meetingPresent");
            return (Criteria) this;
        }

        public Criteria andMeetingPresentNotBetween(String value1, String value2) {
            addCriterion("meeting_present not between", value1, value2, "meetingPresent");
            return (Criteria) this;
        }

        public Criteria andMeetingSaverIsNull() {
            addCriterion("meeting_saver is null");
            return (Criteria) this;
        }

        public Criteria andMeetingSaverIsNotNull() {
            addCriterion("meeting_saver is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingSaverEqualTo(String value) {
            addCriterion("meeting_saver =", value, "meetingSaver");
            return (Criteria) this;
        }

        public Criteria andMeetingSaverNotEqualTo(String value) {
            addCriterion("meeting_saver <>", value, "meetingSaver");
            return (Criteria) this;
        }

        public Criteria andMeetingSaverGreaterThan(String value) {
            addCriterion("meeting_saver >", value, "meetingSaver");
            return (Criteria) this;
        }

        public Criteria andMeetingSaverGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_saver >=", value, "meetingSaver");
            return (Criteria) this;
        }

        public Criteria andMeetingSaverLessThan(String value) {
            addCriterion("meeting_saver <", value, "meetingSaver");
            return (Criteria) this;
        }

        public Criteria andMeetingSaverLessThanOrEqualTo(String value) {
            addCriterion("meeting_saver <=", value, "meetingSaver");
            return (Criteria) this;
        }

        public Criteria andMeetingSaverLike(String value) {
            addCriterion("meeting_saver like", value, "meetingSaver");
            return (Criteria) this;
        }

        public Criteria andMeetingSaverNotLike(String value) {
            addCriterion("meeting_saver not like", value, "meetingSaver");
            return (Criteria) this;
        }

        public Criteria andMeetingSaverIn(List<String> values) {
            addCriterion("meeting_saver in", values, "meetingSaver");
            return (Criteria) this;
        }

        public Criteria andMeetingSaverNotIn(List<String> values) {
            addCriterion("meeting_saver not in", values, "meetingSaver");
            return (Criteria) this;
        }

        public Criteria andMeetingSaverBetween(String value1, String value2) {
            addCriterion("meeting_saver between", value1, value2, "meetingSaver");
            return (Criteria) this;
        }

        public Criteria andMeetingSaverNotBetween(String value1, String value2) {
            addCriterion("meeting_saver not between", value1, value2, "meetingSaver");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstructIsNull() {
            addCriterion("meeting_abstruct is null");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstructIsNotNull() {
            addCriterion("meeting_abstruct is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstructEqualTo(String value) {
            addCriterion("meeting_abstruct =", value, "meetingAbstruct");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstructNotEqualTo(String value) {
            addCriterion("meeting_abstruct <>", value, "meetingAbstruct");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstructGreaterThan(String value) {
            addCriterion("meeting_abstruct >", value, "meetingAbstruct");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstructGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_abstruct >=", value, "meetingAbstruct");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstructLessThan(String value) {
            addCriterion("meeting_abstruct <", value, "meetingAbstruct");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstructLessThanOrEqualTo(String value) {
            addCriterion("meeting_abstruct <=", value, "meetingAbstruct");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstructLike(String value) {
            addCriterion("meeting_abstruct like", value, "meetingAbstruct");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstructNotLike(String value) {
            addCriterion("meeting_abstruct not like", value, "meetingAbstruct");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstructIn(List<String> values) {
            addCriterion("meeting_abstruct in", values, "meetingAbstruct");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstructNotIn(List<String> values) {
            addCriterion("meeting_abstruct not in", values, "meetingAbstruct");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstructBetween(String value1, String value2) {
            addCriterion("meeting_abstruct between", value1, value2, "meetingAbstruct");
            return (Criteria) this;
        }

        public Criteria andMeetingAbstructNotBetween(String value1, String value2) {
            addCriterion("meeting_abstruct not between", value1, value2, "meetingAbstruct");
            return (Criteria) this;
        }

        public Criteria andMeetingRemarksIsNull() {
            addCriterion("meeting_remarks is null");
            return (Criteria) this;
        }

        public Criteria andMeetingRemarksIsNotNull() {
            addCriterion("meeting_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingRemarksEqualTo(String value) {
            addCriterion("meeting_remarks =", value, "meetingRemarks");
            return (Criteria) this;
        }

        public Criteria andMeetingRemarksNotEqualTo(String value) {
            addCriterion("meeting_remarks <>", value, "meetingRemarks");
            return (Criteria) this;
        }

        public Criteria andMeetingRemarksGreaterThan(String value) {
            addCriterion("meeting_remarks >", value, "meetingRemarks");
            return (Criteria) this;
        }

        public Criteria andMeetingRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_remarks >=", value, "meetingRemarks");
            return (Criteria) this;
        }

        public Criteria andMeetingRemarksLessThan(String value) {
            addCriterion("meeting_remarks <", value, "meetingRemarks");
            return (Criteria) this;
        }

        public Criteria andMeetingRemarksLessThanOrEqualTo(String value) {
            addCriterion("meeting_remarks <=", value, "meetingRemarks");
            return (Criteria) this;
        }

        public Criteria andMeetingRemarksLike(String value) {
            addCriterion("meeting_remarks like", value, "meetingRemarks");
            return (Criteria) this;
        }

        public Criteria andMeetingRemarksNotLike(String value) {
            addCriterion("meeting_remarks not like", value, "meetingRemarks");
            return (Criteria) this;
        }

        public Criteria andMeetingRemarksIn(List<String> values) {
            addCriterion("meeting_remarks in", values, "meetingRemarks");
            return (Criteria) this;
        }

        public Criteria andMeetingRemarksNotIn(List<String> values) {
            addCriterion("meeting_remarks not in", values, "meetingRemarks");
            return (Criteria) this;
        }

        public Criteria andMeetingRemarksBetween(String value1, String value2) {
            addCriterion("meeting_remarks between", value1, value2, "meetingRemarks");
            return (Criteria) this;
        }

        public Criteria andMeetingRemarksNotBetween(String value1, String value2) {
            addCriterion("meeting_remarks not between", value1, value2, "meetingRemarks");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeIsNull() {
            addCriterion("meeting_type is null");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeIsNotNull() {
            addCriterion("meeting_type is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeEqualTo(Integer value) {
            addCriterion("meeting_type =", value, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeNotEqualTo(Integer value) {
            addCriterion("meeting_type <>", value, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeGreaterThan(Integer value) {
            addCriterion("meeting_type >", value, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("meeting_type >=", value, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeLessThan(Integer value) {
            addCriterion("meeting_type <", value, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeLessThanOrEqualTo(Integer value) {
            addCriterion("meeting_type <=", value, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeIn(List<Integer> values) {
            addCriterion("meeting_type in", values, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeNotIn(List<Integer> values) {
            addCriterion("meeting_type not in", values, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeBetween(Integer value1, Integer value2) {
            addCriterion("meeting_type between", value1, value2, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("meeting_type not between", value1, value2, "meetingType");
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