package com.my.designpattern.decorator.legacylogin;

public interface ILoginService {
    public ResultMsg register(String username, String password);
    public ResultMsg login (String username,String password);
}
