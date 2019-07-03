package io.github.gateway;

import io.github.gateway.filter.RequestParamGatewayFilterFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

/**
 * @author Wilson
 * @date 2019/6/21
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

/*    @Bean
    public RouteLocator headerRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .header("Authorization", "\\w+")
                        .and()
                        .path("/user/**")
                        .uri("lb://user-consumer")
                        .filters(new AddResponseHeaderGatewayFilterFactory().apply(e -> e.setName("filterHeader").setValue("headVal")),
                                new RequestParamGatewayFilterFactory().apply(e -> e.setPrint(true))))
//                        .filters(new AddRequestHeaderGatewayFilterFactory().apply(e -> e.setName("Authorization").setValue("1"))))
                .build();
    }*/

/*    @Bean
    public RequestParamGatewayFilterFactory requestParamGatewayFilterFactory() {
        return new RequestParamGatewayFilterFactory();
    }*/

}
