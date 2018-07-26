package com.my.designpattern.register;

import java.util.HashMap;
import java.util.Map;

public class RegisterMap {
    private static Map<String,Object> register = new HashMap<String,Object>();

    public static RegisterMap getInstance(String name){
        if(name == null){
            name = RegisterMap.class.getSimpleName();
        }
        if(!register.containsKey(name)){
            register.put(name, new RegisterMap());
        }
        return (RegisterMap) register.get(name);

    }


}
