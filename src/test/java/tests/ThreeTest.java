package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class ThreeTest extends Base{
public WebDriver driver;
	@Test
	public void testThree() throws IOException, InterruptedException {
		System.out.println("Inside >>testThree");
		driver = initializeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		Thread.sleep(2000);
		driver.close();
	
	}
}
