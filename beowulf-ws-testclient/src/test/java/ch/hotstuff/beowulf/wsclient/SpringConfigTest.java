package ch.hotstuff.beowulf.wsclient;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.hotstuff.beowulf.services.HelloWorld;
import ch.hotstuff.beowulf.wsclient.util.SomeBean;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/spring-beowulf-ws-testclient.xml"})
public class SpringConfigTest implements ApplicationContextAware
{
	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
	throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	@Test
	public void someBeanIsDefined()
	{
		SomeBean someBean = (SomeBean) applicationContext.getBean("someBean");
		assertNotNull(someBean.myName());
	}
	
	@Test
	public void webServiceInstantiation()
	{
		System.out.println("Getting service bean");
		HelloWorld helloService = (HelloWorld) applicationContext.getBean("helloService");
		
		System.out.println("Calling service");
		assertEquals("Hello, world!", helloService.sayHello());
		
		System.out.println("Calling service again");
		assertEquals("Hello, world!", helloService.sayHello());
		
		System.out.println("Getting another service bean");
		HelloWorld hello2 = (HelloWorld) applicationContext.getBean("helloService");
		
		System.out.println("Calling second service instance");
		assertEquals("Hello, world!", hello2.sayHello());
		
		System.out.println("Manually calling proxy factory");
		HelloWorld hello3 = (HelloWorld) applicationContext.getBean("helloService_portProxy");
		
		System.out.println("Calling third service instance");
		assertEquals("Hello, world!", hello3.sayHello());
	}
}
