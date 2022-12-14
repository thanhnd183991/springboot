package org.thanh.springboot.scheduler;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class StartScheduler {

    @Scheduled(fixedDelay = 1000)
    public void scheduleExample() throws InterruptedException {
        Thread.sleep(1000);
        log.info("call");
    }


}
