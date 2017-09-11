package me.dumfing.alkacars.me.dumfing.alkacars.carcomponents;

import me.dumfing.alkacars.me.dumfing.alkacars.carcomponents.engine.Engine;
import me.dumfing.alkacars.me.dumfing.alkacars.carcomponents.exhaust.Exhaust;
import me.dumfing.alkacars.me.dumfing.alkacars.carcomponents.suspension.Suspension;
import me.dumfing.alkacars.me.dumfing.alkacars.carcomponents.transmission.Transmission;

public class AlkaVehicle {
    private Engine carEngine;
    private Suspension carSuspension;
    private Exhaust carExhaust;
    private Transmission carTransmission;

    public AlkaVehicle(){

    }
    public void addEngine(Engine engineIn){
        this.carEngine = engineIn;
    }
    public void addSuspension(Suspension suspensionIn){
        this.carSuspension = suspensionIn;
    }
    public void addExhaust(Exhaust exhaustIn){
        this.carExhaust = exhaustIn;
    }
    public void addTransmission(Transmission transmissionIn){
        this.carTransmission = transmissionIn;
    }
}
