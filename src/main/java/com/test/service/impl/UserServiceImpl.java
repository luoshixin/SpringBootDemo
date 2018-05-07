package com.test.service.impl;

import com.test.bean.User;
import com.test.dao.UserMapper;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;// 这里报错属于正常现象，不用管

    @Override
    public List<User> findAllUsers() throws Exception {
        List<User> userList = userMapper.selectByExample(null);
        return userList;
    }
}
