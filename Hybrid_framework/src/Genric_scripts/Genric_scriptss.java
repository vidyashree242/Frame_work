package Genric_scripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Genric_scriptss {
	public static void getphoto(WebDriver driver) throws IOException
	 {
	String photo ="./Photos" ;
	Date d = new Date();
	String d1 = d.toString();
	String d2 = d1.replaceAll(":","_");
	 TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst = new File(photo+d2+".jpg");
	org.openqa.selenium.io.FileHandler.copy(src, dst);
	
	
	
}

}
