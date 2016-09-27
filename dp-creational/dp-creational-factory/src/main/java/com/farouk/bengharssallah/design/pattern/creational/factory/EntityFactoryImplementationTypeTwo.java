package com.farouk.bengharssallah.design.pattern.creational.factory;

import com.farouk.bengharssallah.design.pattern.creational.entities.Entity;
import com.farouk.bengharssallah.design.pattern.creational.entities.EntityB;
import com.farouk.bengharssallah.design.pattern.creational.entities.EntityC;

public class EntityFactoryImplementationTypeTwo implements EntityFactory{
	
	  @Override
	public Entity createDefaultEntity() {
		     return new EntityC("C");
	              }
	  
	
	  @Override
	 public Entity createEntity(String type){
		                 Entity entity = null;
		                 if(type.equals("B")){
		                	            entity = new EntityB("B");
		                             }
		                 if(type.equals("C")){
           	                      entity = new EntityC("C");
                                   }
		                 return entity;
	                 }

        }