package com.company.app.visitor.test;

public interface Visitor {
    public double visit(DiarioClasseAreas visitor);
    public double visit(DiarioClasseNormal visitor);
    public double visit(DiarioClasseIndigena visitor);
}
