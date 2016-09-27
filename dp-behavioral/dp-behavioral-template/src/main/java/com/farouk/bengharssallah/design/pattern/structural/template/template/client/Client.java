package com.farouk.bengharssallah.design.pattern.structural.template.template.client;

import com.farouk.bengharssallah.design.pattern.structural.template.template.Template;
import com.farouk.bengharssallah.design.pattern.structural.template.template.implementation.FirstImplementation;
import com.farouk.bengharssallah.design.pattern.structural.template.template.implementation.SecondImplementation;

public class Client {
   
	       /**
	        * 
	        * A Template design pattern represents an 'abstract' class; 
	        * an abstract refers to the two parts, static and dynamic algorithm.
	        * The static one is related to the abstract class implemented methods.
	        * The dynamic part is implemented in the inherited children classes. During
	        * execution we choose the the child class, the dynamic algorithm that we will use.
	        * 
	        */
	
	 public static void main(String[] args) {
		        
		             Template template = new FirstImplementation();
		             template.execute(5, "perform addition");
		             
		             template = new SecondImplementation();
		             template.execute(5, "perform multiplication");
	}
}
