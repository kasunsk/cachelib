package com.slcache.cachelib.simple;

import org.junit.Assert;
import org.junit.Test;

public class SimpleCacheUnitTest {

    @Test
    public void testSimpleCache() {
        SimpleCache simpleCache = new SimpleCache();
        simpleCache.put("test", "value");
        simpleCache.put("test2", 123);

        Assert.assertEquals(simpleCache.get("test1"),"value");
        Assert.assertEquals(simpleCache.get("test2"), 123);

        simpleCache.clear();
        Assert.assertNull(simpleCache.get("test1"));
    }
}
