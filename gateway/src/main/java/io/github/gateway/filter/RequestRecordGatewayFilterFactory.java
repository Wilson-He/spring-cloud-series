package io.github.gateway.filter;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.cloud.gateway.support.ServerWebExchangeUtils;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static org.springframework.cloud.gateway.support.ServerWebExchangeUtils.GATEWAY_ORIGINAL_REQUEST_URL_ATTR;

/**
 * @author Wilson
 * @date 2019/6/24
 **/
@Slf4j
@Component
public class RequestRecordGatewayFilterFactory extends AbstractGatewayFilterFactory<RequestRecordGatewayFilterFactory.Config> {

    public static final String PARTS_KEY = "print";

    public RequestRecordGatewayFilterFactory() {
        super(Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList(PARTS_KEY);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            if (config.print != null && config.print) {
                log.info("requestRecord1:{},参数:{}", exchange.getRequest().getPath().value(), exchange.getRequest().getQueryParams().toSingleValueMap());
                log.info("requestRecord1:{},参数:{}", exchange.getAttribute(GATEWAY_ORIGINAL_REQUEST_URL_ATTR), exchange.getRequest().getQueryParams().toSingleValueMap());
            }
            return chain.filter(exchange);
        };
    }

    @Override
    public GatewayFilter apply(Consumer<Config> consumer) {
        Config config = newConfig();
        consumer.accept(config);
        return apply(config);
    }

    @ToString
    public static class Config {
        private Boolean print;

        public boolean isPrint() {
            return print;
        }

        public void setPrint(boolean print) {
            this.print = print;
        }
    }
}
