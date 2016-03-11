package com.company.app.decorator;

//The Decorator will allow you to add features
//while keeping them completely separated in
//their own class
abstract class HairCutDecorator implements HairCut {

  protected HairCut hairCut;

  // The decorator will be able to dynamically customize
  // HairCuts

  HairCutDecorator(HairCut hairCut) {
    this.hairCut = hairCut;
  }

  public String getDescription() {
    return hairCut.getDescription();
  }

  public double getCost() {
    return hairCut.getCost();
  }

}

class Shave extends HairCutDecorator {

  Shave(HairCut hairCut) {
    super(hairCut);
  }

  public String getDescription() {
    return hairCut.getDescription() + "\nShave with style";
  }

  public double getCost() {
    return hairCut.getCost()+7.0;
  }

}

class BasicCut implements HairCut {
  protected HairCut cut;

  BasicCut() {
    super();
  }

  BasicCut(HairCut shave) {
    this.cut = shave;
  }

  @Override
  public String getDescription() {
    return "This is a Basic Cut.";
  }

  @Override
  public double getCost() {
    return 5.0;
  }

}

//This represents the basic HairCut that was originally
//used all of the time before the upgrade
class RegularHairCut implements HairCut {

  public String getDescription() {
    return "Trim the Hair";
  }

  public double getCost() {
    return 10.00;
  }
}

//With the decorator we can easily add additional
//features and calculations without changing 
//the code that already exists
class Perm extends HairCutDecorator {

  Perm(HairCut hairCut) {
    super(hairCut);
  }

  public String getDescription() {
    return hairCut.getDescription() + "\nAdd Chemicals and Put Hair in Rollers";
  }

  public double getCost() {
    return hairCut.getCost() + 75.00;
  }
}