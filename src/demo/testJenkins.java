package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testJenkins {

	@Test
	public void denojenkinsjobs()
	{
		System.out.println("Welcome to Jenkins");
		
		WebDriver driver=new FirefoxDriver();
		driver.get ("https://www.facebook.com");
		System.out.println(driver.getTitle());
		//driver.close();
		//driver.quit();


	}
}
