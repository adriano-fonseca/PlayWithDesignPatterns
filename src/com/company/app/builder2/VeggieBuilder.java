package com.company.app.builder2;

public class VeggieBuilder extends SandwichBuilder {

  @Override
  public SandwichBuilder buildBread() {
    sandwich.setBread("Integral bread,");
    return this;
  }

  @Override
  public SandwichBuilder buildVegetables() {
    sandwich.setVegetables(" Onion, carrot, lettuce, tomato");
    return this;
  }

  @Override
  public SandwichBuilder buildMeat() {
    return this;
  }

  @Override
  public SandwichBuilder buildCheese() {
    return this;
  }

  @Override
  public SandwichBuilder buildCondiments() {
    sandwich.setCondiments("Oliva, Italian Souce");
    return this;
  }

}
