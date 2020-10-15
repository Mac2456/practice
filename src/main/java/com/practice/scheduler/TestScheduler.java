package com.practice.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestScheduler {

    @Scheduled(cron = "${cron.test}")
    public void testScheduler(){
      //  log.info("hello world");

        // method call
    }
}
