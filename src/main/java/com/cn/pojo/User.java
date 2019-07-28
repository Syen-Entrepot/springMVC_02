package com.cn.pojo;

import java.util.Date;

/**
 * @author Syen
 * @date 2019/7/28 0028-下午 16:58
 */
public class User {
    private String name;
    private String password;

   /* @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")*/
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
