package io.github.wilson.web;

import io.github.wilson.clients.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Email miles02@163.com
 *
 * @author fangzhipeng
 * create 2018-07-09
 **/
@RestController
public class HiController {

    @Resource
    UserService userService;

    @GetMapping(value = "/index")
    public String index() {
        return userService.index();
    }
}