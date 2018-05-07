package com.test.service;

import com.test.bean.User;

import java.util.List;

public interface UserService {
    public List<User> findAllUsers() throws Exception;
}
