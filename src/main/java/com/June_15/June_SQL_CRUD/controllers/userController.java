package com.June_15.June_SQL_CRUD.controllers;


import com.June_15.June_SQL_CRUD.model.userModel;
import com.June_15.June_SQL_CRUD.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "api/v1/User")
public class userController {
    @Autowired
    userService user_Service;

    @RequestMapping(method = RequestMethod.POST)
    userModel insert(@RequestBody userModel user){
        return user_Service.save(user);
    }


//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    public String getHelloWorld1(){
//        return "Hello there!";
//    }@RequestMapping(value = "/hello", method = RequestMethod.POST)
//    public String getHelloWorld2(){
//        return "Hello there again!";
//
}

