package com.company.app.decorator;

public class TestHairCut {

  public static void main(String[] args) {
    //Here we have a Regular Cut
    HairCut permAndCut = new Perm(new RegularHairCut());
    System.out.println("Services");
    System.out.println(permAndCut.getDescription());
    System.out.println("Price: $" + permAndCut.getCost());
    System.out.println("");

    //Here we have a Permanent with Basic Cut
    HairCut basic = new Perm(new BasicCut());
    System.out.println("Services");
    System.out.println(basic.getDescription());
    System.out.println("Price: $" + basic.getCost());
    System.out.println("");

    //Here just a Basic Cut
    HairCut justbasic = new BasicCut();
    System.out.println("Services");
    System.out.println(justbasic.getDescription());
    System.out.println("Price: $" + justbasic.getCost());
    System.out.println("");

    //Here Shave with a basic cut 
    HairCut basicCutWithShave = new Shave(new BasicCut());
    System.out.println("Services");
    System.out.println(basicCutWithShave.getDescription());
    System.out.println("Price: $" + basicCutWithShave.getCost());

  }
}