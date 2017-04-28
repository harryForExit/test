package com.mytest.controllers;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/4/26.
 * 主页controller
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(HttpRequest request) {

        return "front/index";
    }

    //这里指定是条状的jsp界面
    @RequestMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("sb", "this is my fries测试不是好领导了副经理看fjldj 1123123");
        return "index";
    }
}
