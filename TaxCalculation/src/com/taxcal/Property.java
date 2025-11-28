package com.taxcal;

import java.io.Serializable;

public class Property implements Serializable{
    private double base_value;
    private double builtup_area;
    private double age;
    private boolean inmaincity;
	public Property(double base_value, double builtup_area, double age, boolean inmaincity) {
		super();
		this.base_value = base_value;
		this.builtup_area = builtup_area;
		this.age = age;
		this.inmaincity = inmaincity;
	}
	public double calculateTax() {
		if(inmaincity)
		{
			return (base_value*builtup_area*age)+(0.5*builtup_area);
		}
		else
		{
			return (base_value*builtup_area*age);
		}
	}
	public double getTax() {
		return calculateTax();
	}
	@Override
	public String toString() {
		return "Property [base_value=" + base_value + ","
				+ " builtup_area=" + builtup_area + ","
				+ " age=" + age
				+ ", inmaincity=" + inmaincity + "]";
	}
   
    
}
