package com.joker.myuser.model;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author: lijiawei04
 * @date: 2021/4/13 1:36 下午
 */
@Data
@Accessors(chain = true)
public class User {

    private Long id;

    private String name;

    private Integer age;

    private LocalDateTime birthday;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
