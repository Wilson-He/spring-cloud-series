package io.github.wilson.clients;

import io.github.wilson.clients.fallback.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Email miles02@163.com
 *
 * @author fangzhipeng
 * create 2018-07-09
 **/
@FeignClient(value = "service-hi", fallback = UserServiceFallback.class)
public interface UserService {
    @GetMapping(value = "/index")
    String index();
}

