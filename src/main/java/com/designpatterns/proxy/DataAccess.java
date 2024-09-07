package com.designpatterns.proxy;

public interface DataAccess {
    void put(String key, String value);
    String get(String key);
}
