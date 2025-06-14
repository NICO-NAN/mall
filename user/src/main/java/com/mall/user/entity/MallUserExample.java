package com.mall.user.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MallUserExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MallUserExample() {
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

    public MallUserExample orderBy(String orderByClause) {
            this.setOrderByClause(orderByClause);
            return this;
        }

    public MallUserExample orderBy(String ... orderByClauses) {
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
            MallUserExample example = new MallUserExample();
            return example.createCriteria();
        }

    public MallUserExample when(boolean condition, IExampleWhen then) {
            if (condition) {
                then.example(this);
            }
            return this;
        }

    public MallUserExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

    public Criteria andIdEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdNotEqualTo(Integer value) {
                addCriterion("id <>", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdNotEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdGreaterThan(Integer value) {
                addCriterion("id >", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdGreaterThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdGreaterThanOrEqualTo(Integer value) {
                addCriterion("id >=", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdGreaterThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdLessThan(Integer value) {
                addCriterion("id <", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdLessThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andIdLessThanOrEqualTo(Integer value) {
                addCriterion("id <=", value, "id");
                return (Criteria) this;
            }

    public Criteria andIdLessThanOrEqualToColumn(MallUser.Column column) {
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

            public Criteria andUsernameIsNull() {
                addCriterion("username is null");
                return (Criteria) this;
            }

            public Criteria andUsernameIsNotNull() {
                addCriterion("username is not null");
                return (Criteria) this;
            }

            public Criteria andUsernameEqualTo(String value) {
                addCriterion("username =", value, "username");
                return (Criteria) this;
            }

    public Criteria andUsernameEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("username = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUsernameNotEqualTo(String value) {
                addCriterion("username <>", value, "username");
                return (Criteria) this;
            }

    public Criteria andUsernameNotEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("username <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUsernameGreaterThan(String value) {
                addCriterion("username >", value, "username");
                return (Criteria) this;
            }

    public Criteria andUsernameGreaterThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("username > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUsernameGreaterThanOrEqualTo(String value) {
                addCriterion("username >=", value, "username");
                return (Criteria) this;
            }

    public Criteria andUsernameGreaterThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("username >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUsernameLessThan(String value) {
                addCriterion("username <", value, "username");
                return (Criteria) this;
            }

    public Criteria andUsernameLessThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("username < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUsernameLessThanOrEqualTo(String value) {
                addCriterion("username <=", value, "username");
                return (Criteria) this;
            }

    public Criteria andUsernameLessThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("username <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUsernameLike(String value) {
                addCriterion("username like", value, "username");
                return (Criteria) this;
            }

            public Criteria andUsernameNotLike(String value) {
                addCriterion("username not like", value, "username");
                return (Criteria) this;
            }

            public Criteria andUsernameIn(List<String> values) {
                addCriterion("username in", values, "username");
                return (Criteria) this;
            }

            public Criteria andUsernameNotIn(List<String> values) {
                addCriterion("username not in", values, "username");
                return (Criteria) this;
            }

            public Criteria andUsernameBetween(String value1, String value2) {
                addCriterion("username between", value1, value2, "username");
                return (Criteria) this;
            }

            public Criteria andUsernameNotBetween(String value1, String value2) {
                addCriterion("username not between", value1, value2, "username");
                return (Criteria) this;
            }

            public Criteria andPasswordIsNull() {
                addCriterion("`password` is null");
                return (Criteria) this;
            }

            public Criteria andPasswordIsNotNull() {
                addCriterion("`password` is not null");
                return (Criteria) this;
            }

            public Criteria andPasswordEqualTo(String value) {
                addCriterion("`password` =", value, "password");
                return (Criteria) this;
            }

    public Criteria andPasswordEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("`password` = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPasswordNotEqualTo(String value) {
                addCriterion("`password` <>", value, "password");
                return (Criteria) this;
            }

    public Criteria andPasswordNotEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("`password` <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPasswordGreaterThan(String value) {
                addCriterion("`password` >", value, "password");
                return (Criteria) this;
            }

    public Criteria andPasswordGreaterThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("`password` > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPasswordGreaterThanOrEqualTo(String value) {
                addCriterion("`password` >=", value, "password");
                return (Criteria) this;
            }

    public Criteria andPasswordGreaterThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("`password` >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPasswordLessThan(String value) {
                addCriterion("`password` <", value, "password");
                return (Criteria) this;
            }

    public Criteria andPasswordLessThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("`password` < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPasswordLessThanOrEqualTo(String value) {
                addCriterion("`password` <=", value, "password");
                return (Criteria) this;
            }

    public Criteria andPasswordLessThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("`password` <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andPasswordLike(String value) {
                addCriterion("`password` like", value, "password");
                return (Criteria) this;
            }

            public Criteria andPasswordNotLike(String value) {
                addCriterion("`password` not like", value, "password");
                return (Criteria) this;
            }

            public Criteria andPasswordIn(List<String> values) {
                addCriterion("`password` in", values, "password");
                return (Criteria) this;
            }

            public Criteria andPasswordNotIn(List<String> values) {
                addCriterion("`password` not in", values, "password");
                return (Criteria) this;
            }

            public Criteria andPasswordBetween(String value1, String value2) {
                addCriterion("`password` between", value1, value2, "password");
                return (Criteria) this;
            }

            public Criteria andPasswordNotBetween(String value1, String value2) {
                addCriterion("`password` not between", value1, value2, "password");
                return (Criteria) this;
            }

            public Criteria andGenderIsNull() {
                addCriterion("gender is null");
                return (Criteria) this;
            }

            public Criteria andGenderIsNotNull() {
                addCriterion("gender is not null");
                return (Criteria) this;
            }

            public Criteria andGenderEqualTo(Byte value) {
                addCriterion("gender =", value, "gender");
                return (Criteria) this;
            }

    public Criteria andGenderEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("gender = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGenderNotEqualTo(Byte value) {
                addCriterion("gender <>", value, "gender");
                return (Criteria) this;
            }

    public Criteria andGenderNotEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("gender <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGenderGreaterThan(Byte value) {
                addCriterion("gender >", value, "gender");
                return (Criteria) this;
            }

    public Criteria andGenderGreaterThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("gender > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGenderGreaterThanOrEqualTo(Byte value) {
                addCriterion("gender >=", value, "gender");
                return (Criteria) this;
            }

    public Criteria andGenderGreaterThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("gender >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGenderLessThan(Byte value) {
                addCriterion("gender <", value, "gender");
                return (Criteria) this;
            }

    public Criteria andGenderLessThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("gender < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGenderLessThanOrEqualTo(Byte value) {
                addCriterion("gender <=", value, "gender");
                return (Criteria) this;
            }

    public Criteria andGenderLessThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("gender <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andGenderIn(List<Byte> values) {
                addCriterion("gender in", values, "gender");
                return (Criteria) this;
            }

            public Criteria andGenderNotIn(List<Byte> values) {
                addCriterion("gender not in", values, "gender");
                return (Criteria) this;
            }

            public Criteria andGenderBetween(Byte value1, Byte value2) {
                addCriterion("gender between", value1, value2, "gender");
                return (Criteria) this;
            }

            public Criteria andGenderNotBetween(Byte value1, Byte value2) {
                addCriterion("gender not between", value1, value2, "gender");
                return (Criteria) this;
            }

            public Criteria andBirthdayIsNull() {
                addCriterion("birthday is null");
                return (Criteria) this;
            }

            public Criteria andBirthdayIsNotNull() {
                addCriterion("birthday is not null");
                return (Criteria) this;
            }

            public Criteria andBirthdayEqualTo(LocalDate value) {
                addCriterion("birthday =", value, "birthday");
                return (Criteria) this;
            }

    public Criteria andBirthdayEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("birthday = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andBirthdayNotEqualTo(LocalDate value) {
                addCriterion("birthday <>", value, "birthday");
                return (Criteria) this;
            }

    public Criteria andBirthdayNotEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("birthday <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andBirthdayGreaterThan(LocalDate value) {
                addCriterion("birthday >", value, "birthday");
                return (Criteria) this;
            }

    public Criteria andBirthdayGreaterThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("birthday > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andBirthdayGreaterThanOrEqualTo(LocalDate value) {
                addCriterion("birthday >=", value, "birthday");
                return (Criteria) this;
            }

    public Criteria andBirthdayGreaterThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("birthday >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andBirthdayLessThan(LocalDate value) {
                addCriterion("birthday <", value, "birthday");
                return (Criteria) this;
            }

    public Criteria andBirthdayLessThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("birthday < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andBirthdayLessThanOrEqualTo(LocalDate value) {
                addCriterion("birthday <=", value, "birthday");
                return (Criteria) this;
            }

    public Criteria andBirthdayLessThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("birthday <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andBirthdayIn(List<LocalDate> values) {
                addCriterion("birthday in", values, "birthday");
                return (Criteria) this;
            }

            public Criteria andBirthdayNotIn(List<LocalDate> values) {
                addCriterion("birthday not in", values, "birthday");
                return (Criteria) this;
            }

            public Criteria andBirthdayBetween(LocalDate value1, LocalDate value2) {
                addCriterion("birthday between", value1, value2, "birthday");
                return (Criteria) this;
            }

            public Criteria andBirthdayNotBetween(LocalDate value1, LocalDate value2) {
                addCriterion("birthday not between", value1, value2, "birthday");
                return (Criteria) this;
            }

            public Criteria andLastLoginTimeIsNull() {
                addCriterion("last_login_time is null");
                return (Criteria) this;
            }

            public Criteria andLastLoginTimeIsNotNull() {
                addCriterion("last_login_time is not null");
                return (Criteria) this;
            }

            public Criteria andLastLoginTimeEqualTo(LocalDateTime value) {
                addCriterion("last_login_time =", value, "lastLoginTime");
                return (Criteria) this;
            }

    public Criteria andLastLoginTimeEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("last_login_time = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andLastLoginTimeNotEqualTo(LocalDateTime value) {
                addCriterion("last_login_time <>", value, "lastLoginTime");
                return (Criteria) this;
            }

    public Criteria andLastLoginTimeNotEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("last_login_time <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andLastLoginTimeGreaterThan(LocalDateTime value) {
                addCriterion("last_login_time >", value, "lastLoginTime");
                return (Criteria) this;
            }

    public Criteria andLastLoginTimeGreaterThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("last_login_time > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andLastLoginTimeGreaterThanOrEqualTo(LocalDateTime value) {
                addCriterion("last_login_time >=", value, "lastLoginTime");
                return (Criteria) this;
            }

    public Criteria andLastLoginTimeGreaterThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("last_login_time >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andLastLoginTimeLessThan(LocalDateTime value) {
                addCriterion("last_login_time <", value, "lastLoginTime");
                return (Criteria) this;
            }

    public Criteria andLastLoginTimeLessThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("last_login_time < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andLastLoginTimeLessThanOrEqualTo(LocalDateTime value) {
                addCriterion("last_login_time <=", value, "lastLoginTime");
                return (Criteria) this;
            }

    public Criteria andLastLoginTimeLessThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("last_login_time <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andLastLoginTimeIn(List<LocalDateTime> values) {
                addCriterion("last_login_time in", values, "lastLoginTime");
                return (Criteria) this;
            }

            public Criteria andLastLoginTimeNotIn(List<LocalDateTime> values) {
                addCriterion("last_login_time not in", values, "lastLoginTime");
                return (Criteria) this;
            }

            public Criteria andLastLoginTimeBetween(LocalDateTime value1, LocalDateTime value2) {
                addCriterion("last_login_time between", value1, value2, "lastLoginTime");
                return (Criteria) this;
            }

            public Criteria andLastLoginTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
                addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
                return (Criteria) this;
            }

            public Criteria andLastLoginIpIsNull() {
                addCriterion("last_login_ip is null");
                return (Criteria) this;
            }

            public Criteria andLastLoginIpIsNotNull() {
                addCriterion("last_login_ip is not null");
                return (Criteria) this;
            }

            public Criteria andLastLoginIpEqualTo(String value) {
                addCriterion("last_login_ip =", value, "lastLoginIp");
                return (Criteria) this;
            }

    public Criteria andLastLoginIpEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("last_login_ip = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andLastLoginIpNotEqualTo(String value) {
                addCriterion("last_login_ip <>", value, "lastLoginIp");
                return (Criteria) this;
            }

    public Criteria andLastLoginIpNotEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("last_login_ip <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andLastLoginIpGreaterThan(String value) {
                addCriterion("last_login_ip >", value, "lastLoginIp");
                return (Criteria) this;
            }

    public Criteria andLastLoginIpGreaterThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("last_login_ip > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andLastLoginIpGreaterThanOrEqualTo(String value) {
                addCriterion("last_login_ip >=", value, "lastLoginIp");
                return (Criteria) this;
            }

    public Criteria andLastLoginIpGreaterThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("last_login_ip >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andLastLoginIpLessThan(String value) {
                addCriterion("last_login_ip <", value, "lastLoginIp");
                return (Criteria) this;
            }

    public Criteria andLastLoginIpLessThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("last_login_ip < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andLastLoginIpLessThanOrEqualTo(String value) {
                addCriterion("last_login_ip <=", value, "lastLoginIp");
                return (Criteria) this;
            }

    public Criteria andLastLoginIpLessThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("last_login_ip <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andLastLoginIpLike(String value) {
                addCriterion("last_login_ip like", value, "lastLoginIp");
                return (Criteria) this;
            }

            public Criteria andLastLoginIpNotLike(String value) {
                addCriterion("last_login_ip not like", value, "lastLoginIp");
                return (Criteria) this;
            }

            public Criteria andLastLoginIpIn(List<String> values) {
                addCriterion("last_login_ip in", values, "lastLoginIp");
                return (Criteria) this;
            }

            public Criteria andLastLoginIpNotIn(List<String> values) {
                addCriterion("last_login_ip not in", values, "lastLoginIp");
                return (Criteria) this;
            }

            public Criteria andLastLoginIpBetween(String value1, String value2) {
                addCriterion("last_login_ip between", value1, value2, "lastLoginIp");
                return (Criteria) this;
            }

            public Criteria andLastLoginIpNotBetween(String value1, String value2) {
                addCriterion("last_login_ip not between", value1, value2, "lastLoginIp");
                return (Criteria) this;
            }

            public Criteria andUserLevelIsNull() {
                addCriterion("user_level is null");
                return (Criteria) this;
            }

            public Criteria andUserLevelIsNotNull() {
                addCriterion("user_level is not null");
                return (Criteria) this;
            }

            public Criteria andUserLevelEqualTo(Byte value) {
                addCriterion("user_level =", value, "userLevel");
                return (Criteria) this;
            }

    public Criteria andUserLevelEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("user_level = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUserLevelNotEqualTo(Byte value) {
                addCriterion("user_level <>", value, "userLevel");
                return (Criteria) this;
            }

    public Criteria andUserLevelNotEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("user_level <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUserLevelGreaterThan(Byte value) {
                addCriterion("user_level >", value, "userLevel");
                return (Criteria) this;
            }

    public Criteria andUserLevelGreaterThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("user_level > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUserLevelGreaterThanOrEqualTo(Byte value) {
                addCriterion("user_level >=", value, "userLevel");
                return (Criteria) this;
            }

    public Criteria andUserLevelGreaterThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("user_level >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUserLevelLessThan(Byte value) {
                addCriterion("user_level <", value, "userLevel");
                return (Criteria) this;
            }

    public Criteria andUserLevelLessThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("user_level < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUserLevelLessThanOrEqualTo(Byte value) {
                addCriterion("user_level <=", value, "userLevel");
                return (Criteria) this;
            }

    public Criteria andUserLevelLessThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("user_level <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUserLevelIn(List<Byte> values) {
                addCriterion("user_level in", values, "userLevel");
                return (Criteria) this;
            }

            public Criteria andUserLevelNotIn(List<Byte> values) {
                addCriterion("user_level not in", values, "userLevel");
                return (Criteria) this;
            }

            public Criteria andUserLevelBetween(Byte value1, Byte value2) {
                addCriterion("user_level between", value1, value2, "userLevel");
                return (Criteria) this;
            }

            public Criteria andUserLevelNotBetween(Byte value1, Byte value2) {
                addCriterion("user_level not between", value1, value2, "userLevel");
                return (Criteria) this;
            }

            public Criteria andNicknameIsNull() {
                addCriterion("nickname is null");
                return (Criteria) this;
            }

            public Criteria andNicknameIsNotNull() {
                addCriterion("nickname is not null");
                return (Criteria) this;
            }

            public Criteria andNicknameEqualTo(String value) {
                addCriterion("nickname =", value, "nickname");
                return (Criteria) this;
            }

    public Criteria andNicknameEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("nickname = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNicknameNotEqualTo(String value) {
                addCriterion("nickname <>", value, "nickname");
                return (Criteria) this;
            }

    public Criteria andNicknameNotEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("nickname <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNicknameGreaterThan(String value) {
                addCriterion("nickname >", value, "nickname");
                return (Criteria) this;
            }

    public Criteria andNicknameGreaterThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("nickname > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNicknameGreaterThanOrEqualTo(String value) {
                addCriterion("nickname >=", value, "nickname");
                return (Criteria) this;
            }

    public Criteria andNicknameGreaterThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("nickname >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNicknameLessThan(String value) {
                addCriterion("nickname <", value, "nickname");
                return (Criteria) this;
            }

    public Criteria andNicknameLessThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("nickname < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNicknameLessThanOrEqualTo(String value) {
                addCriterion("nickname <=", value, "nickname");
                return (Criteria) this;
            }

    public Criteria andNicknameLessThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("nickname <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andNicknameLike(String value) {
                addCriterion("nickname like", value, "nickname");
                return (Criteria) this;
            }

            public Criteria andNicknameNotLike(String value) {
                addCriterion("nickname not like", value, "nickname");
                return (Criteria) this;
            }

            public Criteria andNicknameIn(List<String> values) {
                addCriterion("nickname in", values, "nickname");
                return (Criteria) this;
            }

            public Criteria andNicknameNotIn(List<String> values) {
                addCriterion("nickname not in", values, "nickname");
                return (Criteria) this;
            }

            public Criteria andNicknameBetween(String value1, String value2) {
                addCriterion("nickname between", value1, value2, "nickname");
                return (Criteria) this;
            }

            public Criteria andNicknameNotBetween(String value1, String value2) {
                addCriterion("nickname not between", value1, value2, "nickname");
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

    public Criteria andMobileEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("mobile = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andMobileNotEqualTo(String value) {
                addCriterion("mobile <>", value, "mobile");
                return (Criteria) this;
            }

    public Criteria andMobileNotEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("mobile <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andMobileGreaterThan(String value) {
                addCriterion("mobile >", value, "mobile");
                return (Criteria) this;
            }

    public Criteria andMobileGreaterThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("mobile > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andMobileGreaterThanOrEqualTo(String value) {
                addCriterion("mobile >=", value, "mobile");
                return (Criteria) this;
            }

    public Criteria andMobileGreaterThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("mobile >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andMobileLessThan(String value) {
                addCriterion("mobile <", value, "mobile");
                return (Criteria) this;
            }

    public Criteria andMobileLessThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("mobile < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andMobileLessThanOrEqualTo(String value) {
                addCriterion("mobile <=", value, "mobile");
                return (Criteria) this;
            }

    public Criteria andMobileLessThanOrEqualToColumn(MallUser.Column column) {
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

            public Criteria andAvatarIsNull() {
                addCriterion("avatar is null");
                return (Criteria) this;
            }

            public Criteria andAvatarIsNotNull() {
                addCriterion("avatar is not null");
                return (Criteria) this;
            }

            public Criteria andAvatarEqualTo(String value) {
                addCriterion("avatar =", value, "avatar");
                return (Criteria) this;
            }

    public Criteria andAvatarEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("avatar = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAvatarNotEqualTo(String value) {
                addCriterion("avatar <>", value, "avatar");
                return (Criteria) this;
            }

    public Criteria andAvatarNotEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("avatar <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAvatarGreaterThan(String value) {
                addCriterion("avatar >", value, "avatar");
                return (Criteria) this;
            }

    public Criteria andAvatarGreaterThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("avatar > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAvatarGreaterThanOrEqualTo(String value) {
                addCriterion("avatar >=", value, "avatar");
                return (Criteria) this;
            }

    public Criteria andAvatarGreaterThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("avatar >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAvatarLessThan(String value) {
                addCriterion("avatar <", value, "avatar");
                return (Criteria) this;
            }

    public Criteria andAvatarLessThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("avatar < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAvatarLessThanOrEqualTo(String value) {
                addCriterion("avatar <=", value, "avatar");
                return (Criteria) this;
            }

    public Criteria andAvatarLessThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("avatar <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAvatarLike(String value) {
                addCriterion("avatar like", value, "avatar");
                return (Criteria) this;
            }

            public Criteria andAvatarNotLike(String value) {
                addCriterion("avatar not like", value, "avatar");
                return (Criteria) this;
            }

            public Criteria andAvatarIn(List<String> values) {
                addCriterion("avatar in", values, "avatar");
                return (Criteria) this;
            }

            public Criteria andAvatarNotIn(List<String> values) {
                addCriterion("avatar not in", values, "avatar");
                return (Criteria) this;
            }

            public Criteria andAvatarBetween(String value1, String value2) {
                addCriterion("avatar between", value1, value2, "avatar");
                return (Criteria) this;
            }

            public Criteria andAvatarNotBetween(String value1, String value2) {
                addCriterion("avatar not between", value1, value2, "avatar");
                return (Criteria) this;
            }

            public Criteria andWeixinOpenidIsNull() {
                addCriterion("weixin_openid is null");
                return (Criteria) this;
            }

            public Criteria andWeixinOpenidIsNotNull() {
                addCriterion("weixin_openid is not null");
                return (Criteria) this;
            }

            public Criteria andWeixinOpenidEqualTo(String value) {
                addCriterion("weixin_openid =", value, "weixinOpenid");
                return (Criteria) this;
            }

    public Criteria andWeixinOpenidEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("weixin_openid = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andWeixinOpenidNotEqualTo(String value) {
                addCriterion("weixin_openid <>", value, "weixinOpenid");
                return (Criteria) this;
            }

    public Criteria andWeixinOpenidNotEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("weixin_openid <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andWeixinOpenidGreaterThan(String value) {
                addCriterion("weixin_openid >", value, "weixinOpenid");
                return (Criteria) this;
            }

    public Criteria andWeixinOpenidGreaterThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("weixin_openid > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andWeixinOpenidGreaterThanOrEqualTo(String value) {
                addCriterion("weixin_openid >=", value, "weixinOpenid");
                return (Criteria) this;
            }

    public Criteria andWeixinOpenidGreaterThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("weixin_openid >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andWeixinOpenidLessThan(String value) {
                addCriterion("weixin_openid <", value, "weixinOpenid");
                return (Criteria) this;
            }

    public Criteria andWeixinOpenidLessThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("weixin_openid < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andWeixinOpenidLessThanOrEqualTo(String value) {
                addCriterion("weixin_openid <=", value, "weixinOpenid");
                return (Criteria) this;
            }

    public Criteria andWeixinOpenidLessThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("weixin_openid <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andWeixinOpenidLike(String value) {
                addCriterion("weixin_openid like", value, "weixinOpenid");
                return (Criteria) this;
            }

            public Criteria andWeixinOpenidNotLike(String value) {
                addCriterion("weixin_openid not like", value, "weixinOpenid");
                return (Criteria) this;
            }

            public Criteria andWeixinOpenidIn(List<String> values) {
                addCriterion("weixin_openid in", values, "weixinOpenid");
                return (Criteria) this;
            }

            public Criteria andWeixinOpenidNotIn(List<String> values) {
                addCriterion("weixin_openid not in", values, "weixinOpenid");
                return (Criteria) this;
            }

            public Criteria andWeixinOpenidBetween(String value1, String value2) {
                addCriterion("weixin_openid between", value1, value2, "weixinOpenid");
                return (Criteria) this;
            }

            public Criteria andWeixinOpenidNotBetween(String value1, String value2) {
                addCriterion("weixin_openid not between", value1, value2, "weixinOpenid");
                return (Criteria) this;
            }

            public Criteria andSessionKeyIsNull() {
                addCriterion("session_key is null");
                return (Criteria) this;
            }

            public Criteria andSessionKeyIsNotNull() {
                addCriterion("session_key is not null");
                return (Criteria) this;
            }

            public Criteria andSessionKeyEqualTo(String value) {
                addCriterion("session_key =", value, "sessionKey");
                return (Criteria) this;
            }

    public Criteria andSessionKeyEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("session_key = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSessionKeyNotEqualTo(String value) {
                addCriterion("session_key <>", value, "sessionKey");
                return (Criteria) this;
            }

    public Criteria andSessionKeyNotEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("session_key <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSessionKeyGreaterThan(String value) {
                addCriterion("session_key >", value, "sessionKey");
                return (Criteria) this;
            }

    public Criteria andSessionKeyGreaterThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("session_key > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSessionKeyGreaterThanOrEqualTo(String value) {
                addCriterion("session_key >=", value, "sessionKey");
                return (Criteria) this;
            }

    public Criteria andSessionKeyGreaterThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("session_key >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSessionKeyLessThan(String value) {
                addCriterion("session_key <", value, "sessionKey");
                return (Criteria) this;
            }

    public Criteria andSessionKeyLessThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("session_key < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSessionKeyLessThanOrEqualTo(String value) {
                addCriterion("session_key <=", value, "sessionKey");
                return (Criteria) this;
            }

    public Criteria andSessionKeyLessThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("session_key <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andSessionKeyLike(String value) {
                addCriterion("session_key like", value, "sessionKey");
                return (Criteria) this;
            }

            public Criteria andSessionKeyNotLike(String value) {
                addCriterion("session_key not like", value, "sessionKey");
                return (Criteria) this;
            }

            public Criteria andSessionKeyIn(List<String> values) {
                addCriterion("session_key in", values, "sessionKey");
                return (Criteria) this;
            }

            public Criteria andSessionKeyNotIn(List<String> values) {
                addCriterion("session_key not in", values, "sessionKey");
                return (Criteria) this;
            }

            public Criteria andSessionKeyBetween(String value1, String value2) {
                addCriterion("session_key between", value1, value2, "sessionKey");
                return (Criteria) this;
            }

            public Criteria andSessionKeyNotBetween(String value1, String value2) {
                addCriterion("session_key not between", value1, value2, "sessionKey");
                return (Criteria) this;
            }

            public Criteria andStatusIsNull() {
                addCriterion("`status` is null");
                return (Criteria) this;
            }

            public Criteria andStatusIsNotNull() {
                addCriterion("`status` is not null");
                return (Criteria) this;
            }

            public Criteria andStatusEqualTo(Byte value) {
                addCriterion("`status` =", value, "status");
                return (Criteria) this;
            }

    public Criteria andStatusEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("`status` = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andStatusNotEqualTo(Byte value) {
                addCriterion("`status` <>", value, "status");
                return (Criteria) this;
            }

    public Criteria andStatusNotEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("`status` <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andStatusGreaterThan(Byte value) {
                addCriterion("`status` >", value, "status");
                return (Criteria) this;
            }

    public Criteria andStatusGreaterThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("`status` > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
                addCriterion("`status` >=", value, "status");
                return (Criteria) this;
            }

    public Criteria andStatusGreaterThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("`status` >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andStatusLessThan(Byte value) {
                addCriterion("`status` <", value, "status");
                return (Criteria) this;
            }

    public Criteria andStatusLessThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("`status` < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andStatusLessThanOrEqualTo(Byte value) {
                addCriterion("`status` <=", value, "status");
                return (Criteria) this;
            }

    public Criteria andStatusLessThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("`status` <= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andStatusIn(List<Byte> values) {
                addCriterion("`status` in", values, "status");
                return (Criteria) this;
            }

            public Criteria andStatusNotIn(List<Byte> values) {
                addCriterion("`status` not in", values, "status");
                return (Criteria) this;
            }

            public Criteria andStatusBetween(Byte value1, Byte value2) {
                addCriterion("`status` between", value1, value2, "status");
                return (Criteria) this;
            }

            public Criteria andStatusNotBetween(Byte value1, Byte value2) {
                addCriterion("`status` not between", value1, value2, "status");
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

    public Criteria andAddTimeEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("add_time = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeNotEqualTo(LocalDateTime value) {
                addCriterion("add_time <>", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeNotEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("add_time <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeGreaterThan(LocalDateTime value) {
                addCriterion("add_time >", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeGreaterThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("add_time > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeGreaterThanOrEqualTo(LocalDateTime value) {
                addCriterion("add_time >=", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeGreaterThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("add_time >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeLessThan(LocalDateTime value) {
                addCriterion("add_time <", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeLessThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("add_time < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andAddTimeLessThanOrEqualTo(LocalDateTime value) {
                addCriterion("add_time <=", value, "addTime");
                return (Criteria) this;
            }

    public Criteria andAddTimeLessThanOrEqualToColumn(MallUser.Column column) {
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

    public Criteria andUpdateTimeEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("update_time = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeNotEqualTo(LocalDateTime value) {
                addCriterion("update_time <>", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeNotEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("update_time <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeGreaterThan(LocalDateTime value) {
                addCriterion("update_time >", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeGreaterThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("update_time > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
                addCriterion("update_time >=", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeGreaterThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("update_time >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeLessThan(LocalDateTime value) {
                addCriterion("update_time <", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeLessThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("update_time < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
                addCriterion("update_time <=", value, "updateTime");
                return (Criteria) this;
            }

    public Criteria andUpdateTimeLessThanOrEqualToColumn(MallUser.Column column) {
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

    public Criteria andDeletedEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("deleted = ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedNotEqualTo(Boolean value) {
                addCriterion("deleted <>", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedNotEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("deleted <> ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedGreaterThan(Boolean value) {
                addCriterion("deleted >", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedGreaterThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("deleted > ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
                addCriterion("deleted >=", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedGreaterThanOrEqualToColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("deleted >= ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedLessThan(Boolean value) {
                addCriterion("deleted <", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedLessThanColumn(MallUser.Column column) {
                addCriterion(new StringBuilder("deleted < ").append(column.getEscapedColumnName()).toString());
                return (Criteria) this;
            }

            public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
                addCriterion("deleted <=", value, "deleted");
                return (Criteria) this;
            }

    public Criteria andDeletedLessThanOrEqualToColumn(MallUser.Column column) {
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

            private MallUserExample example;

    protected Criteria(MallUserExample example) {
                super();
                this.example = example;
            }

    public MallUserExample example() {
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
                return deleted ? andDeletedEqualTo(MallUser.Deleted.IS_DELETED.value()) : andDeletedNotEqualTo(MallUser.Deleted.IS_DELETED.value());
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

            void example(MallUserExample example);
        }
}