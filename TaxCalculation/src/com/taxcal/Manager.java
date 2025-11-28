package com.taxcal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	
   private ArrayList<User> users;
   private User currentUser;
   private final String fileName= "users.dat"; 
   private ArrayList<User> loadUsersFromFile(){
	   File file = new File(fileName);
	   if(!file.exists()) return new ArrayList<>();
	   try  (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
		   return (ArrayList<User>) ois.readObject();
	} catch (Exception e) {
		System.out.println("Error loading data" + e.getMessage());
	    return new ArrayList<>();
	}
   }
   public Manager() {
	   users = new ArrayList<>();
	   users.add(new User("Ashish","Aman@45"));
	   saveUsersToFile();
	   loadUsersFromFile();
   }
   
   public boolean login(String username,String password) {
	   for(User u:users) {
		   if(u.getUsername().equals(username)&& u.checkPassword(password)) {
			   currentUser = u;
			   return true;
		   }
	   }
	   currentUser = new User(username,password);
	   users.add(currentUser);
	   saveUsersToFile();
	   return true;
    }
   public void addProperty(Property p) {
	   currentUser.addProperty(p);
	   saveUsersToFile();
   }
   public void addVehicle(Vehicle v) {
	   currentUser.addVehicle(v);
	   saveUsersToFile();
   }
   public void saveUsersToFile() {
	   try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
		   oos.writeObject(users);
	   }catch(Exception e)
	   {
		   System.out.println("Error saving data"+e.getMessage());
		    
	   }
   }
}
