package ch.hotstuff.beowulf.frontend.json.service.impl;

import ch.hotstuff.beowulf.frontend.json.service.InstrumentService;
import ch.hotstuff.beowulf.frontend.json.service.dt.GetInstrumentListResponse;
import ch.hotstuff.beowulf.frontend.json.service.dt.Instrument;

public class InstrumentServiceImpl implements InstrumentService
{
	@Override
	public GetInstrumentListResponse getInstrumentList()
	{
		final GetInstrumentListResponse response = new GetInstrumentListResponse();
		final Instrument inst1 = new Instrument();
		inst1.setId("123");
		inst1.setValor("1777230");
		inst1.setSymbol("AAPL");
		
		inst1.getFields().put("U_ASD", "1233.21");
		inst1.getFields().put("A_EEI", "0.33");
		inst1.getFields().put("U_INSTHB", "-");
		
		response.getInstruments().add(inst1);
		
		final Instrument inst2 = new Instrument();
		inst2.setId("456");
		inst2.setValor("70000");
		inst2.setSymbol("FCBK");
		inst2.getFields().put("U_LTST", "999999.99");
		inst2.getFields().put("U_CHG_ABS", "-23.1");
		inst2.getFields().put("U_CHG_REL", "-0.01");
		response.getInstruments().add(inst2);
		
		return response;
	}

}
