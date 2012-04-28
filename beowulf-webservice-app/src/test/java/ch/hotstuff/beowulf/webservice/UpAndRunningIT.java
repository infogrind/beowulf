package ch.hotstuff.beowulf.webservice;

import static org.junit.Assert.assertEquals;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ch.hotstuff.beowulf.services.HelloWorld;

public class UpAndRunningIT 
{
	private Logger LOG = Logger.getLogger(this.getClass());
	
	private static String endpointUrl;
	private HelloWorld soapService;
	
	@BeforeClass
	public static void beforeClass() {
		endpointUrl = System.getProperty("service.url");
	}
	
	@Before
	public void before() {
		final JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(HelloWorld.class);
		factory.setAddress(endpointUrl + "/HelloWorld");
		
		soapService = (HelloWorld) factory.create();
	}
	
	@Test
	public void testWebServiceIsRunning()
	{
		LOG.info("endpointURL = " + endpointUrl);
		
		final String answer = soapService.sayHello();
		assertEquals("Hello, world!", answer);
	}
}
