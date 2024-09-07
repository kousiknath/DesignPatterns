package com.designpatterns.adapter;

public class ServiceAdapter implements ExistingInterface{
    private NonCompatibleService nonCompatibleService;

    public ServiceAdapter(NonCompatibleService nonCompatibleService) {
        this.nonCompatibleService = nonCompatibleService;
    }

    @Override
    public void doSomething(String data) {
        nonCompatibleService.doAnotherThing(convertData(data));
    }

    private String convertData(String data) {
        return data + "some operation";
    }
}
