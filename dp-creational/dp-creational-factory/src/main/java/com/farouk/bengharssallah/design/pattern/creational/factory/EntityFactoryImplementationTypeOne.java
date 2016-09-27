package com.farouk.bengharssallah.design.pattern.creational.factory;

import com.farouk.bengharssallah.design.pattern.creational.entities.Entity;
import com.farouk.bengharssallah.design.pattern.creational.entities.EntityA;
import com.farouk.bengharssallah.design.pattern.creational.entities.EntityB;

public class EntityFactoryImplementationTypeOne implements EntityFactory{
	
	

	  @Override
	public Entity createDefaultEntity() {
		     return new EntityA("A");
	              }
	  
	
	  @Override
	 public Entity createEntity(String type){
		                 Entity entity = null;
		                 if(type.equals("A")){
		                	            entity = new EntityA("A");
		                             }
		                 if(type.equals("B")){
             	                      entity = new EntityB("B");
                                     }
		                 return entity;
	                 }

   }