package io.github.cloud.service.impl;

import io.github.common.model.UserBase;
import io.github.common.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Wilson
 * @date 2019/7/2
 **/
//@RestController
public class UserServiceImpl implements UserService {
    @Override
    public UserBase get(@RequestParam Integer id) {
        return new UserBase().setId(id).setName("Wilson");
    }
}
