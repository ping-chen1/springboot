package com.cp.springbootmybatisflex.service.impl;

import com.cp.springbootmybatisflex.mapper.UserMapper;
import com.cp.springbootmybatisflex.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
}
