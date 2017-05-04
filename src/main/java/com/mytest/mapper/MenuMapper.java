package com.mytest.mapper;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/26.
 * 菜单Mapper
 */
@Component
public interface MenuMapper {
    List<Map<String,Object>> findAll();
}
