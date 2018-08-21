package com.navis.shipping;

public class vessel {
    String vesselId;
    String lineOp;
    long containerCount;
    String manufacturer;
    long weight;
    boolean isOperative;
    container[] c;
    int fuelCapacity;
    public long noOfContainers(){
        return containerCount;
    }

}
