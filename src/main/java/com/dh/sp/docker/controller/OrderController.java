package com.dh.sp.docker.controller;

import com.dh.sp.docker.dto.OrderDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    @GetMapping(value = "/{orderId}")
    public ResponseEntity<OrderDto> findOrderById(@PathVariable final Integer orderId){
        log.info("start findOrderById");
        final OrderDto orderDto =  OrderDto.builder()
                .creditCard("232 3132 1312 3123")
                .creditCartType("VISA")
                .customerId(UUID.randomUUID())
                .id(orderId).build();
        log.info("orderDto: {}", orderDto);
        log.info("end findOrderById");
        return ResponseEntity.ok(orderDto);
    }
}
