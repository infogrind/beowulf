package ch.hotstuff.beowulf.frontend.struts.form;

import org.apache.struts.action.ActionForm;

public class SomeForm extends ActionForm
{
	private static final long serialVersionUID = 1L;
	
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private String food;
	private String drink;
	private String message;
}
