package com.davin.myshop.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.davin.myshop.commons.domain.TbUser;
import com.davin.myshop.service.user.api.TbUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/user")
public class TbUserController {

    @Reference(version = "${services.versions.user.v1}")
    private TbUserService tbUserService;

    @RequestMapping("/")
    String get() {
        //mapped to hostname:port/home/
        return "Hello from get ";
    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        return "hello";
//        List<TbUser> tbUsers = tbUserService.selectAll();
//        model.addAttribute("tbUsers", tbUsers);
//        return "user/list";
    }
}