package com.company.app.strategy.test.turma;

public class TurmaNormal extends Turma {

  public TurmaNormal(int nrClass, int minutes) {
    super(nrClass, minutes);
    calcFreq = new CalculaFrequencia();
  }
  
  public int calculaFrequencia(){
    return calcFreq.calculaFrequency(this.getNrClassGiven(), this.getMinuteByPeriod());
  }
}
