package weiboautoman.timer.dataobject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersWeiboExample {
    protected String orderByClause;

    protected List oredCriteria;

    public UsersWeiboExample() {
        oredCriteria = new ArrayList();
    }

    protected UsersWeiboExample(UsersWeiboExample example) {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return this;
        }

        public Criteria andUserIdIn(List values) {
            addCriterion("user_id in", values, "userId");
            return this;
        }

        public Criteria andUserIdNotIn(List values) {
            addCriterion("user_id not in", values, "userId");
            return this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return this;
        }

        public Criteria andWeiboIdIsNull() {
            addCriterion("weibo_id is null");
            return this;
        }

        public Criteria andWeiboIdIsNotNull() {
            addCriterion("weibo_id is not null");
            return this;
        }

        public Criteria andWeiboIdEqualTo(String value) {
            addCriterion("weibo_id =", value, "weiboId");
            return this;
        }

        public Criteria andWeiboIdNotEqualTo(String value) {
            addCriterion("weibo_id <>", value, "weiboId");
            return this;
        }

        public Criteria andWeiboIdGreaterThan(String value) {
            addCriterion("weibo_id >", value, "weiboId");
            return this;
        }

        public Criteria andWeiboIdGreaterThanOrEqualTo(String value) {
            addCriterion("weibo_id >=", value, "weiboId");
            return this;
        }

        public Criteria andWeiboIdLessThan(String value) {
            addCriterion("weibo_id <", value, "weiboId");
            return this;
        }

        public Criteria andWeiboIdLessThanOrEqualTo(String value) {
            addCriterion("weibo_id <=", value, "weiboId");
            return this;
        }

        public Criteria andWeiboIdLike(String value) {
            addCriterion("weibo_id like", value, "weiboId");
            return this;
        }

        public Criteria andWeiboIdNotLike(String value) {
            addCriterion("weibo_id not like", value, "weiboId");
            return this;
        }

        public Criteria andWeiboIdIn(List values) {
            addCriterion("weibo_id in", values, "weiboId");
            return this;
        }

        public Criteria andWeiboIdNotIn(List values) {
            addCriterion("weibo_id not in", values, "weiboId");
            return this;
        }

        public Criteria andWeiboIdBetween(String value1, String value2) {
            addCriterion("weibo_id between", value1, value2, "weiboId");
            return this;
        }

        public Criteria andWeiboIdNotBetween(String value1, String value2) {
            addCriterion("weibo_id not between", value1, value2, "weiboId");
            return this;
        }

        public Criteria andWeiboEmailIsNull() {
            addCriterion("weibo_email is null");
            return this;
        }

        public Criteria andWeiboEmailIsNotNull() {
            addCriterion("weibo_email is not null");
            return this;
        }

        public Criteria andWeiboEmailEqualTo(String value) {
            addCriterion("weibo_email =", value, "weiboEmail");
            return this;
        }

        public Criteria andWeiboEmailNotEqualTo(String value) {
            addCriterion("weibo_email <>", value, "weiboEmail");
            return this;
        }

        public Criteria andWeiboEmailGreaterThan(String value) {
            addCriterion("weibo_email >", value, "weiboEmail");
            return this;
        }

        public Criteria andWeiboEmailGreaterThanOrEqualTo(String value) {
            addCriterion("weibo_email >=", value, "weiboEmail");
            return this;
        }

        public Criteria andWeiboEmailLessThan(String value) {
            addCriterion("weibo_email <", value, "weiboEmail");
            return this;
        }

        public Criteria andWeiboEmailLessThanOrEqualTo(String value) {
            addCriterion("weibo_email <=", value, "weiboEmail");
            return this;
        }

        public Criteria andWeiboEmailLike(String value) {
            addCriterion("weibo_email like", value, "weiboEmail");
            return this;
        }

        public Criteria andWeiboEmailNotLike(String value) {
            addCriterion("weibo_email not like", value, "weiboEmail");
            return this;
        }

        public Criteria andWeiboEmailIn(List values) {
            addCriterion("weibo_email in", values, "weiboEmail");
            return this;
        }

        public Criteria andWeiboEmailNotIn(List values) {
            addCriterion("weibo_email not in", values, "weiboEmail");
            return this;
        }

        public Criteria andWeiboEmailBetween(String value1, String value2) {
            addCriterion("weibo_email between", value1, value2, "weiboEmail");
            return this;
        }

        public Criteria andWeiboEmailNotBetween(String value1, String value2) {
            addCriterion("weibo_email not between", value1, value2, "weiboEmail");
            return this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return this;
        }

        public Criteria andTokenIn(List values) {
            addCriterion("token in", values, "token");
            return this;
        }

        public Criteria andTokenNotIn(List values) {
            addCriterion("token not in", values, "token");
            return this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return this;
        }

        public Criteria andTokenSecretIsNull() {
            addCriterion("token_secret is null");
            return this;
        }

        public Criteria andTokenSecretIsNotNull() {
            addCriterion("token_secret is not null");
            return this;
        }

        public Criteria andTokenSecretEqualTo(String value) {
            addCriterion("token_secret =", value, "tokenSecret");
            return this;
        }

        public Criteria andTokenSecretNotEqualTo(String value) {
            addCriterion("token_secret <>", value, "tokenSecret");
            return this;
        }

        public Criteria andTokenSecretGreaterThan(String value) {
            addCriterion("token_secret >", value, "tokenSecret");
            return this;
        }

        public Criteria andTokenSecretGreaterThanOrEqualTo(String value) {
            addCriterion("token_secret >=", value, "tokenSecret");
            return this;
        }

        public Criteria andTokenSecretLessThan(String value) {
            addCriterion("token_secret <", value, "tokenSecret");
            return this;
        }

        public Criteria andTokenSecretLessThanOrEqualTo(String value) {
            addCriterion("token_secret <=", value, "tokenSecret");
            return this;
        }

        public Criteria andTokenSecretLike(String value) {
            addCriterion("token_secret like", value, "tokenSecret");
            return this;
        }

        public Criteria andTokenSecretNotLike(String value) {
            addCriterion("token_secret not like", value, "tokenSecret");
            return this;
        }

        public Criteria andTokenSecretIn(List values) {
            addCriterion("token_secret in", values, "tokenSecret");
            return this;
        }

        public Criteria andTokenSecretNotIn(List values) {
            addCriterion("token_secret not in", values, "tokenSecret");
            return this;
        }

        public Criteria andTokenSecretBetween(String value1, String value2) {
            addCriterion("token_secret between", value1, value2, "tokenSecret");
            return this;
        }

        public Criteria andTokenSecretNotBetween(String value1, String value2) {
            addCriterion("token_secret not between", value1, value2, "tokenSecret");
            return this;
        }

        public Criteria andWeiboTypeIsNull() {
            addCriterion("weibo_type is null");
            return this;
        }

        public Criteria andWeiboTypeIsNotNull() {
            addCriterion("weibo_type is not null");
            return this;
        }

        public Criteria andWeiboTypeEqualTo(String value) {
            addCriterion("weibo_type =", value, "weiboType");
            return this;
        }

        public Criteria andWeiboTypeNotEqualTo(String value) {
            addCriterion("weibo_type <>", value, "weiboType");
            return this;
        }

        public Criteria andWeiboTypeGreaterThan(String value) {
            addCriterion("weibo_type >", value, "weiboType");
            return this;
        }

        public Criteria andWeiboTypeGreaterThanOrEqualTo(String value) {
            addCriterion("weibo_type >=", value, "weiboType");
            return this;
        }

        public Criteria andWeiboTypeLessThan(String value) {
            addCriterion("weibo_type <", value, "weiboType");
            return this;
        }

        public Criteria andWeiboTypeLessThanOrEqualTo(String value) {
            addCriterion("weibo_type <=", value, "weiboType");
            return this;
        }

        public Criteria andWeiboTypeLike(String value) {
            addCriterion("weibo_type like", value, "weiboType");
            return this;
        }

        public Criteria andWeiboTypeNotLike(String value) {
            addCriterion("weibo_type not like", value, "weiboType");
            return this;
        }

        public Criteria andWeiboTypeIn(List values) {
            addCriterion("weibo_type in", values, "weiboType");
            return this;
        }

        public Criteria andWeiboTypeNotIn(List values) {
            addCriterion("weibo_type not in", values, "weiboType");
            return this;
        }

        public Criteria andWeiboTypeBetween(String value1, String value2) {
            addCriterion("weibo_type between", value1, value2, "weiboType");
            return this;
        }

        public Criteria andWeiboTypeNotBetween(String value1, String value2) {
            addCriterion("weibo_type not between", value1, value2, "weiboType");
            return this;
        }
    }
}