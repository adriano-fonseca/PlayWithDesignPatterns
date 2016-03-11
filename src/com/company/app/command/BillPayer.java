package com.company.app.command;

//Represents all the different types of BillPayers
//and the methods used by them
public interface BillPayer {
  public void calculateBill(double amountDue);
}