package ch.hotstuff.beowulf.wsclient.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlaygroundServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	final private Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		LOG.info("Starting servlet for {}", this.getClass());
		final PrintWriter out = response.getWriter();
		response.setHeader("Content-type", "text/plain");

		out.println("Hello, World!");
	}

}
