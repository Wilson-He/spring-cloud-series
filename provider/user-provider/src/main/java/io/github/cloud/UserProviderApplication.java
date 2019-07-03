package io.github.cloud;

import io.github.common.model.UserBase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wilson
 * @date 2019/6/20
 **/
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class UserProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserProviderApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/")
    public UserBase home(@RequestParam Integer id) {
        System.out.println("invoke home");
        return new UserBase().setName("Wilson").setId(id);
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
}
