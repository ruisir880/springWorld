package com.ray.security;

import com.ray.model.UserInfo;
import com.ray.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by Ray Rui on 4/12/2017.
 */
@Service("myUserDetailsService")
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserService userService;

    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserInfo userInfo = userService.findUserByName(s);
       // UserDetails userDetails = new User();
       // return null;
        return null;
    }
}
