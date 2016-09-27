package com.farouk.bengharssallah.design.pattern.structural.composite.composite;

import java.util.ArrayList;
import java.util.List;

import com.farouk.bengharssallah.design.pattern.structural.composite.component.Component;
		
		/**
		 * Composite Component represents an element having a list of
		 * component children having a minor level than its children.
		 *
		 */

public class Composite extends Component{

	private  List<Component> children = new ArrayList<Component>();
	
	
	      public Composite(String id) {
		             super(id);
	           }
	
	@Override
	public void operation() {
		            String tabulation  = "";
		            for(int i=0; i<level; i++){
		            	             tabulation  += "---------------------/";
		                               }
		            System.out.println(tabulation + "  composite with ID : '" + id + "'  with level : " + level );
		            System.out.println(" ");
		            for(Component component : children){
		            	             component.operation();
		                          }
		            System.out.println(" ");
		
	}
	
	public void add(Component component){
		             component.level = this.level + 1;
		             children.add(component);
	        }
	
	public void remove(Component component){
                     children.remove(component);
             }
	
	public List<Component> getChildren(Component component){
			          return children;
             }
	
	

}
