package io.github.ribbon.controller;

import io.github.ribbon.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Wilson
 * @date 2019/7/9
 **/
@RestController
@RequestMapping("/")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/name")
    public String get() {
        return userService.index();
    }

}
