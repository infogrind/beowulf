package ch.hotstuff.beowulf.dao.impl;

import ch.hotstuff.beowulf.dao.intf.HelloDao;

public class HelloDaoImpl implements HelloDao
{
	@Override
	public String getHelloGreeting()
	{
		return "Hello, world!";
	}
}