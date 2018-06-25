package com.example.jktest.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Gaoyp
 * @Description:
 * @Date: Create in 下午3:00 2018/6/25
 * @Modified By:
 */
@RestController
public class TestController {

    @GetMapping("/index")
    public String index(){
        return "test jenkins...";
    }
}
