package com.cn.controller;

import com.cn.pojo.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author Syen
 * @date 2019/7/28 0028-下午 21:19
 */
@Controller
@RequestMapping("/dog")
@SessionAttributes("dog")
public class UserSession_teController {

    @RequestMapping("/register")
    public String register(Dog dog){
        return "dog";

    }
    //他还会检查当前会话是否有dog
    @RequestMapping("/login")
   public String login(@SessionAttribute Dog dog){


        return "redirect:/jsp/dog.jsp";


   }
}
