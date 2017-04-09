package com.ray.dao;

import com.ray.model.UserInfo;
import com.ray.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by rui on 2017/4/9.
 */
public class UserDaoTest extends BaseTest{
    @Autowired
    private UserService userService;

    @Test
    public void selectUserByIdTest(){
        UserInfo user = userService.findUserById(1);
        System.out.println(user.getUserName() + ":" + user.getPassword());
    }
}