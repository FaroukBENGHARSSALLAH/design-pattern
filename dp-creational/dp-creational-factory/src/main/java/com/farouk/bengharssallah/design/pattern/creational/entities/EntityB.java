package com.farouk.bengharssallah.design.pattern.creational.entities;

import java.util.Calendar;

public class EntityB  extends Entity {
	
	public EntityB(String name) {
	       super(name);
          }
	

	@Override
	public void action() {
		
		           System.out.println("       Entity with name " + name + " is perfoming associated action");
		           
		           Calendar now = Calendar.getInstance();
		           int year = now.get(Calendar.YEAR);
		           int month = now.get(Calendar.MONTH) + 1;
		           int day = now.get(Calendar.DAY_OF_MONTH);
		           
		           System.out.print("       Current day is : ");
		           System.out.printf("%d-%02d-%02d", year, month, day);
		           
		           System.out.println("           ");
	       }
	

}
