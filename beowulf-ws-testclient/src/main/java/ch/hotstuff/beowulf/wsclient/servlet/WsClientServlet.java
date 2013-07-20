package ch.hotstuff.beowulf.wsclient.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import ch.hotstuff.beowulf.services.HelloWorld;
import ch.hotstuff.beowulf.wsclient.util.SomeBean;

public class WsClientServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	private Logger LOG = LoggerFactory.getLogger(this.getClass());

	private SomeBean someBean;
	private HelloWorld webService;
	private FactoryBean<HelloWorld> proxyFactory;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		LOG.info("Request received");
		final PrintWriter out = response.getWriter();
		response.addHeader("Content-type", "text/plain");
		out.println("Hundwyler up and running");
		out.println("The name is " + someBean.myName());

		try {
			out.println(webService.revert("Ein Neger mit Gazelle zagt im Regen nie."));
			out.println("Katzeklo <-> " + webService.revert("Katzeklo"));
		}
		catch (Exception e) {
			out.println("ERROR: Could not call web service. (" + e.getMessage() + ")");
		}
		out.println("Does the factory yield a singleton? " + proxyFactory.isSingleton());
	}

	@SuppressWarnings("unchecked")
	@Override
	public void init() throws ServletException
	{
		LOG.info("Servlet initialization");
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		someBean = (SomeBean) context.getBean("someBean");
		webService = (HelloWorld) context.getBean("helloService");
		proxyFactory = (FactoryBean<HelloWorld>) context.getBean("&helloService_portProxyFactory");
	}
}
