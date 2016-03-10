package com.company.app.builder2;

public class BLTBuilder extends SandwichBuilder {

  // Methods that make this different from other Sandwich Objects
  public SandwichBuilder buildBread() {
    sandwich.setBread("White Bread");
    return this;
  }

  public SandwichBuilder buildVegetables() {
    sandwich.setVegetables("Lettuce Tomato");
    return this;
  }

  public SandwichBuilder buildMeat() {
    sandwich.setMeat("Bacon");
    return this;
  }

  public SandwichBuilder buildCheese() {
    sandwich.setCheese("White Bread");
    return this;
  }

  public SandwichBuilder buildCondiments() {
    sandwich.setCondiments("Mayonnaise");
    return this;
  }

}
