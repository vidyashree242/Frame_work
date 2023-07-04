package Pom_scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Demoqa_pom {
	
		@FindBy(id="firstName")
	private WebElement Fnfeild;
		@FindBy(id="lastName")
		private WebElement lnfeild;
		@FindBy(id="userEmail")
	private WebElement emailfeild;
		@FindBy(xpath="//label[text()='Female']")
		private WebElement radiobutton;
		@FindBy (id="userNumber")
		private WebElement mblnumber;
		@FindBy (id="dateOfBirthInput")
		private WebElement datefeild;
		@FindBy(xpath="//option[text()='November']")
		private WebElement month;
		@FindBy(xpath = "//div[text()='24']")
		private WebElement date;
		@FindBy(xpath = "//option[text()='1999']")
		private WebElement year;
		
	
	}

