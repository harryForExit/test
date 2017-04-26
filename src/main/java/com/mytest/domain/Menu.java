package com.mytest.domain;

/**
 * Created by Administrator on 2017/4/26.
 * 菜单
 */
public class Menu {

    private Long id;

    private String menuName;

    private String url;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
