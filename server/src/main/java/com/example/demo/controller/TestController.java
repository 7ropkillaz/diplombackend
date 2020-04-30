package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RestController
public class TestController {
    @GetMapping(value = "/test")
    public ResponseEntity get(){
        return new ResponseEntity("Hello world!", HttpStatus.OK);
    }
}
