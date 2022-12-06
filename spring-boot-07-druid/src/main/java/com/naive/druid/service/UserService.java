package com.naive.druid.service;

import com.naive.druid.model.User;

import java.util.List;

/**
  * Author:   Chris
  * Date:     2022/12/5 21:18
  * Description: ${DESCRIPTION}
  */
public interface UserService{


    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> findAll();

}
