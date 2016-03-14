package com.company.app.visitor.test;

public class EnceramentoTest {
  public static void main(String[] args){
    System.out.println("Encerramento de Turma");
    DiarioClasseAreas diarioAreas = new DiarioClasseAreas("proced 1", "base 1", "turma 1");
    DiarioClasseNormal diarioNormal = new DiarioClasseNormal("proced 1", "base 1", "turma 1");
    DiarioClasseIndigena diaIndigena = new DiarioClasseIndigena("proced 1", "base 1", "turma 1");
    
    CancelaEncerramentoVisitor cancelamento = new CancelaEncerramentoVisitor();
    EncerramentoVisitor encerra = new EncerramentoVisitor();
    
    double resultadoA = diarioAreas.accept(encerra);
    System.out.println(resultadoA);
    resultadoA = diarioAreas.accept(cancelamento);
    System.out.println(resultadoA);
    
    double resultadoB = diarioNormal.accept(encerra);
    System.out.println(resultadoB);
    resultadoB = diarioNormal.accept(cancelamento);
    System.out.println(resultadoB);
    
    double resultadoC = diaIndigena.accept(encerra);
    System.out.println(resultadoC);
    resultadoC = diaIndigena.accept(cancelamento);
    System.out.println(resultadoC);
    
    
  }

}
