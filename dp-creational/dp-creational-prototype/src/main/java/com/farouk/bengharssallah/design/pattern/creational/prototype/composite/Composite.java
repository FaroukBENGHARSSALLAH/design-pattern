package com.farouk.bengharssallah.design.pattern.creational.prototype.composite;

import java.util.LinkedList;

import com.farouk.bengharssallah.design.pattern.creational.prototype.entity.Entity;

public abstract class Composite implements Cloneable {
	
	      protected LinkedList<Entity> entityList = null;
	      
	      public Composite(){
	                  super();
                 }
	      
	      
	      
	      public Composite(LinkedList<Entity> entityList){
	    	          super();
	    	          this.entityList = entityList;
	              } 
	      

		@Override
	      public Composite clone(){
	    	                Composite clonedComposite = null;
							try {
								clonedComposite = (Composite) super.clone();
							         } 
							catch (Exception e) {
								          e.printStackTrace();
							         }
				            return clonedComposite;
	    	           
	              }
		
		
		public LinkedList<Entity> getEntityList() {
				         if(entityList == null){
				        	               entityList = new LinkedList<Entity>();
				                    }
				         return entityList;
			}
		 
	      
	      public abstract String DescribeAssociatedEntities();

     }