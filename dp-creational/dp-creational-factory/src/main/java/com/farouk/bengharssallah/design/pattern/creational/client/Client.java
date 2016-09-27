package com.farouk.bengharssallah.design.pattern.creational.client;

import com.farouk.bengharssallah.design.pattern.creational.entities.Entity
;
import com.farouk.bengharssallah.design.pattern.creational.factory.EntityFactoryImplementationTypeOne;
import com.farouk.bengharssallah.design.pattern.creational.factory.EntityFactoryImplementationTypeTwo;

import com.farouk.bengharssallah.design.pattern.creational.master.FactoryMaster;

				
				/**
				 * 
				 * A factory design pattern enables the creation of Objects by choosing the target
				 * class; it helps choose the object template to be created. Thus, you can implement
				 * you own factory, that by giving the target class ID, it will instantiate the target class.
				 *
				 */

public class Client {
               
	                public static void main(String[] args) {
						               
	                	                  FactoryMaster factoryMaster = new FactoryMaster(new EntityFactoryImplementationTypeOne());
	                	                  Entity entity = factoryMaster.getEnityObject();
	                	                  entity.action();
	                	                  
	                	                  System.out.println("          ------------------      ");
	                	                  
	                	                  entity = factoryMaster.getEnityObjectByType("B");
	                	                  entity.action();
	                	                  
	                	                  System.out.println("          ------------------      ");
	                	                  
	                	                  factoryMaster = new FactoryMaster(new EntityFactoryImplementationTypeTwo());
	                	                  entity = factoryMaster.getEnityObject();
	                	                  entity.action();
	                	                  
	                	                  
	                	                  
					}
}
