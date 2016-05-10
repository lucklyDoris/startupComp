package com.startupComp.client;

import java.util.List;

import base.startupComp.mapper.IBaseMapper;

import com.startupComp.model.Works;
import com.startupComp.model.WorksExample;

public interface WorksMapper extends IBaseMapper<Works, WorksExample, Integer>{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    int countByExample(WorksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    int deleteByExample(WorksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    int deleteByPrimaryKey(Integer worksId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    int insert(Works record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    int insertSelective(Works record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    List<Works> selectByExampleWithBLOBs(WorksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    List<Works> selectByExample(WorksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    Works selectByPrimaryKey(Integer worksId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    int updateByPrimaryKeySelective(Works record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(Works record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table startup_works
     *
     * @mbggenerated Tue May 10 17:08:56 CST 2016
     */
    int updateByPrimaryKey(Works record);
}