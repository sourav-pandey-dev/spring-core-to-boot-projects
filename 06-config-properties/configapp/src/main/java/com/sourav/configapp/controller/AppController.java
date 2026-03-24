package com.sourav.configapp.controller;

import com.sourav.configapp.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    AppService service;

    @GetMapping("/name")
     String getName(){
        return service.getName();
    }
    @GetMapping("/version")
    Double getVersion(){
        return service.getVersion();
    }
    @GetMapping("/author")
    String getAuthor(){
        return service.getAuthor();
    }

    @GetMapping("/info")
    Map<String, Object> getInfo(){
        return service.getInfo();
    }
    @GetMapping("/port")
    int getPort(){
        return service.getPort();
    }

}
