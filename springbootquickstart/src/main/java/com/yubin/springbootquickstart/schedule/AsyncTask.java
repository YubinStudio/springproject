package com.yubin.springbootquickstart.schedule;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @program: springproject
 * @description: 异步任务
 * @author: jyb
 * @create: 2019-12-11 15:33
 **/
@Component
@Async
public class AsyncTask {

    public void task1() throws InterruptedException {
        long begin = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println("task1耗时:" + (end - begin));
    }

    public void task2() throws InterruptedException {
        long begin = System.currentTimeMillis();
        Thread.sleep(2000);
        long end = System.currentTimeMillis();
        System.out.println("task2耗时:" + (end - begin));
    }

    public void task3() throws InterruptedException {
        long begin = System.currentTimeMillis();
        Thread.sleep(3000);
        long end = System.currentTimeMillis();
        System.out.println("task3耗时:" + (end - begin));
    }

    public Future<String> task4() throws InterruptedException {
        long begin = System.currentTimeMillis();
        Thread.sleep(2000);
        long end = System.currentTimeMillis();
        System.out.println("task4耗时:" + (end - begin));
        return new AsyncResult<>("task4");
    }

    public Future<String> task5() throws InterruptedException {
        long begin = System.currentTimeMillis();
        Thread.sleep(3000);
        long end = System.currentTimeMillis();
        System.out.println("task5耗时:" + (end - begin));
        return new AsyncResult<>("task5");
    }

    public Future<String> task6() throws InterruptedException {
        long begin = System.currentTimeMillis();
        Thread.sleep(4000);
        long end = System.currentTimeMillis();
        System.out.println("task6耗时:" + (end - begin));
        return new AsyncResult<>("task6");
    }

}
