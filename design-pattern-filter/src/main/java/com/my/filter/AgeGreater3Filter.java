package com.my.filter;


import com.my.target.Gender;
import com.my.target.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyle on 2018/10/26.
 */
public class AgeGreater3Filter implements Filter{
    public List<Person> filter(List<Person> persons) {
        if(persons == null) return null;
        List<Person> result = new ArrayList<Person>();
        for(Person person : persons) {
            if(person.getAge() > 2) {
                result.add(person);
            }
        }

        return result;
    }
}
