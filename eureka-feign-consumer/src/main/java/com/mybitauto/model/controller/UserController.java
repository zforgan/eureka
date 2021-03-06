package com.mybitauto.model.controller;

import com.mybitauto.model.entity.User;
import com.mybitauto.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    //@Qualifier("client01")
    UserService userService;

    @RequestMapping(method = RequestMethod.GET,value = "/hello/{id}")
    public User get(@PathVariable("id") Integer id){
        for(int i=0;i<10;i++){
            userService.get(i);
        }

        return  userService.get(id);
    }

}
