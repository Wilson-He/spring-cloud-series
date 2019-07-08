package io.github.wilson.clients.fallback;

import io.github.wilson.clients.UserService;
import org.springframework.stereotype.Component;

/**
 * Email miles02@163.com
 *
 * @author fangzhipeng
 * create 2018-07-09
 **/
@Component
public class UserServiceFallback implements UserService {
    @Override
    public String index() {
        return "index fallback";
    }
}