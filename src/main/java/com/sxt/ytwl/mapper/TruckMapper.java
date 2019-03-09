package com.sxt.ytwl.mapper;

import com.sxt.ytwl.model.Truck;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface TruckMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table truck
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    int deleteByPrimaryKey(Integer truckid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table truck
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    int insert(Truck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table truck
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    int insertSelective(Truck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table truck
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    Truck selectByPrimaryKey(Integer truckid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table truck
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    int updateByPrimaryKeySelective(Truck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table truck
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    int updateByPrimaryKey(Truck record);

    List<Truck> queryByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("daterange") Date[] daterange,@Param("type") String type);

    List<String> getByTypes();

    long getTotal(@Param("daterange") Date[] daterange, @Param("type") String type);

    List<Truck> getTrucksForTonnage(@Param("state") Integer state);

    List<Truck> getAllByPageCapaCity(@Param("page") Integer page, @Param("size") Integer size, @Param("state") Integer state);

    long getTotalCapaCity(@Param("state") Integer state);
}