package com.ray.service;

import com.ray.model.UserInfo;

/**
 * Created by rui on 2017/4/9.
 */
public interface UserService {
    UserInfo findUserById(int id);

    UserInfo findUserByName(String name);
}
