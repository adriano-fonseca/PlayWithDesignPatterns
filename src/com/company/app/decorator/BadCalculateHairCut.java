package com.company.app.decorator;


//A BAD way to add functionality
class BadCalculateHairCut implements HairCut {

HairCutOptions optionPicked;

BadCalculateHairCut(HairCutOptions options) {
  optionPicked = options;
}

public String getDescription() {

  if (optionPicked == HairCutOptions.PERM) {
    return "\nAdd Chemicals and Put Hair in Rollers";
  } else if (optionPicked == HairCutOptions.HAIR_FROSTING) {
    return "\nAdd Chemicals and Put Hair in Foil";
  } else{
    return "Trim the Hair";
  }
}

public double getCost() {
  // TODO Auto-generated method stub
  return 0;
}

}
