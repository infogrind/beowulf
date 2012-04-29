package ch.hotstuff.beowulf.frontend.json.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/pingservice")
public interface PingService {
	
    @GET
    @Produces("application/json")
    @Path("/ping")
    public Response ping();
}
