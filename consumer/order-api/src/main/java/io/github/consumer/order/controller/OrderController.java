package io.github.consumer.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wilson
 * @date 2019/7/23
 **/
@RestController
@RequestMapping("/")
public class OrderController {
    @GetMapping("/order")
    public String order(){
        return "order";
    }
}
