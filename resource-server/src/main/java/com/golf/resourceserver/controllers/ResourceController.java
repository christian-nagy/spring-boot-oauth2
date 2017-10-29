package com.golf.resourceserver.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @RequestMapping("/my-resource")
    public ResponseMessage home() {
        return new ResponseMessage("Message from Resource Server");
    }

}
