package ch.hotstuff.beowulf.frontend.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ch.hotstuff.beowulf.frontend.struts.form.SomeForm;
import ch.hotstuff.beowulf.services.HelloWorld;

public class SomeAction extends Action
{
	private HelloWorld helloService;

	public HelloWorld getHelloService() {
		return helloService;
	}

	public void setHelloService(HelloWorld helloService) {
		this.helloService = helloService;
	}

	@Override
	public ActionForward execute(
			ActionMapping mapping, 
			ActionForm form,
			HttpServletRequest request, 
			HttpServletResponse response)
	throws Exception 
	{
		final SomeForm someForm = (SomeForm) form;
		final String message = helloService.sayHello();
		someForm.setMessage(message);
		
		return mapping.findForward("foodinfo");
	}

}
