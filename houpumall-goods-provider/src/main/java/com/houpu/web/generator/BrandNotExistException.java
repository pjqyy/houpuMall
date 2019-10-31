package com.houpu.web.generator;

/**
 * @Author:pjq
 * @Date: 2019/10/31 17:38
 */
public class BrandNotExistException extends RuntimeException {

    public BrandNotExistException() {
        super("用户不存在");
    }
}
