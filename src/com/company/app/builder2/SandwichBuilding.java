package com.company.app.builder2;

//The Director which assigns the type of Sandwich to build
//and then calls all of the initialization methods

public class SandwichBuilding {

  private SandwichBuilder sandwichBuilder;

  public void setSandwichBuilder(SandwichBuilder sandwichBuilder) {
    this.sandwichBuilder = sandwichBuilder;
  }

  public Sandwich getSandwich() {
    return sandwichBuilder.getSandwich();
  }

  // Initializes the Sandwich object
  public void takeSandwichOrder() {
    sandwichBuilder.makeSandwich();
    sandwichBuilder.buildBread().buildCheese().buildMeat().buildCondiments();
    sandwichBuilder.buildVegetables();
  }

}