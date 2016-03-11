package com.company.app.command;

import java.util.ArrayList;

public class PayerOperations {

}

//Returns the right BillPayer object based on the method called
//If I want to add another BillPayer I just update this and
//create a new BillPayer class (That's It)
class CustomerTypePicker {

  public static BillPayer getWomanOver60() {

    return new WomanOver60();

  }

  public static BillPayer getManOver60() {

    return new ManOver60();

  }

  public static BillPayer getManUnder60() {

    return new ManUnder60();

  }

}

//Group BillPayers into an ArrayList
//Now you can use these BillPayers as simple commands

class CustomerGroup {

  ArrayList<BillPayer> customers;

  CustomerGroup() {

    customers = new ArrayList<BillPayer>();

  }

  public void add(BillPayer newPayer) {

    customers.add(newPayer);

  }

  public BillPayer get(int customerIndex) {

    return customers.get(customerIndex);

  }

}
