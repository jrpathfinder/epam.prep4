package com.epam.javacc.microservices;

import com.netflix.servo.DefaultMonitorRegistry;
import com.netflix.servo.monitor.BasicCounter;
import com.netflix.servo.monitor.BasicGauge;
import com.netflix.servo.monitor.Counter;
import com.netflix.servo.monitor.Gauge;
import com.netflix.servo.monitor.MaxGauge;
import com.netflix.servo.monitor.MonitorConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OneApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(OneApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Counter counter = new BasicCounter(MonitorConfig.builder("test").build());
        counter.increment();

        Gauge<Double> gauge = new BasicGauge<>(MonitorConfig.builder("test")
                .build(), () -> 2.32);

        DefaultMonitorRegistry.getInstance().register(gauge);

        MaxGauge gauge2 = new MaxGauge(MonitorConfig.builder("test").build());

        gauge2.update(1);
    }
}