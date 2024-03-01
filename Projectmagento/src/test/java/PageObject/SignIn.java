package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {

	WebDriver driver;
	
	public SignIn(WebDriver driver) {
		this.driver = driver;
	}
	
	By email = By.id("email");
	By password = By.id("pass");
	By login = By.id("send2");
	
	
	public void enteremail(String emailv)
	{
		driver.findElement(email).sendKeys(emailv);
	}
	
	public void enterpassword(String passv)
	{
		driver.findElement(password).sendKeys(passv);
	}
	
	public void loginbutton()
	{
		driver.findElement(login).click();
	}
}
