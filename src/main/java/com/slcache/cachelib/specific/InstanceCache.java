package com.slcache.cachelib.specific;

import java.util.HashMap;
import java.util.Map;

/**
 * Any instance can be cache using this class
 * need to provide time to live
 * init size of memory cache
 * @param <T>
 */
public class InstanceCache<T> {

    private long timeToLive;
    private Map<String, T> memoryCache;

    public InstanceCache() {
        this.timeToLive = 1000 * 60 * 5;
        this.memoryCache = new HashMap<String, T>(30);
    }

    public InstanceCache(long timeToLive, int initialSize) {
        this.timeToLive = timeToLive;
        this.memoryCache = new HashMap<String, T>(initialSize);
    }

    public void put(String key, T value) {
        memoryCache.put(key, value);
    }

    public void clear() {
        memoryCache.clear();
    }

    public Object get(String key) {
        return memoryCache.get(key);
    }
}
