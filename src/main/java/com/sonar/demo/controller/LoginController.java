package com.sonar.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @PostMapping("/insert")
    public String insert(String username){
        return "账号"+ username +"创建成功";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(@RequestParam String username){
        return "账号"+ username +"登录成功";
    }
}
