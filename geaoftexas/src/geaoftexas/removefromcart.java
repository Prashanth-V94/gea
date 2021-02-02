package geaoftexas;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class removefromcart {
public static void main(String[] args) throws InterruptedException 
{
		 System.setProperty("webdriver.chrome.driver","D:\\projects\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			driver.manage().window().maximize();
			ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    	driver.switchTo().window(tabs2.get(1));
	    	driver.close();
	    	driver.switchTo().window(tabs2.get(0));
		    driver.get("https://www.geaoftexas.com/");
		    driver.findElement(By.linkText("LogIn")).click();
		    driver.findElement(By.name("email")).sendKeys("prasanth@desss.com");
		    driver.findElement(By.name("password")).sendKeys("dess@123");
		    driver.findElement(By.cssSelector("button[type='submit']")).click();
		    
		    driver.findElement(By.xpath("//i[@title='View Cart']")).click();
		    Thread.sleep(5000);
	      
		    driver.findElement(By.xpath(("(//i[contains(@class,'fas fa-times red-text')])[1]"))).click();
		    driver.switchTo().alert().accept();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath(("(//i[contains(@class,'fas fa-times red-text')])[1]"))).click();
		    driver.switchTo().alert().accept();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath(("(//i[contains(@class,'fas fa-times red-text')])[1]"))).click();
		    driver.switchTo().alert().accept();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath(("(//i[contains(@class,'fas fa-times red-text')])[1]"))).click();
		    driver.switchTo().alert().accept();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath(("(//i[contains(@class,'fas fa-times red-text')])[1]"))).click();
		    driver.switchTo().alert().accept();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath(("(//i[contains(@class,'fas fa-times red-text')])[1]"))).click();
		    driver.switchTo().alert().accept();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath(("(//i[contains(@class,'fas fa-times red-text')])"))).click();
		    driver.switchTo().alert().accept();
		    Thread.sleep(5000);
		    driver.quit();
	}

}
