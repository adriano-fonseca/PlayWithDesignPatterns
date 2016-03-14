package com.company.app.strategy.test.turma;

public class CalculoPorDiasCalendario implements CalcFreq {

  @Override
  public int calculaFrequency(int nrClassGiven, int minuteByPeriod) {
    return nrClassGiven;
  }

}