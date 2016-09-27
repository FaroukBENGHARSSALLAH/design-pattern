package com.farouk.bengharssallah.design.pattern.behavioral.command.implementation;

import com.farouk.bengharssallah.design.pattern.behavioral.command.command.Command;
import com.farouk.bengharssallah.design.pattern.behavioral.command.receiver.ReceiverTypeOne;

public class CommandVersionOne  implements Command{

	  private ReceiverTypeOne receiver;
	  
	  
	public CommandVersionOne(ReceiverTypeOne receiver) {
		          this.receiver = receiver;
	      }
	

	@Override
	public void execute() {
		          receiver.action();
	        }

}
