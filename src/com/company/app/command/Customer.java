package com.company.app.command;


//The Wrong Way
//1. To add a new Customer type I have to change the Customer
//logic for returnFinalBill
//2. Adding a new discount requires editing the class
//3. If I want to implement a new calculation device I can't
public class Customer {

  private int     age;

  private boolean man;

  private double  bill;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public boolean isMan() {
    return man;
  }

  public void setMan(boolean man) {
    this.man = man;
  }

  public Customer(int age, boolean man, double bill) {
    this.age = age;
    this.man = man;
    this.bill = bill;
  }

  public void returnFinalBill() {

    double percentageOff = 0.0;

    if (age > 60) {
      percentageOff += .05;
    }
    if (!man) {
      percentageOff += .05;
    }

    System.out.println("Bill Amount: $" + (bill - (bill * percentageOff)));

  }

  public static void main(String[] args) {

    Customer billSmith = new Customer(62, true, 12);

    billSmith.returnFinalBill();

  }

}