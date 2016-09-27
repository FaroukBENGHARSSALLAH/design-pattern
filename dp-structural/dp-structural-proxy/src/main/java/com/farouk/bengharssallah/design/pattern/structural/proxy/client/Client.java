package com.farouk.bengharssallah.design.pattern.structural.proxy.client;

import com.farouk.bengharssallah.design.pattern.structural.proxy.implementation.Proxy;
 

      /**
       *  A proxy desgin pattern is used to control a Class access 
       * and its method execution. Operations should be accessed by proxy Class, for more you can see
       * the attached picture in project folder.
       **/

public class Client {
	
	  public static void main(String[] args) {
		                  Proxy pxy = new Proxy();
		                  pxy.display();
	            }

}
