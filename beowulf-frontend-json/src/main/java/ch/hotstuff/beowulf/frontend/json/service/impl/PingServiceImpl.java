package ch.hotstuff.beowulf.frontend.json.service.impl;

import javax.ws.rs.core.Response;

import ch.hotstuff.beowulf.frontend.json.service.PingService;
import ch.hotstuff.beowulf.frontend.json.service.dt.PingBean;

public class PingServiceImpl implements PingService {

	@Override
	public Response ping()
	{
		final PingBean bean = new PingBean();
		bean.setStatus("OK");
		
		return Response.ok().entity(bean).build();
	}

}
