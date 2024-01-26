package ru.nikonov;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@ConditionalOnProperty(name = "timer.enabled", havingValue = "true")
@Configuration
@ComponentScan
public class TimerAutoConfiguration {
}
