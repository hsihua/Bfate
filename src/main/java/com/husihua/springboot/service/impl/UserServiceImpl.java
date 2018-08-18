package com.husihua.springboot.service.impl;

import com.husihua.springboot.service.UserService;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    @JmsListener(destination = "")
    public void getUser() {

    }
}
