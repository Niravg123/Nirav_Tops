package practiceform;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class teqhlastic {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Selenium\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	
	 
		
	 //tc-1
	 List<WebElement> rows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr")); 
	 if(rows.size()==4)
	 {
		 System.out.println("pass");
	 }
	 else
	 {
		 System.out.println("fail");
	 }
	
	 //tc-2
	 List<WebElement> head = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/th"));
	 List<WebElement> data = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/td"));
	 
	 int total = head.size()+data.size();
	 if(total==2)
	 {
		 System.out.println("pass");
	 }
	 else
	 {
		 System.out.println("fail");
	 }
	 
	 //tc-3
	 
	 int max = 0;
	 List<WebElement> heights = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td[3]"));
	 for(WebElement height : heights)
	 {
		 String data1 = height.getText();
		 int num = Integer.parseInt(data1.substring(0,data1.indexOf("m")));
		 if(num>max)
		 {
			 max = num;
		 }
		 
	 }
	 System.out.println("maxheight : "+max);
	}
  
	

}	

