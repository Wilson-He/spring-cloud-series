package io.github.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * token全局拦截器
 *
 * @author Wilson
 * @date 2019/6/24
 **/
@Slf4j
@Component
@ConditionalOnProperty(value = "spring.cloud.gateway.discovery.locator.global-token-filter-enabled", havingValue = "true")
public class GlobalTokenFilter implements GlobalFilter, Ordered {
    @PostConstruct
    public void init() {
        log.info("GlobalTokenFilter init finish");
    }

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        Map<String, String> headers = exchange.getRequest().getHeaders().toSingleValueMap();
        boolean hasToken = headers.containsKey("token") && StringUtils.isNotBlank(headers.get("token"));
        if (!hasToken) {
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete();
        }
        log.info("token value:" + headers.get("token"));
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -100;
    }
}
