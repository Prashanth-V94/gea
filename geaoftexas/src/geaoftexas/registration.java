package geaoftexas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
    	driver.switchTo().window(tabs2.get(1));
    	driver.close();
    	driver.switchTo().window(tabs2.get(0));
	    	driver.get("https://www.geaoftexas.com/");
	    	driver.findElement(By.linkText("Register")).click();
	    	Thread.sleep(1000);										
	}

}
