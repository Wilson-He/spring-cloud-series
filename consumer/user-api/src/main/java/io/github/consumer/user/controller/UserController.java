package io.github.consumer.user.controller;

import io.github.consumer.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
