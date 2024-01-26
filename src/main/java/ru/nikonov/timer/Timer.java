package ru.nikonov.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Timer {

    @Scheduled(fixedRateString = "${timer.rate:1000}")
    void timer(){
        System.out.println(LocalDateTime.now());
    }
}
