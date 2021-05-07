package com.example.myuser.controller;

import com.example.myuser.mapper.UserMapper;
import com.example.myuser.model.User;
import com.example.myuser.request.InsertUserRequest;
import com.example.myuser.util.DateUtil;

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
@RequestMapping("/test")
public class UserController {

    @Resource
    private UserMapper userMapper;

    @PostMapping("/insert")
    public String insertUser(@RequestBody InsertUserRequest request) {
        User user = new User()
                .setName(request.getName())
                .setAge(request.getAge())
                .setBirthday(DateUtil.string2LocalDateTimeByDefault(request.getBirthday()));

        userMapper.insert(user);

        return "ok";
    }

}
