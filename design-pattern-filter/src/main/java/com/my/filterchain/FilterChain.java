package com.my.filterchain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyle on 2018/10/26.
 */
public class FilterChain implements Filter{
    private List<Filter> filters ;
    private int index=0;

    public FilterChain() {
        this.filters = new ArrayList<Filter>();
    }

    public FilterChain addFilter(Filter filter){
        this.filters.add(filter);
        return this;
    }


    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) {
        if(this.filters.size()==0 || this.index > this.filters.size()-1 ) return;
        Filter filter = this.filters.get(index);
        this.index ++;
        filter.doFilter(request,response,filterChain);
        //index ++;
    }
}
