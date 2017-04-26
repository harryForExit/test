package com.mytest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/4/26.
 * 主页controller
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello World!";
    }
}
