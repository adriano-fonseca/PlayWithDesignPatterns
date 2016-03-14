package com.company.app.visitor.test;

public class DiarioClasseNormal implements Visitable {
  private String proced;
  private String Base;
  private String Turma;
  
  @Override
  public double accept(Visitor visitor) {
    return visitor.visit(this);
  }
  
  public DiarioClasseNormal(String proced, String base, String turma) {
    super();
    this.proced = proced;
    Base = base;
    Turma = turma;
  }
  
  public String getProced() {
    return proced;
  }
  public void setProced(String proced) {
    this.proced = proced;
  }
  public String getBase() {
    return Base;
  }
  public void setBase(String base) {
    Base = base;
  }
  public String getTurma() {
    return Turma;
  }
  public void setTurma(String turma) {
    Turma = turma;
  }
}
