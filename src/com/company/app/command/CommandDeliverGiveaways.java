package com.company.app.command;

//Represents the methods that will change based off
//of different BillPayers
interface CommandDeliverGiveaways extends CommandCalculateBill {

  public void deliverGiveaways(double dueAmount);

}