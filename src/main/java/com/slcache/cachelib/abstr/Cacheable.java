package com.slcache.cachelib.abstr;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter @Setter
public abstract class Cacheable {
    private LocalTime createdTime;

}
