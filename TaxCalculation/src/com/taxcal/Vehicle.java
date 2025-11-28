package com.taxcal;

import java.io.Serializable;

public class Vehicle implements Serializable{
    private double velocity;
    private int capacity;
    private double purchaseCost;
    private int type;
    
    public Vehicle(double velocity,int capacity,double purchaseCost,int type) {
    	this.velocity = velocity;
    	this.capacity = capacity;
    	this.purchaseCost = purchaseCost;
    	this.type = type;
    }
    
    public double calculateTax() {
    	double rate = switch (type) {
    	case 1->0.10;
    	case 2->0.11;
    	case 3->0.12;
    	default-> 0;
    	
    	};
    	return (velocity+capacity+(rate*purchaseCost));
    }
    public String getTypeName() {
    	return switch (type) {
    	case 1-> "Petrol";
    	case 2-> "Diesel";
    	case 3-> "CNG/LPG";
    	default -> "Unknown";
    	};
    }

	@Override
	public String toString() {
		return "Vehicle [velocity=" + velocity + ", capacity=" + capacity + ", purchaseCost=" + purchaseCost + ", type="
				+ type + "]";
	}
    
}
