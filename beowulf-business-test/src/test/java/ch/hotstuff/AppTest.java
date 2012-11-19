package ch.hotstuff;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/test-context.xml"})
public class AppTest extends TestCase implements ApplicationContextAware
{
	private ApplicationContext appContext;
	@Test
	public void testSpringContext()
	{
		assertNotNull(appContext);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
	throws BeansException
	{
		this.appContext = applicationContext;
	}
}
