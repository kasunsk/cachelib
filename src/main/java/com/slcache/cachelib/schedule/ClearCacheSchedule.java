package com.slcache.cachelib.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Timer;


@Scheduled(fixedDelay = 1000)
public class ClearCacheSchedule {

}
