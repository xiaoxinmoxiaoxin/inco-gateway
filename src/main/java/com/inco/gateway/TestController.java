package com.inco.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("spring_cloud")


    public void spring_cloud(){
        System.out.println("aaaaaaaaaaaaaa");
    }
}
