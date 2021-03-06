package com.sxt.ytwl.mapper;

import com.sxt.ytwl.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    int deleteByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    User selectByPrimaryKey(Integer userid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Feb 22 19:24:53 CST 2019
     */
    int updateByPrimaryKey(User record);

    User getByAccount(String account);

    List<User> getAllUsersByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("keyword") String keyword);

    long getTotal(@Param("keyword") String keyword);

    Integer authorizeUser(Integer userid);

    Integer updateAuthorizeUserBatch();

    Integer checkAccount(String account);

    //User getByAccountNR(String account);
}