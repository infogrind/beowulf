package ch.hotstuff.beowulf.wsclient.util.impl;

import org.apache.log4j.Logger;

import ch.hotstuff.beowulf.wsclient.util.SomeBean;

public class SomeBeanImpl implements SomeBean 
{
	private Logger LOG = Logger.getLogger(this.getClass());
	
	private String name;

	public void setName(String name) 
	{
		LOG.debug("Setting name: " + name);
		this.name = name;
	}
	
	@Override
	public String myName()
	{
		return name;
	}


}
