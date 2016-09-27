package com.farouk.bengharssallah.design.pattern.structural.proxy.implementation;

import java.util.Scanner;

import com.farouk.bengharssallah.design.pattern.structural.proxy.interfacetarget.Target;
import com.farouk.bengharssallah.design.pattern.structural.proxy.interfacetarget.implementation.TargetImplmentation;

public class Proxy implements Target{

	   private TargetImplmentation targetImplmentation;
	   
	   
	public void display() {
		  
		            System.out.println("   Executing Target display method by Proxy class via its display method");
		            System.out.println("");
		     
		            System.out.println("");
		            System.out.println("   Please, to execute Target display method you should the secret key (Enter 23pxy@)     ");
		            System.out.println("");
		            Scanner scanner = new Scanner(System.in);
		            String key = scanner.nextLine();
		            if(!key.equals(getSecretKey())){
		            	                    System.out.println("");
		            	                    System.out.println("    You are not allowed to execute Target display method, you should speficfy the correct secret key       ");
		                                    System.out.println("    The first time was used to show you the real utility for a proxy design pattern, the correct secret key is 23prxy@   ");
		                                    System.out.println("");
		                                         }
		            boolean repeat = true;
		            while (repeat){
		            	                    System.out.println("   Enter the secret key ");
		            	                    System.out.println("");
		            	                    key = scanner.nextLine();
		            	                    if(key.equals(getSecretKey())){
		            	                    	                     repeat = false ;
		            	                                       }
		                                         }
		            scanner.close();                        
		            if(targetImplmentation == null){
			                                 targetImplmentation = new TargetImplmentation();	
			                                                   }
		            System.out.println("");
		            System.out.println("   ------------------------------------");
		            System.out.println("");
		            targetImplmentation.display();
				    System.out.println("");
				    System.out.println("   ------------------------------------");
		            System.out.println("");
				    System.out.println("finshing executing Target display method by Proxy class via its display method");
		            System.out.println("");
	       }
	
	
	public String getSecretKey() {
		return "23prxy@";
	 }
	  
	 

}
