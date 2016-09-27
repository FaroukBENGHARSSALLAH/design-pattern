package com.farouk.bengharssallah.design.pattern.structural.template.template;

public abstract class Template {
	
	
	     public abstract double operation(int n);
	     
	     public abstract String diplay(String str);
	     
	     /**
	      * 
	      * static template algorithm
	      * 
	      */
	     
	     public void execute(int number, String message){
	    	 
	    	              System.out.println("   ------   Starting static template algorithm  ------------   ");
	    	              System.out.println("");
	    	                             // dynamic template algorithm
	    	              double result = operation(number);
	    	              System.out.println("");
	    	              System.out.println("   Modifying saisable number " + number + " and the output is " + result + " ");
	    	              System.out.println("");
	    	                         // dynamic template algorithm
	    	              System.out.println(diplay(message));
	    	              System.out.println("");
	    	              System.out.println("  ---------- Finishing static template algorithm     ----------  ");
	           }

}
