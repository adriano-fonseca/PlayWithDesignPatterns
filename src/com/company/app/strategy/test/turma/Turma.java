package com.company.app.strategy.test.turma;

public class Turma {
  
  private int nrClassGiven;
  
  private int minuteByPeriod;
  
  protected CalcFreq calcFreq;
  
  public Turma(int nrClass, int minutes){
    this.nrClassGiven=nrClass;
    this.minuteByPeriod=minutes;
  }
  
  public int getNrClassGiven() {
    return nrClassGiven;
  }
  public void setNrClassGiven(int nrClassGiven) {
    this.nrClassGiven = nrClassGiven;
  }
  public int getMinuteByPeriod() {
    return minuteByPeriod;
  }
  public void setMinuteByPeriod(int minuteByPeriod) {
    this.minuteByPeriod = minuteByPeriod;
  }
}
