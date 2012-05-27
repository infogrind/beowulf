package ch.hotstuff.beowulf.wsclient;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
}
