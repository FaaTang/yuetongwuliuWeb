package com.sxt.ytwl.mapper;

import com.sxt.ytwl.model.Truckteam;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface TruckteamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table truckteam
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    int deleteByPrimaryKey(Integer teamid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table truckteam
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    int insert(Truckteam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table truckteam
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    int insertSelective(Truckteam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table truckteam
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    Truckteam selectByPrimaryKey(Integer teamid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table truckteam
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    int updateByPrimaryKeySelective(Truckteam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table truckteam
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    int updateByPrimaryKey(Truckteam record);

    List<Truckteam> getAllTeam(@Param("page") Integer page, @Param("size") Integer size, @Param("daterange") Date[] daterange, @Param("keyword") String keyword);

    Integer getTotal(@Param("daterange") Date[] daterange, @Param("keyword") String keyword);
}