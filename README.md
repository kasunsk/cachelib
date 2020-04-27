Caching Library
===============

1 . Introduction
----------------

* This application is to be use for caching purpose in java application. This should be able to
use for any places.
* Will be support for different type of caching.
* Should be able to cache DB results.
* Should be support for thread local cache.
* Should be able to clear cache easily
* Should be able to disable when needed.

2 . How to Use
--------------
* Add maven dependency 
  * groupId : org.slcache
  * artifactId : cachelib
  * version : 1.0-SNAPSHOT
  
3 . Available Functionalities
-----------------------------
* User can use simple cache for tempory caching any instance
* User can use thread local cache in multi threaded environment
* Distributed cache for use in distributed application
* Instance cache and specific cache for caching cachable object 
and other instance.

4 . Limited
-----------------

* This module is not design for servlet container (dependency injection)
* Will not application with maintaining large cache