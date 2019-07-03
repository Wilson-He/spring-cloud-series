package io.github.consumer.user.controller;

import io.github.common.model.UserBase;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author Wilson
 * @date 2019/6/24
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/{id}")
    public UserBase index(@PathVariable @RequestParam Integer id) {
        return new UserBase().setId(id).setName(RandomStringUtils.random(5));
    }

    @GetMapping("/list/a")
    public UserBase listA() {
        return new UserBase().setId(1).setName("a");
    }

    @GetMapping("/list/b")
    public UserBase listB() {
        return new UserBase().setId(1).setName("b");
    }
}
