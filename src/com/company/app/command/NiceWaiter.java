package com.company.app.command;

//Command: Calls the right executeCalculateBill method
//based on the BillPayer type
public class NiceWaiter implements CommandDeliverGiveaways {

  BillPayer thePayer;

  NiceWaiter(BillPayer thePayer) {
    this.thePayer = thePayer;
  }

  public void executeCalculateBill(double amountDue) {
    thePayer.calculateBill(amountDue);
  }

  @Override
  public void deliverGiveaways(double amountDue) {
    if(amountDue>100)
    System.out.println("Nice key ring");
    else
      System.out.println("No so nice key ring");
  }

}