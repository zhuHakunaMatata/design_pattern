package com.my.filterchain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by kyle on 2018/10/26.
 */
public class HTMLFilter implements Filter {
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) {
        System.out.println("\t-- HTMLFilter begins...");
        filterChain.doFilter(request,response,filterChain);
        System.out.println("\t-- HTMLFilter ends...");
    }
}
