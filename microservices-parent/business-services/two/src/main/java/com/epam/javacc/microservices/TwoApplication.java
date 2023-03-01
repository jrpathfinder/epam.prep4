package com.epam.javacc.microservices;

import com.netflix.servo.monitor.BasicTimer;
import com.netflix.servo.monitor.MonitorConfig;
import com.netflix.servo.monitor.Stopwatch;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import static java.util.concurrent.TimeUnit.SECONDS;

@SpringBootApplication
@EnableEurekaClient
public class TwoApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(TwoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        BasicTimer timer = new BasicTimer(MonitorConfig.builder("test").build(), SECONDS);
        Stopwatch stopwatch = timer.start();

        SECONDS.sleep(1);
        timer.record(2, SECONDS);
        stopwatch.stop();
    }
}