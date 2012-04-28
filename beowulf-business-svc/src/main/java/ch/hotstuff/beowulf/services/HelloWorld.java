package ch.hotstuff.beowulf.services;

import javax.jws.WebService;

@WebService
public interface HelloWorld
{
	/**
	 * Returns a greeting.
	 * @return A greeting text
	 */
	public String sayHello();
}
