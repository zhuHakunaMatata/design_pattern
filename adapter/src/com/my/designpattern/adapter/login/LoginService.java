package com.my.designpattern.adapter.login;

import com.my.designpattern.adapter.Member;
import com.my.designpattern.adapter.ResultMsg;

public class LoginService {

    public ResultMsg register(String username,String password){

        System.out.println(" ---- registering new account ..... ");
        return new ResultMsg("200","success",new Member());
    }


    public ResultMsg login(String username,String password){
        System.out.println("-- login  --");
        return new ResultMsg("200","success",new Member());
    }



}
