package com.my.designpattern.register;

import java.util.HashMap;
import java.util.Map;

public class BeanFactory {

    private BeanFactory(){}

    private static Map<String,Object> ioc = new HashMap<String,Object>();

    /**
     * this method getBean makes sure there is only one singleton of some class.
     *
     *
     * @param className
     * @return
     */
    public static Object getBean(String className){
        if(!ioc.containsKey(className)){
            try {
                Object obj = Class.forName(className).newInstance();
                ioc.put(className,obj);
            }catch( Exception e ) {
                e.printStackTrace();
            }
        }
        return ioc.get(className);
    }
}
