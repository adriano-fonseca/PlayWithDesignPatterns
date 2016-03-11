package com.company.app.command;

public class PayerKinds {

}

//Different BillPayers
class WomanOver60 implements BillPayer {

  public void calculateBill(double amountDue) {
    System.out.println("Bill Amount for Woman Over 60: $" + (amountDue - (amountDue * .10)));
  }
}

class ManOver60 implements BillPayer {

  public void calculateBill(double amountDue) {
    System.out.println("Bill Amount for Man Over 60: $" + (amountDue - (amountDue * .05)));
  }
}

class ManUnder60 implements BillPayer {

  public void calculateBill(double amountDue) {
    System.out.println("Bill Amount for Man Under 60: $" + amountDue);
  }

}