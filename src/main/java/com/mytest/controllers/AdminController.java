package com.mytest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/4/30.
 * 后台首页
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("")
    public String index(HttpServletRequest request, HttpServletResponse response){
        return "admin/main";
    }

    @RequestMapping("index")
    public String index1(HttpServletRequest request, HttpServletResponse response){
        System.out.println("111111111111111");
        return "admin/index";
    }
}
