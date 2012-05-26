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
	
	/**
	 * Reverts a string.
	 * Example: revert("Hund") = "dnuH".
	 * @param s Any string
	 * @return The reversed form of <code>s</code>.
	 */
	public String revert(String s);
}
