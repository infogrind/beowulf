package ch.hotstuff.beowulf.services.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import ch.hotstuff.beowulf.dao.intf.HelloDao;

public class HelloWorldTest 
{
	@Test
	public void testCorrectMessageIsReturned()
	{
		HelloWorldImpl impl = new HelloWorldImpl();
		HelloDao daoMock = Mockito.mock(HelloDao.class);
		Mockito.when(daoMock.getHelloGreeting()).thenReturn("Hello, world!");
		impl.setDao(daoMock);
		
		assertEquals("Hello, world!", impl.sayHello());
	}
}
