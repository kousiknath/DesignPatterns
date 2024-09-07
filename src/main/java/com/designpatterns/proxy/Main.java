package com.designpatterns.proxy;

public class Main {

    public static void main(String[] args) {
        DataAccess access = new ProxyDB();
        access.put("key", "value");
        access.get("key");
    }
}
