package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-email")
	private WebElement emailAddressField; //encapsulated by private , now only using its method it can be accessed.

	@FindBy(id="input-password")
	private WebElement passwordField;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginBotton;
	
	public WebElement emailAddressField() {
		return emailAddressField;
	}
	public WebElement passwordField() {
		return passwordField;
	}
	public WebElement loginBotton() {
		return loginBotton;
	}
}
