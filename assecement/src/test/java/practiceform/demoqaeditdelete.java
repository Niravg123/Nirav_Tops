package practiceform;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqaeditdelete {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","D:\\selenium\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoqa.com/webtables");
	
	String uname = "Cierra";
	
	try {
		WebElement name = driver.findElement(By.xpath("//*[text()='"+uname+"']"));
		
		if(name.isDisplayed())
		{
			driver.findElement(By.xpath("//*[text()='"+uname+"']/following-sibling::div[6]/div/span[1]")).click();
		}
		
	} catch (Exception e) {
		System.out.println("element not found");
	}
	
}
}
