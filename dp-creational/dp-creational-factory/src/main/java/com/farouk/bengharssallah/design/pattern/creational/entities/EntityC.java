package com.farouk.bengharssallah.design.pattern.creational.entities;

import java.util.Calendar;

public class EntityC  extends Entity {
	
	public EntityC(String name) {
	       super(name);
           }
	

	@Override
	public void action() {
		
		           System.out.println("       Entity with name " + name + " is perfoming associated action");
		           
		           Calendar now = Calendar.getInstance();
		           
		           int hour = now.get(Calendar.HOUR_OF_DAY);
		           int minute = now.get(Calendar.MINUTE);
		           
		           System.out.print("       Current time is : ");
		           System.out.printf("%02d:%02d", hour, minute);
		           
		           System.out.println("           ");
	        }
	

}
