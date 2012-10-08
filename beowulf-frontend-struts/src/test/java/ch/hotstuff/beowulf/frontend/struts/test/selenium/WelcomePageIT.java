package ch.hotstuff.beowulf.frontend.struts.test.selenium;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import ch.hotstuff.beowulf.frontend.struts.test.selenium.pages.FoodinfoPage;
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
	
	@Test
	@Ignore
	public void foodinfoPageShowsCorrectMessage()
	{
		final String FOOD = "Blutwurst";
		final String DRINK = "Bier";
		final String EXPECTED_MESSAGE = "Your favorite food is Blutwurst; your favorite drink is Bier";
		
		final WelcomePage welcomePage = WelcomePage.navigateTo(driver);
		final FoodinfoPage infoPage = welcomePage.enterFoodInfo(driver, FOOD, DRINK);
		final String infoMessage = infoPage.getInfoText();
		
		assertEquals(EXPECTED_MESSAGE, infoMessage);
	}
}
