package com.company.app.command;

//This is the invoker. When returnFinalBill() is called
//it executes the right executeCalculateBill() based
//on the object type stored in theCommand

//This invoker can accept numerous Command types and
//then execute different methods based on the Command
//type, but here it is limited to just one

class CashRegister {

  CommandCalculateBill theCommand;
    
  CashRegister(CommandCalculateBill newCommand) {
    theCommand = newCommand;
  }
  
  public void returnFinalBill(double amountDue) {
      theCommand.executeCalculateBill(amountDue);
  }
}