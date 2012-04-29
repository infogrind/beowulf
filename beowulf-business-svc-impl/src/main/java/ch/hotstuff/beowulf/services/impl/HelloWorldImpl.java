package ch.hotstuff.beowulf.services.impl;

import ch.hotstuff.beowulf.dao.intf.HelloDao;
import ch.hotstuff.beowulf.services.HelloWorld;

public class HelloWorldImpl implements HelloWorld
{
	private HelloDao dao;
	
	public HelloDao getDao() {
		return dao;
	}

	public void setDao(HelloDao dao) {
		this.dao = dao;
	}

	@Override
	public String sayHello() 
	{
		final String greeting = dao.getHelloGreeting();
		return greeting;
	}

}
