package com.sxt.ytwl.mapper;

import com.sxt.ytwl.model.Driver;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DriverMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    int deleteByPrimaryKey(Integer driverid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    int insert(Driver record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    int insertSelective(Driver record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    Driver selectByPrimaryKey(Integer driverid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    int updateByPrimaryKeySelective(Driver record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    int updateByPrimaryKey(Driver record);

    List<Driver> getAllDriversByPage(@Param("page") Integer page,@Param("size") Integer size,@Param("keyword") String keyword);

    long getTotalDriver();
}