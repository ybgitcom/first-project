package com.yb.firstproject.service.impl;

import com.yb.firstproject.dao.UserMapper;
import com.yb.firstproject.domain.User;
import com.yb.firstproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by yb
 * Date:2018/4/24
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper ;

    @Override
    public int insertUser(User user) {
        userMapper.insertSelective(user) ;
        return 0;
    }
}
