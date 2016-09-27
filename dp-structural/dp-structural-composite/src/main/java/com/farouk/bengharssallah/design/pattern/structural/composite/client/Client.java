package com.farouk.bengharssallah.design.pattern.structural.composite.client;

import com.farouk.bengharssallah.design.pattern.structural.composite.composite.Composite;
import com.farouk.bengharssallah.design.pattern.structural.composite.leaf.Leaf;
		
		/**
		 * Composite design pattern is usually used in case of dealing with 
		 * a tree of component object sharing the same characteristics related 
		 * to each other in logic context.
		 *
		 */
public class Client {
	
	
			 public static void main(String[] args) {
				 
				Composite form = new Composite("form");
				Composite panel = new Composite("panel");
				
				Leaf inputName = new Leaf("input_name");
				Leaf inputPawsord = new Leaf("input_pawsord");
				Leaf inputSubmit = new Leaf("input_submit");
				
				Leaf labelName = new Leaf("label_name");
				Leaf labelMail = new Leaf("label_mail");
				
				form.add(panel);
				form.add(labelName);
				form.add(labelMail);
				
				panel.add(inputName);
				panel.add(inputPawsord);
				panel.add(inputSubmit);
				
				form.operation();
				
			             }
			 
			 
}
