package com.my.designpattern.delegate;

import java.util.HashMap;
import java.util.Map;

public class Manager  {
    private Map<String,IWork> staffMapper = new HashMap<String,IWork>();

    public Manager() {
        this.staffMapper.put("BA",new StaffBA());
        this.staffMapper.put("Dev",new StaffDev());
    }

    //manager dispatches the work to the exact staff respecting to work name.
    public void manage(String workName) {
        staffMapper.get(workName).doWork();
    }
}
