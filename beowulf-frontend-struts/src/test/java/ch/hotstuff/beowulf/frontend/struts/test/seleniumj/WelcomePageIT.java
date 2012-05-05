package ch.hotstuff.beowulf.frontend.struts.test.seleniumj;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.browserlaunchers.locators.SafariLocator;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import ch.hotstuff.beowulf.frontend.struts.test.selenium.pages.WelcomePage;

public class WelcomePageIT
{
	private static WebDriver driver;
	
	@Before
	public void init()
	{
		driver = new HtmlUnitDriver();
	}
	
	@Test
	public void welcomePageHasCorrectTitle()
	{
		final String EXPECTED_TITLE = "Hello, World!";
		WelcomePage page = WelcomePage.navigateTo(driver);
		final String actualTitle = page.getTitleText();
		
		assertEquals(EXPECTED_TITLE, actualTitle);
	}
}
