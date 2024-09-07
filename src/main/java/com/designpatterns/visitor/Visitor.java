package com.designpatterns.visitor;

public interface Visitor {
    void addExtraNonPrimaryFeatureTo(Dot dot);
    void addExtraNonPrimaryFeatureTo(Circle circle);
    void addExtraNonPrimaryFeatureTo(Rectangle rectangle);
}
