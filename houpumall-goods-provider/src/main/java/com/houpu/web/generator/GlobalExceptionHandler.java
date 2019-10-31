package com.houpu.web.generator;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:pjq
 * @Date: 2019/10/31 16:57
 */
@RestControllerAdvice
public class GlobalExceptionHandler {


    //1、浏览器客户端返回的都是json
    @ResponseBody
    @ExceptionHandler(BrandNotExistException.class)
    public Map<String, Object> handleException(Exception e) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", "name.notexist");
        map.put("message", e.getMessage());
        return map;
    }


}
