package io.github.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import static org.springframework.cloud.gateway.support.ServerWebExchangeUtils.GATEWAY_ORIGINAL_REQUEST_URL_ATTR;

/**
 * @author Wilson
 * @date 2019/7/24
 **/
@Component
@Slf4j
public class GatewayRecordFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("GatewayRecordFilter:{},参数:{}", exchange.getRequest().getPath().value(), exchange.getRequest().getQueryParams().toSingleValueMap());
        log.info("GatewayRecordFilter:{},参数:{}", exchange.getAttribute(GATEWAY_ORIGINAL_REQUEST_URL_ATTR), exchange.getRequest().getQueryParams().toSingleValueMap());
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -100;
    }
}
