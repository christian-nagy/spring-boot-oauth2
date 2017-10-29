package com.golf.resourceserver.controllers;

import java.util.UUID;

public class ResponseMessage {

    private String id = UUID.randomUUID().toString();
    private String content;

    public ResponseMessage() {
    }

    public ResponseMessage(String content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
