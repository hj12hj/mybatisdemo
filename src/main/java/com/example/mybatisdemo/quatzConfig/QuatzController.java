package com.example.mybatisdemo.quatzConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.ScheduledFuture;

/**
 * @ProjectName: mybatisdemo
 * @Package: com.example.mybatisdemo.quatzConfig
 * @ClassName: QuatzController
 * @Author: hejie
 * @Description:
 * @Date: 2021/8/17 10:53 下午
 * @Version: 1.0
 */
@RestController
public class QuatzController {

    @Autowired
    ThreadPoolTaskScheduler threadPoolTaskScheduler;

    private ScheduledFuture <?> future;

    @GetMapping("/start")
  public   String  task1(){
      future  =  threadPoolTaskScheduler.schedule(new Task1(), new Trigger() {
            @Override
            public Date nextExecutionTime(TriggerContext triggerContext) {
                return new CronTrigger("0/2 * * * * ?").nextExecutionTime(triggerContext);
            }
        });

      return "Start successfully!";
    }

    @GetMapping("/stop")
    public String  stop(){

        future.cancel(true);

        return "Stop successfully!";
    }

}
