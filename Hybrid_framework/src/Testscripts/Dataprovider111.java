package Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider111 {
	@Test(dataProvider = "testdata")
	public void validTest(String un ,String pwd )
	{
		System.setProperty("webdriver.chrome.driver", "./folders/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("email")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		driver.close();}
		@DataProvider(name="testdata")
		public Object[][] createdata1()
		{
			return new Object[][] {{
				"cedric","admin"},
				{"anne","manager"},
			};
			
			
			}
		
	
}