package ch.hotstuff.beowulf.frontend.struts.test.spring;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.hotstuff.beowulf.services.HelloWorld;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/applicationContext-services-local.xml"})
public class FrontendSpringConfigTest
{
	@Autowired
	private ApplicationContext applicationContext;

	@Test
	public void applicationContextIsProperlyInitialized()
	{
		final HelloWorld helloService;
		helloService = (HelloWorld) applicationContext.getBean("helloService");
		assertNotNull("helloService bean not available", helloService);
	}
}
