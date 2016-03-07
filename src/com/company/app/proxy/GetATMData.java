package com.company.app.proxy;

//This interface will contain just those methods
//that you want the proxy to provide access to
public interface GetATMData{
  public ATMState getATMState();
  public int getCashInMachine();
//  public int requestCash(int amount);
}