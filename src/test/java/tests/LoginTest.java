package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.AccountPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

public class LoginTest extends Base {
	public WebDriver driver;
	Logger log;
	@Test(dataProvider="getLoginData")
	public void login(String email,String password, String expectedResult) throws IOException, InterruptedException {
		
	
		log.debug("debug log>>>here");
		
		LandingPage landingPage= new LandingPage(driver);
		landingPage.myAccountDropwown().click();
		landingPage.loginOption().click();
		
		Thread.sleep(2000);
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.emailAddressField().sendKeys(email);
		log.debug("debug log>>>here");
		loginPage.passwordField().sendKeys(password);
		
		loginPage.loginBotton().click();
		log.debug("debug log>>>here");
		AccountPage accountPage= new AccountPage(driver);
		String actualResult=null;
		try {
			if(accountPage.editAccountInformationOption().isDisplayed()) {
			actualResult="Successfull";
			}
		}catch(Exception e){
			actualResult="Failure";
		}
		Assert.assertEquals(actualResult,expectedResult);
	
	
	}
	@BeforeMethod
	public void openApp() throws IOException {
		log = LogManager.getLogger(LoginTest.class.getName());
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	@AfterMethod
	public void closure() {
		driver.close();
		
	}
	@DataProvider
	public Object[][] getLoginData() {
		Object[][] data= {{"badalsingh123456789@gmail.com","Mynextpc@07","Successfull"}};
		return data;
	}
	
}
