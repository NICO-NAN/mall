package com.mall.order.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MallCartExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MallCartExample() {
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

    public MallCartExample orderBy(String orderByClause) {
            this.setOrderByClause(orderByClause);
            return this;
        }

    public MallCartExample orderBy(String ... orderByClauses) {
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
            MallCartExample example = new MallCartExample();
            return example.createCriteria();
        }

    public MallCartExample when(boolean condition, IExampleWhen then) {
            if (condition) {
                then.example(this);
            }
            return this;
        }

    public MallCartExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
            if (condition) {
                then.example(this);
            } else {
                otherwise.example(this);
            }
            return this;
        }

    protected abstract static class GeneratedCriteria {
            protected List<Criterion> specificationsCriteria;

            protected List<Criterion> allCriteria;

            protected List<Criterion> criteria;

            protected GeneratedCriteria() {
                super();
                criteria = new ArrayList<Criterion>();
                specificationsCriteria = new ArrayList<Criterion>();
            }

            public List<Criterion> getSpecificationsCriteria() {
                return specificationsCriteria;
            }

            protected void addSpecificationsCriterion(String condition, Object value, String property) {
                if (value == null) {
                    throw new RuntimeException("Value for " + property + " cannot be null");
                }
                specificationsCriteria.add(new Criterion(condition, value, "com.mall.common.util.JsonStringArrayTypeHandler"));
                allCriteria = null;
            }

            protected void addSpecificationsCriterion(String condition, String[] value1, String[] value2, String property) {
                if (value1 == null || value2 == null) {
                    throw new RuntimeException("Between values for " + property + " cannot be null");
                }
                specificationsCriteria.add(new Criterion(condition, value1, value2, "com.mall.common.util.JsonStringArrayTypeHandler"));
                allCriteria = null;
            }

            public boolean isValid() {
                return criteria.size() > 0
                        || specificationsCriteria.size() > 0;
            }

            public List<Criterion> getAllCriteria() {
                if (allCriteria == null) {
                    allCriteria = new ArrayList<Criterion>();
                    allCriteria.addAll(criteria);
                    allCriteria.addAll(specificationsCriteria);
                }
                return allCriteria;
            }

            public List<Criterion> getCriteria() {
                return criteria;
            }

            protected void addCriterion(String condition) {
                if (condition == null) {
                    throw new RuntimeException("Value for condition cannot be null");
                }
                criteria.add(new Criterion(condition));
                allCriteria = null;
            }

            protected void addCriterion(String condition, Object value, String property) {
                if (value == null) {
                    throw new RuntimeException("Value for " + property + " cannot be null");
                }
                criteria.add(new Criterion(condition, value));
                allCriteria = null;
            }

            protected void addCriterion(String condition, Object value1, Object value2, String property) {
                if (value1 == null || value2 == null) {
                    throw new RuntimeException("Between values for " + property + " cannot be null");
                }
                criteria.add(new Criterion(condition, value1, value2));
                allCriteria = null;
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

    public Criteria andIdEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdNotEqualTo(Integer value) {
                addCriterion("id <>", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdNotEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdGreaterThan(Integer value) {
                addCriterion("id >", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdGreaterThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdGreaterThanOrEqualTo(Integer value) {
                addCriterion("id >=", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdGreaterThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdLessThan(Integer value) {
                addCriterion("id <", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdLessThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdLessThanOrEqualTo(Integer value) {
                addCriterion("id <=", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdLessThanOrEqualToColumn(MallCart.Column column) {
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

    public Criteria andUserIdEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("user_id = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUserIdNotEqualTo(Integer value) {
                addCriterion("user_id <>", value, "userId");
                return (Criteria) this;
            }

    public Criteria andUserIdNotEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("user_id <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUserIdGreaterThan(Integer value) {
                addCriterion("user_id >", value, "userId");
                return (Criteria) this;
            }

    public Criteria andUserIdGreaterThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("user_id > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
                addCriterion("user_id >=", value, "userId");
                return (Criteria) this;
            }

    public Criteria andUserIdGreaterThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("user_id >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUserIdLessThan(Integer value) {
                addCriterion("user_id <", value, "userId");
                return (Criteria) this;
            }

    public Criteria andUserIdLessThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("user_id < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUserIdLessThanOrEqualTo(Integer value) {
                addCriterion("user_id <=", value, "userId");
                return (Criteria) this;
            }

    public Criteria andUserIdLessThanOrEqualToColumn(MallCart.Column column) {
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

            public Criteria andGoodsIdIsNull() {
                addCriterion("goods_id is null");
                return (Criteria) this;
            }

            public Criteria andGoodsIdIsNotNull() {
                addCriterion("goods_id is not null");
                return (Criteria) this;
            }

            public Criteria andGoodsIdEqualTo(Integer value) {
                addCriterion("goods_id =", value, "goodsId");
                return (Criteria) this;
            }

    public Criteria andGoodsIdEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("goods_id = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsIdNotEqualTo(Integer value) {
                addCriterion("goods_id <>", value, "goodsId");
                return (Criteria) this;
            }

    public Criteria andGoodsIdNotEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("goods_id <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsIdGreaterThan(Integer value) {
                addCriterion("goods_id >", value, "goodsId");
                return (Criteria) this;
            }

    public Criteria andGoodsIdGreaterThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("goods_id > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
                addCriterion("goods_id >=", value, "goodsId");
                return (Criteria) this;
            }

    public Criteria andGoodsIdGreaterThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("goods_id >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsIdLessThan(Integer value) {
                addCriterion("goods_id <", value, "goodsId");
                return (Criteria) this;
            }

    public Criteria andGoodsIdLessThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("goods_id < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
                addCriterion("goods_id <=", value, "goodsId");
                return (Criteria) this;
            }

    public Criteria andGoodsIdLessThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("goods_id <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsIdIn(List<Integer> values) {
                addCriterion("goods_id in", values, "goodsId");
                return (Criteria) this;
            }

            public Criteria andGoodsIdNotIn(List<Integer> values) {
                addCriterion("goods_id not in", values, "goodsId");
                return (Criteria) this;
            }

            public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
                addCriterion("goods_id between", value1, value2, "goodsId");
                return (Criteria) this;
            }

            public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
                addCriterion("goods_id not between", value1, value2, "goodsId");
                return (Criteria) this;
            }

            public Criteria andGoodsSnIsNull() {
                addCriterion("goods_sn is null");
                return (Criteria) this;
            }

            public Criteria andGoodsSnIsNotNull() {
                addCriterion("goods_sn is not null");
                return (Criteria) this;
            }

            public Criteria andGoodsSnEqualTo(String value) {
                addCriterion("goods_sn =", value, "goodsSn");
                return (Criteria) this;
            }

    public Criteria andGoodsSnEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("goods_sn = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsSnNotEqualTo(String value) {
                addCriterion("goods_sn <>", value, "goodsSn");
                return (Criteria) this;
            }

    public Criteria andGoodsSnNotEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("goods_sn <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsSnGreaterThan(String value) {
                addCriterion("goods_sn >", value, "goodsSn");
                return (Criteria) this;
            }

    public Criteria andGoodsSnGreaterThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("goods_sn > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsSnGreaterThanOrEqualTo(String value) {
                addCriterion("goods_sn >=", value, "goodsSn");
                return (Criteria) this;
            }

    public Criteria andGoodsSnGreaterThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("goods_sn >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsSnLessThan(String value) {
                addCriterion("goods_sn <", value, "goodsSn");
                return (Criteria) this;
            }

    public Criteria andGoodsSnLessThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("goods_sn < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsSnLessThanOrEqualTo(String value) {
                addCriterion("goods_sn <=", value, "goodsSn");
                return (Criteria) this;
            }

    public Criteria andGoodsSnLessThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("goods_sn <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsSnLike(String value) {
                addCriterion("goods_sn like", value, "goodsSn");
                return (Criteria) this;
            }

            public Criteria andGoodsSnNotLike(String value) {
                addCriterion("goods_sn not like", value, "goodsSn");
                return (Criteria) this;
            }

            public Criteria andGoodsSnIn(List<String> values) {
                addCriterion("goods_sn in", values, "goodsSn");
                return (Criteria) this;
            }

            public Criteria andGoodsSnNotIn(List<String> values) {
                addCriterion("goods_sn not in", values, "goodsSn");
                return (Criteria) this;
            }

            public Criteria andGoodsSnBetween(String value1, String value2) {
                addCriterion("goods_sn between", value1, value2, "goodsSn");
                return (Criteria) this;
            }

            public Criteria andGoodsSnNotBetween(String value1, String value2) {
                addCriterion("goods_sn not between", value1, value2, "goodsSn");
                return (Criteria) this;
            }

            public Criteria andGoodsNameIsNull() {
                addCriterion("goods_name is null");
                return (Criteria) this;
            }

            public Criteria andGoodsNameIsNotNull() {
                addCriterion("goods_name is not null");
                return (Criteria) this;
            }

            public Criteria andGoodsNameEqualTo(String value) {
                addCriterion("goods_name =", value, "goodsName");
                return (Criteria) this;
            }

    public Criteria andGoodsNameEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("goods_name = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsNameNotEqualTo(String value) {
                addCriterion("goods_name <>", value, "goodsName");
                return (Criteria) this;
            }

    public Criteria andGoodsNameNotEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("goods_name <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsNameGreaterThan(String value) {
                addCriterion("goods_name >", value, "goodsName");
                return (Criteria) this;
            }

    public Criteria andGoodsNameGreaterThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("goods_name > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
                addCriterion("goods_name >=", value, "goodsName");
                return (Criteria) this;
            }

    public Criteria andGoodsNameGreaterThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("goods_name >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsNameLessThan(String value) {
                addCriterion("goods_name <", value, "goodsName");
                return (Criteria) this;
            }

    public Criteria andGoodsNameLessThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("goods_name < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsNameLessThanOrEqualTo(String value) {
                addCriterion("goods_name <=", value, "goodsName");
                return (Criteria) this;
            }

    public Criteria andGoodsNameLessThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("goods_name <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsNameLike(String value) {
                addCriterion("goods_name like", value, "goodsName");
                return (Criteria) this;
            }

            public Criteria andGoodsNameNotLike(String value) {
                addCriterion("goods_name not like", value, "goodsName");
                return (Criteria) this;
            }

            public Criteria andGoodsNameIn(List<String> values) {
                addCriterion("goods_name in", values, "goodsName");
                return (Criteria) this;
            }

            public Criteria andGoodsNameNotIn(List<String> values) {
                addCriterion("goods_name not in", values, "goodsName");
                return (Criteria) this;
            }

            public Criteria andGoodsNameBetween(String value1, String value2) {
                addCriterion("goods_name between", value1, value2, "goodsName");
                return (Criteria) this;
            }

            public Criteria andGoodsNameNotBetween(String value1, String value2) {
                addCriterion("goods_name not between", value1, value2, "goodsName");
                return (Criteria) this;
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

    public Criteria andProductIdEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("product_id = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andProductIdNotEqualTo(Integer value) {
                addCriterion("product_id <>", value, "productId");
                return (Criteria) this;
            }

    public Criteria andProductIdNotEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("product_id <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andProductIdGreaterThan(Integer value) {
                addCriterion("product_id >", value, "productId");
                return (Criteria) this;
            }

    public Criteria andProductIdGreaterThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("product_id > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
                addCriterion("product_id >=", value, "productId");
                return (Criteria) this;
            }

    public Criteria andProductIdGreaterThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("product_id >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andProductIdLessThan(Integer value) {
                addCriterion("product_id <", value, "productId");
                return (Criteria) this;
            }

    public Criteria andProductIdLessThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("product_id < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andProductIdLessThanOrEqualTo(Integer value) {
                addCriterion("product_id <=", value, "productId");
                return (Criteria) this;
            }

    public Criteria andProductIdLessThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("product_id <= ").append(column.getEscapedColumnName()).toString());
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

            public Criteria andPriceIsNull() {
                addCriterion("price is null");
                return (Criteria) this;
            }

            public Criteria andPriceIsNotNull() {
                addCriterion("price is not null");
                return (Criteria) this;
            }

            public Criteria andPriceEqualTo(BigDecimal value) {
                addCriterion("price =", value, "price");
                return (Criteria) this;
            }

    public Criteria andPriceEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("price = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPriceNotEqualTo(BigDecimal value) {
                addCriterion("price <>", value, "price");
                return (Criteria) this;
            }

    public Criteria andPriceNotEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("price <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPriceGreaterThan(BigDecimal value) {
                addCriterion("price >", value, "price");
                return (Criteria) this;
            }

    public Criteria andPriceGreaterThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("price > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
                addCriterion("price >=", value, "price");
                return (Criteria) this;
            }

    public Criteria andPriceGreaterThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("price >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPriceLessThan(BigDecimal value) {
                addCriterion("price <", value, "price");
                return (Criteria) this;
            }

    public Criteria andPriceLessThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("price < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
                addCriterion("price <=", value, "price");
                return (Criteria) this;
            }

    public Criteria andPriceLessThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("price <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPriceIn(List<BigDecimal> values) {
                addCriterion("price in", values, "price");
                return (Criteria) this;
            }

            public Criteria andPriceNotIn(List<BigDecimal> values) {
                addCriterion("price not in", values, "price");
                return (Criteria) this;
            }

            public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("price between", value1, value2, "price");
                return (Criteria) this;
            }

            public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("price not between", value1, value2, "price");
                return (Criteria) this;
            }

            public Criteria andNumberIsNull() {
                addCriterion("`number` is null");
                return (Criteria) this;
            }

            public Criteria andNumberIsNotNull() {
                addCriterion("`number` is not null");
                return (Criteria) this;
            }

            public Criteria andNumberEqualTo(Short value) {
                addCriterion("`number` =", value, "number");
                return (Criteria) this;
            }

    public Criteria andNumberEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("`number` = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNumberNotEqualTo(Short value) {
                addCriterion("`number` <>", value, "number");
                return (Criteria) this;
            }

    public Criteria andNumberNotEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("`number` <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNumberGreaterThan(Short value) {
                addCriterion("`number` >", value, "number");
                return (Criteria) this;
            }

    public Criteria andNumberGreaterThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("`number` > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNumberGreaterThanOrEqualTo(Short value) {
                addCriterion("`number` >=", value, "number");
                return (Criteria) this;
            }

    public Criteria andNumberGreaterThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("`number` >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNumberLessThan(Short value) {
                addCriterion("`number` <", value, "number");
                return (Criteria) this;
            }

    public Criteria andNumberLessThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("`number` < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNumberLessThanOrEqualTo(Short value) {
                addCriterion("`number` <=", value, "number");
                return (Criteria) this;
            }

    public Criteria andNumberLessThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("`number` <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNumberIn(List<Short> values) {
                addCriterion("`number` in", values, "number");
                return (Criteria) this;
            }

            public Criteria andNumberNotIn(List<Short> values) {
                addCriterion("`number` not in", values, "number");
                return (Criteria) this;
            }

            public Criteria andNumberBetween(Short value1, Short value2) {
                addCriterion("`number` between", value1, value2, "number");
                return (Criteria) this;
            }

            public Criteria andNumberNotBetween(Short value1, Short value2) {
                addCriterion("`number` not between", value1, value2, "number");
                return (Criteria) this;
            }

            public Criteria andSpecificationsIsNull() {
                addCriterion("specifications is null");
                return (Criteria) this;
            }

            public Criteria andSpecificationsIsNotNull() {
                addCriterion("specifications is not null");
                return (Criteria) this;
            }

            public Criteria andSpecificationsEqualTo(String[] value) {
                addSpecificationsCriterion("specifications =", value, "specifications");
                return (Criteria) this;
            }

    public Criteria andSpecificationsEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("specifications = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSpecificationsNotEqualTo(String[] value) {
                addSpecificationsCriterion("specifications <>", value, "specifications");
                return (Criteria) this;
            }

    public Criteria andSpecificationsNotEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("specifications <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSpecificationsGreaterThan(String[] value) {
                addSpecificationsCriterion("specifications >", value, "specifications");
                return (Criteria) this;
            }

    public Criteria andSpecificationsGreaterThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("specifications > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSpecificationsGreaterThanOrEqualTo(String[] value) {
                addSpecificationsCriterion("specifications >=", value, "specifications");
                return (Criteria) this;
            }

    public Criteria andSpecificationsGreaterThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("specifications >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSpecificationsLessThan(String[] value) {
                addSpecificationsCriterion("specifications <", value, "specifications");
                return (Criteria) this;
            }

    public Criteria andSpecificationsLessThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("specifications < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSpecificationsLessThanOrEqualTo(String[] value) {
                addSpecificationsCriterion("specifications <=", value, "specifications");
                return (Criteria) this;
            }

    public Criteria andSpecificationsLessThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("specifications <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSpecificationsLike(String[] value) {
                addSpecificationsCriterion("specifications like", value, "specifications");
                return (Criteria) this;
            }

            public Criteria andSpecificationsNotLike(String[] value) {
                addSpecificationsCriterion("specifications not like", value, "specifications");
                return (Criteria) this;
            }

            public Criteria andSpecificationsIn(List<String[]> values) {
                addSpecificationsCriterion("specifications in", values, "specifications");
                return (Criteria) this;
            }

            public Criteria andSpecificationsNotIn(List<String[]> values) {
                addSpecificationsCriterion("specifications not in", values, "specifications");
                return (Criteria) this;
            }

            public Criteria andSpecificationsBetween(String[] value1, String[] value2) {
                addSpecificationsCriterion("specifications between", value1, value2, "specifications");
                return (Criteria) this;
            }

            public Criteria andSpecificationsNotBetween(String[] value1, String[] value2) {
                addSpecificationsCriterion("specifications not between", value1, value2, "specifications");
                return (Criteria) this;
            }

            public Criteria andCheckedIsNull() {
                addCriterion("`checked` is null");
                return (Criteria) this;
            }

            public Criteria andCheckedIsNotNull() {
                addCriterion("`checked` is not null");
                return (Criteria) this;
            }

            public Criteria andCheckedEqualTo(Boolean value) {
                addCriterion("`checked` =", value, "checked");
                return (Criteria) this;
            }

    public Criteria andCheckedEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("`checked` = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCheckedNotEqualTo(Boolean value) {
                addCriterion("`checked` <>", value, "checked");
                return (Criteria) this;
            }

    public Criteria andCheckedNotEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("`checked` <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCheckedGreaterThan(Boolean value) {
                addCriterion("`checked` >", value, "checked");
                return (Criteria) this;
            }

    public Criteria andCheckedGreaterThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("`checked` > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCheckedGreaterThanOrEqualTo(Boolean value) {
                addCriterion("`checked` >=", value, "checked");
                return (Criteria) this;
            }

    public Criteria andCheckedGreaterThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("`checked` >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCheckedLessThan(Boolean value) {
                addCriterion("`checked` <", value, "checked");
                return (Criteria) this;
            }

    public Criteria andCheckedLessThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("`checked` < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCheckedLessThanOrEqualTo(Boolean value) {
                addCriterion("`checked` <=", value, "checked");
                return (Criteria) this;
            }

    public Criteria andCheckedLessThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("`checked` <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCheckedIn(List<Boolean> values) {
                addCriterion("`checked` in", values, "checked");
                return (Criteria) this;
            }

            public Criteria andCheckedNotIn(List<Boolean> values) {
                addCriterion("`checked` not in", values, "checked");
                return (Criteria) this;
            }

            public Criteria andCheckedBetween(Boolean value1, Boolean value2) {
                addCriterion("`checked` between", value1, value2, "checked");
                return (Criteria) this;
            }

            public Criteria andCheckedNotBetween(Boolean value1, Boolean value2) {
                addCriterion("`checked` not between", value1, value2, "checked");
                return (Criteria) this;
            }

            public Criteria andPicUrlIsNull() {
                addCriterion("pic_url is null");
                return (Criteria) this;
            }

            public Criteria andPicUrlIsNotNull() {
                addCriterion("pic_url is not null");
                return (Criteria) this;
            }

            public Criteria andPicUrlEqualTo(String value) {
                addCriterion("pic_url =", value, "picUrl");
                return (Criteria) this;
            }

    public Criteria andPicUrlEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("pic_url = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPicUrlNotEqualTo(String value) {
                addCriterion("pic_url <>", value, "picUrl");
                return (Criteria) this;
            }

    public Criteria andPicUrlNotEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("pic_url <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPicUrlGreaterThan(String value) {
                addCriterion("pic_url >", value, "picUrl");
                return (Criteria) this;
            }

    public Criteria andPicUrlGreaterThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("pic_url > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
                addCriterion("pic_url >=", value, "picUrl");
                return (Criteria) this;
            }

    public Criteria andPicUrlGreaterThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("pic_url >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPicUrlLessThan(String value) {
                addCriterion("pic_url <", value, "picUrl");
                return (Criteria) this;
            }

    public Criteria andPicUrlLessThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("pic_url < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPicUrlLessThanOrEqualTo(String value) {
                addCriterion("pic_url <=", value, "picUrl");
                return (Criteria) this;
            }

    public Criteria andPicUrlLessThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("pic_url <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPicUrlLike(String value) {
                addCriterion("pic_url like", value, "picUrl");
                return (Criteria) this;
            }

            public Criteria andPicUrlNotLike(String value) {
                addCriterion("pic_url not like", value, "picUrl");
                return (Criteria) this;
            }

            public Criteria andPicUrlIn(List<String> values) {
                addCriterion("pic_url in", values, "picUrl");
                return (Criteria) this;
            }

            public Criteria andPicUrlNotIn(List<String> values) {
                addCriterion("pic_url not in", values, "picUrl");
                return (Criteria) this;
            }

            public Criteria andPicUrlBetween(String value1, String value2) {
                addCriterion("pic_url between", value1, value2, "picUrl");
                return (Criteria) this;
            }

            public Criteria andPicUrlNotBetween(String value1, String value2) {
                addCriterion("pic_url not between", value1, value2, "picUrl");
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

    public Criteria andAddTimeEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("add_time = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeNotEqualTo(LocalDateTime value) {
                addCriterion("add_time <>", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeNotEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("add_time <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeGreaterThan(LocalDateTime value) {
                addCriterion("add_time >", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeGreaterThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("add_time > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeGreaterThanOrEqualTo(LocalDateTime value) {
                addCriterion("add_time >=", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeGreaterThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("add_time >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeLessThan(LocalDateTime value) {
                addCriterion("add_time <", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeLessThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("add_time < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeLessThanOrEqualTo(LocalDateTime value) {
                addCriterion("add_time <=", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeLessThanOrEqualToColumn(MallCart.Column column) {
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

    public Criteria andUpdateTimeEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeNotEqualTo(LocalDateTime value) {
                addCriterion("update_time <>", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeNotEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeGreaterThan(LocalDateTime value) {
                addCriterion("update_time >", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeGreaterThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
                addCriterion("update_time >=", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeGreaterThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeLessThan(LocalDateTime value) {
                addCriterion("update_time <", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeLessThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
                addCriterion("update_time <=", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeLessThanOrEqualToColumn(MallCart.Column column) {
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

    public Criteria andDeletedEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedNotEqualTo(Boolean value) {
                addCriterion("deleted <>", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedNotEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedGreaterThan(Boolean value) {
                addCriterion("deleted >", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedGreaterThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
                addCriterion("deleted >=", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedGreaterThanOrEqualToColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedLessThan(Boolean value) {
                addCriterion("deleted <", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedLessThanColumn(MallCart.Column column) {
                addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
                addCriterion("deleted <=", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedLessThanOrEqualToColumn(MallCart.Column column) {
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

            private MallCartExample example;

    protected Criteria(MallCartExample example) {
                super();
                this.example = example;
            }

    public MallCartExample example() {
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
                return deleted ? andDeletedEqualTo(MallCart.Deleted.IS_DELETED.value()) : andDeletedNotEqualTo(MallCart.Deleted.IS_DELETED.value());
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

            void example(MallCartExample example);
        }
}