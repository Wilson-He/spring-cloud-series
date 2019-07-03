package io.github.apollo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: Wilson
 * @date: 2019/5/7
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ApolloConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApolloConfigApplication.class);
    }
}