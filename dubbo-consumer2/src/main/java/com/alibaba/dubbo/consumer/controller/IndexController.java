package com.alibaba.dubbo.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: IndexController
 * @Author: jiangze.He
 * @Date: 2021-06-09
 * @Version: v1.0
 */
@Controller
public class IndexController {

    @RequestMapping(method = RequestMethod.GET, value = "hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
