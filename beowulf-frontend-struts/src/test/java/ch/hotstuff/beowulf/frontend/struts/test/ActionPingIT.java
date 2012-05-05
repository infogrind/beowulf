package ch.hotstuff.beowulf.frontend.struts.test;

import static org.junit.Assert.assertEquals;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.BeforeClass;
import org.junit.Test;

public class ActionPingIT 
{
	private static String webappUrl;
	
	@BeforeClass
	public static void beforeClass() {
		webappUrl = System.getProperty("webapp.url");
	}
	
	@Test
	public void responseCodeIs200() throws Exception
	{
		final int CODE_OK = 200;
		final URL url = new URL(webappUrl);
		final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		final int responseStatus = connection.getResponseCode();
		
		assertEquals(CODE_OK, responseStatus);
	}
}
