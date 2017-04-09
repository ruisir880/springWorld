package com.ray.dao;

import com.ray.model.UserInfo;

/**
 * Created by rui on 2017/4/9.
 */
public interface UserDao {
    UserInfo selectUserById(int userId);
}
