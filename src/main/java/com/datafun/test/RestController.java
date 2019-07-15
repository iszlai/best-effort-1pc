package com.datafun.test;

import jdk.jfr.ContentType;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestController {
    @GetMapping(value = "test",produces ="application/json")
    ResponseEntity<String> health(){
        System.out.println("fsfds");
        return ResponseEntity.ok("OK" );
    }
}
