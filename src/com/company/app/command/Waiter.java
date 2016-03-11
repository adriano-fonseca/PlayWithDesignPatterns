package com.company.app.command;

//Command: Calls the right executeCalculateBill method
//based on the BillPayer type
public class Waiter implements CommandCalculateBill {

  BillPayer thePayer;

  Waiter(BillPayer thePayer) {
    this.thePayer = thePayer;
  }

  public void executeCalculateBill(double amountDue) {
    thePayer.calculateBill(amountDue);
  }

}