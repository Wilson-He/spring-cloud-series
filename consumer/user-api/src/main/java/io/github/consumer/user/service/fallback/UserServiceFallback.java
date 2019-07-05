package io.github.consumer.user.service.fallback;

import io.github.consumer.user.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Wilson
 * @date 2019/7/3
 **/
@Component
public class  UserServiceFallback implements UserService {

    @PostConstruct
    public void init(){
        System.out.println("UserServiceFallback init");
    }

    @Override
    public String index() {
        return "index fallback";
    }
}
