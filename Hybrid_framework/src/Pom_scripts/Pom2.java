package Pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Genric_scripts.Base_page;

public class Pom2 extends  Base_page  {
	@FindBy(name="email")
	private WebElement uname ;
	@FindBy(name="pass")
	private WebElement pname ;
	@FindBy(name="login")
	private WebElement loginbtn ;
	
	
	public Pom2(WebDriver driver)
	{ 
		super(driver);
	}
	public void passun(String un)
	{
		uname.sendKeys(un);
	}
	public void passpwd(String pw)
	{
		pname.sendKeys(pw);
	}
	
	public void loginbvtn()
	{
		loginbtn.click();
		
	}
	
	

}
