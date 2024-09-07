package com.designpatterns.adapter;

public class NonCompatibleServiceImpl implements NonCompatibleService {
    @Override
    public String doAnotherThing(String json) {
        return "----------garbage------------";
    }
}
