package com.husihua.springboot.redis;

import com.husihua.springboot.Entiy.JedisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Jedis;

@Component
public class JedisImpl implements JedisM {
    @Autowired
    private JedisConfig jedisConfig;
    @Override
    public String set(String key, String value) {

        Jedis jedis = new Jedis(jedisConfig.getHost(), jedisConfig.getPort(),jedisConfig.getTimeout());
        String set = jedis.set(key, value);

        return set;
    }
}
