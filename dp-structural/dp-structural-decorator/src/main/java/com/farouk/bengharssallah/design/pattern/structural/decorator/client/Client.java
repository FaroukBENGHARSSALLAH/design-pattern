package com.farouk.bengharssallah.design.pattern.structural.decorator.client;

import com.farouk.bengharssallah.design.pattern.structural.decorator.component.Component;
import com.farouk.bengharssallah.design.pattern.structural.decorator.component.concrete.ConcreteCompnent;
import com.farouk.bengharssallah.design.pattern.structural.decorator.component.decorator.concrete.ConcreteDecorator;

       /**
        * 
        * A decoration design pattern adds some functionality to a class, thus in execution 
        * it execute the normal and usual actions of the class and later execute its own tasks. It should
        * inherits the the target class and redefine the methods, where in the bodies, it calls them. 
        *
        */
public class Client {
	
	    public static void main(String[] args) {
	    	Component component=new ConcreteCompnent();
	    	System.out.println("----------- usual operation exceution  ----------------");
	    	component.operation();
	    	System.out.println("--------------------"); 
	    	System.out.println("----------- decoration effect on operation exceution  ----------------");
	    	component=new ConcreteDecorator(component);
	    	component.operation();
	    	System.out.println("--------------------");
	    	
		}

}
