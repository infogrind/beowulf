package ch.hotstuff.beowulf.frontend.json.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ch.hotstuff.beowulf.frontend.json.service.dt.GetInstrumentListResponse;

@Path("/instruments")
public interface InstrumentService 
{
    @GET
    @Produces("application/json")
    @Path("/getinstrumentlist")
    public GetInstrumentListResponse getInstrumentList();
}
