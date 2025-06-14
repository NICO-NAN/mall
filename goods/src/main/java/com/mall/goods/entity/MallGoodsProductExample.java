package com.mall.goods.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MallGoodsProductExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MallGoodsProductExample() {
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

    public MallGoodsProductExample orderBy(String orderByClause) {
            this.setOrderByClause(orderByClause);
            return this;
        }

    public MallGoodsProductExample orderBy(String ... orderByClauses) {
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
            MallGoodsProductExample example = new MallGoodsProductExample();
            return example.createCriteria();
        }

    public MallGoodsProductExample when(boolean condition, IExampleWhen then) {
            if (condition) {
                then.example(this);
            }
            return this;
        }

    public MallGoodsProductExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

    public Criteria andIdEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdNotEqualTo(Integer value) {
                addCriterion("id <>", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdNotEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdGreaterThan(Integer value) {
                addCriterion("id >", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdGreaterThanColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdGreaterThanOrEqualTo(Integer value) {
                addCriterion("id >=", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdGreaterThanOrEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdLessThan(Integer value) {
                addCriterion("id <", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdLessThanColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdLessThanOrEqualTo(Integer value) {
                addCriterion("id <=", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdLessThanOrEqualToColumn(MallGoodsProduct.Column column) {
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

    public Criteria andGoodsIdEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("goods_id = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsIdNotEqualTo(Integer value) {
                addCriterion("goods_id <>", value, "goodsId");
                return (Criteria) this;
            }

    public Criteria andGoodsIdNotEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("goods_id <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsIdGreaterThan(Integer value) {
                addCriterion("goods_id >", value, "goodsId");
                return (Criteria) this;
            }

    public Criteria andGoodsIdGreaterThanColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("goods_id > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
                addCriterion("goods_id >=", value, "goodsId");
                return (Criteria) this;
            }

    public Criteria andGoodsIdGreaterThanOrEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("goods_id >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsIdLessThan(Integer value) {
                addCriterion("goods_id <", value, "goodsId");
                return (Criteria) this;
            }

    public Criteria andGoodsIdLessThanColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("goods_id < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
                addCriterion("goods_id <=", value, "goodsId");
                return (Criteria) this;
            }

    public Criteria andGoodsIdLessThanOrEqualToColumn(MallGoodsProduct.Column column) {
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

    public Criteria andSpecificationsEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("specifications = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSpecificationsNotEqualTo(String[] value) {
                addSpecificationsCriterion("specifications <>", value, "specifications");
                return (Criteria) this;
            }

    public Criteria andSpecificationsNotEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("specifications <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSpecificationsGreaterThan(String[] value) {
                addSpecificationsCriterion("specifications >", value, "specifications");
                return (Criteria) this;
            }

    public Criteria andSpecificationsGreaterThanColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("specifications > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSpecificationsGreaterThanOrEqualTo(String[] value) {
                addSpecificationsCriterion("specifications >=", value, "specifications");
                return (Criteria) this;
            }

    public Criteria andSpecificationsGreaterThanOrEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("specifications >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSpecificationsLessThan(String[] value) {
                addSpecificationsCriterion("specifications <", value, "specifications");
                return (Criteria) this;
            }

    public Criteria andSpecificationsLessThanColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("specifications < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSpecificationsLessThanOrEqualTo(String[] value) {
                addSpecificationsCriterion("specifications <=", value, "specifications");
                return (Criteria) this;
            }

    public Criteria andSpecificationsLessThanOrEqualToColumn(MallGoodsProduct.Column column) {
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

    public Criteria andPriceEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("price = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPriceNotEqualTo(BigDecimal value) {
                addCriterion("price <>", value, "price");
                return (Criteria) this;
            }

    public Criteria andPriceNotEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("price <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPriceGreaterThan(BigDecimal value) {
                addCriterion("price >", value, "price");
                return (Criteria) this;
            }

    public Criteria andPriceGreaterThanColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("price > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
                addCriterion("price >=", value, "price");
                return (Criteria) this;
            }

    public Criteria andPriceGreaterThanOrEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("price >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPriceLessThan(BigDecimal value) {
                addCriterion("price <", value, "price");
                return (Criteria) this;
            }

    public Criteria andPriceLessThanColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("price < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
                addCriterion("price <=", value, "price");
                return (Criteria) this;
            }

    public Criteria andPriceLessThanOrEqualToColumn(MallGoodsProduct.Column column) {
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

            public Criteria andNumberEqualTo(Integer value) {
                addCriterion("`number` =", value, "number");
                return (Criteria) this;
            }

    public Criteria andNumberEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("`number` = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNumberNotEqualTo(Integer value) {
                addCriterion("`number` <>", value, "number");
                return (Criteria) this;
            }

    public Criteria andNumberNotEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("`number` <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNumberGreaterThan(Integer value) {
                addCriterion("`number` >", value, "number");
                return (Criteria) this;
            }

    public Criteria andNumberGreaterThanColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("`number` > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
                addCriterion("`number` >=", value, "number");
                return (Criteria) this;
            }

    public Criteria andNumberGreaterThanOrEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("`number` >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNumberLessThan(Integer value) {
                addCriterion("`number` <", value, "number");
                return (Criteria) this;
            }

    public Criteria andNumberLessThanColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("`number` < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNumberLessThanOrEqualTo(Integer value) {
                addCriterion("`number` <=", value, "number");
                return (Criteria) this;
            }

    public Criteria andNumberLessThanOrEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("`number` <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNumberIn(List<Integer> values) {
                addCriterion("`number` in", values, "number");
                return (Criteria) this;
            }

            public Criteria andNumberNotIn(List<Integer> values) {
                addCriterion("`number` not in", values, "number");
                return (Criteria) this;
            }

            public Criteria andNumberBetween(Integer value1, Integer value2) {
                addCriterion("`number` between", value1, value2, "number");
                return (Criteria) this;
            }

            public Criteria andNumberNotBetween(Integer value1, Integer value2) {
                addCriterion("`number` not between", value1, value2, "number");
                return (Criteria) this;
            }

            public Criteria andUrlIsNull() {
                addCriterion("url is null");
                return (Criteria) this;
            }

            public Criteria andUrlIsNotNull() {
                addCriterion("url is not null");
                return (Criteria) this;
            }

            public Criteria andUrlEqualTo(String value) {
                addCriterion("url =", value, "url");
                return (Criteria) this;
            }

    public Criteria andUrlEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("url = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUrlNotEqualTo(String value) {
                addCriterion("url <>", value, "url");
                return (Criteria) this;
            }

    public Criteria andUrlNotEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("url <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUrlGreaterThan(String value) {
                addCriterion("url >", value, "url");
                return (Criteria) this;
            }

    public Criteria andUrlGreaterThanColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("url > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUrlGreaterThanOrEqualTo(String value) {
                addCriterion("url >=", value, "url");
                return (Criteria) this;
            }

    public Criteria andUrlGreaterThanOrEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("url >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUrlLessThan(String value) {
                addCriterion("url <", value, "url");
                return (Criteria) this;
            }

    public Criteria andUrlLessThanColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("url < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUrlLessThanOrEqualTo(String value) {
                addCriterion("url <=", value, "url");
                return (Criteria) this;
            }

    public Criteria andUrlLessThanOrEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("url <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUrlLike(String value) {
                addCriterion("url like", value, "url");
                return (Criteria) this;
            }

            public Criteria andUrlNotLike(String value) {
                addCriterion("url not like", value, "url");
                return (Criteria) this;
            }

            public Criteria andUrlIn(List<String> values) {
                addCriterion("url in", values, "url");
                return (Criteria) this;
            }

            public Criteria andUrlNotIn(List<String> values) {
                addCriterion("url not in", values, "url");
                return (Criteria) this;
            }

            public Criteria andUrlBetween(String value1, String value2) {
                addCriterion("url between", value1, value2, "url");
                return (Criteria) this;
            }

            public Criteria andUrlNotBetween(String value1, String value2) {
                addCriterion("url not between", value1, value2, "url");
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

    public Criteria andAddTimeEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("add_time = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeNotEqualTo(LocalDateTime value) {
                addCriterion("add_time <>", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeNotEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("add_time <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeGreaterThan(LocalDateTime value) {
                addCriterion("add_time >", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeGreaterThanColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("add_time > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeGreaterThanOrEqualTo(LocalDateTime value) {
                addCriterion("add_time >=", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeGreaterThanOrEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("add_time >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeLessThan(LocalDateTime value) {
                addCriterion("add_time <", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeLessThanColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("add_time < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeLessThanOrEqualTo(LocalDateTime value) {
                addCriterion("add_time <=", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeLessThanOrEqualToColumn(MallGoodsProduct.Column column) {
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

    public Criteria andUpdateTimeEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeNotEqualTo(LocalDateTime value) {
                addCriterion("update_time <>", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeNotEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeGreaterThan(LocalDateTime value) {
                addCriterion("update_time >", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeGreaterThanColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
                addCriterion("update_time >=", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeGreaterThanOrEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeLessThan(LocalDateTime value) {
                addCriterion("update_time <", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeLessThanColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
                addCriterion("update_time <=", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeLessThanOrEqualToColumn(MallGoodsProduct.Column column) {
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

    public Criteria andDeletedEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedNotEqualTo(Boolean value) {
                addCriterion("deleted <>", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedNotEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedGreaterThan(Boolean value) {
                addCriterion("deleted >", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedGreaterThanColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
                addCriterion("deleted >=", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedGreaterThanOrEqualToColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedLessThan(Boolean value) {
                addCriterion("deleted <", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedLessThanColumn(MallGoodsProduct.Column column) {
                addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
                addCriterion("deleted <=", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedLessThanOrEqualToColumn(MallGoodsProduct.Column column) {
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

            private MallGoodsProductExample example;

    protected Criteria(MallGoodsProductExample example) {
                super();
                this.example = example;
            }

    public MallGoodsProductExample example() {
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
                return deleted ? andDeletedEqualTo(MallGoodsProduct.Deleted.IS_DELETED.value()) : andDeletedNotEqualTo(MallGoodsProduct.Deleted.IS_DELETED.value());
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

            void example(MallGoodsProductExample example);
        }
}