package com.farouk.bengharssallah.design.pattern.structural.template.template.implementation;

import com.farouk.bengharssallah.design.pattern.structural.template.template.Template;

public class SecondImplementation  extends Template{
      
			 /**
			  * Dynamic Template algorithm
			  */
	
	@Override
	public double operation(int number) {
			        System.out.println("    .........   Starting dynamic template algorithm in " + this.getClass().getSimpleName() +  " .........   ");
			        System.out.println("");
			        System.out.println("    .........   Perforiming multiplication to the input number " + number  + " by the value 10 in Operarion method   .........   ");
		            return number * 10;
	     }
	
			 /**
			  * Dynamic Template algorithm
			  */
		 
	@Override
	public String diplay(String message) {
		            return  "    .........   " + this.getClass().getSimpleName() + " " + message + " .........  ";
	       }
}
