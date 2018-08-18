package com.husihua.springboot.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
@Async
public class AsyncTask  {

    public Future<String> task1() throws Exception{
        long b = System.currentTimeMillis();
        Thread.sleep(1000);
         long a= System.currentTimeMillis();

        System.out.println("task1"+(a-b));
        return  new AsyncResult<>("任务1");
    }

    public Future<String> task2() throws Exception{
        long b = System.currentTimeMillis();
        Thread.sleep(2000);
        long a= System.currentTimeMillis();

        System.out.println("task2"+(a-b));
        return new AsyncResult<>("任务2");
    }

}
