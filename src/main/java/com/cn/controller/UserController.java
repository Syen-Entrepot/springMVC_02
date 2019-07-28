package com.cn.controller;

import com.cn.pojo.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Syen
 * @date 2019/7/28 0028-下午 16:58
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @InitBinder
    public void init(WebDataBinder webDataBinder){
//*这里指定什么格式，前台就传什么格式*//
        SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        date.setLenient(false);

        webDataBinder.registerCustomEditor(Date.class,new CustomDateEditor(date,false));
        webDataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"),Date.class);
    }

    @PostMapping("/put")
    //需要额外的json包的支持
    @ResponseBody
    public String put(@ModelAttribute User user){

        System.out.println(user.getName()+user.getPassword());

        System.out.println(user.getBirthday());


      return "ok";

    }

}
