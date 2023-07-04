package Genric_scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test1 implements Framework_const
{
public WebDriver driver;
		@BeforeMethod
		public void openapp()
		{
			System.setProperty(chrome_key, chrome_value);
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(base_url);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		@AfterMethod
		public void closeapp(ITestResult res) throws IOException
		{
			if(ITestResult.FAILURE==res.getStatus())
				
			{
				Genric_scriptss.getphoto(driver);
				}
			driver.close();
			
			
		}}
		
