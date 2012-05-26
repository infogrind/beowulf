package ch.hotstuff.beowulf.wsclient.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class WsClientServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	private Logger LOG = Logger.getLogger(this.getClass());

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException 
	{
		LOG.info("Request received");
		final PrintWriter out = response.getWriter();
		response.addHeader("Content-type", "text/plain");
		out.println("Hundwyler up and running");
	}



}