package geaoftexas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class registrationlogin 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver","D:\\projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
    	driver.switchTo().window(tabs2.get(1));
    	driver.close();
    	driver.switchTo().window(tabs2.get(0));
	    	driver.get("https://www.geaoftexas.com/");
	    	driver.findElement(By.linkText("Register")).click();
	    	Thread.sleep(1000);																	//"*" indicates mandatory field
		    	driver.findElement(By.id("first_name")).sendKeys("Prashanth"); 					//First name*
		    	driver.findElement(By.id("last_name")).sendKeys("Venkat");						//Last name
		    	driver.findElement(By.id("customer_name")).sendKeys("Desss Inc");				//Company Name*
		    	driver.findElement(By.id("email")).sendKeys("prasanth@desss.com");				//Email*
		    	driver.findElement(By.id("user_name")).sendKeys("Prashanth_Desss");				//User name*
		    	driver.findElement(By.id("password")).sendKeys("dess@123");						//Password*
		    	driver.findElement(By.id("confirm_password")).sendKeys("dess@123");				//Confirm Password*
		    	driver.findElement(By.id("address_1")).sendKeys("26611 Majestic Ridge Ln");		//Address 1*
		    	driver.findElement(By.id("address_2")).sendKeys("#444");						//Address 2
		    	driver.findElement(By.id("city")).sendKeys("Katy");								//City*
		    	WebElement w1=driver.findElement(By.id("state"));								//State*
				    	Select s1=new Select(w1);
				    	s1.selectByVisibleText("Texas");
		    	driver.findElement(By.id("zipcode")).sendKeys("77493");							//zipcode*
		    	driver.findElement(By.id("mobile_number")).sendKeys("9856325200");						//Mobile number
		    	// Image catpcha, Used to show and input box to enter the captcha manually, Until then it will wait.
		    	String str = JOptionPane.showInputDialog("Enter your captcha");		
		    	WebElement w2=driver.findElement(By.id("captcha"));
		    	w2.sendKeys(str);
		    	driver.findElement(By.xpath("//input[@type='submit']")).click();
		    	Thread.sleep(10000);
		    	driver.switchTo().activeElement();
		    	driver.findElement(By.xpath("/html/body/div[6]/div/div[10]/button[1]")).click();
		    	driver.switchTo().activeElement();
		    	Thread.sleep(20000);
		    			
		    	//Login screen, after email verification
		    				driver.findElement(By.linkText("LogIn")).click();
		    				driver.findElement(By.id("email-list")).sendKeys("prasanth@desss.com");
		    				driver.findElement(By.id("password-field")).sendKeys("dess@123");
		    				driver.findElement(By.xpath("//button[@id='login_submit']")).click();
		    	//driver.close();
	}

}
