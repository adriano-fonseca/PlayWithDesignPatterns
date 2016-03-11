package com.company.app.decorator;

//When new features are needed it is a bad idea to
//add new code to older classes. This would make
//compact easy to understand classes complicated
//because they would break the Single responsibility 
//principle.
//By using the decorator pattern we'll also satisfy
//another SOLID principle being the Interface segregation 
//principle, by using many specific interfaces rather 
//than one general purpose interface.
public interface HairCut {
  public String getDescription();
  public double getCost();
}