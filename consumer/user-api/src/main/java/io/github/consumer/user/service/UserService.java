package io.github.consumer.user.service;

import io.github.consumer.user.service.fallback.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Wilson
 * @date 2019/6/28
 **/
@FeignClient(value = "user-service", fallback = UserServiceFallback.class)
public interface UserService {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String index();
}
