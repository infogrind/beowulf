package ch.hotstuff.beowulf.wsclient.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WsClientServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException 
	{
		final PrintWriter out = response.getWriter();
		response.addHeader("Content-type", "text/plain");
		out.println("Hundwyler up and running");
	}



}
