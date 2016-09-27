package com.farouk.bengharssallah.design.pattern.structural.decorator.component.decorator;

import com.farouk.bengharssallah.design.pattern.structural.decorator.component.Component;

public abstract class Decorator extends Component {
	
	protected Component component;
	
	public Decorator(Component component) {
	          this.component = component;
	        }

}
