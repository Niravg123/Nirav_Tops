package practiceform;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class demoqa {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoqa.com/automation-practice-form");
	
	String MyDate = "19";
	String MyMonth = "July";
	String MyYear = "1994";
	
	driver.findElement(By.id("firstName")).sendKeys("nirav");
	driver.findElement(By.id("lastName")).sendKeys("goti");
	driver.findElement(By.id("userEmail")).sendKeys("niravgoti@gmail.com");
	driver.findElement(By.id("userNumber")).sendKeys("01234567890");
	driver.findElement(By.xpath("//div[@id='genterWrapper']/div/div[1]")).click();
	driver.findElement(By.id("dateOfBirthInput")).click();
	
	
	
	WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
	Select months = new Select(month);
	months.selectByVisibleText(MyMonth);
	
	WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
	Select years = new Select(year);
	years.selectByVisibleText(MyYear);
	
	List<WebElement> dates = driver.findElements(By.xpath("//div[@class='react-datepicker__week']/div"));
	for(WebElement date : dates)
	{
		if(date.getText().equals(MyDate))
		{
			if(date.getAttribute("aria-label").contains(MyMonth))
			{
				date.click();
				break;
			}
		}
	}
	
	WebElement subject = driver.findElement(By.id("subjectsContainer"));
	Actions builder = new Actions(driver);
	builder.click(subject)
					.sendKeys("Maths")
					.sendKeys(Keys.ARROW_DOWN)
					.sendKeys(Keys.ENTER)
					.build().perform();
	
	driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
	driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
	driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
	
	driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\NCS\\Downloads\\51nq12d56nL.png");
	driver.findElement(By.id("currentAddress")).sendKeys("thankyou");
		
	
	
	
}
}
