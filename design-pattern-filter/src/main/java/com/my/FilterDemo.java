package com.my;

import com.my.filter.AgeGreater3Filter;
import com.my.filter.FemaleFilter;
import com.my.filter.Filter;
import com.my.target.Gender;
import com.my.target.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyle on 2018/10/26.
 */
public class FilterDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("kyle1",1, Gender.Female));
        persons.add(new Person("kyle2",2,Gender.Male));
        persons.add(new Person("kyle3",3,Gender.Female));
        persons.add(new Person("kyle4",4,Gender.Male));
        persons.add(new Person("kyle5",5,Gender.Female));
        persons.add(new Person("kyle6",6,Gender.Male));

        Filter femaleFilter = new FemaleFilter();
        List<Person> women = femaleFilter.filter(persons);
        for(Person person: women) {
            System.out.println(person);
        }
        Filter ageGreater3Filter = new AgeGreater3Filter();
        List<Person> ageGreater3Women = ageGreater3Filter.filter(women);
        for(Person person:ageGreater3Women){
            System.out.println(person);
        }

    }
}
