package com.farouk.bengharssallah.design.pattern.behavioral.command.invoker;

import java.util.HashMap;
import java.util.Map;

import com.farouk.bengharssallah.design.pattern.behavioral.command.command.Command;


public class Invoker {
	
            private Map<String, Command> commandList = new HashMap<>();
            
            public void addCommand(String id, Command command){
            	             commandList.put(id, command);
                  }
            
            public void invoke(String id){
	                      Command command = commandList.get(id);
	                      System.out.println("...........................");
	                      System.out.println("  Executing '" + id + "'  on command '" + command.getClass().getSimpleName() + "'");
	                      if(command != null){
	                                     command.execute();
	                                      }
	                      System.out.println("...........................");
	                      System.out.println(" ");
	                      
                  }
	      
}
