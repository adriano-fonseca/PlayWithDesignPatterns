package com.company.app.strategy;

import com.company.app.strategy.test.turma.CalculoPorDiasCalendario;
import com.company.app.strategy.test.turma.TurmaNEJA;
import com.company.app.strategy.test.turma.TurmaNormal;

public class StrategyTest {

  public static void main(String[] args) {
    TurmaNormal turmaNormal = new TurmaNormal(10,50);
    System.out.println(turmaNormal.calculaFrequencia());
    
    TurmaNEJA turmaNEJA = new TurmaNEJA(10,30);
    turmaNEJA.setCalcFreq(new CalculoPorDiasCalendario());
  }

}
