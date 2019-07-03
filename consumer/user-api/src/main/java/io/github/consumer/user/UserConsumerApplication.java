package io.github.consumer.user;

import io.github.common.model.UserBase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import javax.annotation.Resource;

/**
 * @author Wilson
 * @date 2019/6/24
 **/
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class UserConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplication.class, args);
    }

    @Resource
    private WebClient.Builder webClientBuilder;

    @GetMapping("/index")
    public Flux index() {
        return webClientBuilder.build().get()
                .uri("localhost:8201/user/list/a")
                .retrieve()
                .bodyToFlux(UserBase.class);
    }
}
