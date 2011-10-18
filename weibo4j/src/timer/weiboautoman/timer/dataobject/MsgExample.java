package weiboautoman.timer.dataobject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MsgExample {
    protected String orderByClause;

    protected List oredCriteria;

    public MsgExample() {
        oredCriteria = new ArrayList();
    }

    protected MsgExample(MsgExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public List getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
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
    }

    public static class Criteria {
        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return this;
        }

        public Criteria andIdIn(List values) {
            addCriterion("id in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List values) {
            addCriterion("id not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return this;
        }

        public Criteria andContentIn(List values) {
            addCriterion("content in", values, "content");
            return this;
        }

        public Criteria andContentNotIn(List values) {
            addCriterion("content not in", values, "content");
            return this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return this;
        }

        public Criteria andSortnoIsNull() {
            addCriterion("sortno is null");
            return this;
        }

        public Criteria andSortnoIsNotNull() {
            addCriterion("sortno is not null");
            return this;
        }

        public Criteria andSortnoEqualTo(Integer value) {
            addCriterion("sortno =", value, "sortno");
            return this;
        }

        public Criteria andSortnoNotEqualTo(Integer value) {
            addCriterion("sortno <>", value, "sortno");
            return this;
        }

        public Criteria andSortnoGreaterThan(Integer value) {
            addCriterion("sortno >", value, "sortno");
            return this;
        }

        public Criteria andSortnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sortno >=", value, "sortno");
            return this;
        }

        public Criteria andSortnoLessThan(Integer value) {
            addCriterion("sortno <", value, "sortno");
            return this;
        }

        public Criteria andSortnoLessThanOrEqualTo(Integer value) {
            addCriterion("sortno <=", value, "sortno");
            return this;
        }

        public Criteria andSortnoIn(List values) {
            addCriterion("sortno in", values, "sortno");
            return this;
        }

        public Criteria andSortnoNotIn(List values) {
            addCriterion("sortno not in", values, "sortno");
            return this;
        }

        public Criteria andSortnoBetween(Integer value1, Integer value2) {
            addCriterion("sortno between", value1, value2, "sortno");
            return this;
        }

        public Criteria andSortnoNotBetween(Integer value1, Integer value2) {
            addCriterion("sortno not between", value1, value2, "sortno");
            return this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return this;
        }

        public Criteria andTypeIdIn(List values) {
            addCriterion("type_id in", values, "typeId");
            return this;
        }

        public Criteria andTypeIdNotIn(List values) {
            addCriterion("type_id not in", values, "typeId");
            return this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return this;
        }

        public Criteria andPictureIn(List values) {
            addCriterion("picture in", values, "picture");
            return this;
        }

        public Criteria andPictureNotIn(List values) {
            addCriterion("picture not in", values, "picture");
            return this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return this;
        }
    }
}