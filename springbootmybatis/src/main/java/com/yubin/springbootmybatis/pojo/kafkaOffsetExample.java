package com.yubin.springbootmybatis.pojo;

import java.util.ArrayList;
import java.util.List;

public class kafkaOffsetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public kafkaOffsetExample() {
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

        public Criteria andTopicnameIsNull() {
            addCriterion("topicName is null");
            return (Criteria) this;
        }

        public Criteria andTopicnameIsNotNull() {
            addCriterion("topicName is not null");
            return (Criteria) this;
        }

        public Criteria andTopicnameEqualTo(String value) {
            addCriterion("topicName =", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameNotEqualTo(String value) {
            addCriterion("topicName <>", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameGreaterThan(String value) {
            addCriterion("topicName >", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameGreaterThanOrEqualTo(String value) {
            addCriterion("topicName >=", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameLessThan(String value) {
            addCriterion("topicName <", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameLessThanOrEqualTo(String value) {
            addCriterion("topicName <=", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameLike(String value) {
            addCriterion("topicName like", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameNotLike(String value) {
            addCriterion("topicName not like", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameIn(List<String> values) {
            addCriterion("topicName in", values, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameNotIn(List<String> values) {
            addCriterion("topicName not in", values, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameBetween(String value1, String value2) {
            addCriterion("topicName between", value1, value2, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameNotBetween(String value1, String value2) {
            addCriterion("topicName not between", value1, value2, "topicname");
            return (Criteria) this;
        }

        public Criteria andPartitionidIsNull() {
            addCriterion("partitionId is null");
            return (Criteria) this;
        }

        public Criteria andPartitionidIsNotNull() {
            addCriterion("partitionId is not null");
            return (Criteria) this;
        }

        public Criteria andPartitionidEqualTo(Integer value) {
            addCriterion("partitionId =", value, "partitionid");
            return (Criteria) this;
        }

        public Criteria andPartitionidNotEqualTo(Integer value) {
            addCriterion("partitionId <>", value, "partitionid");
            return (Criteria) this;
        }

        public Criteria andPartitionidGreaterThan(Integer value) {
            addCriterion("partitionId >", value, "partitionid");
            return (Criteria) this;
        }

        public Criteria andPartitionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("partitionId >=", value, "partitionid");
            return (Criteria) this;
        }

        public Criteria andPartitionidLessThan(Integer value) {
            addCriterion("partitionId <", value, "partitionid");
            return (Criteria) this;
        }

        public Criteria andPartitionidLessThanOrEqualTo(Integer value) {
            addCriterion("partitionId <=", value, "partitionid");
            return (Criteria) this;
        }

        public Criteria andPartitionidIn(List<Integer> values) {
            addCriterion("partitionId in", values, "partitionid");
            return (Criteria) this;
        }

        public Criteria andPartitionidNotIn(List<Integer> values) {
            addCriterion("partitionId not in", values, "partitionid");
            return (Criteria) this;
        }

        public Criteria andPartitionidBetween(Integer value1, Integer value2) {
            addCriterion("partitionId between", value1, value2, "partitionid");
            return (Criteria) this;
        }

        public Criteria andPartitionidNotBetween(Integer value1, Integer value2) {
            addCriterion("partitionId not between", value1, value2, "partitionid");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("groupId is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("groupId is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(String value) {
            addCriterion("groupId =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(String value) {
            addCriterion("groupId <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(String value) {
            addCriterion("groupId >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(String value) {
            addCriterion("groupId >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(String value) {
            addCriterion("groupId <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(String value) {
            addCriterion("groupId <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLike(String value) {
            addCriterion("groupId like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotLike(String value) {
            addCriterion("groupId not like", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<String> values) {
            addCriterion("groupId in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<String> values) {
            addCriterion("groupId not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(String value1, String value2) {
            addCriterion("groupId between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(String value1, String value2) {
            addCriterion("groupId not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andOffsetIsNull() {
            addCriterion("offset is null");
            return (Criteria) this;
        }

        public Criteria andOffsetIsNotNull() {
            addCriterion("offset is not null");
            return (Criteria) this;
        }

        public Criteria andOffsetEqualTo(Long value) {
            addCriterion("offset =", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetNotEqualTo(Long value) {
            addCriterion("offset <>", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetGreaterThan(Long value) {
            addCriterion("offset >", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetGreaterThanOrEqualTo(Long value) {
            addCriterion("offset >=", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetLessThan(Long value) {
            addCriterion("offset <", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetLessThanOrEqualTo(Long value) {
            addCriterion("offset <=", value, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetIn(List<Long> values) {
            addCriterion("offset in", values, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetNotIn(List<Long> values) {
            addCriterion("offset not in", values, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetBetween(Long value1, Long value2) {
            addCriterion("offset between", value1, value2, "offset");
            return (Criteria) this;
        }

        public Criteria andOffsetNotBetween(Long value1, Long value2) {
            addCriterion("offset not between", value1, value2, "offset");
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