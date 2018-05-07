package com.mybitauto.model.service;


import com.mybitauto.model.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient("userService")
public interface UserService {

    //@RequestMapping(method = RequestMethod.GET, value = "/add")
    //Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);


    @RequestMapping(method = RequestMethod.GET,value = "/hello/{id}")
    User get(@PathVariable("id") Integer id);
}
