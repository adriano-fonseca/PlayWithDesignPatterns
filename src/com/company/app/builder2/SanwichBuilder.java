package com.company.app.builder2;

//This is the builder abstract class. It defines
//all the methods that each Sandwich object must
//contain. What these methods do is completely
//up to the subclass that extends the builder

abstract class SandwichBuilder {

  Sandwich sandwich;

  public Sandwich getSandwich() {
    return sandwich;
  }

  public void makeSandwich() {
    sandwich = new Sandwich();
  }

  public abstract SandwichBuilder buildBread();

  public abstract SandwichBuilder buildVegetables();

  public abstract SandwichBuilder buildMeat();

  public abstract SandwichBuilder buildCheese();

  public abstract SandwichBuilder buildCondiments();

}

