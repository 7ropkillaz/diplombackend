package com.example.demo.controller;


import com.example.demo.Main;
import com.example.demo.entity.PacientEntity;
import com.example.demo.repository.PacientRepository;
import com.example.demo.service.XlsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {
@Autowired
    private XlsService xlsService;
@Autowired
private PacientRepository pacientRepository;

    @PostMapping(value = "/test")
    public ResponseEntity get(@RequestBody Map<String, String> inputMap){

        for (int i = 0; i < inputMap.size() ; i++) {
            xlsService.createXls(inputMap);
        }
        




        return new ResponseEntity("Hello world!", HttpStatus.OK);
    }



}
