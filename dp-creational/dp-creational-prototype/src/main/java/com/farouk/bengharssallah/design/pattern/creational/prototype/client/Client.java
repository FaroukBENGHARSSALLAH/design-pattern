package com.farouk.bengharssallah.design.pattern.creational.prototype.client;

import java.util.LinkedList;

import com.farouk.bengharssallah.design.pattern.creational.prototype.composite.Composite;

import com.farouk.bengharssallah.design.pattern.creational.prototype.composite.implementation.CompositeImplementation;

import com.farouk.bengharssallah.design.pattern.creational.prototype.entity.Entity;

public class Client {
	
	          public static void main(String[] args) {
	        	                      LinkedList<Entity> entityList = new LinkedList<Entity>();
					                  entityList.add(new Entity("Entity 1", "  I'm used a component for Composite 'composite' "));
					                  entityList.add(new Entity("Entity 2", "  I'm used a to control Composite 'composite' execution "));
					                  Composite composite = new CompositeImplementation(entityList);
					                  System.out.println(composite.DescribeAssociatedEntities());
					                  Composite clonedCompositer = (Composite) composite.clone();
					                  System.out.println("------------------- Cloned Composite Message --------------");
					                  System.out.println(clonedCompositer.DescribeAssociatedEntities());
					               
	                               }

}
