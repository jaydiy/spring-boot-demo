package com.naive.mybatis.model;

import lombok.Data;

/**
  * Author:   Chris
  * Date:     2022/12/5 16:17
  * Description: ${DESCRIPTION}
  */
@Data
public class User {
    private Integer id;

    private String name;

    private Integer age;

    private Byte gender;

    private String job;
}