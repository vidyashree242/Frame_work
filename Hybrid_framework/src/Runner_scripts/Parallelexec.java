package Runner_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallelexec {
	public WebDriver driver;

	@Test
	@Parameters({"browser"})
	public void exe(String browser)
	{
	System.setProperty("webdriver.chrome.driver","./Folders/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./Folders/geckodriver.exe");
	if(browser.equals("firefox"))
	{
		 driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	else { driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
		
	}
	}}

	
	
