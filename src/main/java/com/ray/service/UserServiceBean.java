package com.ray.service;

import com.ray.dao.UserDao;
import com.ray.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rui on 2017/4/9.
 */
@Service
public class UserServiceBean implements UserService {
    @Autowired
    private UserDao userDao;

    public UserInfo findUserById(int id) {
        return userDao.selectUserById(id);
    }
}
