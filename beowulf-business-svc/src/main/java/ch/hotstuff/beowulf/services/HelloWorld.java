package ch.hotstuff.beowulf.services;

import javax.jws.WebService;

import ch.hotstuff.beowulf.types.PackageType;

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
	
	/**
	 * Returns a string based on the package type passed.
	 */
	public String describePackage(PackageType type);
}
