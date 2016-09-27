package com.farouk.bengharssallah.design.pattern.structural.decorator.component.decorator.concrete;

import com.farouk.bengharssallah.design.pattern.structural.decorator.component.Component;
import com.farouk.bengharssallah.design.pattern.structural.decorator.component.decorator.Decorator;

public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Component component) {
		          super(component);
	          }

	@Override
	public void operation() {
					System.out.print("                 Concrete Decorator  : before, this my usual operation execution output  :  ");
					component.operation();
					System.out.println("                 Concrete Decorator : after , this my decorated operation version, version 'Decorated' ");
	             }

}
