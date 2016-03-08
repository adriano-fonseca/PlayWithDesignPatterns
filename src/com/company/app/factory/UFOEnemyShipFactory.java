package com.company.app.factory;

import com.company.app.factory.parts.ESEngine;
import com.company.app.factory.parts.ESUFOEngine;
import com.company.app.factory.parts.ESUFOGun;
import com.company.app.factory.parts.ESGun;

//This factory uses the EnemyShipFactory interface
//to create very specific UFO Enemy Ship

//This is where we define all of the parts the ship
//will use by defining the methods implemented
//being ESWeapon and ESEngine

//The returned object specifies a specific weapon & engine

public class UFOEnemyShipFactory implements EnemyShipFactory{

// Defines the weapon object to associate with the ship

public ESGun addESGun() {
 return new ESUFOGun(); // Specific to regular UFO
}

// Defines the engine object to associate with the ship

public ESEngine addESEngine() {
 return new ESUFOEngine(); // Specific to regular UFO
}
}