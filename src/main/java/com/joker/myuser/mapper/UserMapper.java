package com.joker.myuser.mapper;

import com.joker.myuser.model.User;

import org.apache.ibatis.annotations.Param;

/**
 * @author: lijiawei04
 * @date: 2021/4/13 1:42 下午
 */
public interface UserMapper {

    /**
     * 增
     */
    int insert(@Param("user") User user);

    /**
     * 删
     */
    int deleteById(@Param("id") Long id);

    /**
     * 改
     */
    int updateById(@Param("user") User user);

    /**
     * 查
     */
    User selectById(@Param("id") Long id);

}
