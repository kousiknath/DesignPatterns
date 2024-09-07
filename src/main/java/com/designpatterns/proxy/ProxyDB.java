package com.designpatterns.proxy;

public class ProxyDB implements DataAccess {
    /*
        Proxy, Decorator, Adapter - all of them have the same structure. But:

        Decorator: It enhances the existing behaviour of an object, does not
        control the life cycle of the wrapped object. Composition of decorators
        is controlled by the client.

        Adapter: It wraps an incompatible object around an interface which the
        client wants to use

        Proxy: It can control the life cycle of the wrapped object.
        Ex: instantiate / return the reference of the wrapped object only when
        access control passed or some kind of other criteria passed etc, can
        cache heavy objects. Basically, before or after executing some behaviour
        on the wrapped object, the proxy executes some code that does not enhance
        the behavior of the object.
     */

    private DataAccess accessObj;

    public ProxyDB() {
        // You may choose to accept a subclass of type DataAccess in the constructor
        // but that's implementation dependent
    }

    @Override
    public void put(String key, String value) {
        lazilyInitialize();
    }

    @Override
    public String get(String key) {
        lazilyInitialize();

        return null;
    }

    void lazilyInitialize() {
        if (this.accessObj == null) {
            this.accessObj = new HeavyWeightDB();
        }
    }
}
