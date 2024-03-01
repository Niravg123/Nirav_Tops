package MainTest;

import com.Base;

import org.testng.annotations.Test;
import PageObject.LandingPage;
import PageObject.SignUp;

public class SignUpTest extends Base {

	@Test
	public void Test()
	{
		driver = getDriver();
		
		LandingPage lp = new LandingPage(driver);
		lp.signup();
		
		SignUp sp = new SignUp(driver);
		sp.enterfname("nirav");
		sp.enterlname("goti");
		sp.enteremail("niravgoti@gmail.com");
		sp.enterpassword("nirav@123");
		sp.entercpassword("nirav@123");
		sp.submitbutton();
	}
	
}
