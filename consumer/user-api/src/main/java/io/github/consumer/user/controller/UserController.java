package io.github.consumer.user.controller;

import io.github.common.model.UserBase;
import io.github.common.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Wilson
 * @date 2019/6/24
 **/
@RestController
@RequestMapping("/")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/index")
    public String index() {
        return userService.index();
    }

    @GetMapping("/id")
    public UserBase id(@RequestParam Integer id) {
        return userService.get(id);
    }

    @GetMapping("/hi")
    public String hi() {
        return "hi";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/user/hello")
    public String userHello() {
        return "userHello";
    }

    @GetMapping("/demo/hello")
    public String demoHello() {
        return "demoHello";
    }
}
