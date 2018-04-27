package com.yb.firstproject.web.controller;

import com.yb.firstproject.domain.User;
import com.yb.firstproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * created by yb
 * Date:2018/4/24
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired(required = false)
    private UserService userService ;

    @RequestMapping("/insert")
    public ModelAndView insertTest1() {
        User u1 = new User() ;
        u1.setUsername("China");
        u1.setAge(24) ;
        userService.insertUser(u1) ;
        System.out.println("success");
        ModelAndView modelAndView = new ModelAndView("/index.jsp") ;
        return modelAndView ;
    }
}
