package com.example.serviceregistry.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {
    private String RESPONSE_BODY = "{\"message\":\"Service Unavailable. Please try after sometime\"}";

    @GetMapping(value = "/service", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getEndpointsFallback(){
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(RESPONSE_BODY);
    }

    @PostMapping(value = "/service", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> postEndpointsFallback(){
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(RESPONSE_BODY);
    }
}