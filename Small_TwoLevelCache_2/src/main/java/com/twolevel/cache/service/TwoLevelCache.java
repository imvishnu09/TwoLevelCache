package com.twolevel.cache.service;

public interface TwoLevelCache<K, V> {
    Object get(K key);
    void put(K key, V value);
}
