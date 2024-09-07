package com.designpatterns.proxy;

public class HeavyWeightDB implements DataAccess {
    public HeavyWeightDB() {
        // The initialization is heavy on resource
    }

    @Override
    public void put(String key, String value) {

    }

    @Override
    public String get(String key) {
        return null;
    }
}
