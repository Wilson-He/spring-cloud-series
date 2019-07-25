package io.github.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wilson
 * @date 2019/6/21
 **/
@SpringBootApplication
@EnableEurekaClient
@RestController
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

/*    @Bean
    public RouteLocator pathRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/user-consumer/**")
                        .and()
                        .header("token", "\\w+")
                        .filters(f -> f
                                .addResponseHeader("response-header", "head-val")
                                .stripPrefix(1))
                        .uri("lb://user-consumer"))
                .build();
    }*/
}
