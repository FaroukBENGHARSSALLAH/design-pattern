package com.farouk.bengharssallah.design.pattern.behavioral.command.implementation;

import com.farouk.bengharssallah.design.pattern.behavioral.command.command.Command;
import com.farouk.bengharssallah.design.pattern.behavioral.command.receiver.ReceiverTypeTwo;

public class CommandVersionTwo  implements Command{

	  private ReceiverTypeTwo receiver;
	  
	  
	public CommandVersionTwo(ReceiverTypeTwo receiver) {
		          this.receiver = receiver;
	      }
	

	@Override
	public void execute() {
		          receiver.action();
	        }

}
