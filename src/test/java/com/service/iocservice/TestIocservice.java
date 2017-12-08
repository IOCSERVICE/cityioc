package com.service.iocservice.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestIocservice {

    IocserviceDelegate iocserviceDelegate = new IocserviceDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = iocserviceDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
