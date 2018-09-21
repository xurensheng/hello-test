package com.cinema.cms.cmstest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xurensheng
 * @desc:
 * @date 2018/9/18
 */
@RestController
public class HelloController {

    @Value("${cms.env}")
    private String env;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello, XuRenSheng, This env is " + env;
    }
}
