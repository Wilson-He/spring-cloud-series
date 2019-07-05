package io.github.cloud.service.impl;

import io.github.common.model.UserBase;
import io.github.common.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wilson
 * @date 2019/7/2
 **/
@RestController
public class UserServiceImpl implements UserService {
    @Override
    public String index() {
        return "index";
    }

    @Override
    public UserBase get(@RequestParam Integer id) {
        System.out.println("invoke home");
        return new UserBase().setName("Wilson").setId(id);
    }
}
