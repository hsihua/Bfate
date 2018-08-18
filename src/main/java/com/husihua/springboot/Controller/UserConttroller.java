package com.husihua.springboot.Controller;

import com.husihua.springboot.Entiy.Config;
import com.husihua.springboot.Entiy.User;
import com.husihua.springboot.redis.JedisM;
import com.husihua.springboot.task.AsyncTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.Future;

@RestController
public class UserConttroller {
    @Autowired
    private JedisM jedisM;
    @Value("${test.name}")
    private String name1;

    @Autowired
    private AsyncTask asyncTask;

    @Autowired
    private User user;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/user/{id}")
    public Object getUser(@PathVariable(value = "id") String userId) {
        User user = new User();


        user.setDate(new Date());
        user.setPwd("111111111");
        user.setSex("男");
        user.setDate(new Date());
        user.setUserName("");
        return user;


    }

    @GetMapping("/html")
    public Object getHtml() {

        String set = jedisM.set("test", "husihua");
        System.out.println(set);
        return "hello";
    }

    @GetMapping("/properties")
    public Object getProperties() {

        return user;
    }

    @GetMapping("/async")
    public Object getAsync() {
        try {
            long a = System.currentTimeMillis();
            Future<String> t1 = asyncTask.task1();
            Future<String> t2 = asyncTask.task2();
            if (t1.isDone() && t2.isDone()) {

            }
            long b = System.currentTimeMillis();
            return b - a;
        } catch (Exception e) {
            return null;
        }

    }

}
