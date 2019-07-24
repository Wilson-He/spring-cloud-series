package io.github.cloud.service.impl;

import io.github.common.model.UserBase;
import io.github.common.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wilson
 * @date 2019/7/2
 **/
@RestController
public class UserServiceImpl implements UserService {
    @Value("${server.port}")
    private String port;

    @Override
    public String index() {
        System.err.println("port: " + port);
        return "index";
    }

    @Override
    public UserBase get(@RequestParam Integer id) {
        System.err.println("port: " + port);
        return new UserBase().setName("Wilson").setId(id);
    }
}
