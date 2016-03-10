package com.company.app.builder2;

class TestBuilder {

  public static void main(String[] args) {

    // The director has methods for assigning the
    // Sandwich to build, initializes it and provides
    // the Object to who asks for it
    SandwichBuilding paul = new SandwichBuilding();

    // Designate the specific Sandwich object we want to build
    SandwichBuilder bltBuilder = new BLTBuilder();

    // Assign the specific Sandwich to build
    paul.setSandwichBuilder(bltBuilder);

    // Initialize everything in the new object
    paul.takeSandwichOrder();

    // Provide the specific Sandwich object
    Sandwich bltSandwich = paul.getSandwich();

    // Print out info on the Sandwich Object
    System.out.println(bltSandwich);
    
    
    //Another kind of sandwich
    SandwichBuilder vaggieBuilder = new VeggieBuilder();
    paul.setSandwichBuilder(vaggieBuilder);
    paul.takeSandwichOrder();
    Sandwich veggieSandwich = paul.getSandwich();
    System.out.println(veggieSandwich);
  }
}