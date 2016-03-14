package com.company.app.visitor.test;

public class DiarioClasseIndigena extends DiarioClasseNormal {

  public DiarioClasseIndigena(String proced, String base, String turma) {
    super(proced, base, turma);
  }
  
  public double accept(Visitor visitor) {
    return visitor.visit(this);
  }

}
