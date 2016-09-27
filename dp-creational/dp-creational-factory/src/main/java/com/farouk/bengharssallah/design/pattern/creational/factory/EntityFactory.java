package com.farouk.bengharssallah.design.pattern.creational.factory;

import com.farouk.bengharssallah.design.pattern.creational.entities.Entity;

public interface EntityFactory {
	
	 public Entity createDefaultEntity(); 
	
	 public Entity createEntity(String type);
	  

     }
