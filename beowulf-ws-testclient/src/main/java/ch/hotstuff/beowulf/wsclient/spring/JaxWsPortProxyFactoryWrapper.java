package ch.hotstuff.beowulf.wsclient.spring;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import ch.hotstuff.beowulf.services.HelloWorld;

public class JaxWsPortProxyFactoryWrapper implements InitializingBean
{
	private JaxWsPortProxyFactoryBean wrappedBean;
	
	public String getServiceName() {
		return wrappedBean.getServiceName();
	}

	public void setServiceName(String serviceName) {
		wrappedBean.setServiceName(serviceName);
	}

	public Class<?> getServiceInterface() {
		return wrappedBean.getServiceInterface();
	}

	public void setServiceInterface(Class<?> serviceInterface) {
		wrappedBean.setServiceInterface(serviceInterface);
	}

	public String getEndpointAddress() {
		return wrappedBean.getEndpointAddress();
	}

	public void setEndpointAddress(String endpointAddress) {
		wrappedBean.setEndpointAddress(endpointAddress);
	}
	
	public JaxWsPortProxyFactoryWrapper()
	{
		wrappedBean = new JaxWsPortProxyFactoryBean();
	}

	@Override
	public void afterPropertiesSet() throws Exception
	{
		wrappedBean.afterPropertiesSet();
	}
	
	public HelloWorld getPortInstance()
	{
		return (HelloWorld) wrappedBean.getObject();
	}

}
