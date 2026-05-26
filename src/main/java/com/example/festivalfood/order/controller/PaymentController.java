package com.example.festivalfood.order.controller;

import com.example.festivalfood.order.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/orders/{orderId}/payments/sleep")
    public ResponseEntity<String> sleepPayment(@PathVariable Long orderId) {
        paymentService.sleepPayment(orderId);
        return ResponseEntity.ok("결제 지연 테스트 완료");
    }

    @PostMapping("/orders/{orderId}/payments/error")
    public ResponseEntity<String> errorPayment(@PathVariable Long orderId) {
        paymentService.errorPayment(orderId);
        return ResponseEntity.ok("도달하지 않음");
    }
}