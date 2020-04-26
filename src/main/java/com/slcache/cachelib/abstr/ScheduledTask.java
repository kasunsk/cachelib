package com.slcache.cachelib.abstr;

import java.util.Date;
import java.util.TimerTask;


//Scheduling purpose
public class ScheduledTask extends TimerTask {

    private Date now; // to display current time

    public void run() {
        now = new Date(); // initialize date
        System.out.println("Time is :" + now); // Display current time
    }
}
