package ch.hotstuff.beowulf.frontend.json.test;

import static org.junit.Assert.assertEquals;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.MappingJsonFactory;
import org.junit.BeforeClass;
import org.junit.Test;

import ch.hotstuff.beowulf.frontend.json.service.dt.PingBean;


public class UpAndRunningIT
{
	private static String endpointUrl;
	
	@BeforeClass
	public static void beforeClass() {
		endpointUrl = System.getProperty("service.url");
	}
	
	@Test
	public void testJsonRoundtrip() throws Exception {
		 List<Object> providers = new ArrayList<Object>();
	    providers.add(new org.codehaus.jackson.jaxrs.JacksonJsonProvider());
	    WebClient client = WebClient.create(endpointUrl + "/json/pingservice/ping", providers);
		Response r = client.accept("application/json")
				.type("application/json")
				.get();
		assertEquals(Response.Status.OK.getStatusCode(), r.getStatus());
		MappingJsonFactory factory = new MappingJsonFactory();
		JsonParser parser = factory.createJsonParser((InputStream)r.getEntity());
		PingBean output = parser.readValueAs(PingBean.class);
		assertEquals("OK", output.getStatus());
	}

}
