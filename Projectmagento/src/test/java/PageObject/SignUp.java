package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {

	WebDriver driver;
	
	public SignUp(WebDriver driver) {
		this.driver = driver;
	}

	
	By fname = By.id("firstname");
	By lname = By.id("lastname");
	By email = By.id("email_address");
	By pass  = By.id("password");
	By cpass = By.id("password-confirmation");
	By submit = By.xpath("//button[@title='Create an Account']");
	
	
	

	public void enterfname(String fnamev)
	{
		driver.findElement(fname).sendKeys(fnamev);
	}
	
	public void enterlname(String lnamev)
	{
		driver.findElement(lname).sendKeys(lnamev);
	}
	
	public void enteremail(String emailv)
	{
		driver.findElement(email).sendKeys(emailv);
	}
	
	public void enterpassword(String passv)
	{
		driver.findElement(pass).sendKeys(passv);
	}
	
	public void entercpassword(String cpassv)
	{
		driver.findElement(cpass).sendKeys(cpassv);
	}
	
	public void submitbutton()
	{
		driver.findElement(submit).click();
	}
}
