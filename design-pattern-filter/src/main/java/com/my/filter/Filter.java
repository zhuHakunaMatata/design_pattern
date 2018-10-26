package com.my.filter;

import com.my.target.Person;

import java.util.List;

/**
 * Created by kyle on 2018/10/26.
 */
public interface Filter {
    List<Person> filter(List<Person> persons);
}
