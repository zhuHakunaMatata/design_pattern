package com.my.designpattern.decorator.legacylogin;

public class LegacyLoginServiceImpl implements ILoginService {

    @Override
    public ResultMsg register(String username,String password){

        System.out.println(" ---- registering new account ..... ");
        return new ResultMsg("200","success",new Member());
    }


    @Override
    public ResultMsg login(String username,String password){
        System.out.println("-- login  --");
        return new ResultMsg("200","success",new Member());
    }

}
