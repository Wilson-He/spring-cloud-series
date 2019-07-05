package io.github.common.service.fallback;

import io.github.common.model.UserBase;
import io.github.common.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Wilson
 * @date 2019/7/3
 **/
@Component
public class UserServiceFallback implements UserService {

    @PostConstruct
    public void init(){
        System.out.println("UserServiceFallback init");
    }

    @Override
    public UserBase get(Integer id) {
        return new UserBase().setName("get fallback");
    }

    @Override
    public String index() {
        return "index fallback";
    }
}
