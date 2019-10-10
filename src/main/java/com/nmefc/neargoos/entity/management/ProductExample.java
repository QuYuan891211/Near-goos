//package com.nmefc.neargoos.entity.management;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//public class ProductExample {
//    protected String orderByClause;
//
//    protected boolean distinct;
//
//    protected List<Criteria> oredCriteria;
//
//    public ProductExample() {
//        oredCriteria = new ArrayList<Criteria>();
//    }
//
//    public void setOrderByClause(String orderByClause) {
//        this.orderByClause = orderByClause;
//    }
//
//    public String getOrderByClause() {
//        return orderByClause;
//    }
//
//    public void setDistinct(boolean distinct) {
//        this.distinct = distinct;
//    }
//
//    public boolean isDistinct() {
//        return distinct;
//    }
//
//    public List<Criteria> getOredCriteria() {
//        return oredCriteria;
//    }
//
//    public void or(Criteria criteria) {
//        oredCriteria.add(criteria);
//    }
//
//    public Criteria or() {
//        Criteria criteria = createCriteriaInternal();
//        oredCriteria.add(criteria);
//        return criteria;
//    }
//
//    public Criteria createCriteria() {
//        Criteria criteria = createCriteriaInternal();
//        if (oredCriteria.size() == 0) {
//            oredCriteria.add(criteria);
//        }
//        return criteria;
//    }
//
//    protected Criteria createCriteriaInternal() {
//        Criteria criteria = new Criteria();
//        return criteria;
//    }
//
//    public void clear() {
//        oredCriteria.clear();
//        orderByClause = null;
//        distinct = false;
//    }
//
//    protected abstract static class GeneratedCriteria {
//        protected List<Criterion> criteria;
//
//        protected GeneratedCriteria() {
//            super();
//            criteria = new ArrayList<Criterion>();
//        }
//
//        public boolean isValid() {
//            return criteria.size() > 0;
//        }
//
//        public List<Criterion> getAllCriteria() {
//            return criteria;
//        }
//
//        public List<Criterion> getCriteria() {
//            return criteria;
//        }
//
//        protected void addCriterion(String condition) {
//            if (condition == null) {
//                throw new RuntimeException("Value for condition cannot be null");
//            }
//            criteria.add(new Criterion(condition));
//        }
//
//        protected void addCriterion(String condition, Object value, String property) {
//            if (value == null) {
//                throw new RuntimeException("Value for " + property + " cannot be null");
//            }
//            criteria.add(new Criterion(condition, value));
//        }
//
//        protected void addCriterion(String condition, Object value1, Object value2, String property) {
//            if (value1 == null || value2 == null) {
//                throw new RuntimeException("Between values for " + property + " cannot be null");
//            }
//            criteria.add(new Criterion(condition, value1, value2));
//        }
//
//        public Criteria andIdIsNull() {
//            addCriterion("id is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdIsNotNull() {
//            addCriterion("id is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdEqualTo(Integer value) {
//            addCriterion("id =", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdNotEqualTo(Integer value) {
//            addCriterion("id <>", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdGreaterThan(Integer value) {
//            addCriterion("id >", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
//            addCriterion("id >=", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdLessThan(Integer value) {
//            addCriterion("id <", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdLessThanOrEqualTo(Integer value) {
//            addCriterion("id <=", value, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdIn(List<Integer> values) {
//            addCriterion("id in", values, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdNotIn(List<Integer> values) {
//            addCriterion("id not in", values, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdBetween(Integer value1, Integer value2) {
//            addCriterion("id between", value1, value2, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andIdNotBetween(Integer value1, Integer value2) {
//            addCriterion("id not between", value1, value2, "id");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameIsNull() {
//            addCriterion("name is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameIsNotNull() {
//            addCriterion("name is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameEqualTo(String value) {
//            addCriterion("name =", value, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameNotEqualTo(String value) {
//            addCriterion("name <>", value, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameGreaterThan(String value) {
//            addCriterion("name >", value, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameGreaterThanOrEqualTo(String value) {
//            addCriterion("name >=", value, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameLessThan(String value) {
//            addCriterion("name <", value, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameLessThanOrEqualTo(String value) {
//            addCriterion("name <=", value, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameLike(String value) {
//            addCriterion("name like", value, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameNotLike(String value) {
//            addCriterion("name not like", value, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameIn(List<String> values) {
//            addCriterion("name in", values, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameNotIn(List<String> values) {
//            addCriterion("name not in", values, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameBetween(String value1, String value2) {
//            addCriterion("name between", value1, value2, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andNameNotBetween(String value1, String value2) {
//            addCriterion("name not between", value1, value2, "name");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeIsNull() {
//            addCriterion("type is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeIsNotNull() {
//            addCriterion("type is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeEqualTo(Integer value) {
//            addCriterion("type =", value, "type");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeNotEqualTo(Integer value) {
//            addCriterion("type <>", value, "type");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeGreaterThan(Integer value) {
//            addCriterion("type >", value, "type");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
//            addCriterion("type >=", value, "type");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeLessThan(Integer value) {
//            addCriterion("type <", value, "type");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeLessThanOrEqualTo(Integer value) {
//            addCriterion("type <=", value, "type");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeIn(List<Integer> values) {
//            addCriterion("type in", values, "type");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeNotIn(List<Integer> values) {
//            addCriterion("type not in", values, "type");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeBetween(Integer value1, Integer value2) {
//            addCriterion("type between", value1, value2, "type");
//            return (Criteria) this;
//        }
//
//        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
//            addCriterion("type not between", value1, value2, "type");
//            return (Criteria) this;
//        }
//
//        public Criteria andAreaIsNull() {
//            addCriterion("area is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andAreaIsNotNull() {
//            addCriterion("area is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andAreaEqualTo(Integer value) {
//            addCriterion("area =", value, "area");
//            return (Criteria) this;
//        }
//
//        public Criteria andAreaNotEqualTo(Integer value) {
//            addCriterion("area <>", value, "area");
//            return (Criteria) this;
//        }
//
//        public Criteria andAreaGreaterThan(Integer value) {
//            addCriterion("area >", value, "area");
//            return (Criteria) this;
//        }
//
//        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
//            addCriterion("area >=", value, "area");
//            return (Criteria) this;
//        }
//
//        public Criteria andAreaLessThan(Integer value) {
//            addCriterion("area <", value, "area");
//            return (Criteria) this;
//        }
//
//        public Criteria andAreaLessThanOrEqualTo(Integer value) {
//            addCriterion("area <=", value, "area");
//            return (Criteria) this;
//        }
//
//        public Criteria andAreaIn(List<Integer> values) {
//            addCriterion("area in", values, "area");
//            return (Criteria) this;
//        }
//
//        public Criteria andAreaNotIn(List<Integer> values) {
//            addCriterion("area not in", values, "area");
//            return (Criteria) this;
//        }
//
//        public Criteria andAreaBetween(Integer value1, Integer value2) {
//            addCriterion("area between", value1, value2, "area");
//            return (Criteria) this;
//        }
//
//        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
//            addCriterion("area not between", value1, value2, "area");
//            return (Criteria) this;
//        }
//
//        public Criteria andIntervalIsNull() {
//            addCriterion("interval is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andIntervalIsNotNull() {
//            addCriterion("interval is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andIntervalEqualTo(Integer value) {
//            addCriterion("interval =", value, "interval");
//            return (Criteria) this;
//        }
//
//        public Criteria andIntervalNotEqualTo(Integer value) {
//            addCriterion("interval <>", value, "interval");
//            return (Criteria) this;
//        }
//
//        public Criteria andIntervalGreaterThan(Integer value) {
//            addCriterion("interval >", value, "interval");
//            return (Criteria) this;
//        }
//
//        public Criteria andIntervalGreaterThanOrEqualTo(Integer value) {
//            addCriterion("interval >=", value, "interval");
//            return (Criteria) this;
//        }
//
//        public Criteria andIntervalLessThan(Integer value) {
//            addCriterion("interval <", value, "interval");
//            return (Criteria) this;
//        }
//
//        public Criteria andIntervalLessThanOrEqualTo(Integer value) {
//            addCriterion("interval <=", value, "interval");
//            return (Criteria) this;
//        }
//
//        public Criteria andIntervalIn(List<Integer> values) {
//            addCriterion("interval in", values, "interval");
//            return (Criteria) this;
//        }
//
//        public Criteria andIntervalNotIn(List<Integer> values) {
//            addCriterion("interval not in", values, "interval");
//            return (Criteria) this;
//        }
//
//        public Criteria andIntervalBetween(Integer value1, Integer value2) {
//            addCriterion("interval between", value1, value2, "interval");
//            return (Criteria) this;
//        }
//
//        public Criteria andIntervalNotBetween(Integer value1, Integer value2) {
//            addCriterion("interval not between", value1, value2, "interval");
//            return (Criteria) this;
//        }
//
//        public Criteria andImageUrlIsNull() {
//            addCriterion("image_url is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andImageUrlIsNotNull() {
//            addCriterion("image_url is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andImageUrlEqualTo(String value) {
//            addCriterion("image_url =", value, "imageUrl");
//            return (Criteria) this;
//        }
//
//        public Criteria andImageUrlNotEqualTo(String value) {
//            addCriterion("image_url <>", value, "imageUrl");
//            return (Criteria) this;
//        }
//
//        public Criteria andImageUrlGreaterThan(String value) {
//            addCriterion("image_url >", value, "imageUrl");
//            return (Criteria) this;
//        }
//
//        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
//            addCriterion("image_url >=", value, "imageUrl");
//            return (Criteria) this;
//        }
//
//        public Criteria andImageUrlLessThan(String value) {
//            addCriterion("image_url <", value, "imageUrl");
//            return (Criteria) this;
//        }
//
//        public Criteria andImageUrlLessThanOrEqualTo(String value) {
//            addCriterion("image_url <=", value, "imageUrl");
//            return (Criteria) this;
//        }
//
//        public Criteria andImageUrlLike(String value) {
//            addCriterion("image_url like", value, "imageUrl");
//            return (Criteria) this;
//        }
//
//        public Criteria andImageUrlNotLike(String value) {
//            addCriterion("image_url not like", value, "imageUrl");
//            return (Criteria) this;
//        }
//
//        public Criteria andImageUrlIn(List<String> values) {
//            addCriterion("image_url in", values, "imageUrl");
//            return (Criteria) this;
//        }
//
//        public Criteria andImageUrlNotIn(List<String> values) {
//            addCriterion("image_url not in", values, "imageUrl");
//            return (Criteria) this;
//        }
//
//        public Criteria andImageUrlBetween(String value1, String value2) {
//            addCriterion("image_url between", value1, value2, "imageUrl");
//            return (Criteria) this;
//        }
//
//        public Criteria andImageUrlNotBetween(String value1, String value2) {
//            addCriterion("image_url not between", value1, value2, "imageUrl");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetDateIsNull() {
//            addCriterion("target_date is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetDateIsNotNull() {
//            addCriterion("target_date is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetDateEqualTo(Date value) {
//            addCriterion("target_date =", value, "targetDate");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetDateNotEqualTo(Date value) {
//            addCriterion("target_date <>", value, "targetDate");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetDateGreaterThan(Date value) {
//            addCriterion("target_date >", value, "targetDate");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetDateGreaterThanOrEqualTo(Date value) {
//            addCriterion("target_date >=", value, "targetDate");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetDateLessThan(Date value) {
//            addCriterion("target_date <", value, "targetDate");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetDateLessThanOrEqualTo(Date value) {
//            addCriterion("target_date <=", value, "targetDate");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetDateIn(List<Date> values) {
//            addCriterion("target_date in", values, "targetDate");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetDateNotIn(List<Date> values) {
//            addCriterion("target_date not in", values, "targetDate");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetDateBetween(Date value1, Date value2) {
//            addCriterion("target_date between", value1, value2, "targetDate");
//            return (Criteria) this;
//        }
//
//        public Criteria andTargetDateNotBetween(Date value1, Date value2) {
//            addCriterion("target_date not between", value1, value2, "targetDate");
//            return (Criteria) this;
//        }
//    }
//
//    public static class Criteria extends GeneratedCriteria {
//
//        protected Criteria() {
//            super();
//        }
//    }
//
//    public static class Criterion {
//        private String condition;
//
//        private Object value;
//
//        private Object secondValue;
//
//        private boolean noValue;
//
//        private boolean singleValue;
//
//        private boolean betweenValue;
//
//        private boolean listValue;
//
//        private String typeHandler;
//
//        public String getCondition() {
//            return condition;
//        }
//
//        public Object getValue() {
//            return value;
//        }
//
//        public Object getSecondValue() {
//            return secondValue;
//        }
//
//        public boolean isNoValue() {
//            return noValue;
//        }
//
//        public boolean isSingleValue() {
//            return singleValue;
//        }
//
//        public boolean isBetweenValue() {
//            return betweenValue;
//        }
//
//        public boolean isListValue() {
//            return listValue;
//        }
//
//        public String getTypeHandler() {
//            return typeHandler;
//        }
//
//        protected Criterion(String condition) {
//            super();
//            this.condition = condition;
//            this.typeHandler = null;
//            this.noValue = true;
//        }
//
//        protected Criterion(String condition, Object value, String typeHandler) {
//            super();
//            this.condition = condition;
//            this.value = value;
//            this.typeHandler = typeHandler;
//            if (value instanceof List<?>) {
//                this.listValue = true;
//            } else {
//                this.singleValue = true;
//            }
//        }
//
//        protected Criterion(String condition, Object value) {
//            this(condition, value, null);
//        }
//
//        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
//            super();
//            this.condition = condition;
//            this.value = value;
//            this.secondValue = secondValue;
//            this.typeHandler = typeHandler;
//            this.betweenValue = true;
//        }
//
//        protected Criterion(String condition, Object value, Object secondValue) {
//            this(condition, value, secondValue, null);
//        }
//    }
//}