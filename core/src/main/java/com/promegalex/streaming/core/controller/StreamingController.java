package com.promegalex.streaming.core.controller;

import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/streaming", produces = "application/json;charset=UTF-8")
@Api(value = "Streaming Controller Api", tags = {"Streaming Controller"})
public class StreamingController {

    @GetMapping
    public ResponseEntity<Object> getStatus() {
        return ResponseEntity.ok().body("Okey");
    }
}
