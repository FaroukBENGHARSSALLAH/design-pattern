package com.farouk.bengharssallah.design.pattern.creational.master;

import com.farouk.bengharssallah.design.pattern.creational.entities.Entity;
import com.farouk.bengharssallah.design.pattern.creational.factory.EntityFactory;

public class FactoryMaster {
	
	         private EntityFactory entityFactory;
                           
	         
	                   // Tight Dependency !!!
			public FactoryMaster(EntityFactory entityFactory) {
				           this.entityFactory = entityFactory;
			    }
			
			
			public Entity getEnityObject(){
				                return entityFactory.createDefaultEntity();
			           }
			
			public Entity getEnityObjectByType(String type){
                                return entityFactory.createEntity(type);
                       }

        }
