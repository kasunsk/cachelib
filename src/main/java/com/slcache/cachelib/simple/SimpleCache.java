package com.slcache.cachelib.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * Can be use for simple caching application for any application
 */
public class SimpleCache {

    //this will decide live time of the current cache
    private long timeToLive;
    private Map<String, Object> memoryCache;

    public SimpleCache() {
        this.timeToLive = 1000 * 60 * 5;
        this.memoryCache = new HashMap<String, Object>(30);
    }

    public SimpleCache(long timeToLive, int initialSize) {
        this.timeToLive = timeToLive;
        this.memoryCache = new HashMap<>(initialSize);
    }

    public void put(String key, Object value) {
        memoryCache.put(key, value);
    }

    public void clear() {
        memoryCache.clear();
    }

    public Object get(String key) {
        return memoryCache.get(key);
    }
}
