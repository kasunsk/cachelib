package com.slcache.cachelib.specific;

import com.slcache.cachelib.abstr.Cacheable;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class SpecificCaching {

    private long timeToLive;
    private Map<String, Cacheable> memoryCache;

    public SpecificCaching(long timeToLive, int initSize) {
        memoryCache = new HashMap<>(initSize);
        this.timeToLive = timeToLive;
    }

    public SpecificCaching() {
        this.timeToLive = 1000 * 60 * 5;
        this.memoryCache = new HashMap<>(30);
    }

    public void put(String key, Cacheable value) {

        //Filter cache with who lived longer than timeToLive

        memoryCache.put(key, value);
    }

    public void clear() {
        memoryCache.clear();
    }

    public Cacheable get(String key) {
        return memoryCache.get(key);
    }

}
