package com.service.iocservice.controller;

import org.springframework.stereotype.Component;


@Component
public class IocserviceDelegate implements Iocservice {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name;
    }
}
