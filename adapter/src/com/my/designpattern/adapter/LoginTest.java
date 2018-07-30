package com.my.designpattern.adapter;

import com.my.designpattern.adapter.login.LoginService;
import com.my.designpattern.adapter.login.LoginServiceForQQ;

public class LoginTest {
    public static void main(String[] args) {
        //old interfafe for login
        LoginService loginService = new LoginService();
        //loginService.register("hakunamatata","123456");
        //loginService.login("hakunamatata","123456");

        //new interface for QQ login
        LoginService qqLoginService = new LoginServiceForQQ();
        qqLoginService.login("hakunamatata","123456");


    }
}
