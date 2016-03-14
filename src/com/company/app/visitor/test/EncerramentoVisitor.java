package com.company.app.visitor.test;


public class EncerramentoVisitor implements Visitor {

  @Override
  public double visit(DiarioClasseAreas diario) {
   System.out.println("Encerramento de diario por áreas");
   return 10;
  }
  
  @Override
  public double visit(DiarioClasseNormal diario) {
    System.out.println("Encerramento de diario Normal");
    return 30;
  }

  @Override
  public double visit(DiarioClasseIndigena visitor) {
    System.out.println("Encerramento de diario Indigina.");
    return 40;
  }
  
  
  
}
