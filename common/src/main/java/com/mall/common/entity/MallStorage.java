package com.mall.common.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class MallStorage {

    public static final Boolean IS_DELETED = Deleted.IS_DELETED.value();

    public static final Boolean NOT_DELETED = Deleted.NOT_DELETED.value();

    private Integer id;

    private String key;

    private String name;

    private String type;

    private Integer size;

    private String url;

    private LocalDateTime addTime;

    private LocalDateTime updateTime;

    private Boolean deleted;

    public Integer getId() {
            return id;
        }

    public void setId(Integer id) {
            this.id = id;
        }

    public String getKey() {
            return key;
        }

    public void setKey(String key) {
            this.key = key;
        }

    public String getName() {
            return name;
        }

    public void setName(String name) {
            this.name = name;
        }

    public String getType() {
            return type;
        }

    public void setType(String type) {
            this.type = type;
        }

    public Integer getSize() {
            return size;
        }

    public void setSize(Integer size) {
            this.size = size;
        }

    public String getUrl() {
            return url;
        }

    public void setUrl(String url) {
            this.url = url;
        }

    public LocalDateTime getAddTime() {
            return addTime;
        }

    public void setAddTime(LocalDateTime addTime) {
            this.addTime = addTime;
        }

    public LocalDateTime getUpdateTime() {
            return updateTime;
        }

    public void setUpdateTime(LocalDateTime updateTime) {
            this.updateTime = updateTime;
        }

    public void andLogicalDeleted(boolean deleted) {
            setDeleted(deleted ? Deleted.IS_DELETED.value() : Deleted.NOT_DELETED.value());
        }

    public Boolean getDeleted() {
            return deleted;
        }

    public void setDeleted(Boolean deleted) {
            this.deleted = deleted;
        }

    @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" [");
            sb.append("Hash = ").append(hashCode());
            sb.append(", IS_DELETED=").append(IS_DELETED);
            sb.append(", NOT_DELETED=").append(NOT_DELETED);
            sb.append(", id=").append(id);
            sb.append(", key=").append(key);
            sb.append(", name=").append(name);
            sb.append(", type=").append(type);
            sb.append(", size=").append(size);
            sb.append(", url=").append(url);
            sb.append(", addTime=").append(addTime);
            sb.append(", updateTime=").append(updateTime);
            sb.append(", deleted=").append(deleted);
            sb.append("]");
            return sb.toString();
        }

    @Override
        public boolean equals(Object that) {
            if (this == that) {
                return true;
            }
            if (that == null) {
                return false;
            }
            if (getClass() != that.getClass()) {
                return false;
            }
            MallStorage other = (MallStorage) that;
            return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getKey() == null ? other.getKey() == null : this.getKey().equals(other.getKey()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()))
                && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
                && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
                && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
                && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
        }

    @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
            result = prime * result + ((getKey() == null) ? 0 : getKey().hashCode());
            result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
            result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
            result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
            result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
            result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
            result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
            result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
            return result;
        }

    public enum Deleted {
            NOT_DELETED(new Boolean("0"), "未删除"),
            IS_DELETED(new Boolean("1"), "已删除");

    private final Boolean value;

    private final String name;

    Deleted(Boolean value, String name) {
                this.value = value;
                this.name = name;
            }

    public Boolean getValue() {
                return this.value;
            }

    public Boolean value() {
                return this.value;
            }

    public String getName() {
                return this.name;
            }
        }

    public enum Column {
            id("id", "id", "INTEGER", false),
            key("key", "key", "VARCHAR", true),
            name("name", "name", "VARCHAR", true),
            type("type", "type", "VARCHAR", true),
            size("size", "size", "INTEGER", true),
            url("url", "url", "VARCHAR", false),
            addTime("add_time", "addTime", "TIMESTAMP", false),
            updateTime("update_time", "updateTime", "TIMESTAMP", false),
            deleted("deleted", "deleted", "BIT", false);

    private static final String BEGINNING_DELIMITER = "`";

    private static final String ENDING_DELIMITER = "`";

    private final String column;

    private final boolean isColumnNameDelimited;

    private final String javaProperty;

    private final String jdbcType;

    public String value() {
                return this.column;
            }

    public String getValue() {
                return this.column;
            }

    public String getJavaProperty() {
                return this.javaProperty;
            }

    public String getJdbcType() {
                return this.jdbcType;
            }

    Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
                this.column = column;
                this.javaProperty = javaProperty;
                this.jdbcType = jdbcType;
                this.isColumnNameDelimited = isColumnNameDelimited;
            }

    public String desc() {
                return this.getEscapedColumnName() + " DESC";
            }

    public String asc() {
                return this.getEscapedColumnName() + " ASC";
            }

    public static Column[] excludes(Column ... excludes) {
                ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
                if (excludes != null && excludes.length > 0) {
                    columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
                }
                return columns.toArray(new Column[]{});
            }

    public String getEscapedColumnName() {
                if (this.isColumnNameDelimited) {
                    return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
                } else {
                    return this.column;
                }
            }

    public String getAliasedEscapedColumnName() {
                return this.getEscapedColumnName();
            }
        }
}