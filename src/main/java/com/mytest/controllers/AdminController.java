package com.mytest.controllers;

import com.mytest.domain.Menu;
import com.mytest.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/30.
 * 后台首页
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private MenuMapper menuMapper;

    @RequestMapping("")
    public String index(HttpServletRequest request, HttpServletResponse response){
        return "admin/main";
    }

    @RequestMapping("index")
    public String index1(HttpServletRequest request, HttpServletResponse response){
        System.out.println("111111111111111");
        return "admin/index";
    }

    @RequestMapping("text")
    public String text(HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("text","这是一个文章列表");
        List<Map<String,Object>> list =  menuMapper.findAll();
        list.forEach(i -> System.out.println(i.toString()));
        return "admin/text";
    }
}
