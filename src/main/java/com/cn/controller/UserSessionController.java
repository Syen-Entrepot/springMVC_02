package com.cn.controller;

import com.cn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author Syen
 * @date 2019/7/28 0028-下午 21:05
 */
@Controller
@RequestMapping("/user3")
@SessionAttributes("user")
public class UserSessionController {


    @ModelAttribute("user")
    public void init(Model model){
        System.out.println("init。。。");
        User user=new User();
        user.setName("frank");
        model.addAttribute("user",user);
    }
    @RequestMapping("/login")
    public String login(@ModelAttribute User user){
        System.out.println(user.getName()+user.getPassword());
        return "redirect:/jsp/user.jsp";
    }

}
