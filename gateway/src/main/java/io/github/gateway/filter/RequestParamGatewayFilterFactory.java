package io.github.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Wilson
 * @date 2019/6/24
 **/
@Slf4j
@Component
public class RequestParamGatewayFilterFactory extends AbstractGatewayFilterFactory<RequestParamGatewayFilterFactory.Config> {

    public static final String PARTS_KEY = "print";

    public RequestParamGatewayFilterFactory() {
        super(Config.class);
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Arrays.asList(PARTS_KEY);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            if (config.print) {
                ServerHttpRequest request = exchange.getRequest();
                log.info("url:{},参数:{}", request.getPath().value(), request.getQueryParams().toSingleValueMap());
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

    public static class Config {
        private boolean print;

        public boolean isPrint() {
            return print;
        }

        public void setPrint(boolean print) {
            this.print = print;
        }
    }
}
