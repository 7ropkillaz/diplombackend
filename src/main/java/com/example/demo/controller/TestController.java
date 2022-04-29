package com.example.demo.controller;


import com.example.demo.Main;
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

    @PostMapping(value = "/test")
    public ResponseEntity get(@RequestBody Map<String, String> inputMap){

        Map<String, String> map = new HashMap<>();
        map.put("о1", "боль");
        map.put("о2", "муж");
        xlsService.createXls(map);



        return new ResponseEntity("Hello world!", HttpStatus.OK);
    }



}
