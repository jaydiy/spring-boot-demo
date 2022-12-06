package com.naive.mybatis.service;

import com.naive.mybatis.model.User;

import java.util.List;

/**
  * Author:   Chris
  * Date:     2022/12/5 16:17
  * Description: ${DESCRIPTION}
  */
public interface UserService{


    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> getAll();
}
