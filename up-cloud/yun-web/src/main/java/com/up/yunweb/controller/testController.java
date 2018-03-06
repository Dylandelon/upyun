package com.up.yunweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @RequestMapping(value = {"/"})
    public String test1(){

        System.out.println("/test1");
        return "test1";
    }
    @RequestMapping(value = {"/api"})
    public String test2(){

        System.out.println("/api/test2");
        return "test2";
    }
    @RequestMapping(value = {"/notify"})
    public String test3(){

        System.out.println("/api/test3");
        return "test3";
    }
}
