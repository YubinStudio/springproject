package com.yubin.springbootquickstart.controller;

import com.yubin.springbootquickstart.schedule.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * @program: springproject
 * @description: 异步任务测试
 * @author: jyb
 * @create: 2019-12-11 16:36
 **/
@RestController
public class AsyncTaskController {

    Map<String, Object> params = new HashMap<>();

    @Autowired
    private AsyncTask asyncTask;

    @GetMapping("api/v1/async")
    public Map<String, Object> AsyncTaskTest() throws InterruptedException {
        long begin = System.currentTimeMillis();
        asyncTask.task1();
        asyncTask.task2();
        asyncTask.task3();
        Future<String> task4 = asyncTask.task4();
        Future<String> task5 = asyncTask.task5();
        Future<String> task6 = asyncTask.task6();
        for (; ; ) {
            if (task4.isDone() && task5.isDone() && task6.isDone()) {
                break;
            }
        }

        long end = System.currentTimeMillis();
        params.clear();
        long total = end - begin;
        params.put("test", "AsyncTaskController");
        System.out.println("执行总耗时" + total);
        params.put("执行总耗时", total);
        return params;
    }

}
