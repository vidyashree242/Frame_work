package Runner_scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Genric_scripts.Base_test1;
import Pom_scripts.Pom2;

public class runner_class extends Base_test1  {
	@Test(dataProvider="testdata")
	public void test1(String d1,String d2) throws InterruptedException
	{
		Pom2 p = new Pom2(driver);
		p.passun(d1);
		p.passpwd(d2);
		Thread.sleep(2000);
		p.loginbvtn();
		Assert.fail();
		
	}
	@DataProvider(name="testdata")
	public Object[][] createData()
	{
		return new Object[][]
				{
			{"cedric","admin"},
			{"anne","manager"},
				
			};
				}
	}