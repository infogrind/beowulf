package ch.hotstuff.beowulf.frontend.json.service.dt;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class GetInstrumentListResponse implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private final List<Instrument> instruments;
	
	public GetInstrumentListResponse()
	{
		instruments = new LinkedList<Instrument>();
	}
	
	public List<Instrument> getInstruments() {
		return instruments;
	}
	
	@Override
	public String toString() {
		return "GetInstrumentListResponse [instruments=" + instruments + "]";
	}
}
