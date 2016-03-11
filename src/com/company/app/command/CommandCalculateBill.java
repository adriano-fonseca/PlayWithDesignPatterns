package com.company.app.command;

//Represents the methods that will change based off
//of different BillPayers
interface CommandCalculateBill extends Command {

  public void executeCalculateBill(double amountDue);

}