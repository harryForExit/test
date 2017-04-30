package com.mytest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/4/26.
 * 主页controller
 */
@Controller
public class HomeController {
    @RequestMapping("")
    public String index() {

        return "front/index";
    }

    //这里指定是条状的jsp界面
    @RequestMapping(value = "/index")
    public String index(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("sb", "this is my fries测试不是好领导了副经理看fjldj");
        return "front/index";
    }
}
