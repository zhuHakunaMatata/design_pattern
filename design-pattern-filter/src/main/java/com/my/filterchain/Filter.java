package com.my.filterchain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by kyle on 2018/10/26.
 */
public interface Filter {
    void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain);
}
