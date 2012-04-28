package ch.hotstuff.beowulf.services.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ch.hotstuff.beowulf.services.HelloWorld;

public class HelloWorldTest 
{
	@Test
	public void testCorrectMessageIsReturned()
	{
		HelloWorld impl = new HelloWorldImpl();
		assertEquals("Hello, world!", impl.sayHello());
	}
}
