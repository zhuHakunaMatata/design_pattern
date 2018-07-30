package com.my.designpattern.adapter.login;

import com.my.designpattern.adapter.Member;
import com.my.designpattern.adapter.ResultMsg;

public class LoginServiceForWechat {
    private static LoginService loginService = new LoginService();

    public ResultMsg login(String username, String password){
        //Adding some extra logics for wechat
        System.out.println(" connecting to wechat ....");
        //register wechat account in this system ...
        loginService.register(username, password);
        //login ....
        return loginService.login(username,password);
    }


}
