package com.srit.kkexample.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ExampleController {

    @GetMapping("/auth")
    public ResponseEntity<?> yesAuth() {
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/noauth")
    public ResponseEntity<?> noAuth() {
        return ResponseEntity.ok("ok2");
    }
    
    
    
}
