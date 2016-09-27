package com.farouk.bengharssallah.design.pattern.creational.prototype.entity;

public class Entity {
	
	 private String name;
     private String descritption;
	
		
		public Entity() {
			
		     }
		
		
	   public Entity(String name, String descritption) {
					this.name = name;
					this.descritption = descritption;
					
		    }
	   
	   
	   @Override
	 public String toString(){
		               return "I'm an entity with name : " + name + " and with description : " + descritption;
	      }
	   
	   
	    public String getName() {
			            return name;
		               }


		public String getDescritption() {
			             return descritption;
		               }

				
				

}
