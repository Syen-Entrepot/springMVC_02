package com.cn.controller;

import com.cn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Syen
 * @date 2019/7/28 0028-下午 18:35
 */
@Controller
@RequestMapping("/model")
public class ModelAttribuUserController {

    /*@ModelAttribute//就是在controller里面的任意一个处理具体的方法之前都会执行,使用方式一
    public User init(){
        System.out.println("first......");
      User user=new User();
      user.setName("王不二");
      return user;
    }*/
    @ModelAttribute("user")//使用方式二
    public void init(Model model){
        System.out.println("first......");
        User user=new User();
        user.setName("王不二");
        model.addAttribute("user",user);

    }
    //这种方式会直接去我们的model里面去找
    @RequestMapping("/login")
    public String login(@ModelAttribute User user){

       System.out.println(user.getName()+user.getPassword());


        return "msg";

    }

}
