package com.up.yunservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = {"/t1"})
    public String mytest1(){
        System.out.println("mytest1");
        return "mytest1";
    }
    @RequestMapping(value = {"/app"})
    public String mytestapp(){
        System.out.println("mytestapp");
        return "mytestapp";
    }
    @RequestMapping(value = {"/notify"})
    public String mytestnotify(){
        System.out.println("mytestnotify");
        return "mytestnotify";
    }
}
