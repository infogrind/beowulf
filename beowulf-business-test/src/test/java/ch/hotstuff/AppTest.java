package ch.hotstuff;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.hotstuff.beowulf.services.HelloWorld;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/test-context.xml"})
public class AppTest extends TestCase implements ApplicationContextAware
{
	private ApplicationContext appContext;

	@Autowired
	private HelloWorld helloBean;

	@Test
	public void testSpringContext()
	{
		assertNotNull(appContext);
		assertNotNull(helloBean);
	}

	@Test
	public void inverseOfStringIsCorrect()
	{
		assertEquals("renielk suiram", helloBean.revert("marius kleiner"));
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
	throws BeansException
	{
		this.appContext = applicationContext;
	}
}
