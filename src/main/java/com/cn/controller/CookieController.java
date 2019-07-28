package com.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Syen
 * @date 2019/7/28 0028-下午 21:48
 */
@Controller
@RequestMapping("/cookie")
public class CookieController {


    @RequestMapping("/cook")
    //
    public String cook(@CookieValue("JSESSIONID") String jsessionid){

        System.out.println(jsessionid);
        return "msg";
    }

}
