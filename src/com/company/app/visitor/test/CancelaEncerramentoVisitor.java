package com.company.app.visitor.test;

public class CancelaEncerramentoVisitor implements Visitor {

  @Override
  public double visit(DiarioClasseAreas diario) {
    System.out.println("Cancela Encerramento por areas.");
    return -10;
  }
  
  @Override
  public double visit(DiarioClasseNormal diario) {
    System.out.println("Cancela Encerramento normal.");
    return -30;
  }

  @Override
  public double visit(DiarioClasseIndigena visitor) {
    System.out.println("Cancela Encerramento Indigina.");
    return -40;
  }


}
