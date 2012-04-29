package ch.hotstuff.beowulf.frontend.json.service.dt;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Instrument implements Serializable
{

	private static final long serialVersionUID = 1L;

	private String valor;
	private String id;
	private String symbol;
	
	final private Map<String, String> fields;
	
	public Instrument()
	{
		fields = new HashMap<String, String>();
	}
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Map<String, String> getFields() {
		return fields;
	}

	@Override
	public String toString() {
		return "Instrument [valor=" + valor + ", id=" + id + ", fields="
				+ fields + "]";
	}
}
