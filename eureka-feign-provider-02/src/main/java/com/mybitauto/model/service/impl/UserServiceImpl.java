package com.mybitauto.model.service.impl;

import com.mybitauto.model.entity.User;
import com.mybitauto.model.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService1")
public class UserServiceImpl implements UserService {

    @Override
    public User get(Integer id) {
        User user = new User();
        user.setId(id);
        user.setName("name"+id);
        return  user;
    }
}
