package Propertyfiles24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class property123 {
	@Test
	public void   test1() throws FileNotFoundException, IOException 
	{
		Properties p = new Properties();
		p.load(new FileInputStream("./Property123.properties"));
		String u = p.getProperty("baseurl");
		System.out.println(u);
	}
	//Generic
	
	
		
		public void   test12(String path,String key) throws FileNotFoundException, IOException 
		{
			Properties p = new Properties();
			p.load(new FileInputStream(path));
			 String u = p.getProperty(key);
			System.out.println(u);
		}}