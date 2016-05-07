package com.startupComp.client;

import java.util.List;

import base.startupComp.mapper.IBaseMapper;

import com.startupComp.model.UserStartup;
import com.startupComp.model.UserStartupExample;

public interface UserStartupMapper extends IBaseMapper<UserStartup, UserStartupExample, Integer>{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startupcomp_user
     *
     * @mbggenerated Fri May 06 12:56:34 CST 2016
     */
    int countByExample(UserStartupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startupcomp_user
     *
     * @mbggenerated Fri May 06 12:56:34 CST 2016
     */
    int deleteByExample(UserStartupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startupcomp_user
     *
     * @mbggenerated Fri May 06 12:56:34 CST 2016
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startupcomp_user
     *
     * @mbggenerated Fri May 06 12:56:34 CST 2016
     */
    int insert(UserStartup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startupcomp_user
     *
     * @mbggenerated Fri May 06 12:56:34 CST 2016
     */
    int insertSelective(UserStartup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startupcomp_user
     *
     * @mbggenerated Fri May 06 12:56:34 CST 2016
     */
    List<UserStartup> selectByExample(UserStartupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startupcomp_user
     *
     * @mbggenerated Fri May 06 12:56:34 CST 2016
     */
    UserStartup selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startupcomp_user
     *
     * @mbggenerated Fri May 06 12:56:34 CST 2016
     */
    int updateByPrimaryKeySelective(UserStartup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startupcomp_user
     *
     * @mbggenerated Fri May 06 12:56:34 CST 2016
     */
    int updateByPrimaryKey(UserStartup record);
}