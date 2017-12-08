package com.service.iocservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2017-12-08T04:15:38.966Z")

@RpcSchema(schemaId = "iocservice")
public class IocserviceImpl implements Iocservice{

    @Autowired
    private IocserviceDelegate iocserviceDelegate;


    public String helloworld(String name) {

        return iocserviceDelegate.helloworld(name);
    }

}
