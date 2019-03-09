package com.sxt.ytwl.mapper;

import com.sxt.ytwl.model.Scheduling;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SchedulingMapper {
    int deleteByPrimaryKey(Integer schedulingid);

    int insert(Scheduling record);

    int insertSelective(Scheduling record);

    Scheduling selectByPrimaryKey(Integer schedulingid);

    int updateByPrimaryKeySelective(Scheduling record);

    int updateByPrimaryKey(Scheduling record);

    List<Scheduling> getAllByPage(@Param("page") Integer page, @Param("size") Integer size);

    long getTotal();
}