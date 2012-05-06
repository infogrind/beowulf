package ch.hotstuff.beowulf.frontend.struts.test.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage
{
	@FindBy(id="title")
	private WebElement titleText;
	
	@FindBy(name="food")
	private WebElement foodInput;
	
	@FindBy(name="drink")
	private WebElement drinkInput;
	
	@FindBy(id="submitButton")
	private WebElement submitButton;
	
	public String getTitleText() {
		return titleText.getText();
	}
	
	public FoodinfoPage enterFoodInfo(WebDriver driver, String food, String drink)
	{
		foodInput.sendKeys(food);
		drinkInput.sendKeys(drink);
		
		submitButton.click();
		return PageFactory.initElements(driver, FoodinfoPage.class);
		
	}

	public static WelcomePage navigateTo(WebDriver driver)
	{
		final String URL = System.getProperty("webapp.url");
		driver.get(URL);
		return PageFactory.initElements(driver, WelcomePage.class);
	}
}
