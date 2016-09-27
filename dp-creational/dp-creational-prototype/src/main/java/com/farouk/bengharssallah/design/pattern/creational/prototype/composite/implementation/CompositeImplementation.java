package com.farouk.bengharssallah.design.pattern.creational.prototype.composite.implementation;

import java.util.LinkedList;

import com.farouk.bengharssallah.design.pattern.creational.prototype.composite.Composite;
import com.farouk.bengharssallah.design.pattern.creational.prototype.entity.Entity;

public class CompositeImplementation extends Composite {

		public CompositeImplementation(){
			
		         }
		
		
		
		public CompositeImplementation(LinkedList<Entity> entityList) {
			              super(entityList);
		         }
		
		
	
		  @Override
		public String DescribeAssociatedEntities() {
			                  String message =  "              My associated " +  entityList.size() + " entities have the following presentation messages :              \n";
			                  for(Entity entity : entityList){
			                	                    message +=  "                " + entity.toString() + "    \n";
			                                   }
			                  message += "\n";
			                  return message;
		              }

}
