package ch.hotstuff.beowulf.frontend.struts.test.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FoodinfoPage 
{
	@FindBy(id="foodinfo")
	private WebElement infoParagraph;

	public String getInfoText() {
		return infoParagraph.getText();
	}
}
