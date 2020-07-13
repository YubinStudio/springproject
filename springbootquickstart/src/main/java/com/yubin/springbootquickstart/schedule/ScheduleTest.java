package com.yubin.springbootquickstart.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: springproject
 * @description:
 * @author: jyb
 * @create: 2019-12-11 14:29
 **/
@Component
@Slf4j
public class ScheduleTest {

    @Scheduled(cron = "0 0/1 * * * ?")
    public void minuteExport() {
        log.debug("每分钟执行一次的任务：" + getDate());
    }

//    @Scheduled(fixedRate = 5000)
    public void fiveSecondExport() {
        log.error("每5秒执行一次：" + getDate());
    }

//    @Scheduled(cron = "0/2 * * * * ?")
    public void twoSecondExport() {
        log.info("每2秒执行一次：" + getDate());
    }

//    @Scheduled(cron = "0 37 14 ? * *")
    public void regularTimeExport() {
        log.info("每天上午14点37分执行：" + getDate());
    }

    private String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }
}
