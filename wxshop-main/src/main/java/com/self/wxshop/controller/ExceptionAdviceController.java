package com.self.wxshop.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdviceController {


    @ExceptionHandler(value = Exception.class)
    public String errorAll(Exception e) {
        return e.getMessage();
    }


}
