package com.up.frontweb.controller;

import com.up.frontweb.module.Welcome;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/")
    public String greetingForm(Model model) {

        Welcome welcome = new Welcome();
        welcome.setContent1("每天撸代码玩游戏看电视剧吃饭睡觉上厕所思考");
        welcome.setContent2("服务器选定");
        welcome.setContent3("框架部署完成");
        welcome.setContent4("页面选定");
        welcome.setContent5("布局以及内容进行中");
        welcome.setContent6("这内容还没出来框架先要升级一个版本，好尴尬");
        model.addAttribute("welcome", welcome);
        return "welcome";
    }
}
