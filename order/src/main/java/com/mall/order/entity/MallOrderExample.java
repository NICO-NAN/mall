package com.mall.order.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MallOrderExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MallOrderExample() {
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

    public MallOrderExample orderBy(String orderByClause) {
            this.setOrderByClause(orderByClause);
            return this;
        }

    public MallOrderExample orderBy(String ... orderByClauses) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < orderByClauses.length; i++) {
                sb.append(orderByClauses[i]);
                if (i < orderByClauses.length - 1) {
                    sb.append(" , ");
                }
            }
            this.setOrderByClause(sb.toString());
            return this;
        }

    public Criteria createCriteria() {
            Criteria criteria = createCriteriaInternal();
            if (oredCriteria.size() == 0) {
                oredCriteria.add(criteria);
            }
            return criteria;
        }

    protected Criteria createCriteriaInternal() {
            Criteria criteria = new Criteria(this);
            return criteria;
        }

    public void clear() {
            oredCriteria.clear();
            orderByClause = null;
            distinct = false;
        }

    public static Criteria newAndCreateCriteria() {
            MallOrderExample example = new MallOrderExample();
            return example.createCriteria();
        }

    public MallOrderExample when(boolean condition, IExampleWhen then) {
            if (condition) {
                then.example(this);
            }
            return this;
        }

    public MallOrderExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
            if (condition) {
                then.example(this);
            } else {
                otherwise.example(this);
            }
            return this;
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

    public Criteria andIdEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdNotEqualTo(Integer value) {
                addCriterion("id <>", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdGreaterThan(Integer value) {
                addCriterion("id >", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdGreaterThanOrEqualTo(Integer value) {
                addCriterion("id >=", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdLessThan(Integer value) {
                addCriterion("id <", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdLessThanOrEqualTo(Integer value) {
                addCriterion("id <=", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
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

    public Criteria andUserIdEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("user_id = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUserIdNotEqualTo(Integer value) {
                addCriterion("user_id <>", value, "userId");
                return (Criteria) this;
            }

    public Criteria andUserIdNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("user_id <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUserIdGreaterThan(Integer value) {
                addCriterion("user_id >", value, "userId");
                return (Criteria) this;
            }

    public Criteria andUserIdGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("user_id > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
                addCriterion("user_id >=", value, "userId");
                return (Criteria) this;
            }

    public Criteria andUserIdGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("user_id >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUserIdLessThan(Integer value) {
                addCriterion("user_id <", value, "userId");
                return (Criteria) this;
            }

    public Criteria andUserIdLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("user_id < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUserIdLessThanOrEqualTo(Integer value) {
                addCriterion("user_id <=", value, "userId");
                return (Criteria) this;
            }

    public Criteria andUserIdLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("user_id <= ").append(column.getEscapedColumnName()).toString());
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

            public Criteria andOrderSnIsNull() {
                addCriterion("order_sn is null");
                return (Criteria) this;
            }

            public Criteria andOrderSnIsNotNull() {
                addCriterion("order_sn is not null");
                return (Criteria) this;
            }

            public Criteria andOrderSnEqualTo(String value) {
                addCriterion("order_sn =", value, "orderSn");
                return (Criteria) this;
            }

    public Criteria andOrderSnEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("order_sn = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andOrderSnNotEqualTo(String value) {
                addCriterion("order_sn <>", value, "orderSn");
                return (Criteria) this;
            }

    public Criteria andOrderSnNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("order_sn <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andOrderSnGreaterThan(String value) {
                addCriterion("order_sn >", value, "orderSn");
                return (Criteria) this;
            }

    public Criteria andOrderSnGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("order_sn > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
                addCriterion("order_sn >=", value, "orderSn");
                return (Criteria) this;
            }

    public Criteria andOrderSnGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("order_sn >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andOrderSnLessThan(String value) {
                addCriterion("order_sn <", value, "orderSn");
                return (Criteria) this;
            }

    public Criteria andOrderSnLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("order_sn < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andOrderSnLessThanOrEqualTo(String value) {
                addCriterion("order_sn <=", value, "orderSn");
                return (Criteria) this;
            }

    public Criteria andOrderSnLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("order_sn <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andOrderSnLike(String value) {
                addCriterion("order_sn like", value, "orderSn");
                return (Criteria) this;
            }

            public Criteria andOrderSnNotLike(String value) {
                addCriterion("order_sn not like", value, "orderSn");
                return (Criteria) this;
            }

            public Criteria andOrderSnIn(List<String> values) {
                addCriterion("order_sn in", values, "orderSn");
                return (Criteria) this;
            }

            public Criteria andOrderSnNotIn(List<String> values) {
                addCriterion("order_sn not in", values, "orderSn");
                return (Criteria) this;
            }

            public Criteria andOrderSnBetween(String value1, String value2) {
                addCriterion("order_sn between", value1, value2, "orderSn");
                return (Criteria) this;
            }

            public Criteria andOrderSnNotBetween(String value1, String value2) {
                addCriterion("order_sn not between", value1, value2, "orderSn");
                return (Criteria) this;
            }

            public Criteria andOrderStatusIsNull() {
                addCriterion("order_status is null");
                return (Criteria) this;
            }

            public Criteria andOrderStatusIsNotNull() {
                addCriterion("order_status is not null");
                return (Criteria) this;
            }

            public Criteria andOrderStatusEqualTo(Short value) {
                addCriterion("order_status =", value, "orderStatus");
                return (Criteria) this;
            }

    public Criteria andOrderStatusEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("order_status = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andOrderStatusNotEqualTo(Short value) {
                addCriterion("order_status <>", value, "orderStatus");
                return (Criteria) this;
            }

    public Criteria andOrderStatusNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("order_status <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andOrderStatusGreaterThan(Short value) {
                addCriterion("order_status >", value, "orderStatus");
                return (Criteria) this;
            }

    public Criteria andOrderStatusGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("order_status > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andOrderStatusGreaterThanOrEqualTo(Short value) {
                addCriterion("order_status >=", value, "orderStatus");
                return (Criteria) this;
            }

    public Criteria andOrderStatusGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("order_status >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andOrderStatusLessThan(Short value) {
                addCriterion("order_status <", value, "orderStatus");
                return (Criteria) this;
            }

    public Criteria andOrderStatusLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("order_status < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andOrderStatusLessThanOrEqualTo(Short value) {
                addCriterion("order_status <=", value, "orderStatus");
                return (Criteria) this;
            }

    public Criteria andOrderStatusLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("order_status <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andOrderStatusIn(List<Short> values) {
                addCriterion("order_status in", values, "orderStatus");
                return (Criteria) this;
            }

            public Criteria andOrderStatusNotIn(List<Short> values) {
                addCriterion("order_status not in", values, "orderStatus");
                return (Criteria) this;
            }

            public Criteria andOrderStatusBetween(Short value1, Short value2) {
                addCriterion("order_status between", value1, value2, "orderStatus");
                return (Criteria) this;
            }

            public Criteria andOrderStatusNotBetween(Short value1, Short value2) {
                addCriterion("order_status not between", value1, value2, "orderStatus");
                return (Criteria) this;
            }

            public Criteria andAftersaleStatusIsNull() {
                addCriterion("aftersale_status is null");
                return (Criteria) this;
            }

            public Criteria andAftersaleStatusIsNotNull() {
                addCriterion("aftersale_status is not null");
                return (Criteria) this;
            }

            public Criteria andAftersaleStatusEqualTo(Short value) {
                addCriterion("aftersale_status =", value, "aftersaleStatus");
                return (Criteria) this;
            }

    public Criteria andAftersaleStatusEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("aftersale_status = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAftersaleStatusNotEqualTo(Short value) {
                addCriterion("aftersale_status <>", value, "aftersaleStatus");
                return (Criteria) this;
            }

    public Criteria andAftersaleStatusNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("aftersale_status <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAftersaleStatusGreaterThan(Short value) {
                addCriterion("aftersale_status >", value, "aftersaleStatus");
                return (Criteria) this;
            }

    public Criteria andAftersaleStatusGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("aftersale_status > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAftersaleStatusGreaterThanOrEqualTo(Short value) {
                addCriterion("aftersale_status >=", value, "aftersaleStatus");
                return (Criteria) this;
            }

    public Criteria andAftersaleStatusGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("aftersale_status >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAftersaleStatusLessThan(Short value) {
                addCriterion("aftersale_status <", value, "aftersaleStatus");
                return (Criteria) this;
            }

    public Criteria andAftersaleStatusLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("aftersale_status < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAftersaleStatusLessThanOrEqualTo(Short value) {
                addCriterion("aftersale_status <=", value, "aftersaleStatus");
                return (Criteria) this;
            }

    public Criteria andAftersaleStatusLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("aftersale_status <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAftersaleStatusIn(List<Short> values) {
                addCriterion("aftersale_status in", values, "aftersaleStatus");
                return (Criteria) this;
            }

            public Criteria andAftersaleStatusNotIn(List<Short> values) {
                addCriterion("aftersale_status not in", values, "aftersaleStatus");
                return (Criteria) this;
            }

            public Criteria andAftersaleStatusBetween(Short value1, Short value2) {
                addCriterion("aftersale_status between", value1, value2, "aftersaleStatus");
                return (Criteria) this;
            }

            public Criteria andAftersaleStatusNotBetween(Short value1, Short value2) {
                addCriterion("aftersale_status not between", value1, value2, "aftersaleStatus");
                return (Criteria) this;
            }

            public Criteria andConsigneeIsNull() {
                addCriterion("consignee is null");
                return (Criteria) this;
            }

            public Criteria andConsigneeIsNotNull() {
                addCriterion("consignee is not null");
                return (Criteria) this;
            }

            public Criteria andConsigneeEqualTo(String value) {
                addCriterion("consignee =", value, "consignee");
                return (Criteria) this;
            }

    public Criteria andConsigneeEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("consignee = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andConsigneeNotEqualTo(String value) {
                addCriterion("consignee <>", value, "consignee");
                return (Criteria) this;
            }

    public Criteria andConsigneeNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("consignee <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andConsigneeGreaterThan(String value) {
                addCriterion("consignee >", value, "consignee");
                return (Criteria) this;
            }

    public Criteria andConsigneeGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("consignee > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
                addCriterion("consignee >=", value, "consignee");
                return (Criteria) this;
            }

    public Criteria andConsigneeGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("consignee >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andConsigneeLessThan(String value) {
                addCriterion("consignee <", value, "consignee");
                return (Criteria) this;
            }

    public Criteria andConsigneeLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("consignee < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andConsigneeLessThanOrEqualTo(String value) {
                addCriterion("consignee <=", value, "consignee");
                return (Criteria) this;
            }

    public Criteria andConsigneeLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("consignee <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andConsigneeLike(String value) {
                addCriterion("consignee like", value, "consignee");
                return (Criteria) this;
            }

            public Criteria andConsigneeNotLike(String value) {
                addCriterion("consignee not like", value, "consignee");
                return (Criteria) this;
            }

            public Criteria andConsigneeIn(List<String> values) {
                addCriterion("consignee in", values, "consignee");
                return (Criteria) this;
            }

            public Criteria andConsigneeNotIn(List<String> values) {
                addCriterion("consignee not in", values, "consignee");
                return (Criteria) this;
            }

            public Criteria andConsigneeBetween(String value1, String value2) {
                addCriterion("consignee between", value1, value2, "consignee");
                return (Criteria) this;
            }

            public Criteria andConsigneeNotBetween(String value1, String value2) {
                addCriterion("consignee not between", value1, value2, "consignee");
                return (Criteria) this;
            }

            public Criteria andMobileIsNull() {
                addCriterion("mobile is null");
                return (Criteria) this;
            }

            public Criteria andMobileIsNotNull() {
                addCriterion("mobile is not null");
                return (Criteria) this;
            }

            public Criteria andMobileEqualTo(String value) {
                addCriterion("mobile =", value, "mobile");
                return (Criteria) this;
            }

    public Criteria andMobileEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("mobile = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andMobileNotEqualTo(String value) {
                addCriterion("mobile <>", value, "mobile");
                return (Criteria) this;
            }

    public Criteria andMobileNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("mobile <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andMobileGreaterThan(String value) {
                addCriterion("mobile >", value, "mobile");
                return (Criteria) this;
            }

    public Criteria andMobileGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("mobile > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andMobileGreaterThanOrEqualTo(String value) {
                addCriterion("mobile >=", value, "mobile");
                return (Criteria) this;
            }

    public Criteria andMobileGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("mobile >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andMobileLessThan(String value) {
                addCriterion("mobile <", value, "mobile");
                return (Criteria) this;
            }

    public Criteria andMobileLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("mobile < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andMobileLessThanOrEqualTo(String value) {
                addCriterion("mobile <=", value, "mobile");
                return (Criteria) this;
            }

    public Criteria andMobileLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("mobile <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andMobileLike(String value) {
                addCriterion("mobile like", value, "mobile");
                return (Criteria) this;
            }

            public Criteria andMobileNotLike(String value) {
                addCriterion("mobile not like", value, "mobile");
                return (Criteria) this;
            }

            public Criteria andMobileIn(List<String> values) {
                addCriterion("mobile in", values, "mobile");
                return (Criteria) this;
            }

            public Criteria andMobileNotIn(List<String> values) {
                addCriterion("mobile not in", values, "mobile");
                return (Criteria) this;
            }

            public Criteria andMobileBetween(String value1, String value2) {
                addCriterion("mobile between", value1, value2, "mobile");
                return (Criteria) this;
            }

            public Criteria andMobileNotBetween(String value1, String value2) {
                addCriterion("mobile not between", value1, value2, "mobile");
                return (Criteria) this;
            }

            public Criteria andAddressIsNull() {
                addCriterion("address is null");
                return (Criteria) this;
            }

            public Criteria andAddressIsNotNull() {
                addCriterion("address is not null");
                return (Criteria) this;
            }

            public Criteria andAddressEqualTo(String value) {
                addCriterion("address =", value, "address");
                return (Criteria) this;
            }

    public Criteria andAddressEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("address = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddressNotEqualTo(String value) {
                addCriterion("address <>", value, "address");
                return (Criteria) this;
            }

    public Criteria andAddressNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("address <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddressGreaterThan(String value) {
                addCriterion("address >", value, "address");
                return (Criteria) this;
            }

    public Criteria andAddressGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("address > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddressGreaterThanOrEqualTo(String value) {
                addCriterion("address >=", value, "address");
                return (Criteria) this;
            }

    public Criteria andAddressGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("address >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddressLessThan(String value) {
                addCriterion("address <", value, "address");
                return (Criteria) this;
            }

    public Criteria andAddressLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("address < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddressLessThanOrEqualTo(String value) {
                addCriterion("address <=", value, "address");
                return (Criteria) this;
            }

    public Criteria andAddressLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("address <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddressLike(String value) {
                addCriterion("address like", value, "address");
                return (Criteria) this;
            }

            public Criteria andAddressNotLike(String value) {
                addCriterion("address not like", value, "address");
                return (Criteria) this;
            }

            public Criteria andAddressIn(List<String> values) {
                addCriterion("address in", values, "address");
                return (Criteria) this;
            }

            public Criteria andAddressNotIn(List<String> values) {
                addCriterion("address not in", values, "address");
                return (Criteria) this;
            }

            public Criteria andAddressBetween(String value1, String value2) {
                addCriterion("address between", value1, value2, "address");
                return (Criteria) this;
            }

            public Criteria andAddressNotBetween(String value1, String value2) {
                addCriterion("address not between", value1, value2, "address");
                return (Criteria) this;
            }

            public Criteria andMessageIsNull() {
                addCriterion("message is null");
                return (Criteria) this;
            }

            public Criteria andMessageIsNotNull() {
                addCriterion("message is not null");
                return (Criteria) this;
            }

            public Criteria andMessageEqualTo(String value) {
                addCriterion("message =", value, "message");
                return (Criteria) this;
            }

    public Criteria andMessageEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("message = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andMessageNotEqualTo(String value) {
                addCriterion("message <>", value, "message");
                return (Criteria) this;
            }

    public Criteria andMessageNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("message <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andMessageGreaterThan(String value) {
                addCriterion("message >", value, "message");
                return (Criteria) this;
            }

    public Criteria andMessageGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("message > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andMessageGreaterThanOrEqualTo(String value) {
                addCriterion("message >=", value, "message");
                return (Criteria) this;
            }

    public Criteria andMessageGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("message >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andMessageLessThan(String value) {
                addCriterion("message <", value, "message");
                return (Criteria) this;
            }

    public Criteria andMessageLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("message < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andMessageLessThanOrEqualTo(String value) {
                addCriterion("message <=", value, "message");
                return (Criteria) this;
            }

    public Criteria andMessageLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("message <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andMessageLike(String value) {
                addCriterion("message like", value, "message");
                return (Criteria) this;
            }

            public Criteria andMessageNotLike(String value) {
                addCriterion("message not like", value, "message");
                return (Criteria) this;
            }

            public Criteria andMessageIn(List<String> values) {
                addCriterion("message in", values, "message");
                return (Criteria) this;
            }

            public Criteria andMessageNotIn(List<String> values) {
                addCriterion("message not in", values, "message");
                return (Criteria) this;
            }

            public Criteria andMessageBetween(String value1, String value2) {
                addCriterion("message between", value1, value2, "message");
                return (Criteria) this;
            }

            public Criteria andMessageNotBetween(String value1, String value2) {
                addCriterion("message not between", value1, value2, "message");
                return (Criteria) this;
            }

            public Criteria andGoodsPriceIsNull() {
                addCriterion("goods_price is null");
                return (Criteria) this;
            }

            public Criteria andGoodsPriceIsNotNull() {
                addCriterion("goods_price is not null");
                return (Criteria) this;
            }

            public Criteria andGoodsPriceEqualTo(BigDecimal value) {
                addCriterion("goods_price =", value, "goodsPrice");
                return (Criteria) this;
            }

    public Criteria andGoodsPriceEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("goods_price = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
                addCriterion("goods_price <>", value, "goodsPrice");
                return (Criteria) this;
            }

    public Criteria andGoodsPriceNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("goods_price <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
                addCriterion("goods_price >", value, "goodsPrice");
                return (Criteria) this;
            }

    public Criteria andGoodsPriceGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("goods_price > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
                addCriterion("goods_price >=", value, "goodsPrice");
                return (Criteria) this;
            }

    public Criteria andGoodsPriceGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("goods_price >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsPriceLessThan(BigDecimal value) {
                addCriterion("goods_price <", value, "goodsPrice");
                return (Criteria) this;
            }

    public Criteria andGoodsPriceLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("goods_price < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
                addCriterion("goods_price <=", value, "goodsPrice");
                return (Criteria) this;
            }

    public Criteria andGoodsPriceLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("goods_price <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsPriceIn(List<BigDecimal> values) {
                addCriterion("goods_price in", values, "goodsPrice");
                return (Criteria) this;
            }

            public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
                addCriterion("goods_price not in", values, "goodsPrice");
                return (Criteria) this;
            }

            public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("goods_price between", value1, value2, "goodsPrice");
                return (Criteria) this;
            }

            public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("goods_price not between", value1, value2, "goodsPrice");
                return (Criteria) this;
            }

            public Criteria andFreightPriceIsNull() {
                addCriterion("freight_price is null");
                return (Criteria) this;
            }

            public Criteria andFreightPriceIsNotNull() {
                addCriterion("freight_price is not null");
                return (Criteria) this;
            }

            public Criteria andFreightPriceEqualTo(BigDecimal value) {
                addCriterion("freight_price =", value, "freightPrice");
                return (Criteria) this;
            }

    public Criteria andFreightPriceEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("freight_price = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andFreightPriceNotEqualTo(BigDecimal value) {
                addCriterion("freight_price <>", value, "freightPrice");
                return (Criteria) this;
            }

    public Criteria andFreightPriceNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("freight_price <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andFreightPriceGreaterThan(BigDecimal value) {
                addCriterion("freight_price >", value, "freightPrice");
                return (Criteria) this;
            }

    public Criteria andFreightPriceGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("freight_price > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andFreightPriceGreaterThanOrEqualTo(BigDecimal value) {
                addCriterion("freight_price >=", value, "freightPrice");
                return (Criteria) this;
            }

    public Criteria andFreightPriceGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("freight_price >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andFreightPriceLessThan(BigDecimal value) {
                addCriterion("freight_price <", value, "freightPrice");
                return (Criteria) this;
            }

    public Criteria andFreightPriceLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("freight_price < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andFreightPriceLessThanOrEqualTo(BigDecimal value) {
                addCriterion("freight_price <=", value, "freightPrice");
                return (Criteria) this;
            }

    public Criteria andFreightPriceLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("freight_price <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andFreightPriceIn(List<BigDecimal> values) {
                addCriterion("freight_price in", values, "freightPrice");
                return (Criteria) this;
            }

            public Criteria andFreightPriceNotIn(List<BigDecimal> values) {
                addCriterion("freight_price not in", values, "freightPrice");
                return (Criteria) this;
            }

            public Criteria andFreightPriceBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("freight_price between", value1, value2, "freightPrice");
                return (Criteria) this;
            }

            public Criteria andFreightPriceNotBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("freight_price not between", value1, value2, "freightPrice");
                return (Criteria) this;
            }

            public Criteria andCouponPriceIsNull() {
                addCriterion("coupon_price is null");
                return (Criteria) this;
            }

            public Criteria andCouponPriceIsNotNull() {
                addCriterion("coupon_price is not null");
                return (Criteria) this;
            }

            public Criteria andCouponPriceEqualTo(BigDecimal value) {
                addCriterion("coupon_price =", value, "couponPrice");
                return (Criteria) this;
            }

    public Criteria andCouponPriceEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("coupon_price = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCouponPriceNotEqualTo(BigDecimal value) {
                addCriterion("coupon_price <>", value, "couponPrice");
                return (Criteria) this;
            }

    public Criteria andCouponPriceNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("coupon_price <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCouponPriceGreaterThan(BigDecimal value) {
                addCriterion("coupon_price >", value, "couponPrice");
                return (Criteria) this;
            }

    public Criteria andCouponPriceGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("coupon_price > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCouponPriceGreaterThanOrEqualTo(BigDecimal value) {
                addCriterion("coupon_price >=", value, "couponPrice");
                return (Criteria) this;
            }

    public Criteria andCouponPriceGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("coupon_price >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCouponPriceLessThan(BigDecimal value) {
                addCriterion("coupon_price <", value, "couponPrice");
                return (Criteria) this;
            }

    public Criteria andCouponPriceLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("coupon_price < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCouponPriceLessThanOrEqualTo(BigDecimal value) {
                addCriterion("coupon_price <=", value, "couponPrice");
                return (Criteria) this;
            }

    public Criteria andCouponPriceLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("coupon_price <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCouponPriceIn(List<BigDecimal> values) {
                addCriterion("coupon_price in", values, "couponPrice");
                return (Criteria) this;
            }

            public Criteria andCouponPriceNotIn(List<BigDecimal> values) {
                addCriterion("coupon_price not in", values, "couponPrice");
                return (Criteria) this;
            }

            public Criteria andCouponPriceBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("coupon_price between", value1, value2, "couponPrice");
                return (Criteria) this;
            }

            public Criteria andCouponPriceNotBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("coupon_price not between", value1, value2, "couponPrice");
                return (Criteria) this;
            }

            public Criteria andIntegralPriceIsNull() {
                addCriterion("integral_price is null");
                return (Criteria) this;
            }

            public Criteria andIntegralPriceIsNotNull() {
                addCriterion("integral_price is not null");
                return (Criteria) this;
            }

            public Criteria andIntegralPriceEqualTo(BigDecimal value) {
                addCriterion("integral_price =", value, "integralPrice");
                return (Criteria) this;
            }

    public Criteria andIntegralPriceEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("integral_price = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIntegralPriceNotEqualTo(BigDecimal value) {
                addCriterion("integral_price <>", value, "integralPrice");
                return (Criteria) this;
            }

    public Criteria andIntegralPriceNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("integral_price <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIntegralPriceGreaterThan(BigDecimal value) {
                addCriterion("integral_price >", value, "integralPrice");
                return (Criteria) this;
            }

    public Criteria andIntegralPriceGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("integral_price > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIntegralPriceGreaterThanOrEqualTo(BigDecimal value) {
                addCriterion("integral_price >=", value, "integralPrice");
                return (Criteria) this;
            }

    public Criteria andIntegralPriceGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("integral_price >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIntegralPriceLessThan(BigDecimal value) {
                addCriterion("integral_price <", value, "integralPrice");
                return (Criteria) this;
            }

    public Criteria andIntegralPriceLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("integral_price < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIntegralPriceLessThanOrEqualTo(BigDecimal value) {
                addCriterion("integral_price <=", value, "integralPrice");
                return (Criteria) this;
            }

    public Criteria andIntegralPriceLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("integral_price <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIntegralPriceIn(List<BigDecimal> values) {
                addCriterion("integral_price in", values, "integralPrice");
                return (Criteria) this;
            }

            public Criteria andIntegralPriceNotIn(List<BigDecimal> values) {
                addCriterion("integral_price not in", values, "integralPrice");
                return (Criteria) this;
            }

            public Criteria andIntegralPriceBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("integral_price between", value1, value2, "integralPrice");
                return (Criteria) this;
            }

            public Criteria andIntegralPriceNotBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("integral_price not between", value1, value2, "integralPrice");
                return (Criteria) this;
            }

            public Criteria andGrouponPriceIsNull() {
                addCriterion("groupon_price is null");
                return (Criteria) this;
            }

            public Criteria andGrouponPriceIsNotNull() {
                addCriterion("groupon_price is not null");
                return (Criteria) this;
            }

            public Criteria andGrouponPriceEqualTo(BigDecimal value) {
                addCriterion("groupon_price =", value, "grouponPrice");
                return (Criteria) this;
            }

    public Criteria andGrouponPriceEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("groupon_price = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGrouponPriceNotEqualTo(BigDecimal value) {
                addCriterion("groupon_price <>", value, "grouponPrice");
                return (Criteria) this;
            }

    public Criteria andGrouponPriceNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("groupon_price <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGrouponPriceGreaterThan(BigDecimal value) {
                addCriterion("groupon_price >", value, "grouponPrice");
                return (Criteria) this;
            }

    public Criteria andGrouponPriceGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("groupon_price > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGrouponPriceGreaterThanOrEqualTo(BigDecimal value) {
                addCriterion("groupon_price >=", value, "grouponPrice");
                return (Criteria) this;
            }

    public Criteria andGrouponPriceGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("groupon_price >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGrouponPriceLessThan(BigDecimal value) {
                addCriterion("groupon_price <", value, "grouponPrice");
                return (Criteria) this;
            }

    public Criteria andGrouponPriceLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("groupon_price < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGrouponPriceLessThanOrEqualTo(BigDecimal value) {
                addCriterion("groupon_price <=", value, "grouponPrice");
                return (Criteria) this;
            }

    public Criteria andGrouponPriceLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("groupon_price <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGrouponPriceIn(List<BigDecimal> values) {
                addCriterion("groupon_price in", values, "grouponPrice");
                return (Criteria) this;
            }

            public Criteria andGrouponPriceNotIn(List<BigDecimal> values) {
                addCriterion("groupon_price not in", values, "grouponPrice");
                return (Criteria) this;
            }

            public Criteria andGrouponPriceBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("groupon_price between", value1, value2, "grouponPrice");
                return (Criteria) this;
            }

            public Criteria andGrouponPriceNotBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("groupon_price not between", value1, value2, "grouponPrice");
                return (Criteria) this;
            }

            public Criteria andOrderPriceIsNull() {
                addCriterion("order_price is null");
                return (Criteria) this;
            }

            public Criteria andOrderPriceIsNotNull() {
                addCriterion("order_price is not null");
                return (Criteria) this;
            }

            public Criteria andOrderPriceEqualTo(BigDecimal value) {
                addCriterion("order_price =", value, "orderPrice");
                return (Criteria) this;
            }

    public Criteria andOrderPriceEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("order_price = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andOrderPriceNotEqualTo(BigDecimal value) {
                addCriterion("order_price <>", value, "orderPrice");
                return (Criteria) this;
            }

    public Criteria andOrderPriceNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("order_price <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andOrderPriceGreaterThan(BigDecimal value) {
                addCriterion("order_price >", value, "orderPrice");
                return (Criteria) this;
            }

    public Criteria andOrderPriceGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("order_price > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andOrderPriceGreaterThanOrEqualTo(BigDecimal value) {
                addCriterion("order_price >=", value, "orderPrice");
                return (Criteria) this;
            }

    public Criteria andOrderPriceGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("order_price >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andOrderPriceLessThan(BigDecimal value) {
                addCriterion("order_price <", value, "orderPrice");
                return (Criteria) this;
            }

    public Criteria andOrderPriceLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("order_price < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andOrderPriceLessThanOrEqualTo(BigDecimal value) {
                addCriterion("order_price <=", value, "orderPrice");
                return (Criteria) this;
            }

    public Criteria andOrderPriceLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("order_price <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andOrderPriceIn(List<BigDecimal> values) {
                addCriterion("order_price in", values, "orderPrice");
                return (Criteria) this;
            }

            public Criteria andOrderPriceNotIn(List<BigDecimal> values) {
                addCriterion("order_price not in", values, "orderPrice");
                return (Criteria) this;
            }

            public Criteria andOrderPriceBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("order_price between", value1, value2, "orderPrice");
                return (Criteria) this;
            }

            public Criteria andOrderPriceNotBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("order_price not between", value1, value2, "orderPrice");
                return (Criteria) this;
            }

            public Criteria andActualPriceIsNull() {
                addCriterion("actual_price is null");
                return (Criteria) this;
            }

            public Criteria andActualPriceIsNotNull() {
                addCriterion("actual_price is not null");
                return (Criteria) this;
            }

            public Criteria andActualPriceEqualTo(BigDecimal value) {
                addCriterion("actual_price =", value, "actualPrice");
                return (Criteria) this;
            }

    public Criteria andActualPriceEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("actual_price = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andActualPriceNotEqualTo(BigDecimal value) {
                addCriterion("actual_price <>", value, "actualPrice");
                return (Criteria) this;
            }

    public Criteria andActualPriceNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("actual_price <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andActualPriceGreaterThan(BigDecimal value) {
                addCriterion("actual_price >", value, "actualPrice");
                return (Criteria) this;
            }

    public Criteria andActualPriceGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("actual_price > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andActualPriceGreaterThanOrEqualTo(BigDecimal value) {
                addCriterion("actual_price >=", value, "actualPrice");
                return (Criteria) this;
            }

    public Criteria andActualPriceGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("actual_price >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andActualPriceLessThan(BigDecimal value) {
                addCriterion("actual_price <", value, "actualPrice");
                return (Criteria) this;
            }

    public Criteria andActualPriceLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("actual_price < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andActualPriceLessThanOrEqualTo(BigDecimal value) {
                addCriterion("actual_price <=", value, "actualPrice");
                return (Criteria) this;
            }

    public Criteria andActualPriceLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("actual_price <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andActualPriceIn(List<BigDecimal> values) {
                addCriterion("actual_price in", values, "actualPrice");
                return (Criteria) this;
            }

            public Criteria andActualPriceNotIn(List<BigDecimal> values) {
                addCriterion("actual_price not in", values, "actualPrice");
                return (Criteria) this;
            }

            public Criteria andActualPriceBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("actual_price between", value1, value2, "actualPrice");
                return (Criteria) this;
            }

            public Criteria andActualPriceNotBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("actual_price not between", value1, value2, "actualPrice");
                return (Criteria) this;
            }

            public Criteria andPayIdIsNull() {
                addCriterion("pay_id is null");
                return (Criteria) this;
            }

            public Criteria andPayIdIsNotNull() {
                addCriterion("pay_id is not null");
                return (Criteria) this;
            }

            public Criteria andPayIdEqualTo(String value) {
                addCriterion("pay_id =", value, "payId");
                return (Criteria) this;
            }

    public Criteria andPayIdEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("pay_id = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPayIdNotEqualTo(String value) {
                addCriterion("pay_id <>", value, "payId");
                return (Criteria) this;
            }

    public Criteria andPayIdNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("pay_id <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPayIdGreaterThan(String value) {
                addCriterion("pay_id >", value, "payId");
                return (Criteria) this;
            }

    public Criteria andPayIdGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("pay_id > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPayIdGreaterThanOrEqualTo(String value) {
                addCriterion("pay_id >=", value, "payId");
                return (Criteria) this;
            }

    public Criteria andPayIdGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("pay_id >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPayIdLessThan(String value) {
                addCriterion("pay_id <", value, "payId");
                return (Criteria) this;
            }

    public Criteria andPayIdLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("pay_id < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPayIdLessThanOrEqualTo(String value) {
                addCriterion("pay_id <=", value, "payId");
                return (Criteria) this;
            }

    public Criteria andPayIdLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("pay_id <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPayIdLike(String value) {
                addCriterion("pay_id like", value, "payId");
                return (Criteria) this;
            }

            public Criteria andPayIdNotLike(String value) {
                addCriterion("pay_id not like", value, "payId");
                return (Criteria) this;
            }

            public Criteria andPayIdIn(List<String> values) {
                addCriterion("pay_id in", values, "payId");
                return (Criteria) this;
            }

            public Criteria andPayIdNotIn(List<String> values) {
                addCriterion("pay_id not in", values, "payId");
                return (Criteria) this;
            }

            public Criteria andPayIdBetween(String value1, String value2) {
                addCriterion("pay_id between", value1, value2, "payId");
                return (Criteria) this;
            }

            public Criteria andPayIdNotBetween(String value1, String value2) {
                addCriterion("pay_id not between", value1, value2, "payId");
                return (Criteria) this;
            }

            public Criteria andPayTimeIsNull() {
                addCriterion("pay_time is null");
                return (Criteria) this;
            }

            public Criteria andPayTimeIsNotNull() {
                addCriterion("pay_time is not null");
                return (Criteria) this;
            }

            public Criteria andPayTimeEqualTo(LocalDateTime value) {
                addCriterion("pay_time =", value, "payTime");
                return (Criteria) this;
            }

    public Criteria andPayTimeEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("pay_time = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPayTimeNotEqualTo(LocalDateTime value) {
                addCriterion("pay_time <>", value, "payTime");
                return (Criteria) this;
            }

    public Criteria andPayTimeNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("pay_time <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPayTimeGreaterThan(LocalDateTime value) {
                addCriterion("pay_time >", value, "payTime");
                return (Criteria) this;
            }

    public Criteria andPayTimeGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("pay_time > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPayTimeGreaterThanOrEqualTo(LocalDateTime value) {
                addCriterion("pay_time >=", value, "payTime");
                return (Criteria) this;
            }

    public Criteria andPayTimeGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("pay_time >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPayTimeLessThan(LocalDateTime value) {
                addCriterion("pay_time <", value, "payTime");
                return (Criteria) this;
            }

    public Criteria andPayTimeLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("pay_time < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPayTimeLessThanOrEqualTo(LocalDateTime value) {
                addCriterion("pay_time <=", value, "payTime");
                return (Criteria) this;
            }

    public Criteria andPayTimeLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("pay_time <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPayTimeIn(List<LocalDateTime> values) {
                addCriterion("pay_time in", values, "payTime");
                return (Criteria) this;
            }

            public Criteria andPayTimeNotIn(List<LocalDateTime> values) {
                addCriterion("pay_time not in", values, "payTime");
                return (Criteria) this;
            }

            public Criteria andPayTimeBetween(LocalDateTime value1, LocalDateTime value2) {
                addCriterion("pay_time between", value1, value2, "payTime");
                return (Criteria) this;
            }

            public Criteria andPayTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
                addCriterion("pay_time not between", value1, value2, "payTime");
                return (Criteria) this;
            }

            public Criteria andShipSnIsNull() {
                addCriterion("ship_sn is null");
                return (Criteria) this;
            }

            public Criteria andShipSnIsNotNull() {
                addCriterion("ship_sn is not null");
                return (Criteria) this;
            }

            public Criteria andShipSnEqualTo(String value) {
                addCriterion("ship_sn =", value, "shipSn");
                return (Criteria) this;
            }

    public Criteria andShipSnEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("ship_sn = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShipSnNotEqualTo(String value) {
                addCriterion("ship_sn <>", value, "shipSn");
                return (Criteria) this;
            }

    public Criteria andShipSnNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("ship_sn <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShipSnGreaterThan(String value) {
                addCriterion("ship_sn >", value, "shipSn");
                return (Criteria) this;
            }

    public Criteria andShipSnGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("ship_sn > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShipSnGreaterThanOrEqualTo(String value) {
                addCriterion("ship_sn >=", value, "shipSn");
                return (Criteria) this;
            }

    public Criteria andShipSnGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("ship_sn >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShipSnLessThan(String value) {
                addCriterion("ship_sn <", value, "shipSn");
                return (Criteria) this;
            }

    public Criteria andShipSnLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("ship_sn < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShipSnLessThanOrEqualTo(String value) {
                addCriterion("ship_sn <=", value, "shipSn");
                return (Criteria) this;
            }

    public Criteria andShipSnLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("ship_sn <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShipSnLike(String value) {
                addCriterion("ship_sn like", value, "shipSn");
                return (Criteria) this;
            }

            public Criteria andShipSnNotLike(String value) {
                addCriterion("ship_sn not like", value, "shipSn");
                return (Criteria) this;
            }

            public Criteria andShipSnIn(List<String> values) {
                addCriterion("ship_sn in", values, "shipSn");
                return (Criteria) this;
            }

            public Criteria andShipSnNotIn(List<String> values) {
                addCriterion("ship_sn not in", values, "shipSn");
                return (Criteria) this;
            }

            public Criteria andShipSnBetween(String value1, String value2) {
                addCriterion("ship_sn between", value1, value2, "shipSn");
                return (Criteria) this;
            }

            public Criteria andShipSnNotBetween(String value1, String value2) {
                addCriterion("ship_sn not between", value1, value2, "shipSn");
                return (Criteria) this;
            }

            public Criteria andShipChannelIsNull() {
                addCriterion("ship_channel is null");
                return (Criteria) this;
            }

            public Criteria andShipChannelIsNotNull() {
                addCriterion("ship_channel is not null");
                return (Criteria) this;
            }

            public Criteria andShipChannelEqualTo(String value) {
                addCriterion("ship_channel =", value, "shipChannel");
                return (Criteria) this;
            }

    public Criteria andShipChannelEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("ship_channel = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShipChannelNotEqualTo(String value) {
                addCriterion("ship_channel <>", value, "shipChannel");
                return (Criteria) this;
            }

    public Criteria andShipChannelNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("ship_channel <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShipChannelGreaterThan(String value) {
                addCriterion("ship_channel >", value, "shipChannel");
                return (Criteria) this;
            }

    public Criteria andShipChannelGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("ship_channel > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShipChannelGreaterThanOrEqualTo(String value) {
                addCriterion("ship_channel >=", value, "shipChannel");
                return (Criteria) this;
            }

    public Criteria andShipChannelGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("ship_channel >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShipChannelLessThan(String value) {
                addCriterion("ship_channel <", value, "shipChannel");
                return (Criteria) this;
            }

    public Criteria andShipChannelLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("ship_channel < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShipChannelLessThanOrEqualTo(String value) {
                addCriterion("ship_channel <=", value, "shipChannel");
                return (Criteria) this;
            }

    public Criteria andShipChannelLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("ship_channel <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShipChannelLike(String value) {
                addCriterion("ship_channel like", value, "shipChannel");
                return (Criteria) this;
            }

            public Criteria andShipChannelNotLike(String value) {
                addCriterion("ship_channel not like", value, "shipChannel");
                return (Criteria) this;
            }

            public Criteria andShipChannelIn(List<String> values) {
                addCriterion("ship_channel in", values, "shipChannel");
                return (Criteria) this;
            }

            public Criteria andShipChannelNotIn(List<String> values) {
                addCriterion("ship_channel not in", values, "shipChannel");
                return (Criteria) this;
            }

            public Criteria andShipChannelBetween(String value1, String value2) {
                addCriterion("ship_channel between", value1, value2, "shipChannel");
                return (Criteria) this;
            }

            public Criteria andShipChannelNotBetween(String value1, String value2) {
                addCriterion("ship_channel not between", value1, value2, "shipChannel");
                return (Criteria) this;
            }

            public Criteria andShipTimeIsNull() {
                addCriterion("ship_time is null");
                return (Criteria) this;
            }

            public Criteria andShipTimeIsNotNull() {
                addCriterion("ship_time is not null");
                return (Criteria) this;
            }

            public Criteria andShipTimeEqualTo(LocalDateTime value) {
                addCriterion("ship_time =", value, "shipTime");
                return (Criteria) this;
            }

    public Criteria andShipTimeEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("ship_time = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShipTimeNotEqualTo(LocalDateTime value) {
                addCriterion("ship_time <>", value, "shipTime");
                return (Criteria) this;
            }

    public Criteria andShipTimeNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("ship_time <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShipTimeGreaterThan(LocalDateTime value) {
                addCriterion("ship_time >", value, "shipTime");
                return (Criteria) this;
            }

    public Criteria andShipTimeGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("ship_time > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShipTimeGreaterThanOrEqualTo(LocalDateTime value) {
                addCriterion("ship_time >=", value, "shipTime");
                return (Criteria) this;
            }

    public Criteria andShipTimeGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("ship_time >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShipTimeLessThan(LocalDateTime value) {
                addCriterion("ship_time <", value, "shipTime");
                return (Criteria) this;
            }

    public Criteria andShipTimeLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("ship_time < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShipTimeLessThanOrEqualTo(LocalDateTime value) {
                addCriterion("ship_time <=", value, "shipTime");
                return (Criteria) this;
            }

    public Criteria andShipTimeLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("ship_time <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShipTimeIn(List<LocalDateTime> values) {
                addCriterion("ship_time in", values, "shipTime");
                return (Criteria) this;
            }

            public Criteria andShipTimeNotIn(List<LocalDateTime> values) {
                addCriterion("ship_time not in", values, "shipTime");
                return (Criteria) this;
            }

            public Criteria andShipTimeBetween(LocalDateTime value1, LocalDateTime value2) {
                addCriterion("ship_time between", value1, value2, "shipTime");
                return (Criteria) this;
            }

            public Criteria andShipTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
                addCriterion("ship_time not between", value1, value2, "shipTime");
                return (Criteria) this;
            }

            public Criteria andRefundAmountIsNull() {
                addCriterion("refund_amount is null");
                return (Criteria) this;
            }

            public Criteria andRefundAmountIsNotNull() {
                addCriterion("refund_amount is not null");
                return (Criteria) this;
            }

            public Criteria andRefundAmountEqualTo(BigDecimal value) {
                addCriterion("refund_amount =", value, "refundAmount");
                return (Criteria) this;
            }

    public Criteria andRefundAmountEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_amount = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundAmountNotEqualTo(BigDecimal value) {
                addCriterion("refund_amount <>", value, "refundAmount");
                return (Criteria) this;
            }

    public Criteria andRefundAmountNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_amount <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundAmountGreaterThan(BigDecimal value) {
                addCriterion("refund_amount >", value, "refundAmount");
                return (Criteria) this;
            }

    public Criteria andRefundAmountGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_amount > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundAmountGreaterThanOrEqualTo(BigDecimal value) {
                addCriterion("refund_amount >=", value, "refundAmount");
                return (Criteria) this;
            }

    public Criteria andRefundAmountGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_amount >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundAmountLessThan(BigDecimal value) {
                addCriterion("refund_amount <", value, "refundAmount");
                return (Criteria) this;
            }

    public Criteria andRefundAmountLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_amount < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundAmountLessThanOrEqualTo(BigDecimal value) {
                addCriterion("refund_amount <=", value, "refundAmount");
                return (Criteria) this;
            }

    public Criteria andRefundAmountLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_amount <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundAmountIn(List<BigDecimal> values) {
                addCriterion("refund_amount in", values, "refundAmount");
                return (Criteria) this;
            }

            public Criteria andRefundAmountNotIn(List<BigDecimal> values) {
                addCriterion("refund_amount not in", values, "refundAmount");
                return (Criteria) this;
            }

            public Criteria andRefundAmountBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("refund_amount between", value1, value2, "refundAmount");
                return (Criteria) this;
            }

            public Criteria andRefundAmountNotBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("refund_amount not between", value1, value2, "refundAmount");
                return (Criteria) this;
            }

            public Criteria andRefundTypeIsNull() {
                addCriterion("refund_type is null");
                return (Criteria) this;
            }

            public Criteria andRefundTypeIsNotNull() {
                addCriterion("refund_type is not null");
                return (Criteria) this;
            }

            public Criteria andRefundTypeEqualTo(String value) {
                addCriterion("refund_type =", value, "refundType");
                return (Criteria) this;
            }

    public Criteria andRefundTypeEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_type = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundTypeNotEqualTo(String value) {
                addCriterion("refund_type <>", value, "refundType");
                return (Criteria) this;
            }

    public Criteria andRefundTypeNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_type <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundTypeGreaterThan(String value) {
                addCriterion("refund_type >", value, "refundType");
                return (Criteria) this;
            }

    public Criteria andRefundTypeGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_type > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundTypeGreaterThanOrEqualTo(String value) {
                addCriterion("refund_type >=", value, "refundType");
                return (Criteria) this;
            }

    public Criteria andRefundTypeGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_type >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundTypeLessThan(String value) {
                addCriterion("refund_type <", value, "refundType");
                return (Criteria) this;
            }

    public Criteria andRefundTypeLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_type < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundTypeLessThanOrEqualTo(String value) {
                addCriterion("refund_type <=", value, "refundType");
                return (Criteria) this;
            }

    public Criteria andRefundTypeLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_type <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundTypeLike(String value) {
                addCriterion("refund_type like", value, "refundType");
                return (Criteria) this;
            }

            public Criteria andRefundTypeNotLike(String value) {
                addCriterion("refund_type not like", value, "refundType");
                return (Criteria) this;
            }

            public Criteria andRefundTypeIn(List<String> values) {
                addCriterion("refund_type in", values, "refundType");
                return (Criteria) this;
            }

            public Criteria andRefundTypeNotIn(List<String> values) {
                addCriterion("refund_type not in", values, "refundType");
                return (Criteria) this;
            }

            public Criteria andRefundTypeBetween(String value1, String value2) {
                addCriterion("refund_type between", value1, value2, "refundType");
                return (Criteria) this;
            }

            public Criteria andRefundTypeNotBetween(String value1, String value2) {
                addCriterion("refund_type not between", value1, value2, "refundType");
                return (Criteria) this;
            }

            public Criteria andRefundContentIsNull() {
                addCriterion("refund_content is null");
                return (Criteria) this;
            }

            public Criteria andRefundContentIsNotNull() {
                addCriterion("refund_content is not null");
                return (Criteria) this;
            }

            public Criteria andRefundContentEqualTo(String value) {
                addCriterion("refund_content =", value, "refundContent");
                return (Criteria) this;
            }

    public Criteria andRefundContentEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_content = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundContentNotEqualTo(String value) {
                addCriterion("refund_content <>", value, "refundContent");
                return (Criteria) this;
            }

    public Criteria andRefundContentNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_content <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundContentGreaterThan(String value) {
                addCriterion("refund_content >", value, "refundContent");
                return (Criteria) this;
            }

    public Criteria andRefundContentGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_content > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundContentGreaterThanOrEqualTo(String value) {
                addCriterion("refund_content >=", value, "refundContent");
                return (Criteria) this;
            }

    public Criteria andRefundContentGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_content >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundContentLessThan(String value) {
                addCriterion("refund_content <", value, "refundContent");
                return (Criteria) this;
            }

    public Criteria andRefundContentLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_content < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundContentLessThanOrEqualTo(String value) {
                addCriterion("refund_content <=", value, "refundContent");
                return (Criteria) this;
            }

    public Criteria andRefundContentLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_content <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundContentLike(String value) {
                addCriterion("refund_content like", value, "refundContent");
                return (Criteria) this;
            }

            public Criteria andRefundContentNotLike(String value) {
                addCriterion("refund_content not like", value, "refundContent");
                return (Criteria) this;
            }

            public Criteria andRefundContentIn(List<String> values) {
                addCriterion("refund_content in", values, "refundContent");
                return (Criteria) this;
            }

            public Criteria andRefundContentNotIn(List<String> values) {
                addCriterion("refund_content not in", values, "refundContent");
                return (Criteria) this;
            }

            public Criteria andRefundContentBetween(String value1, String value2) {
                addCriterion("refund_content between", value1, value2, "refundContent");
                return (Criteria) this;
            }

            public Criteria andRefundContentNotBetween(String value1, String value2) {
                addCriterion("refund_content not between", value1, value2, "refundContent");
                return (Criteria) this;
            }

            public Criteria andRefundTimeIsNull() {
                addCriterion("refund_time is null");
                return (Criteria) this;
            }

            public Criteria andRefundTimeIsNotNull() {
                addCriterion("refund_time is not null");
                return (Criteria) this;
            }

            public Criteria andRefundTimeEqualTo(LocalDateTime value) {
                addCriterion("refund_time =", value, "refundTime");
                return (Criteria) this;
            }

    public Criteria andRefundTimeEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_time = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundTimeNotEqualTo(LocalDateTime value) {
                addCriterion("refund_time <>", value, "refundTime");
                return (Criteria) this;
            }

    public Criteria andRefundTimeNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_time <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundTimeGreaterThan(LocalDateTime value) {
                addCriterion("refund_time >", value, "refundTime");
                return (Criteria) this;
            }

    public Criteria andRefundTimeGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_time > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundTimeGreaterThanOrEqualTo(LocalDateTime value) {
                addCriterion("refund_time >=", value, "refundTime");
                return (Criteria) this;
            }

    public Criteria andRefundTimeGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_time >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundTimeLessThan(LocalDateTime value) {
                addCriterion("refund_time <", value, "refundTime");
                return (Criteria) this;
            }

    public Criteria andRefundTimeLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_time < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundTimeLessThanOrEqualTo(LocalDateTime value) {
                addCriterion("refund_time <=", value, "refundTime");
                return (Criteria) this;
            }

    public Criteria andRefundTimeLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("refund_time <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRefundTimeIn(List<LocalDateTime> values) {
                addCriterion("refund_time in", values, "refundTime");
                return (Criteria) this;
            }

            public Criteria andRefundTimeNotIn(List<LocalDateTime> values) {
                addCriterion("refund_time not in", values, "refundTime");
                return (Criteria) this;
            }

            public Criteria andRefundTimeBetween(LocalDateTime value1, LocalDateTime value2) {
                addCriterion("refund_time between", value1, value2, "refundTime");
                return (Criteria) this;
            }

            public Criteria andRefundTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
                addCriterion("refund_time not between", value1, value2, "refundTime");
                return (Criteria) this;
            }

            public Criteria andConfirmTimeIsNull() {
                addCriterion("confirm_time is null");
                return (Criteria) this;
            }

            public Criteria andConfirmTimeIsNotNull() {
                addCriterion("confirm_time is not null");
                return (Criteria) this;
            }

            public Criteria andConfirmTimeEqualTo(LocalDateTime value) {
                addCriterion("confirm_time =", value, "confirmTime");
                return (Criteria) this;
            }

    public Criteria andConfirmTimeEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("confirm_time = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andConfirmTimeNotEqualTo(LocalDateTime value) {
                addCriterion("confirm_time <>", value, "confirmTime");
                return (Criteria) this;
            }

    public Criteria andConfirmTimeNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("confirm_time <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andConfirmTimeGreaterThan(LocalDateTime value) {
                addCriterion("confirm_time >", value, "confirmTime");
                return (Criteria) this;
            }

    public Criteria andConfirmTimeGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("confirm_time > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andConfirmTimeGreaterThanOrEqualTo(LocalDateTime value) {
                addCriterion("confirm_time >=", value, "confirmTime");
                return (Criteria) this;
            }

    public Criteria andConfirmTimeGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("confirm_time >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andConfirmTimeLessThan(LocalDateTime value) {
                addCriterion("confirm_time <", value, "confirmTime");
                return (Criteria) this;
            }

    public Criteria andConfirmTimeLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("confirm_time < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andConfirmTimeLessThanOrEqualTo(LocalDateTime value) {
                addCriterion("confirm_time <=", value, "confirmTime");
                return (Criteria) this;
            }

    public Criteria andConfirmTimeLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("confirm_time <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andConfirmTimeIn(List<LocalDateTime> values) {
                addCriterion("confirm_time in", values, "confirmTime");
                return (Criteria) this;
            }

            public Criteria andConfirmTimeNotIn(List<LocalDateTime> values) {
                addCriterion("confirm_time not in", values, "confirmTime");
                return (Criteria) this;
            }

            public Criteria andConfirmTimeBetween(LocalDateTime value1, LocalDateTime value2) {
                addCriterion("confirm_time between", value1, value2, "confirmTime");
                return (Criteria) this;
            }

            public Criteria andConfirmTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
                addCriterion("confirm_time not between", value1, value2, "confirmTime");
                return (Criteria) this;
            }

            public Criteria andCommentsIsNull() {
                addCriterion("comments is null");
                return (Criteria) this;
            }

            public Criteria andCommentsIsNotNull() {
                addCriterion("comments is not null");
                return (Criteria) this;
            }

            public Criteria andCommentsEqualTo(Short value) {
                addCriterion("comments =", value, "comments");
                return (Criteria) this;
            }

    public Criteria andCommentsEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("comments = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCommentsNotEqualTo(Short value) {
                addCriterion("comments <>", value, "comments");
                return (Criteria) this;
            }

    public Criteria andCommentsNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("comments <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCommentsGreaterThan(Short value) {
                addCriterion("comments >", value, "comments");
                return (Criteria) this;
            }

    public Criteria andCommentsGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("comments > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCommentsGreaterThanOrEqualTo(Short value) {
                addCriterion("comments >=", value, "comments");
                return (Criteria) this;
            }

    public Criteria andCommentsGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("comments >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCommentsLessThan(Short value) {
                addCriterion("comments <", value, "comments");
                return (Criteria) this;
            }

    public Criteria andCommentsLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("comments < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCommentsLessThanOrEqualTo(Short value) {
                addCriterion("comments <=", value, "comments");
                return (Criteria) this;
            }

    public Criteria andCommentsLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("comments <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCommentsIn(List<Short> values) {
                addCriterion("comments in", values, "comments");
                return (Criteria) this;
            }

            public Criteria andCommentsNotIn(List<Short> values) {
                addCriterion("comments not in", values, "comments");
                return (Criteria) this;
            }

            public Criteria andCommentsBetween(Short value1, Short value2) {
                addCriterion("comments between", value1, value2, "comments");
                return (Criteria) this;
            }

            public Criteria andCommentsNotBetween(Short value1, Short value2) {
                addCriterion("comments not between", value1, value2, "comments");
                return (Criteria) this;
            }

            public Criteria andEndTimeIsNull() {
                addCriterion("end_time is null");
                return (Criteria) this;
            }

            public Criteria andEndTimeIsNotNull() {
                addCriterion("end_time is not null");
                return (Criteria) this;
            }

            public Criteria andEndTimeEqualTo(LocalDateTime value) {
                addCriterion("end_time =", value, "endTime");
                return (Criteria) this;
            }

    public Criteria andEndTimeEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("end_time = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andEndTimeNotEqualTo(LocalDateTime value) {
                addCriterion("end_time <>", value, "endTime");
                return (Criteria) this;
            }

    public Criteria andEndTimeNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("end_time <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andEndTimeGreaterThan(LocalDateTime value) {
                addCriterion("end_time >", value, "endTime");
                return (Criteria) this;
            }

    public Criteria andEndTimeGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("end_time > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andEndTimeGreaterThanOrEqualTo(LocalDateTime value) {
                addCriterion("end_time >=", value, "endTime");
                return (Criteria) this;
            }

    public Criteria andEndTimeGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("end_time >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andEndTimeLessThan(LocalDateTime value) {
                addCriterion("end_time <", value, "endTime");
                return (Criteria) this;
            }

    public Criteria andEndTimeLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("end_time < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andEndTimeLessThanOrEqualTo(LocalDateTime value) {
                addCriterion("end_time <=", value, "endTime");
                return (Criteria) this;
            }

    public Criteria andEndTimeLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("end_time <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andEndTimeIn(List<LocalDateTime> values) {
                addCriterion("end_time in", values, "endTime");
                return (Criteria) this;
            }

            public Criteria andEndTimeNotIn(List<LocalDateTime> values) {
                addCriterion("end_time not in", values, "endTime");
                return (Criteria) this;
            }

            public Criteria andEndTimeBetween(LocalDateTime value1, LocalDateTime value2) {
                addCriterion("end_time between", value1, value2, "endTime");
                return (Criteria) this;
            }

            public Criteria andEndTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
                addCriterion("end_time not between", value1, value2, "endTime");
                return (Criteria) this;
            }

            public Criteria andAddTimeIsNull() {
                addCriterion("add_time is null");
                return (Criteria) this;
            }

            public Criteria andAddTimeIsNotNull() {
                addCriterion("add_time is not null");
                return (Criteria) this;
            }

            public Criteria andAddTimeEqualTo(LocalDateTime value) {
                addCriterion("add_time =", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("add_time = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeNotEqualTo(LocalDateTime value) {
                addCriterion("add_time <>", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("add_time <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeGreaterThan(LocalDateTime value) {
                addCriterion("add_time >", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("add_time > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeGreaterThanOrEqualTo(LocalDateTime value) {
                addCriterion("add_time >=", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("add_time >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeLessThan(LocalDateTime value) {
                addCriterion("add_time <", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("add_time < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeLessThanOrEqualTo(LocalDateTime value) {
                addCriterion("add_time <=", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("add_time <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeIn(List<LocalDateTime> values) {
                addCriterion("add_time in", values, "addTime");
                return (Criteria) this;
            }

            public Criteria andAddTimeNotIn(List<LocalDateTime> values) {
                addCriterion("add_time not in", values, "addTime");
                return (Criteria) this;
            }

            public Criteria andAddTimeBetween(LocalDateTime value1, LocalDateTime value2) {
                addCriterion("add_time between", value1, value2, "addTime");
                return (Criteria) this;
            }

            public Criteria andAddTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
                addCriterion("add_time not between", value1, value2, "addTime");
                return (Criteria) this;
            }

            public Criteria andUpdateTimeIsNull() {
                addCriterion("update_time is null");
                return (Criteria) this;
            }

            public Criteria andUpdateTimeIsNotNull() {
                addCriterion("update_time is not null");
                return (Criteria) this;
            }

            public Criteria andUpdateTimeEqualTo(LocalDateTime value) {
                addCriterion("update_time =", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeNotEqualTo(LocalDateTime value) {
                addCriterion("update_time <>", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeGreaterThan(LocalDateTime value) {
                addCriterion("update_time >", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
                addCriterion("update_time >=", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeLessThan(LocalDateTime value) {
                addCriterion("update_time <", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
                addCriterion("update_time <=", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("update_time <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeIn(List<LocalDateTime> values) {
                addCriterion("update_time in", values, "updateTime");
                return (Criteria) this;
            }

            public Criteria andUpdateTimeNotIn(List<LocalDateTime> values) {
                addCriterion("update_time not in", values, "updateTime");
                return (Criteria) this;
            }

            public Criteria andUpdateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
                addCriterion("update_time between", value1, value2, "updateTime");
                return (Criteria) this;
            }

            public Criteria andUpdateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
                addCriterion("update_time not between", value1, value2, "updateTime");
                return (Criteria) this;
            }

            public Criteria andDeletedIsNull() {
                addCriterion("deleted is null");
                return (Criteria) this;
            }

            public Criteria andDeletedIsNotNull() {
                addCriterion("deleted is not null");
                return (Criteria) this;
            }

            public Criteria andDeletedEqualTo(Boolean value) {
                addCriterion("deleted =", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedNotEqualTo(Boolean value) {
                addCriterion("deleted <>", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedNotEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedGreaterThan(Boolean value) {
                addCriterion("deleted >", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedGreaterThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
                addCriterion("deleted >=", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedGreaterThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedLessThan(Boolean value) {
                addCriterion("deleted <", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedLessThanColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
                addCriterion("deleted <=", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedLessThanOrEqualToColumn(MallOrder.Column column) {
                addCriterion(new StringBuilder("deleted <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedIn(List<Boolean> values) {
                addCriterion("deleted in", values, "deleted");
                return (Criteria) this;
            }

            public Criteria andDeletedNotIn(List<Boolean> values) {
                addCriterion("deleted not in", values, "deleted");
                return (Criteria) this;
            }

            public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
                addCriterion("deleted between", value1, value2, "deleted");
                return (Criteria) this;
            }

            public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
                addCriterion("deleted not between", value1, value2, "deleted");
                return (Criteria) this;
            }
        }

    public static class Criteria extends GeneratedCriteria {

            private MallOrderExample example;

    protected Criteria(MallOrderExample example) {
                super();
                this.example = example;
            }

    public MallOrderExample example() {
                return this.example;
            }

    @Deprecated
            public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
                if (ifAdd) {
                    add.add(this);
                }
                return this;
            }

    public Criteria when(boolean condition, ICriteriaWhen then) {
                if (condition) {
                    then.criteria(this);
                }
                return this;
            }

    public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
                if (condition) {
                    then.criteria(this);
                } else {
                    otherwise.criteria(this);
                }
                return this;
            }

    public Criteria andLogicalDeleted(boolean deleted) {
                return deleted ? andDeletedEqualTo(MallOrder.Deleted.IS_DELETED.value()) : andDeletedNotEqualTo(MallOrder.Deleted.IS_DELETED.value());
            }

            @Deprecated
            public interface ICriteriaAdd {

                Criteria add(Criteria add);
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

        public interface ICriteriaWhen {

            void criteria(Criteria criteria);
        }

        public interface IExampleWhen {

            void example(MallOrderExample example);
        }
}