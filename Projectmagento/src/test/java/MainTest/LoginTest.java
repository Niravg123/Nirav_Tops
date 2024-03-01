package MainTest;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 	
import com.Base;
import com.ExcellReader;

import PageObject.LandingPage;
import PageObject.SignIn;
import PageObject.SignUp;

public class LoginTest extends Base {

	@Test(dataProvider = "dp")
	public void Test(String uname , String pass , String title , ITestContext i)
	{
		driver = getDriver();
		
		LandingPage lp = new LandingPage(driver);
		lp.signin();
		
		SignIn si = new SignIn(driver);
		si.enteremail(uname);
		si.enterpassword(pass);
		si.loginbutton();
		
		
		assertEquals(title, driver.getTitle());
	}
	@DataProvider(name="dp")
	public Object[][] getData()
	{
		ExcellReader rd = new ExcellReader("C:\\Users\\NCS\\Desktop\\test\\magento.xlsx", "data");
		int row = rd.rowCount();
		int col = rd.colCount();
		
		Object obj[][] = new Object[row-1][col];
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				String data = rd.getData(i, j);
				obj[i-1][j] = data;
			}
		}
		return obj;
	}
//	@DataProvider(name="dp")
//	public Object[][] getData()
//	{
//		Object obj[][] = new Object[3][3];
//		
//		obj[0][0] = "abc@gmail.com";
//		obj[0][1] = "abc@123";
//		obj[0][2] = "customer login";
//		
//		obj[1][0] = "xyz@gmail.com";
//		obj[1][1] = "xyz@123";
//		obj[1][2] = "customer login";
//		
//		obj[2][0] = "niravgoti@gmail.com";
//		obj[2][1] = "nirav@123";
//		obj[2][2] = "My Account";
//		return obj;
//	}
}
