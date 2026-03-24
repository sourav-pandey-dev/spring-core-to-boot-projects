package com.sourav.configapp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AppService {
    @Value("${app.name}")
     private String name;

    @Value("${app.version}")
    private Double version;

    @Value("${app.author}")
    private String author;

    @Value("${server.port}")
    private  int port;

    public Double getVersion(){
        return version;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getPort(){
        return port;
    }

    public Map<String,Object> getInfo(){
        return Map.of(
               "name", name ,
                "version" ,version,
              "author",  author
);
    }

}
