package com.my.designpattern.adapter.login;

import com.my.designpattern.adapter.ResultMsg;

public class LoginServiceForQQ extends LoginService {

    public ResultMsg login(String username, String password) {
        //Adding some extra logics for QQ
        System.out.println(" connecting to QQ ....");
        //register QQ account in this system ...
        super.register(username, password);
        //login ....
        return super.login(username, password);
    }
}
