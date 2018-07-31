package com.my.designpattern.decorator.newlogin;

import com.my.designpattern.decorator.legacylogin.ILoginService;
import com.my.designpattern.decorator.legacylogin.ResultMsg;

public class NewLoginServiceImpl implements INewLoginService {

    private ILoginService loginService ;

    public NewLoginServiceImpl(ILoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public ResultMsg login4QQ(String username, String password) {
        register4QQ(username, password);
        return login(username, password);
    }

    @Override
    public ResultMsg register4QQ(String username, String password) {
        //
        System.out.println("connecting to QQ ...");
        System.out.println(" get qq account info .... ");

        return register(username, password);
    }

    @Override
    public ResultMsg login4Wechat(String username, String password) {
        return null;
    }

    @Override
    public ResultMsg register4Wechat(String username, String password) {
        return null;
    }

    @Override
    public ResultMsg register(String username, String password) {
        return this.loginService.register(username, password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return this.loginService.login(username, password);
    }
}
