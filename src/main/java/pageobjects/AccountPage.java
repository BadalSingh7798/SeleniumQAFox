package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	
	WebDriver driver;

	public AccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//ul[@class=\"list-unstyled\"]/li/a[starts-with(text(),'Edit')]")
		private WebElement editAccountInformationOption;
		
		public WebElement editAccountInformationOption() {
			return editAccountInformationOption;
		}
	
}
