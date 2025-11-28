package com.taxcal;
import java.io.Serializable;
import java.util.*;
public class User implements Serializable{
    private String username;
    private String password;
    private ArrayList<Property> properties;
    private ArrayList<Vehicle> vehicles;
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		this.properties = properties;
		this.vehicles = vehicles;
	}
    
	// to get the username 
	public String getUsername() {
		return username;
	}
	// to compare the password of the user
	public boolean checkPassword(String password) {
		return password.equals(password);
	}
	// printing details of each property
	public ArrayList<Property> getProperties(){
		return properties;
	}
	// printing details of each vehicles
	public ArrayList<Vehicle> getVehicles(){
		return vehicles;
	}
	// to add the new property 
	public void addProperty(Property p)
	{
		properties.add(p);
	}
	public void addVehicle(Vehicle v)
	{
		vehicles.add(v);
	}
}
