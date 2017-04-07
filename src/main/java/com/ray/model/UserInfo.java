package com.ray.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by rui on 2017/4/5.
 */
public class UserInfo implements Serializable {
    @NotNull(message = "name can not be empty")
    @Size(min = 5,max = 20)
    private String userName;

    @NotNull
    private String email;

    @NotNull
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
