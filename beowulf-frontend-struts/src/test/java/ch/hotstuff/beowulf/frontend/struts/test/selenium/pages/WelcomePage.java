package ch.hotstuff.beowulf.frontend.struts.test.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage
{
	@FindBy(id="title")
	private WebElement titleText;
	
	public String getTitleText() {
		return titleText.getText();
	}

	public static WelcomePage navigateTo(WebDriver driver)
	{
		final String URL = System.getProperty("webapp.url");
		assert(URL != null);
		System.out.println("URL = " + URL);
		
		driver.get(URL);
		return PageFactory.initElements(driver, WelcomePage.class);
	}
}
