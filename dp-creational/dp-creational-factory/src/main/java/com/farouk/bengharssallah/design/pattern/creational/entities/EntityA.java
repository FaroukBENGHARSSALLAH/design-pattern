package com.farouk.bengharssallah.design.pattern.creational.entities;

import java.util.Calendar;

public class EntityA  extends Entity {

	
	public EntityA(String name) {
		       super(name);
	        }
	
	
	@Override
	public void action() {
		
		           System.out.println("       Entity with name " + name + " is perfoming associated action");
		           
		           Calendar now = Calendar.getInstance();
		           
		           int hour = now.get(Calendar.HOUR_OF_DAY);
		           int minute = now.get(Calendar.MINUTE);
		           int second = now.get(Calendar.SECOND);
		           
		           System.out.print("       Current time is : ");
		           System.out.printf("%02d:%02d:%02d", hour, minute, second);
		           
		           System.out.println("           ");
	        }

	
	

}
