package com.company.app.proxy;

public interface ATMState {
  
  void insertCard();
  void ejectCard();
  void insertPin(int pinEntered);
  int requestCash(int cashToWithdraw);
}