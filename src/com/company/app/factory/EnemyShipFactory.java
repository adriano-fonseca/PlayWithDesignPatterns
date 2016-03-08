package com.company.app.factory;

import com.company.app.factory.parts.ESEngine;
import com.company.app.factory.parts.ESGun;

//With an Abstract Factory Pattern you won't
//just build ships, but also all of the components
//for the ships

//Here is where you define the parts that are required
//if an object wants to be an enemy ship

public interface EnemyShipFactory{

public ESGun addESGun();
public ESEngine addESEngine();

}