package com.example.festivalfood.global.metrics;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

@Component
public class CustomMetricRecorder {

    private final Counter paymentSleepCounter;
    private final Counter paymentErrorCounter;

    public CustomMetricRecorder(MeterRegistry meterRegistry) {
        this.paymentSleepCounter = Counter.builder("festival_payment_sleep_total")
                .description("Total count of delayed payment API calls")
                .register(meterRegistry);

        this.paymentErrorCounter = Counter.builder("festival_payment_error_total")
                .description("Total count of payment error API calls")
                .register(meterRegistry);
    }

    public void increasePaymentSleepCount() {
        paymentSleepCounter.increment();
    }

    public void increasePaymentErrorCount() {
        paymentErrorCounter.increment();
    }
}