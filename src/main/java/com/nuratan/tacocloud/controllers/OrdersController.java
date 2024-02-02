package com.nuratan.tacocloud.controllers;

import com.nuratan.tacocloud.TacoOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Slf4j
@Controller
@SessionAttributes("tacoOrder")
@RequestMapping("/orders")
public class OrdersController {
    @GetMapping("/current")
    public String orderForm(){
        return "orderForm";
    }
    @PostMapping
    public String order(TacoOrder order, SessionStatus sessionStatus){
        log.info("Order submitted: {}", order);
        sessionStatus.setComplete();
        return "redirect:/";
    }
}
