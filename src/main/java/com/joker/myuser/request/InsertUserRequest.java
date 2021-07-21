package com.joker.myuser.request;

import lombok.Data;

/**
 * @author: lijiawei04
 * @date: 2021/4/13 1:56 下午
 */
@Data
public class InsertUserRequest {

    private String name;

    private Integer age;

    private String birthday;

}
