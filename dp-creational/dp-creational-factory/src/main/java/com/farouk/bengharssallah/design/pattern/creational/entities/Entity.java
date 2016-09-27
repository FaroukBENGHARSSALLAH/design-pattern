package com.farouk.bengharssallah.design.pattern.creational.entities;

public abstract class Entity {
	
	       public String name;
	       
	       public Entity(String name) {
			        this.name = name;
		        }

		public abstract void action();
	       

     }
