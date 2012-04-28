package ch.hotstuff.beowulf.services.impl;

import ch.hotstuff.beowulf.services.HelloWorld;

public class HelloWorldImpl implements HelloWorld
{
	@Override
	public String sayHello() 
	{
		return "Hello, world!";
	}

}
