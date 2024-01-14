package com.ponlokpen.restapi.controller;

import ch.qos.logback.classic.spi.LoggingEventVO;

public class ResponseEntity<T> {

    public static LoggingEventVO ok() {
        return ResponseEntity.ok();
    }
}
