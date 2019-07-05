package io.github.common.service;

import io.github.common.model.UserBase;
import io.github.common.service.fallback.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Wilson
 * @date 2019/6/28
 **/
@FeignClient(value = "user-service", fallback = UserServiceFallback.class)
public interface UserService {
    @GetMapping
    UserBase get(@RequestParam Integer id);

    @GetMapping("/index")
    String index();
}
