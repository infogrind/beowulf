package ch.hotstuff.beowulf.frontend.json.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/pingservice")
public interface PingService {
	
    @POST
    @Produces("application/json")
    @Path("/ping")
    public Response ping();
}
