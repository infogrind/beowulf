package ch.hotstuff.beowulf.wsclient;

import static org.junit.Assert.assertEquals;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import ch.hotstuff.beowulf.services.HelloWorld;

// Marked as ignored because these tests need the web service to run at 8443.
@Ignore
public class AlternativeProxyFactoryTest
{
	@Test
	public void cxfProxyFactoryBeanInstantiation()
	{
		System.out.println("Instantiating factoryBean");
		final JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
		
		System.out.println("Setting properties");
		factoryBean.setServiceClass(HelloWorld.class);
		factoryBean.setAddress("http://localhost:8443/webservice/HelloWorld");
		
		System.out.println("Creating proxy");
		HelloWorld service = (HelloWorld) factoryBean.create();
		
		System.out.println("Calling method");
		assertEquals("Hello, world!", service.sayHello());
		
		System.out.println("Calling again");
		assertEquals("Hello, world!", service.sayHello());
		
		System.out.println("Creating second proxy");
		HelloWorld service2 = (HelloWorld) factoryBean.create();
		
		System.out.println("Calling method");
		assertEquals("Hello, world!", service2.sayHello());
		
		System.out.println("Calling again");
		assertEquals("Hello, world!", service2.sayHello());
	}

	@Test
	public void springProxyFactoryBeanInstantiation()
	{
		System.out.println("Instantiating factoryBean");
		final JaxWsPortProxyFactoryBean factoryBean = new JaxWsPortProxyFactoryBean();
		
		System.out.println("Setting properties");
		factoryBean.setServiceInterface(HelloWorld.class);
		factoryBean.setEndpointAddress("http://localhost:8443/webservice/HelloWorld");
		factoryBean.setServiceName("HelloWorld");
		factoryBean.afterPropertiesSet();
		
		System.out.println("Creating proxy");
		HelloWorld service = (HelloWorld) factoryBean.getObject();
		
		System.out.println("Calling method");
		assertEquals("Hello, world!", service.sayHello());
		
		System.out.println("Calling again");
		assertEquals("Hello, world!", service.sayHello());
		
		System.out.println("Creating second proxy");
		HelloWorld service2 = (HelloWorld) factoryBean.getObject();
		
		System.out.println("Calling method");
		assertEquals("Hello, world!", service2.sayHello());
		
		System.out.println("Calling again");
		assertEquals("Hello, world!", service2.sayHello());
	}
}
