package com.farouk.bengharssallah.design.pattern.structural.composite.component;

		/**
		 * For Composite design pattern,  Component is an abstract class that 
		 * represents a root for a components tree. It can be either a a composite; storing 
		 * composite component list or a leaf component.
		 *
		 */

public abstract class Component {

	public String id;
	public int level;
	        
	        public Component(String id) {
		               this.id = id;
	            }

			public abstract void operation();
}
