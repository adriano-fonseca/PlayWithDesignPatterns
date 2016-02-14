package com.company.app.proxy;

public class ATMMachine implements GetATMData{
  
  ATMState hasCard;
  ATMState noCard;
  ATMState hasCorrectPin;
  ATMState atmOutOfMoney;
  ATMState atmState;
  
  int cashInMachine = 2000;
  int pinCode = 1234;
  boolean authenticaded=false;
  
  boolean correctPinEnterded = false;
  
  public ATMState getYesCardState() { return hasCard; }
  public ATMState getNoCardState() { return noCard; }
  public ATMState getHasPin() { return hasCorrectPin; }
  public ATMState getNoCashState() { return atmOutOfMoney; }
 
  public void insertCard() {
    System.out.println("Card was inserted");
  }
  
  public void ejectCard() {
    System.out.println("Card was removed");
    
  }
  
  // NEW STUFF
  public ATMState getATMState() { return atmState; }
  public int getCashInMachine() { return cashInMachine; }

  public void insertPin(int code) {
    if(pinCode==code){
      this.authenticaded=true;
      System.out.println("Authenticaded");
    }else{
      System.out.println("Access Denied");
    }
  }
  
  public int requestCash(int amount) {
    if(authenticaded){
      this.cashInMachine-=amount;
      System.out.println("\nCash in ATM Machine $" + this.cashInMachine);
    }else{
      System.out.println("User not authenticaded");
    }
    return this.cashInMachine;
  }
}