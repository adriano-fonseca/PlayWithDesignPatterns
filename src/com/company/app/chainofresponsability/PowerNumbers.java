package com.company.app.chainofresponsability;

public class PowerNumbers implements Chain {
  
  private Chain nextInChain;
  
  @Override
  public void setNextChain(Chain nextChain) {
    this.nextInChain=nextChain;
  }

  @Override
  public void calculate(Numbers request) {
    if(request.getCalculationWanted() == "pow"){
      System.out.print(request.getNumber1() + " ^ " + request.getNumber2() + " = "+(Math.pow(request.getNumber1(), request.getNumber2())));
    } else {
      nextInChain.calculate(request);
    }
  }

}
