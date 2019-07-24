package io.github.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Wilson
 * @date 2019/7/9
 **/
@Service
public class UserService {
    @Resource
    RestTemplate restTemplate;

    public String index() {
        return restTemplate.getForObject("http://user-service/index", String.class);
    }
}
