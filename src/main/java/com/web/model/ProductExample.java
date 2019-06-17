package com.web.model;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductMoneyIsNull() {
            addCriterion("product_money is null");
            return (Criteria) this;
        }

        public Criteria andProductMoneyIsNotNull() {
            addCriterion("product_money is not null");
            return (Criteria) this;
        }

        public Criteria andProductMoneyEqualTo(String value) {
            addCriterion("product_money =", value, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyNotEqualTo(String value) {
            addCriterion("product_money <>", value, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyGreaterThan(String value) {
            addCriterion("product_money >", value, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("product_money >=", value, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyLessThan(String value) {
            addCriterion("product_money <", value, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyLessThanOrEqualTo(String value) {
            addCriterion("product_money <=", value, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyLike(String value) {
            addCriterion("product_money like", value, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyNotLike(String value) {
            addCriterion("product_money not like", value, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyIn(List<String> values) {
            addCriterion("product_money in", values, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyNotIn(List<String> values) {
            addCriterion("product_money not in", values, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyBetween(String value1, String value2) {
            addCriterion("product_money between", value1, value2, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductMoneyNotBetween(String value1, String value2) {
            addCriterion("product_money not between", value1, value2, "productMoney");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("product_type like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("product_type not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductDscIsNull() {
            addCriterion("product_dsc is null");
            return (Criteria) this;
        }

        public Criteria andProductDscIsNotNull() {
            addCriterion("product_dsc is not null");
            return (Criteria) this;
        }

        public Criteria andProductDscEqualTo(String value) {
            addCriterion("product_dsc =", value, "productDsc");
            return (Criteria) this;
        }

        public Criteria andProductDscNotEqualTo(String value) {
            addCriterion("product_dsc <>", value, "productDsc");
            return (Criteria) this;
        }

        public Criteria andProductDscGreaterThan(String value) {
            addCriterion("product_dsc >", value, "productDsc");
            return (Criteria) this;
        }

        public Criteria andProductDscGreaterThanOrEqualTo(String value) {
            addCriterion("product_dsc >=", value, "productDsc");
            return (Criteria) this;
        }

        public Criteria andProductDscLessThan(String value) {
            addCriterion("product_dsc <", value, "productDsc");
            return (Criteria) this;
        }

        public Criteria andProductDscLessThanOrEqualTo(String value) {
            addCriterion("product_dsc <=", value, "productDsc");
            return (Criteria) this;
        }

        public Criteria andProductDscLike(String value) {
            addCriterion("product_dsc like", value, "productDsc");
            return (Criteria) this;
        }

        public Criteria andProductDscNotLike(String value) {
            addCriterion("product_dsc not like", value, "productDsc");
            return (Criteria) this;
        }

        public Criteria andProductDscIn(List<String> values) {
            addCriterion("product_dsc in", values, "productDsc");
            return (Criteria) this;
        }

        public Criteria andProductDscNotIn(List<String> values) {
            addCriterion("product_dsc not in", values, "productDsc");
            return (Criteria) this;
        }

        public Criteria andProductDscBetween(String value1, String value2) {
            addCriterion("product_dsc between", value1, value2, "productDsc");
            return (Criteria) this;
        }

        public Criteria andProductDscNotBetween(String value1, String value2) {
            addCriterion("product_dsc not between", value1, value2, "productDsc");
            return (Criteria) this;
        }

        public Criteria andPruductKucunIsNull() {
            addCriterion("pruduct_kucun is null");
            return (Criteria) this;
        }

        public Criteria andPruductKucunIsNotNull() {
            addCriterion("pruduct_kucun is not null");
            return (Criteria) this;
        }

        public Criteria andPruductKucunEqualTo(String value) {
            addCriterion("pruduct_kucun =", value, "pruductKucun");
            return (Criteria) this;
        }

        public Criteria andPruductKucunNotEqualTo(String value) {
            addCriterion("pruduct_kucun <>", value, "pruductKucun");
            return (Criteria) this;
        }

        public Criteria andPruductKucunGreaterThan(String value) {
            addCriterion("pruduct_kucun >", value, "pruductKucun");
            return (Criteria) this;
        }

        public Criteria andPruductKucunGreaterThanOrEqualTo(String value) {
            addCriterion("pruduct_kucun >=", value, "pruductKucun");
            return (Criteria) this;
        }

        public Criteria andPruductKucunLessThan(String value) {
            addCriterion("pruduct_kucun <", value, "pruductKucun");
            return (Criteria) this;
        }

        public Criteria andPruductKucunLessThanOrEqualTo(String value) {
            addCriterion("pruduct_kucun <=", value, "pruductKucun");
            return (Criteria) this;
        }

        public Criteria andPruductKucunLike(String value) {
            addCriterion("pruduct_kucun like", value, "pruductKucun");
            return (Criteria) this;
        }

        public Criteria andPruductKucunNotLike(String value) {
            addCriterion("pruduct_kucun not like", value, "pruductKucun");
            return (Criteria) this;
        }

        public Criteria andPruductKucunIn(List<String> values) {
            addCriterion("pruduct_kucun in", values, "pruductKucun");
            return (Criteria) this;
        }

        public Criteria andPruductKucunNotIn(List<String> values) {
            addCriterion("pruduct_kucun not in", values, "pruductKucun");
            return (Criteria) this;
        }

        public Criteria andPruductKucunBetween(String value1, String value2) {
            addCriterion("pruduct_kucun between", value1, value2, "pruductKucun");
            return (Criteria) this;
        }

        public Criteria andPruductKucunNotBetween(String value1, String value2) {
            addCriterion("pruduct_kucun not between", value1, value2, "pruductKucun");
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