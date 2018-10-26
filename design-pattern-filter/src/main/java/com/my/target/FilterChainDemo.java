package com.my.target;

import com.my.filterchain.Filter;
import com.my.filterchain.FilterChain;
import com.my.filterchain.HTMLFilter;
import com.my.filterchain.JsonFilter;

/**
 * Created by kyle on 2018/10/26.
 */
public class FilterChainDemo {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        Filter htmlFilter = new HTMLFilter();
        Filter jsonFilter = new JsonFilter();
        filterChain.addFilter(htmlFilter)
                .addFilter(jsonFilter);
        filterChain.doFilter(null,null,filterChain);

    }
}
