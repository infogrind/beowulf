package ch.hotstuff.beowulf.wsclient.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ch.hotstuff.beowulf.services.HelloWorld;
import ch.hotstuff.beowulf.wsclient.util.SomeBean;

public class WsClientServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	private Logger LOG = Logger.getLogger(this.getClass());
	
	private SomeBean someBean;
	
	private JaxWsProxyFactoryBean helloServiceFactory;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException 
	{
		LOG.info("Request received");
		final PrintWriter out = response.getWriter();
		response.addHeader("Content-type", "text/plain");
		out.println("Hundwyler up and running");
		out.println("The name is " + someBean.myName());
	}

	@Override
	public void init() throws ServletException
	{
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		this.someBean = (SomeBean) context.getBean("someBean");
		this.helloServiceFactory = (JaxWsProxyFactoryBean) context.getBean("webService_proxyFactory");
	}
}
