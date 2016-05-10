package com.startupComp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorksExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    public WorksExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
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

        public Criteria andWorksIdIsNull() {
            addCriterion("WORKS_ID is null");
            return (Criteria) this;
        }

        public Criteria andWorksIdIsNotNull() {
            addCriterion("WORKS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWorksIdEqualTo(Integer value) {
            addCriterion("WORKS_ID =", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdNotEqualTo(Integer value) {
            addCriterion("WORKS_ID <>", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdGreaterThan(Integer value) {
            addCriterion("WORKS_ID >", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORKS_ID >=", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdLessThan(Integer value) {
            addCriterion("WORKS_ID <", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdLessThanOrEqualTo(Integer value) {
            addCriterion("WORKS_ID <=", value, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdIn(List<Integer> values) {
            addCriterion("WORKS_ID in", values, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdNotIn(List<Integer> values) {
            addCriterion("WORKS_ID not in", values, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdBetween(Integer value1, Integer value2) {
            addCriterion("WORKS_ID between", value1, value2, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksIdNotBetween(Integer value1, Integer value2) {
            addCriterion("WORKS_ID not between", value1, value2, "worksId");
            return (Criteria) this;
        }

        public Criteria andWorksNameIsNull() {
            addCriterion("WORKS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andWorksNameIsNotNull() {
            addCriterion("WORKS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andWorksNameEqualTo(String value) {
            addCriterion("WORKS_NAME =", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameNotEqualTo(String value) {
            addCriterion("WORKS_NAME <>", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameGreaterThan(String value) {
            addCriterion("WORKS_NAME >", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameGreaterThanOrEqualTo(String value) {
            addCriterion("WORKS_NAME >=", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameLessThan(String value) {
            addCriterion("WORKS_NAME <", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameLessThanOrEqualTo(String value) {
            addCriterion("WORKS_NAME <=", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameLike(String value) {
            addCriterion("WORKS_NAME like", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameNotLike(String value) {
            addCriterion("WORKS_NAME not like", value, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameIn(List<String> values) {
            addCriterion("WORKS_NAME in", values, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameNotIn(List<String> values) {
            addCriterion("WORKS_NAME not in", values, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameBetween(String value1, String value2) {
            addCriterion("WORKS_NAME between", value1, value2, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksNameNotBetween(String value1, String value2) {
            addCriterion("WORKS_NAME not between", value1, value2, "worksName");
            return (Criteria) this;
        }

        public Criteria andWorksDateIsNull() {
            addCriterion("WORKS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andWorksDateIsNotNull() {
            addCriterion("WORKS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andWorksDateEqualTo(Date value) {
            addCriterion("WORKS_DATE =", value, "worksDate");
            return (Criteria) this;
        }

        public Criteria andWorksDateNotEqualTo(Date value) {
            addCriterion("WORKS_DATE <>", value, "worksDate");
            return (Criteria) this;
        }

        public Criteria andWorksDateGreaterThan(Date value) {
            addCriterion("WORKS_DATE >", value, "worksDate");
            return (Criteria) this;
        }

        public Criteria andWorksDateGreaterThanOrEqualTo(Date value) {
            addCriterion("WORKS_DATE >=", value, "worksDate");
            return (Criteria) this;
        }

        public Criteria andWorksDateLessThan(Date value) {
            addCriterion("WORKS_DATE <", value, "worksDate");
            return (Criteria) this;
        }

        public Criteria andWorksDateLessThanOrEqualTo(Date value) {
            addCriterion("WORKS_DATE <=", value, "worksDate");
            return (Criteria) this;
        }

        public Criteria andWorksDateIn(List<Date> values) {
            addCriterion("WORKS_DATE in", values, "worksDate");
            return (Criteria) this;
        }

        public Criteria andWorksDateNotIn(List<Date> values) {
            addCriterion("WORKS_DATE not in", values, "worksDate");
            return (Criteria) this;
        }

        public Criteria andWorksDateBetween(Date value1, Date value2) {
            addCriterion("WORKS_DATE between", value1, value2, "worksDate");
            return (Criteria) this;
        }

        public Criteria andWorksDateNotBetween(Date value1, Date value2) {
            addCriterion("WORKS_DATE not between", value1, value2, "worksDate");
            return (Criteria) this;
        }

        public Criteria andWorksTypeIsNull() {
            addCriterion("WORKS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andWorksTypeIsNotNull() {
            addCriterion("WORKS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWorksTypeEqualTo(String value) {
            addCriterion("WORKS_TYPE =", value, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksTypeNotEqualTo(String value) {
            addCriterion("WORKS_TYPE <>", value, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksTypeGreaterThan(String value) {
            addCriterion("WORKS_TYPE >", value, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksTypeGreaterThanOrEqualTo(String value) {
            addCriterion("WORKS_TYPE >=", value, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksTypeLessThan(String value) {
            addCriterion("WORKS_TYPE <", value, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksTypeLessThanOrEqualTo(String value) {
            addCriterion("WORKS_TYPE <=", value, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksTypeLike(String value) {
            addCriterion("WORKS_TYPE like", value, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksTypeNotLike(String value) {
            addCriterion("WORKS_TYPE not like", value, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksTypeIn(List<String> values) {
            addCriterion("WORKS_TYPE in", values, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksTypeNotIn(List<String> values) {
            addCriterion("WORKS_TYPE not in", values, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksTypeBetween(String value1, String value2) {
            addCriterion("WORKS_TYPE between", value1, value2, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksTypeNotBetween(String value1, String value2) {
            addCriterion("WORKS_TYPE not between", value1, value2, "worksType");
            return (Criteria) this;
        }

        public Criteria andWorksLikeIsNull() {
            addCriterion("WORKS_LIKE is null");
            return (Criteria) this;
        }

        public Criteria andWorksLikeIsNotNull() {
            addCriterion("WORKS_LIKE is not null");
            return (Criteria) this;
        }

        public Criteria andWorksLikeEqualTo(Integer value) {
            addCriterion("WORKS_LIKE =", value, "worksLike");
            return (Criteria) this;
        }

        public Criteria andWorksLikeNotEqualTo(Integer value) {
            addCriterion("WORKS_LIKE <>", value, "worksLike");
            return (Criteria) this;
        }

        public Criteria andWorksLikeGreaterThan(Integer value) {
            addCriterion("WORKS_LIKE >", value, "worksLike");
            return (Criteria) this;
        }

        public Criteria andWorksLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORKS_LIKE >=", value, "worksLike");
            return (Criteria) this;
        }

        public Criteria andWorksLikeLessThan(Integer value) {
            addCriterion("WORKS_LIKE <", value, "worksLike");
            return (Criteria) this;
        }

        public Criteria andWorksLikeLessThanOrEqualTo(Integer value) {
            addCriterion("WORKS_LIKE <=", value, "worksLike");
            return (Criteria) this;
        }

        public Criteria andWorksLikeIn(List<Integer> values) {
            addCriterion("WORKS_LIKE in", values, "worksLike");
            return (Criteria) this;
        }

        public Criteria andWorksLikeNotIn(List<Integer> values) {
            addCriterion("WORKS_LIKE not in", values, "worksLike");
            return (Criteria) this;
        }

        public Criteria andWorksLikeBetween(Integer value1, Integer value2) {
            addCriterion("WORKS_LIKE between", value1, value2, "worksLike");
            return (Criteria) this;
        }

        public Criteria andWorksLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("WORKS_LIKE not between", value1, value2, "worksLike");
            return (Criteria) this;
        }

        public Criteria andWorksCollIsNull() {
            addCriterion("WORKS_COLL is null");
            return (Criteria) this;
        }

        public Criteria andWorksCollIsNotNull() {
            addCriterion("WORKS_COLL is not null");
            return (Criteria) this;
        }

        public Criteria andWorksCollEqualTo(Integer value) {
            addCriterion("WORKS_COLL =", value, "worksColl");
            return (Criteria) this;
        }

        public Criteria andWorksCollNotEqualTo(Integer value) {
            addCriterion("WORKS_COLL <>", value, "worksColl");
            return (Criteria) this;
        }

        public Criteria andWorksCollGreaterThan(Integer value) {
            addCriterion("WORKS_COLL >", value, "worksColl");
            return (Criteria) this;
        }

        public Criteria andWorksCollGreaterThanOrEqualTo(Integer value) {
            addCriterion("WORKS_COLL >=", value, "worksColl");
            return (Criteria) this;
        }

        public Criteria andWorksCollLessThan(Integer value) {
            addCriterion("WORKS_COLL <", value, "worksColl");
            return (Criteria) this;
        }

        public Criteria andWorksCollLessThanOrEqualTo(Integer value) {
            addCriterion("WORKS_COLL <=", value, "worksColl");
            return (Criteria) this;
        }

        public Criteria andWorksCollIn(List<Integer> values) {
            addCriterion("WORKS_COLL in", values, "worksColl");
            return (Criteria) this;
        }

        public Criteria andWorksCollNotIn(List<Integer> values) {
            addCriterion("WORKS_COLL not in", values, "worksColl");
            return (Criteria) this;
        }

        public Criteria andWorksCollBetween(Integer value1, Integer value2) {
            addCriterion("WORKS_COLL between", value1, value2, "worksColl");
            return (Criteria) this;
        }

        public Criteria andWorksCollNotBetween(Integer value1, Integer value2) {
            addCriterion("WORKS_COLL not between", value1, value2, "worksColl");
            return (Criteria) this;
        }

        public Criteria andWorksCommentIsNull() {
            addCriterion("WORKS_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andWorksCommentIsNotNull() {
            addCriterion("WORKS_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andWorksCommentEqualTo(String value) {
            addCriterion("WORKS_COMMENT =", value, "worksComment");
            return (Criteria) this;
        }

        public Criteria andWorksCommentNotEqualTo(String value) {
            addCriterion("WORKS_COMMENT <>", value, "worksComment");
            return (Criteria) this;
        }

        public Criteria andWorksCommentGreaterThan(String value) {
            addCriterion("WORKS_COMMENT >", value, "worksComment");
            return (Criteria) this;
        }

        public Criteria andWorksCommentGreaterThanOrEqualTo(String value) {
            addCriterion("WORKS_COMMENT >=", value, "worksComment");
            return (Criteria) this;
        }

        public Criteria andWorksCommentLessThan(String value) {
            addCriterion("WORKS_COMMENT <", value, "worksComment");
            return (Criteria) this;
        }

        public Criteria andWorksCommentLessThanOrEqualTo(String value) {
            addCriterion("WORKS_COMMENT <=", value, "worksComment");
            return (Criteria) this;
        }

        public Criteria andWorksCommentLike(String value) {
            addCriterion("WORKS_COMMENT like", value, "worksComment");
            return (Criteria) this;
        }

        public Criteria andWorksCommentNotLike(String value) {
            addCriterion("WORKS_COMMENT not like", value, "worksComment");
            return (Criteria) this;
        }

        public Criteria andWorksCommentIn(List<String> values) {
            addCriterion("WORKS_COMMENT in", values, "worksComment");
            return (Criteria) this;
        }

        public Criteria andWorksCommentNotIn(List<String> values) {
            addCriterion("WORKS_COMMENT not in", values, "worksComment");
            return (Criteria) this;
        }

        public Criteria andWorksCommentBetween(String value1, String value2) {
            addCriterion("WORKS_COMMENT between", value1, value2, "worksComment");
            return (Criteria) this;
        }

        public Criteria andWorksCommentNotBetween(String value1, String value2) {
            addCriterion("WORKS_COMMENT not between", value1, value2, "worksComment");
            return (Criteria) this;
        }

        public Criteria andWorksAuthorIsNull() {
            addCriterion("WORKS_AUTHOR is null");
            return (Criteria) this;
        }

        public Criteria andWorksAuthorIsNotNull() {
            addCriterion("WORKS_AUTHOR is not null");
            return (Criteria) this;
        }

        public Criteria andWorksAuthorEqualTo(String value) {
            addCriterion("WORKS_AUTHOR =", value, "worksAuthor");
            return (Criteria) this;
        }

        public Criteria andWorksAuthorNotEqualTo(String value) {
            addCriterion("WORKS_AUTHOR <>", value, "worksAuthor");
            return (Criteria) this;
        }

        public Criteria andWorksAuthorGreaterThan(String value) {
            addCriterion("WORKS_AUTHOR >", value, "worksAuthor");
            return (Criteria) this;
        }

        public Criteria andWorksAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("WORKS_AUTHOR >=", value, "worksAuthor");
            return (Criteria) this;
        }

        public Criteria andWorksAuthorLessThan(String value) {
            addCriterion("WORKS_AUTHOR <", value, "worksAuthor");
            return (Criteria) this;
        }

        public Criteria andWorksAuthorLessThanOrEqualTo(String value) {
            addCriterion("WORKS_AUTHOR <=", value, "worksAuthor");
            return (Criteria) this;
        }

        public Criteria andWorksAuthorLike(String value) {
            addCriterion("WORKS_AUTHOR like", value, "worksAuthor");
            return (Criteria) this;
        }

        public Criteria andWorksAuthorNotLike(String value) {
            addCriterion("WORKS_AUTHOR not like", value, "worksAuthor");
            return (Criteria) this;
        }

        public Criteria andWorksAuthorIn(List<String> values) {
            addCriterion("WORKS_AUTHOR in", values, "worksAuthor");
            return (Criteria) this;
        }

        public Criteria andWorksAuthorNotIn(List<String> values) {
            addCriterion("WORKS_AUTHOR not in", values, "worksAuthor");
            return (Criteria) this;
        }

        public Criteria andWorksAuthorBetween(String value1, String value2) {
            addCriterion("WORKS_AUTHOR between", value1, value2, "worksAuthor");
            return (Criteria) this;
        }

        public Criteria andWorksAuthorNotBetween(String value1, String value2) {
            addCriterion("WORKS_AUTHOR not between", value1, value2, "worksAuthor");
            return (Criteria) this;
        }

        public Criteria andWorksImg1IsNull() {
            addCriterion("WORKS_IMG1 is null");
            return (Criteria) this;
        }

        public Criteria andWorksImg1IsNotNull() {
            addCriterion("WORKS_IMG1 is not null");
            return (Criteria) this;
        }

        public Criteria andWorksImg1EqualTo(String value) {
            addCriterion("WORKS_IMG1 =", value, "worksImg1");
            return (Criteria) this;
        }

        public Criteria andWorksImg1NotEqualTo(String value) {
            addCriterion("WORKS_IMG1 <>", value, "worksImg1");
            return (Criteria) this;
        }

        public Criteria andWorksImg1GreaterThan(String value) {
            addCriterion("WORKS_IMG1 >", value, "worksImg1");
            return (Criteria) this;
        }

        public Criteria andWorksImg1GreaterThanOrEqualTo(String value) {
            addCriterion("WORKS_IMG1 >=", value, "worksImg1");
            return (Criteria) this;
        }

        public Criteria andWorksImg1LessThan(String value) {
            addCriterion("WORKS_IMG1 <", value, "worksImg1");
            return (Criteria) this;
        }

        public Criteria andWorksImg1LessThanOrEqualTo(String value) {
            addCriterion("WORKS_IMG1 <=", value, "worksImg1");
            return (Criteria) this;
        }

        public Criteria andWorksImg1Like(String value) {
            addCriterion("WORKS_IMG1 like", value, "worksImg1");
            return (Criteria) this;
        }

        public Criteria andWorksImg1NotLike(String value) {
            addCriterion("WORKS_IMG1 not like", value, "worksImg1");
            return (Criteria) this;
        }

        public Criteria andWorksImg1In(List<String> values) {
            addCriterion("WORKS_IMG1 in", values, "worksImg1");
            return (Criteria) this;
        }

        public Criteria andWorksImg1NotIn(List<String> values) {
            addCriterion("WORKS_IMG1 not in", values, "worksImg1");
            return (Criteria) this;
        }

        public Criteria andWorksImg1Between(String value1, String value2) {
            addCriterion("WORKS_IMG1 between", value1, value2, "worksImg1");
            return (Criteria) this;
        }

        public Criteria andWorksImg1NotBetween(String value1, String value2) {
            addCriterion("WORKS_IMG1 not between", value1, value2, "worksImg1");
            return (Criteria) this;
        }

        public Criteria andWorksImg2IsNull() {
            addCriterion("WORKS_IMG2 is null");
            return (Criteria) this;
        }

        public Criteria andWorksImg2IsNotNull() {
            addCriterion("WORKS_IMG2 is not null");
            return (Criteria) this;
        }

        public Criteria andWorksImg2EqualTo(String value) {
            addCriterion("WORKS_IMG2 =", value, "worksImg2");
            return (Criteria) this;
        }

        public Criteria andWorksImg2NotEqualTo(String value) {
            addCriterion("WORKS_IMG2 <>", value, "worksImg2");
            return (Criteria) this;
        }

        public Criteria andWorksImg2GreaterThan(String value) {
            addCriterion("WORKS_IMG2 >", value, "worksImg2");
            return (Criteria) this;
        }

        public Criteria andWorksImg2GreaterThanOrEqualTo(String value) {
            addCriterion("WORKS_IMG2 >=", value, "worksImg2");
            return (Criteria) this;
        }

        public Criteria andWorksImg2LessThan(String value) {
            addCriterion("WORKS_IMG2 <", value, "worksImg2");
            return (Criteria) this;
        }

        public Criteria andWorksImg2LessThanOrEqualTo(String value) {
            addCriterion("WORKS_IMG2 <=", value, "worksImg2");
            return (Criteria) this;
        }

        public Criteria andWorksImg2Like(String value) {
            addCriterion("WORKS_IMG2 like", value, "worksImg2");
            return (Criteria) this;
        }

        public Criteria andWorksImg2NotLike(String value) {
            addCriterion("WORKS_IMG2 not like", value, "worksImg2");
            return (Criteria) this;
        }

        public Criteria andWorksImg2In(List<String> values) {
            addCriterion("WORKS_IMG2 in", values, "worksImg2");
            return (Criteria) this;
        }

        public Criteria andWorksImg2NotIn(List<String> values) {
            addCriterion("WORKS_IMG2 not in", values, "worksImg2");
            return (Criteria) this;
        }

        public Criteria andWorksImg2Between(String value1, String value2) {
            addCriterion("WORKS_IMG2 between", value1, value2, "worksImg2");
            return (Criteria) this;
        }

        public Criteria andWorksImg2NotBetween(String value1, String value2) {
            addCriterion("WORKS_IMG2 not between", value1, value2, "worksImg2");
            return (Criteria) this;
        }

        public Criteria andWorksImg3IsNull() {
            addCriterion("WORKS_IMG3 is null");
            return (Criteria) this;
        }

        public Criteria andWorksImg3IsNotNull() {
            addCriterion("WORKS_IMG3 is not null");
            return (Criteria) this;
        }

        public Criteria andWorksImg3EqualTo(String value) {
            addCriterion("WORKS_IMG3 =", value, "worksImg3");
            return (Criteria) this;
        }

        public Criteria andWorksImg3NotEqualTo(String value) {
            addCriterion("WORKS_IMG3 <>", value, "worksImg3");
            return (Criteria) this;
        }

        public Criteria andWorksImg3GreaterThan(String value) {
            addCriterion("WORKS_IMG3 >", value, "worksImg3");
            return (Criteria) this;
        }

        public Criteria andWorksImg3GreaterThanOrEqualTo(String value) {
            addCriterion("WORKS_IMG3 >=", value, "worksImg3");
            return (Criteria) this;
        }

        public Criteria andWorksImg3LessThan(String value) {
            addCriterion("WORKS_IMG3 <", value, "worksImg3");
            return (Criteria) this;
        }

        public Criteria andWorksImg3LessThanOrEqualTo(String value) {
            addCriterion("WORKS_IMG3 <=", value, "worksImg3");
            return (Criteria) this;
        }

        public Criteria andWorksImg3Like(String value) {
            addCriterion("WORKS_IMG3 like", value, "worksImg3");
            return (Criteria) this;
        }

        public Criteria andWorksImg3NotLike(String value) {
            addCriterion("WORKS_IMG3 not like", value, "worksImg3");
            return (Criteria) this;
        }

        public Criteria andWorksImg3In(List<String> values) {
            addCriterion("WORKS_IMG3 in", values, "worksImg3");
            return (Criteria) this;
        }

        public Criteria andWorksImg3NotIn(List<String> values) {
            addCriterion("WORKS_IMG3 not in", values, "worksImg3");
            return (Criteria) this;
        }

        public Criteria andWorksImg3Between(String value1, String value2) {
            addCriterion("WORKS_IMG3 between", value1, value2, "worksImg3");
            return (Criteria) this;
        }

        public Criteria andWorksImg3NotBetween(String value1, String value2) {
            addCriterion("WORKS_IMG3 not between", value1, value2, "worksImg3");
            return (Criteria) this;
        }

        public Criteria andWorksImg4IsNull() {
            addCriterion("WORKS_IMG4 is null");
            return (Criteria) this;
        }

        public Criteria andWorksImg4IsNotNull() {
            addCriterion("WORKS_IMG4 is not null");
            return (Criteria) this;
        }

        public Criteria andWorksImg4EqualTo(String value) {
            addCriterion("WORKS_IMG4 =", value, "worksImg4");
            return (Criteria) this;
        }

        public Criteria andWorksImg4NotEqualTo(String value) {
            addCriterion("WORKS_IMG4 <>", value, "worksImg4");
            return (Criteria) this;
        }

        public Criteria andWorksImg4GreaterThan(String value) {
            addCriterion("WORKS_IMG4 >", value, "worksImg4");
            return (Criteria) this;
        }

        public Criteria andWorksImg4GreaterThanOrEqualTo(String value) {
            addCriterion("WORKS_IMG4 >=", value, "worksImg4");
            return (Criteria) this;
        }

        public Criteria andWorksImg4LessThan(String value) {
            addCriterion("WORKS_IMG4 <", value, "worksImg4");
            return (Criteria) this;
        }

        public Criteria andWorksImg4LessThanOrEqualTo(String value) {
            addCriterion("WORKS_IMG4 <=", value, "worksImg4");
            return (Criteria) this;
        }

        public Criteria andWorksImg4Like(String value) {
            addCriterion("WORKS_IMG4 like", value, "worksImg4");
            return (Criteria) this;
        }

        public Criteria andWorksImg4NotLike(String value) {
            addCriterion("WORKS_IMG4 not like", value, "worksImg4");
            return (Criteria) this;
        }

        public Criteria andWorksImg4In(List<String> values) {
            addCriterion("WORKS_IMG4 in", values, "worksImg4");
            return (Criteria) this;
        }

        public Criteria andWorksImg4NotIn(List<String> values) {
            addCriterion("WORKS_IMG4 not in", values, "worksImg4");
            return (Criteria) this;
        }

        public Criteria andWorksImg4Between(String value1, String value2) {
            addCriterion("WORKS_IMG4 between", value1, value2, "worksImg4");
            return (Criteria) this;
        }

        public Criteria andWorksImg4NotBetween(String value1, String value2) {
            addCriterion("WORKS_IMG4 not between", value1, value2, "worksImg4");
            return (Criteria) this;
        }

        public Criteria andWorksImg5IsNull() {
            addCriterion("WORKS_IMG5 is null");
            return (Criteria) this;
        }

        public Criteria andWorksImg5IsNotNull() {
            addCriterion("WORKS_IMG5 is not null");
            return (Criteria) this;
        }

        public Criteria andWorksImg5EqualTo(String value) {
            addCriterion("WORKS_IMG5 =", value, "worksImg5");
            return (Criteria) this;
        }

        public Criteria andWorksImg5NotEqualTo(String value) {
            addCriterion("WORKS_IMG5 <>", value, "worksImg5");
            return (Criteria) this;
        }

        public Criteria andWorksImg5GreaterThan(String value) {
            addCriterion("WORKS_IMG5 >", value, "worksImg5");
            return (Criteria) this;
        }

        public Criteria andWorksImg5GreaterThanOrEqualTo(String value) {
            addCriterion("WORKS_IMG5 >=", value, "worksImg5");
            return (Criteria) this;
        }

        public Criteria andWorksImg5LessThan(String value) {
            addCriterion("WORKS_IMG5 <", value, "worksImg5");
            return (Criteria) this;
        }

        public Criteria andWorksImg5LessThanOrEqualTo(String value) {
            addCriterion("WORKS_IMG5 <=", value, "worksImg5");
            return (Criteria) this;
        }

        public Criteria andWorksImg5Like(String value) {
            addCriterion("WORKS_IMG5 like", value, "worksImg5");
            return (Criteria) this;
        }

        public Criteria andWorksImg5NotLike(String value) {
            addCriterion("WORKS_IMG5 not like", value, "worksImg5");
            return (Criteria) this;
        }

        public Criteria andWorksImg5In(List<String> values) {
            addCriterion("WORKS_IMG5 in", values, "worksImg5");
            return (Criteria) this;
        }

        public Criteria andWorksImg5NotIn(List<String> values) {
            addCriterion("WORKS_IMG5 not in", values, "worksImg5");
            return (Criteria) this;
        }

        public Criteria andWorksImg5Between(String value1, String value2) {
            addCriterion("WORKS_IMG5 between", value1, value2, "worksImg5");
            return (Criteria) this;
        }

        public Criteria andWorksImg5NotBetween(String value1, String value2) {
            addCriterion("WORKS_IMG5 not between", value1, value2, "worksImg5");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table startup_works
     *
     * @mbggenerated do_not_delete_during_merge Tue May 10 17:08:56 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
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