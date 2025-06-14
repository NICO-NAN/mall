package com.mall.goods.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MallGoodsExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MallGoodsExample() {
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

    public MallGoodsExample orderBy(String orderByClause) {
            this.setOrderByClause(orderByClause);
            return this;
        }

    public MallGoodsExample orderBy(String ... orderByClauses) {
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
            MallGoodsExample example = new MallGoodsExample();
            return example.createCriteria();
        }

    public MallGoodsExample when(boolean condition, IExampleWhen then) {
            if (condition) {
                then.example(this);
            }
            return this;
        }

    public MallGoodsExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
            if (condition) {
                then.example(this);
            } else {
                otherwise.example(this);
            }
            return this;
        }

    protected abstract static class GeneratedCriteria {
            protected List<Criterion> galleryCriteria;

            protected List<Criterion> allCriteria;

            protected List<Criterion> criteria;

            protected GeneratedCriteria() {
                super();
                criteria = new ArrayList<Criterion>();
                galleryCriteria = new ArrayList<Criterion>();
            }

            public List<Criterion> getGalleryCriteria() {
                return galleryCriteria;
            }

            protected void addGalleryCriterion(String condition, Object value, String property) {
                if (value == null) {
                    throw new RuntimeException("Value for " + property + " cannot be null");
                }
                galleryCriteria.add(new Criterion(condition, value, "com.mall.common.util.JsonStringArrayTypeHandler"));
                allCriteria = null;
            }

            protected void addGalleryCriterion(String condition, String[] value1, String[] value2, String property) {
                if (value1 == null || value2 == null) {
                    throw new RuntimeException("Between values for " + property + " cannot be null");
                }
                galleryCriteria.add(new Criterion(condition, value1, value2, "com.mall.common.util.JsonStringArrayTypeHandler"));
                allCriteria = null;
            }

            public boolean isValid() {
                return criteria.size() > 0
                    || galleryCriteria.size() > 0;
            }

            public List<Criterion> getAllCriteria() {
                if (allCriteria == null) {
                    allCriteria = new ArrayList<Criterion>();
                    allCriteria.addAll(criteria);
                    allCriteria.addAll(galleryCriteria);
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

    public Criteria andIdEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdNotEqualTo(Integer value) {
                addCriterion("id <>", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdNotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdGreaterThan(Integer value) {
                addCriterion("id >", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdGreaterThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdGreaterThanOrEqualTo(Integer value) {
                addCriterion("id >=", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdGreaterThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdLessThan(Integer value) {
                addCriterion("id <", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdLessThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdLessThanOrEqualTo(Integer value) {
                addCriterion("id <=", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdLessThanOrEqualToColumn(MallGoods.Column column) {
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

    public Criteria andGoodsSnEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("goods_sn = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsSnNotEqualTo(String value) {
                addCriterion("goods_sn <>", value, "goodsSn");
                return (Criteria) this;
            }

    public Criteria andGoodsSnNotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("goods_sn <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsSnGreaterThan(String value) {
                addCriterion("goods_sn >", value, "goodsSn");
                return (Criteria) this;
            }

    public Criteria andGoodsSnGreaterThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("goods_sn > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsSnGreaterThanOrEqualTo(String value) {
                addCriterion("goods_sn >=", value, "goodsSn");
                return (Criteria) this;
            }

    public Criteria andGoodsSnGreaterThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("goods_sn >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsSnLessThan(String value) {
                addCriterion("goods_sn <", value, "goodsSn");
                return (Criteria) this;
            }

    public Criteria andGoodsSnLessThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("goods_sn < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGoodsSnLessThanOrEqualTo(String value) {
                addCriterion("goods_sn <=", value, "goodsSn");
                return (Criteria) this;
            }

    public Criteria andGoodsSnLessThanOrEqualToColumn(MallGoods.Column column) {
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

            public Criteria andNameIsNull() {
                addCriterion("`name` is null");
                return (Criteria) this;
            }

            public Criteria andNameIsNotNull() {
                addCriterion("`name` is not null");
                return (Criteria) this;
            }

            public Criteria andNameEqualTo(String value) {
                addCriterion("`name` =", value, "name");
                return (Criteria) this;
            }

    public Criteria andNameEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("`name` = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNameNotEqualTo(String value) {
                addCriterion("`name` <>", value, "name");
                return (Criteria) this;
            }

    public Criteria andNameNotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("`name` <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNameGreaterThan(String value) {
                addCriterion("`name` >", value, "name");
                return (Criteria) this;
            }

    public Criteria andNameGreaterThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("`name` > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNameGreaterThanOrEqualTo(String value) {
                addCriterion("`name` >=", value, "name");
                return (Criteria) this;
            }

    public Criteria andNameGreaterThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("`name` >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNameLessThan(String value) {
                addCriterion("`name` <", value, "name");
                return (Criteria) this;
            }

    public Criteria andNameLessThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("`name` < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNameLessThanOrEqualTo(String value) {
                addCriterion("`name` <=", value, "name");
                return (Criteria) this;
            }

    public Criteria andNameLessThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("`name` <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNameLike(String value) {
                addCriterion("`name` like", value, "name");
                return (Criteria) this;
            }

            public Criteria andNameNotLike(String value) {
                addCriterion("`name` not like", value, "name");
                return (Criteria) this;
            }

            public Criteria andNameIn(List<String> values) {
                addCriterion("`name` in", values, "name");
                return (Criteria) this;
            }

            public Criteria andNameNotIn(List<String> values) {
                addCriterion("`name` not in", values, "name");
                return (Criteria) this;
            }

            public Criteria andNameBetween(String value1, String value2) {
                addCriterion("`name` between", value1, value2, "name");
                return (Criteria) this;
            }

            public Criteria andNameNotBetween(String value1, String value2) {
                addCriterion("`name` not between", value1, value2, "name");
                return (Criteria) this;
            }

            public Criteria andCategoryIdIsNull() {
                addCriterion("category_id is null");
                return (Criteria) this;
            }

            public Criteria andCategoryIdIsNotNull() {
                addCriterion("category_id is not null");
                return (Criteria) this;
            }

            public Criteria andCategoryIdEqualTo(Integer value) {
                addCriterion("category_id =", value, "categoryId");
                return (Criteria) this;
            }

    public Criteria andCategoryIdEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("category_id = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCategoryIdNotEqualTo(Integer value) {
                addCriterion("category_id <>", value, "categoryId");
                return (Criteria) this;
            }

    public Criteria andCategoryIdNotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("category_id <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCategoryIdGreaterThan(Integer value) {
                addCriterion("category_id >", value, "categoryId");
                return (Criteria) this;
            }

    public Criteria andCategoryIdGreaterThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("category_id > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
                addCriterion("category_id >=", value, "categoryId");
                return (Criteria) this;
            }

    public Criteria andCategoryIdGreaterThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("category_id >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCategoryIdLessThan(Integer value) {
                addCriterion("category_id <", value, "categoryId");
                return (Criteria) this;
            }

    public Criteria andCategoryIdLessThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("category_id < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
                addCriterion("category_id <=", value, "categoryId");
                return (Criteria) this;
            }

    public Criteria andCategoryIdLessThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("category_id <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCategoryIdIn(List<Integer> values) {
                addCriterion("category_id in", values, "categoryId");
                return (Criteria) this;
            }

            public Criteria andCategoryIdNotIn(List<Integer> values) {
                addCriterion("category_id not in", values, "categoryId");
                return (Criteria) this;
            }

            public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
                addCriterion("category_id between", value1, value2, "categoryId");
                return (Criteria) this;
            }

            public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
                addCriterion("category_id not between", value1, value2, "categoryId");
                return (Criteria) this;
            }

            public Criteria andBrandIdIsNull() {
                addCriterion("brand_id is null");
                return (Criteria) this;
            }

            public Criteria andBrandIdIsNotNull() {
                addCriterion("brand_id is not null");
                return (Criteria) this;
            }

            public Criteria andBrandIdEqualTo(Integer value) {
                addCriterion("brand_id =", value, "brandId");
                return (Criteria) this;
            }

    public Criteria andBrandIdEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("brand_id = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andBrandIdNotEqualTo(Integer value) {
                addCriterion("brand_id <>", value, "brandId");
                return (Criteria) this;
            }

    public Criteria andBrandIdNotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("brand_id <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andBrandIdGreaterThan(Integer value) {
                addCriterion("brand_id >", value, "brandId");
                return (Criteria) this;
            }

    public Criteria andBrandIdGreaterThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("brand_id > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
                addCriterion("brand_id >=", value, "brandId");
                return (Criteria) this;
            }

    public Criteria andBrandIdGreaterThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("brand_id >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andBrandIdLessThan(Integer value) {
                addCriterion("brand_id <", value, "brandId");
                return (Criteria) this;
            }

    public Criteria andBrandIdLessThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("brand_id < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
                addCriterion("brand_id <=", value, "brandId");
                return (Criteria) this;
            }

    public Criteria andBrandIdLessThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("brand_id <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andBrandIdIn(List<Integer> values) {
                addCriterion("brand_id in", values, "brandId");
                return (Criteria) this;
            }

            public Criteria andBrandIdNotIn(List<Integer> values) {
                addCriterion("brand_id not in", values, "brandId");
                return (Criteria) this;
            }

            public Criteria andBrandIdBetween(Integer value1, Integer value2) {
                addCriterion("brand_id between", value1, value2, "brandId");
                return (Criteria) this;
            }

            public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
                addCriterion("brand_id not between", value1, value2, "brandId");
                return (Criteria) this;
            }

            public Criteria andGalleryIsNull() {
                addCriterion("gallery is null");
                return (Criteria) this;
            }

            public Criteria andGalleryIsNotNull() {
                addCriterion("gallery is not null");
                return (Criteria) this;
            }

            public Criteria andGalleryEqualTo(String[] value) {
                addGalleryCriterion("gallery =", value, "gallery");
                return (Criteria) this;
            }

    public Criteria andGalleryEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("gallery = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGalleryNotEqualTo(String[] value) {
                addGalleryCriterion("gallery <>", value, "gallery");
                return (Criteria) this;
            }

    public Criteria andGalleryNotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("gallery <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGalleryGreaterThan(String[] value) {
                addGalleryCriterion("gallery >", value, "gallery");
                return (Criteria) this;
            }

    public Criteria andGalleryGreaterThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("gallery > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGalleryGreaterThanOrEqualTo(String[] value) {
                addGalleryCriterion("gallery >=", value, "gallery");
                return (Criteria) this;
            }

    public Criteria andGalleryGreaterThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("gallery >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGalleryLessThan(String[] value) {
                addGalleryCriterion("gallery <", value, "gallery");
                return (Criteria) this;
            }

    public Criteria andGalleryLessThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("gallery < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGalleryLessThanOrEqualTo(String[] value) {
                addGalleryCriterion("gallery <=", value, "gallery");
                return (Criteria) this;
            }

    public Criteria andGalleryLessThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("gallery <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGalleryLike(String[] value) {
                addGalleryCriterion("gallery like", value, "gallery");
                return (Criteria) this;
            }

            public Criteria andGalleryNotLike(String[] value) {
                addGalleryCriterion("gallery not like", value, "gallery");
                return (Criteria) this;
            }

            public Criteria andGalleryIn(List<String[]> values) {
                addGalleryCriterion("gallery in", values, "gallery");
                return (Criteria) this;
            }

            public Criteria andGalleryNotIn(List<String[]> values) {
                addGalleryCriterion("gallery not in", values, "gallery");
                return (Criteria) this;
            }

            public Criteria andGalleryBetween(String[] value1, String[] value2) {
                addGalleryCriterion("gallery between", value1, value2, "gallery");
                return (Criteria) this;
            }

            public Criteria andGalleryNotBetween(String[] value1, String[] value2) {
                addGalleryCriterion("gallery not between", value1, value2, "gallery");
                return (Criteria) this;
            }

            public Criteria andKeywordsIsNull() {
                addCriterion("keywords is null");
                return (Criteria) this;
            }

            public Criteria andKeywordsIsNotNull() {
                addCriterion("keywords is not null");
                return (Criteria) this;
            }

            public Criteria andKeywordsEqualTo(String value) {
                addCriterion("keywords =", value, "keywords");
                return (Criteria) this;
            }

    public Criteria andKeywordsEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("keywords = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andKeywordsNotEqualTo(String value) {
                addCriterion("keywords <>", value, "keywords");
                return (Criteria) this;
            }

    public Criteria andKeywordsNotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("keywords <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andKeywordsGreaterThan(String value) {
                addCriterion("keywords >", value, "keywords");
                return (Criteria) this;
            }

    public Criteria andKeywordsGreaterThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("keywords > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
                addCriterion("keywords >=", value, "keywords");
                return (Criteria) this;
            }

    public Criteria andKeywordsGreaterThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("keywords >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andKeywordsLessThan(String value) {
                addCriterion("keywords <", value, "keywords");
                return (Criteria) this;
            }

    public Criteria andKeywordsLessThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("keywords < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andKeywordsLessThanOrEqualTo(String value) {
                addCriterion("keywords <=", value, "keywords");
                return (Criteria) this;
            }

    public Criteria andKeywordsLessThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("keywords <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andKeywordsLike(String value) {
                addCriterion("keywords like", value, "keywords");
                return (Criteria) this;
            }

            public Criteria andKeywordsNotLike(String value) {
                addCriterion("keywords not like", value, "keywords");
                return (Criteria) this;
            }

            public Criteria andKeywordsIn(List<String> values) {
                addCriterion("keywords in", values, "keywords");
                return (Criteria) this;
            }

            public Criteria andKeywordsNotIn(List<String> values) {
                addCriterion("keywords not in", values, "keywords");
                return (Criteria) this;
            }

            public Criteria andKeywordsBetween(String value1, String value2) {
                addCriterion("keywords between", value1, value2, "keywords");
                return (Criteria) this;
            }

            public Criteria andKeywordsNotBetween(String value1, String value2) {
                addCriterion("keywords not between", value1, value2, "keywords");
                return (Criteria) this;
            }

            public Criteria andBriefIsNull() {
                addCriterion("brief is null");
                return (Criteria) this;
            }

            public Criteria andBriefIsNotNull() {
                addCriterion("brief is not null");
                return (Criteria) this;
            }

            public Criteria andBriefEqualTo(String value) {
                addCriterion("brief =", value, "brief");
                return (Criteria) this;
            }

    public Criteria andBriefEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("brief = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andBriefNotEqualTo(String value) {
                addCriterion("brief <>", value, "brief");
                return (Criteria) this;
            }

    public Criteria andBriefNotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("brief <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andBriefGreaterThan(String value) {
                addCriterion("brief >", value, "brief");
                return (Criteria) this;
            }

    public Criteria andBriefGreaterThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("brief > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andBriefGreaterThanOrEqualTo(String value) {
                addCriterion("brief >=", value, "brief");
                return (Criteria) this;
            }

    public Criteria andBriefGreaterThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("brief >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andBriefLessThan(String value) {
                addCriterion("brief <", value, "brief");
                return (Criteria) this;
            }

    public Criteria andBriefLessThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("brief < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andBriefLessThanOrEqualTo(String value) {
                addCriterion("brief <=", value, "brief");
                return (Criteria) this;
            }

    public Criteria andBriefLessThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("brief <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andBriefLike(String value) {
                addCriterion("brief like", value, "brief");
                return (Criteria) this;
            }

            public Criteria andBriefNotLike(String value) {
                addCriterion("brief not like", value, "brief");
                return (Criteria) this;
            }

            public Criteria andBriefIn(List<String> values) {
                addCriterion("brief in", values, "brief");
                return (Criteria) this;
            }

            public Criteria andBriefNotIn(List<String> values) {
                addCriterion("brief not in", values, "brief");
                return (Criteria) this;
            }

            public Criteria andBriefBetween(String value1, String value2) {
                addCriterion("brief between", value1, value2, "brief");
                return (Criteria) this;
            }

            public Criteria andBriefNotBetween(String value1, String value2) {
                addCriterion("brief not between", value1, value2, "brief");
                return (Criteria) this;
            }

            public Criteria andIsOnSaleIsNull() {
                addCriterion("is_on_sale is null");
                return (Criteria) this;
            }

            public Criteria andIsOnSaleIsNotNull() {
                addCriterion("is_on_sale is not null");
                return (Criteria) this;
            }

            public Criteria andIsOnSaleEqualTo(Boolean value) {
                addCriterion("is_on_sale =", value, "isOnSale");
                return (Criteria) this;
            }

    public Criteria andIsOnSaleEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("is_on_sale = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIsOnSaleNotEqualTo(Boolean value) {
                addCriterion("is_on_sale <>", value, "isOnSale");
                return (Criteria) this;
            }

    public Criteria andIsOnSaleNotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("is_on_sale <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIsOnSaleGreaterThan(Boolean value) {
                addCriterion("is_on_sale >", value, "isOnSale");
                return (Criteria) this;
            }

    public Criteria andIsOnSaleGreaterThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("is_on_sale > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIsOnSaleGreaterThanOrEqualTo(Boolean value) {
                addCriterion("is_on_sale >=", value, "isOnSale");
                return (Criteria) this;
            }

    public Criteria andIsOnSaleGreaterThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("is_on_sale >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIsOnSaleLessThan(Boolean value) {
                addCriterion("is_on_sale <", value, "isOnSale");
                return (Criteria) this;
            }

    public Criteria andIsOnSaleLessThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("is_on_sale < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIsOnSaleLessThanOrEqualTo(Boolean value) {
                addCriterion("is_on_sale <=", value, "isOnSale");
                return (Criteria) this;
            }

    public Criteria andIsOnSaleLessThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("is_on_sale <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIsOnSaleIn(List<Boolean> values) {
                addCriterion("is_on_sale in", values, "isOnSale");
                return (Criteria) this;
            }

            public Criteria andIsOnSaleNotIn(List<Boolean> values) {
                addCriterion("is_on_sale not in", values, "isOnSale");
                return (Criteria) this;
            }

            public Criteria andIsOnSaleBetween(Boolean value1, Boolean value2) {
                addCriterion("is_on_sale between", value1, value2, "isOnSale");
                return (Criteria) this;
            }

            public Criteria andIsOnSaleNotBetween(Boolean value1, Boolean value2) {
                addCriterion("is_on_sale not between", value1, value2, "isOnSale");
                return (Criteria) this;
            }

            public Criteria andSortOrderIsNull() {
                addCriterion("sort_order is null");
                return (Criteria) this;
            }

            public Criteria andSortOrderIsNotNull() {
                addCriterion("sort_order is not null");
                return (Criteria) this;
            }

            public Criteria andSortOrderEqualTo(Short value) {
                addCriterion("sort_order =", value, "sortOrder");
                return (Criteria) this;
            }

    public Criteria andSortOrderEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("sort_order = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSortOrderNotEqualTo(Short value) {
                addCriterion("sort_order <>", value, "sortOrder");
                return (Criteria) this;
            }

    public Criteria andSortOrderNotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("sort_order <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSortOrderGreaterThan(Short value) {
                addCriterion("sort_order >", value, "sortOrder");
                return (Criteria) this;
            }

    public Criteria andSortOrderGreaterThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("sort_order > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSortOrderGreaterThanOrEqualTo(Short value) {
                addCriterion("sort_order >=", value, "sortOrder");
                return (Criteria) this;
            }

    public Criteria andSortOrderGreaterThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("sort_order >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSortOrderLessThan(Short value) {
                addCriterion("sort_order <", value, "sortOrder");
                return (Criteria) this;
            }

    public Criteria andSortOrderLessThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("sort_order < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSortOrderLessThanOrEqualTo(Short value) {
                addCriterion("sort_order <=", value, "sortOrder");
                return (Criteria) this;
            }

    public Criteria andSortOrderLessThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("sort_order <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSortOrderIn(List<Short> values) {
                addCriterion("sort_order in", values, "sortOrder");
                return (Criteria) this;
            }

            public Criteria andSortOrderNotIn(List<Short> values) {
                addCriterion("sort_order not in", values, "sortOrder");
                return (Criteria) this;
            }

            public Criteria andSortOrderBetween(Short value1, Short value2) {
                addCriterion("sort_order between", value1, value2, "sortOrder");
                return (Criteria) this;
            }

            public Criteria andSortOrderNotBetween(Short value1, Short value2) {
                addCriterion("sort_order not between", value1, value2, "sortOrder");
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

    public Criteria andPicUrlEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("pic_url = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPicUrlNotEqualTo(String value) {
                addCriterion("pic_url <>", value, "picUrl");
                return (Criteria) this;
            }

    public Criteria andPicUrlNotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("pic_url <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPicUrlGreaterThan(String value) {
                addCriterion("pic_url >", value, "picUrl");
                return (Criteria) this;
            }

    public Criteria andPicUrlGreaterThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("pic_url > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
                addCriterion("pic_url >=", value, "picUrl");
                return (Criteria) this;
            }

    public Criteria andPicUrlGreaterThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("pic_url >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPicUrlLessThan(String value) {
                addCriterion("pic_url <", value, "picUrl");
                return (Criteria) this;
            }

    public Criteria andPicUrlLessThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("pic_url < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPicUrlLessThanOrEqualTo(String value) {
                addCriterion("pic_url <=", value, "picUrl");
                return (Criteria) this;
            }

    public Criteria andPicUrlLessThanOrEqualToColumn(MallGoods.Column column) {
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

            public Criteria andShareUrlIsNull() {
                addCriterion("share_url is null");
                return (Criteria) this;
            }

            public Criteria andShareUrlIsNotNull() {
                addCriterion("share_url is not null");
                return (Criteria) this;
            }

            public Criteria andShareUrlEqualTo(String value) {
                addCriterion("share_url =", value, "shareUrl");
                return (Criteria) this;
            }

    public Criteria andShareUrlEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("share_url = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShareUrlNotEqualTo(String value) {
                addCriterion("share_url <>", value, "shareUrl");
                return (Criteria) this;
            }

    public Criteria andShareUrlNotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("share_url <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShareUrlGreaterThan(String value) {
                addCriterion("share_url >", value, "shareUrl");
                return (Criteria) this;
            }

    public Criteria andShareUrlGreaterThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("share_url > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShareUrlGreaterThanOrEqualTo(String value) {
                addCriterion("share_url >=", value, "shareUrl");
                return (Criteria) this;
            }

    public Criteria andShareUrlGreaterThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("share_url >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShareUrlLessThan(String value) {
                addCriterion("share_url <", value, "shareUrl");
                return (Criteria) this;
            }

    public Criteria andShareUrlLessThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("share_url < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShareUrlLessThanOrEqualTo(String value) {
                addCriterion("share_url <=", value, "shareUrl");
                return (Criteria) this;
            }

    public Criteria andShareUrlLessThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("share_url <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andShareUrlLike(String value) {
                addCriterion("share_url like", value, "shareUrl");
                return (Criteria) this;
            }

            public Criteria andShareUrlNotLike(String value) {
                addCriterion("share_url not like", value, "shareUrl");
                return (Criteria) this;
            }

            public Criteria andShareUrlIn(List<String> values) {
                addCriterion("share_url in", values, "shareUrl");
                return (Criteria) this;
            }

            public Criteria andShareUrlNotIn(List<String> values) {
                addCriterion("share_url not in", values, "shareUrl");
                return (Criteria) this;
            }

            public Criteria andShareUrlBetween(String value1, String value2) {
                addCriterion("share_url between", value1, value2, "shareUrl");
                return (Criteria) this;
            }

            public Criteria andShareUrlNotBetween(String value1, String value2) {
                addCriterion("share_url not between", value1, value2, "shareUrl");
                return (Criteria) this;
            }

            public Criteria andIsNewIsNull() {
                addCriterion("is_new is null");
                return (Criteria) this;
            }

            public Criteria andIsNewIsNotNull() {
                addCriterion("is_new is not null");
                return (Criteria) this;
            }

            public Criteria andIsNewEqualTo(Boolean value) {
                addCriterion("is_new =", value, "isNew");
                return (Criteria) this;
            }

    public Criteria andIsNewEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("is_new = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIsNewNotEqualTo(Boolean value) {
                addCriterion("is_new <>", value, "isNew");
                return (Criteria) this;
            }

    public Criteria andIsNewNotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("is_new <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIsNewGreaterThan(Boolean value) {
                addCriterion("is_new >", value, "isNew");
                return (Criteria) this;
            }

    public Criteria andIsNewGreaterThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("is_new > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIsNewGreaterThanOrEqualTo(Boolean value) {
                addCriterion("is_new >=", value, "isNew");
                return (Criteria) this;
            }

    public Criteria andIsNewGreaterThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("is_new >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIsNewLessThan(Boolean value) {
                addCriterion("is_new <", value, "isNew");
                return (Criteria) this;
            }

    public Criteria andIsNewLessThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("is_new < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIsNewLessThanOrEqualTo(Boolean value) {
                addCriterion("is_new <=", value, "isNew");
                return (Criteria) this;
            }

    public Criteria andIsNewLessThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("is_new <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIsNewIn(List<Boolean> values) {
                addCriterion("is_new in", values, "isNew");
                return (Criteria) this;
            }

            public Criteria andIsNewNotIn(List<Boolean> values) {
                addCriterion("is_new not in", values, "isNew");
                return (Criteria) this;
            }

            public Criteria andIsNewBetween(Boolean value1, Boolean value2) {
                addCriterion("is_new between", value1, value2, "isNew");
                return (Criteria) this;
            }

            public Criteria andIsNewNotBetween(Boolean value1, Boolean value2) {
                addCriterion("is_new not between", value1, value2, "isNew");
                return (Criteria) this;
            }

            public Criteria andIsHotIsNull() {
                addCriterion("is_hot is null");
                return (Criteria) this;
            }

            public Criteria andIsHotIsNotNull() {
                addCriterion("is_hot is not null");
                return (Criteria) this;
            }

            public Criteria andIsHotEqualTo(Boolean value) {
                addCriterion("is_hot =", value, "isHot");
                return (Criteria) this;
            }

    public Criteria andIsHotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("is_hot = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIsHotNotEqualTo(Boolean value) {
                addCriterion("is_hot <>", value, "isHot");
                return (Criteria) this;
            }

    public Criteria andIsHotNotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("is_hot <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIsHotGreaterThan(Boolean value) {
                addCriterion("is_hot >", value, "isHot");
                return (Criteria) this;
            }

    public Criteria andIsHotGreaterThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("is_hot > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIsHotGreaterThanOrEqualTo(Boolean value) {
                addCriterion("is_hot >=", value, "isHot");
                return (Criteria) this;
            }

    public Criteria andIsHotGreaterThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("is_hot >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIsHotLessThan(Boolean value) {
                addCriterion("is_hot <", value, "isHot");
                return (Criteria) this;
            }

    public Criteria andIsHotLessThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("is_hot < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIsHotLessThanOrEqualTo(Boolean value) {
                addCriterion("is_hot <=", value, "isHot");
                return (Criteria) this;
            }

    public Criteria andIsHotLessThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("is_hot <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIsHotIn(List<Boolean> values) {
                addCriterion("is_hot in", values, "isHot");
                return (Criteria) this;
            }

            public Criteria andIsHotNotIn(List<Boolean> values) {
                addCriterion("is_hot not in", values, "isHot");
                return (Criteria) this;
            }

            public Criteria andIsHotBetween(Boolean value1, Boolean value2) {
                addCriterion("is_hot between", value1, value2, "isHot");
                return (Criteria) this;
            }

            public Criteria andIsHotNotBetween(Boolean value1, Boolean value2) {
                addCriterion("is_hot not between", value1, value2, "isHot");
                return (Criteria) this;
            }

            public Criteria andUnitIsNull() {
                addCriterion("unit is null");
                return (Criteria) this;
            }

            public Criteria andUnitIsNotNull() {
                addCriterion("unit is not null");
                return (Criteria) this;
            }

            public Criteria andUnitEqualTo(String value) {
                addCriterion("unit =", value, "unit");
                return (Criteria) this;
            }

    public Criteria andUnitEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("unit = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUnitNotEqualTo(String value) {
                addCriterion("unit <>", value, "unit");
                return (Criteria) this;
            }

    public Criteria andUnitNotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("unit <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUnitGreaterThan(String value) {
                addCriterion("unit >", value, "unit");
                return (Criteria) this;
            }

    public Criteria andUnitGreaterThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("unit > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUnitGreaterThanOrEqualTo(String value) {
                addCriterion("unit >=", value, "unit");
                return (Criteria) this;
            }

    public Criteria andUnitGreaterThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("unit >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUnitLessThan(String value) {
                addCriterion("unit <", value, "unit");
                return (Criteria) this;
            }

    public Criteria andUnitLessThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("unit < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUnitLessThanOrEqualTo(String value) {
                addCriterion("unit <=", value, "unit");
                return (Criteria) this;
            }

    public Criteria andUnitLessThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("unit <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUnitLike(String value) {
                addCriterion("unit like", value, "unit");
                return (Criteria) this;
            }

            public Criteria andUnitNotLike(String value) {
                addCriterion("unit not like", value, "unit");
                return (Criteria) this;
            }

            public Criteria andUnitIn(List<String> values) {
                addCriterion("unit in", values, "unit");
                return (Criteria) this;
            }

            public Criteria andUnitNotIn(List<String> values) {
                addCriterion("unit not in", values, "unit");
                return (Criteria) this;
            }

            public Criteria andUnitBetween(String value1, String value2) {
                addCriterion("unit between", value1, value2, "unit");
                return (Criteria) this;
            }

            public Criteria andUnitNotBetween(String value1, String value2) {
                addCriterion("unit not between", value1, value2, "unit");
                return (Criteria) this;
            }

            public Criteria andCounterPriceIsNull() {
                addCriterion("counter_price is null");
                return (Criteria) this;
            }

            public Criteria andCounterPriceIsNotNull() {
                addCriterion("counter_price is not null");
                return (Criteria) this;
            }

            public Criteria andCounterPriceEqualTo(BigDecimal value) {
                addCriterion("counter_price =", value, "counterPrice");
                return (Criteria) this;
            }

    public Criteria andCounterPriceEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("counter_price = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCounterPriceNotEqualTo(BigDecimal value) {
                addCriterion("counter_price <>", value, "counterPrice");
                return (Criteria) this;
            }

    public Criteria andCounterPriceNotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("counter_price <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCounterPriceGreaterThan(BigDecimal value) {
                addCriterion("counter_price >", value, "counterPrice");
                return (Criteria) this;
            }

    public Criteria andCounterPriceGreaterThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("counter_price > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCounterPriceGreaterThanOrEqualTo(BigDecimal value) {
                addCriterion("counter_price >=", value, "counterPrice");
                return (Criteria) this;
            }

    public Criteria andCounterPriceGreaterThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("counter_price >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCounterPriceLessThan(BigDecimal value) {
                addCriterion("counter_price <", value, "counterPrice");
                return (Criteria) this;
            }

    public Criteria andCounterPriceLessThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("counter_price < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCounterPriceLessThanOrEqualTo(BigDecimal value) {
                addCriterion("counter_price <=", value, "counterPrice");
                return (Criteria) this;
            }

    public Criteria andCounterPriceLessThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("counter_price <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andCounterPriceIn(List<BigDecimal> values) {
                addCriterion("counter_price in", values, "counterPrice");
                return (Criteria) this;
            }

            public Criteria andCounterPriceNotIn(List<BigDecimal> values) {
                addCriterion("counter_price not in", values, "counterPrice");
                return (Criteria) this;
            }

            public Criteria andCounterPriceBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("counter_price between", value1, value2, "counterPrice");
                return (Criteria) this;
            }

            public Criteria andCounterPriceNotBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("counter_price not between", value1, value2, "counterPrice");
                return (Criteria) this;
            }

            public Criteria andRetailPriceIsNull() {
                addCriterion("retail_price is null");
                return (Criteria) this;
            }

            public Criteria andRetailPriceIsNotNull() {
                addCriterion("retail_price is not null");
                return (Criteria) this;
            }

            public Criteria andRetailPriceEqualTo(BigDecimal value) {
                addCriterion("retail_price =", value, "retailPrice");
                return (Criteria) this;
            }

    public Criteria andRetailPriceEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("retail_price = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRetailPriceNotEqualTo(BigDecimal value) {
                addCriterion("retail_price <>", value, "retailPrice");
                return (Criteria) this;
            }

    public Criteria andRetailPriceNotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("retail_price <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRetailPriceGreaterThan(BigDecimal value) {
                addCriterion("retail_price >", value, "retailPrice");
                return (Criteria) this;
            }

    public Criteria andRetailPriceGreaterThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("retail_price > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRetailPriceGreaterThanOrEqualTo(BigDecimal value) {
                addCriterion("retail_price >=", value, "retailPrice");
                return (Criteria) this;
            }

    public Criteria andRetailPriceGreaterThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("retail_price >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRetailPriceLessThan(BigDecimal value) {
                addCriterion("retail_price <", value, "retailPrice");
                return (Criteria) this;
            }

    public Criteria andRetailPriceLessThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("retail_price < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRetailPriceLessThanOrEqualTo(BigDecimal value) {
                addCriterion("retail_price <=", value, "retailPrice");
                return (Criteria) this;
            }

    public Criteria andRetailPriceLessThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("retail_price <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andRetailPriceIn(List<BigDecimal> values) {
                addCriterion("retail_price in", values, "retailPrice");
                return (Criteria) this;
            }

            public Criteria andRetailPriceNotIn(List<BigDecimal> values) {
                addCriterion("retail_price not in", values, "retailPrice");
                return (Criteria) this;
            }

            public Criteria andRetailPriceBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("retail_price between", value1, value2, "retailPrice");
                return (Criteria) this;
            }

            public Criteria andRetailPriceNotBetween(BigDecimal value1, BigDecimal value2) {
                addCriterion("retail_price not between", value1, value2, "retailPrice");
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

    public Criteria andAddTimeEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("add_time = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeNotEqualTo(LocalDateTime value) {
                addCriterion("add_time <>", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeNotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("add_time <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeGreaterThan(LocalDateTime value) {
                addCriterion("add_time >", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeGreaterThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("add_time > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeGreaterThanOrEqualTo(LocalDateTime value) {
                addCriterion("add_time >=", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeGreaterThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("add_time >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeLessThan(LocalDateTime value) {
                addCriterion("add_time <", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeLessThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("add_time < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeLessThanOrEqualTo(LocalDateTime value) {
                addCriterion("add_time <=", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeLessThanOrEqualToColumn(MallGoods.Column column) {
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

    public Criteria andUpdateTimeEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeNotEqualTo(LocalDateTime value) {
                addCriterion("update_time <>", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeNotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeGreaterThan(LocalDateTime value) {
                addCriterion("update_time >", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeGreaterThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
                addCriterion("update_time >=", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeGreaterThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeLessThan(LocalDateTime value) {
                addCriterion("update_time <", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeLessThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
                addCriterion("update_time <=", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeLessThanOrEqualToColumn(MallGoods.Column column) {
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

    public Criteria andDeletedEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedNotEqualTo(Boolean value) {
                addCriterion("deleted <>", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedNotEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedGreaterThan(Boolean value) {
                addCriterion("deleted >", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedGreaterThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
                addCriterion("deleted >=", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedGreaterThanOrEqualToColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedLessThan(Boolean value) {
                addCriterion("deleted <", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedLessThanColumn(MallGoods.Column column) {
                addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
                addCriterion("deleted <=", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedLessThanOrEqualToColumn(MallGoods.Column column) {
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

            private MallGoodsExample example;

    protected Criteria(MallGoodsExample example) {
                super();
                this.example = example;
            }

    public MallGoodsExample example() {
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
                return deleted ? andDeletedEqualTo(MallGoods.Deleted.IS_DELETED.value()) : andDeletedNotEqualTo(MallGoods.Deleted.IS_DELETED.value());
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

            void example(MallGoodsExample example);
        }
}