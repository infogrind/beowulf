package ch.hotstuff.beowulf.wsclient.util.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.hotstuff.beowulf.wsclient.util.SomeBean;

public class SomeBeanImpl implements SomeBean
{
	private Logger LOG = LoggerFactory.getLogger(this.getClass());

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
