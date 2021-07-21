package com.joker.myuser.controller;

import com.joker.myuser.mapper.UserMapper;
import com.joker.myuser.model.User;
import com.joker.myuser.request.InsertUserRequest;
import com.joker.myuser.util.DateUtil;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: lijiawei04
 * @date: 2021/4/13 1:56 下午
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @PostMapping("/")
    public String insertUser(@RequestBody InsertUserRequest request) {
        User user = new User()
                .setName(request.getName())
                .setAge(request.getAge())
                .setBirthday(DateUtil.string2LocalDateTimeByDefault(request.getBirthday()));

        return String.valueOf(userMapper.insert(user));
    }

    @DeleteMapping("{userId}")
    public String deleteById(@PathVariable("userId") Long userId) {
        return String.valueOf(userMapper.deleteById(userId));
    }

    @GetMapping("{userId}")
    public User getById(@PathVariable("userId") Long userId) {
        return userMapper.selectById(userId);
    }

}
