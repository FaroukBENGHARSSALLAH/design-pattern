package com.farouk.bengharssallah.design.pattern.structural.composite.leaf;

import com.farouk.bengharssallah.design.pattern.structural.composite.component.Component;

      /**
       * Leaf Component represents an element without children
       * having a superior level than its parent and the same level with
       * the other leafs.
       *
       */

public class Leaf  extends Component{

	public Leaf(String id) {
		     super(id);
	  }

	@Override
	public void operation() {
		           String tabulation  = "";
		           for(int i=0; i<level; i++){
		        	             tabulation += "---------------------/";
		                       }
		           System.out.println(tabulation + "  Leaf with ID : '" + id + "'  with level : " + level );
	   }
	
	

}
