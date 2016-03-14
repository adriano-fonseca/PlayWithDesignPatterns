package com.company.app.strategy.test.turma;

public class TurmaNEJA extends Turma {
  
  public TurmaNEJA(int nrClass, int minutes) {
    super(nrClass, minutes);
  }
  
  public void setCalcFreq(CalcFreq calc){
    calcFreq=calc;
  }
  
  public int calculaFrequencia(){
    return calcFreq.calculaFrequency(super.getNrClassGiven(), super.getMinuteByPeriod());
  }
 
}
