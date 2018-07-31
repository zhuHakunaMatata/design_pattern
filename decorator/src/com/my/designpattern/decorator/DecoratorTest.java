package com.my.designpattern.decorator;

import com.my.designpattern.decorator.legacylogin.ILoginService;
import com.my.designpattern.decorator.legacylogin.LegacyLoginServiceImpl;
import com.my.designpattern.decorator.newlogin.INewLoginService;
import com.my.designpattern.decorator.newlogin.NewLoginServiceImpl;

public class DecoratorTest {
    public static void main(String[] args) {

        ILoginService loginService = new LegacyLoginServiceImpl();
        loginService.login("hakunamatata","123456");
        INewLoginService newLoginService = new NewLoginServiceImpl(loginService);
        newLoginService.login4QQ("hakunamatata","123456");

    }

}
