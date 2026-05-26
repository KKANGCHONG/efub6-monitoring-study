package com.example.festivalfood.order.service;

import com.example.festivalfood.global.metrics.CustomMetricRecorder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final CustomMetricRecorder customMetricRecorder;

    public void sleepPayment(Long orderId) {
        customMetricRecorder.increasePaymentSleepCount();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Sleep interrupted");
        }
    }

    public void errorPayment(Long orderId) {
        customMetricRecorder.increasePaymentErrorCount();
        throw new RuntimeException("의도적으로 발생시킨 결제 실패");
    }
}