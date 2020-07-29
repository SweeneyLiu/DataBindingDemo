package com.lsw.demo.databindingdemo;

/**
 * Create by liushuwei on 2020/7/21
 */
public class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    //两者存在优先调用
    public String getName() {
        return name;
    }
    //getter方法不存在会调用
    public String name() {
        return "name";
    }
}
