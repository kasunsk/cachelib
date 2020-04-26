package com.slcache.cachelib.schedule;

import java.util.Date;
import java.util.TimerTask;

public class ScheduledTask extends TimerTask {

    private Date now; // to display current time

    public void run() {
        now = new Date(); // initialize date
        System.out.println("Time is :" + now); // Display current time
    }
}
