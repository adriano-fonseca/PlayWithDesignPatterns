package com.company.app.proxy;

public class TestATMMachine {
  
  public static void main(String[] args){
    
    ATMMachine realATMMachine = new ATMMachine();
    
    realATMMachine.insertCard();
    
    realATMMachine.ejectCard();
    
    realATMMachine.insertCard();
    
    realATMMachine.insertPin(1234);
    
    realATMMachine.requestCash(2000);
    
    // NEW STUFF : Proxy Design Pattern Code
    // The interface limits access to just the methods you want
    // made accessible

      
    GetATMData atmProxy = new ATMProxy();
    
    System.out.println("\nCurrent ATM State " + atmProxy.getATMState());
    
    System.out.println("\nCash in ATM Machine $" + atmProxy.getCashInMachine());
    
    // The user can't perform this action because ATMProxy doesn't
    // have access to that potentially harmful method
//     atmProxy.requestCash(10000);
    
  }
  
}