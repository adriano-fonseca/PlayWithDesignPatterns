package com.company.app.command;

//Represents the methods that will change based off
//of different BillPayers
interface CommandCalculateBill {

  public void executeCalculateBill(double amountDue);

}