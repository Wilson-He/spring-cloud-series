package io.github.gateway;

import org.springframework.util.StringUtils;

import java.util.Arrays;

/**
 * @author Wilson
 * @date 2019/6/25
 **/
public class GatewayTest {
    public static void main(String[] args) {
        String tokenize = "321,321,   32112 ,32";
        System.out.println(Arrays.asList(StringUtils.tokenizeToStringArray(tokenize, ",")));
    }
}
