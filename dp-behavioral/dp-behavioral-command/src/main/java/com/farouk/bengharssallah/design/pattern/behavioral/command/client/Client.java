package com.farouk.bengharssallah.design.pattern.behavioral.command.client;

import com.farouk.bengharssallah.design.pattern.behavioral.command.command.Command;

import com.farouk.bengharssallah.design.pattern.behavioral.command.implementation.CommandVersionOne;
import com.farouk.bengharssallah.design.pattern.behavioral.command.implementation.CommandVersionTwo;
import com.farouk.bengharssallah.design.pattern.behavioral.command.invoker.Invoker;
import com.farouk.bengharssallah.design.pattern.behavioral.command.receiver.ReceiverTypeOne;
import com.farouk.bengharssallah.design.pattern.behavioral.command.receiver.ReceiverTypeTwo;

		/**
		 * 
		 * A command design pattern represents a tool for designing some 
		 * actions with an ID, and associating them to a receiver class. The 
		 * invoker will handle executing these actions, by assembling the command with 
		 * the action ID. Thus, the invoker will instantiate the command class according to the action ID,
		 * and the command will instantiate the associated receiver.
		 *  Its the basic function of the command of the TV
		 *
		 */

public class Client {

	             public static void main(String[] args) {
					 
	            	                 ReceiverTypeOne receiverOne = new ReceiverTypeOne();
	            	                 ReceiverTypeTwo receiverTwo = new ReceiverTypeTwo();
	            	                 
	            	                 Command commandOne = new CommandVersionOne(receiverOne);
	            	                 Command commandTwo = new CommandVersionTwo(receiverTwo);
	            	                 
	            	                 Invoker invoker = new Invoker();
	            	                 invoker.addCommand("menu", commandOne);
	            	                 invoker.addCommand("exit", commandTwo);
	            	                 
	            	                 invoker.invoke("menu");
	            	                 invoker.invoke("exit");
	            	                 
				        }
}
