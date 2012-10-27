package ch.hotstuff.beowulf.services.impl;

import ch.hotstuff.beowulf.dao.HelloDao;
import ch.hotstuff.beowulf.services.HelloWorld;
import ch.hotstuff.beowulf.types.PackageType;

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

	@Override
	public String revert(String s)
	{
		if (s == null) { throw new NullPointerException("s must not be null"); }
		
		return (new StringBuilder(s)).reverse().toString();
	}

	@Override
	public String describePackage(PackageType type)
	{
		switch (type)
		{
		case BAG:
			return "bag";
		case BULK_DUMPED:
			return "bulk dumped";
		case BULK_POWDER:
			return "bulk powder";
		case SERVICE:
			return "service";
		}
		// Can we somehow avoid this?
		return null;
	}

}
