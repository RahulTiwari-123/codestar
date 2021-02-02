package com.codestar.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    ResponseEntity<String> all() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
