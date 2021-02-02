package geaoftexas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkoutflow1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
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
	  
	    
	    // from product grid to my cart screen
	    	Actions action = new Actions(driver);
	    	action.moveToElement(driver.findElement(By.xpath("//a[@href='https://www.geaoftexas.com/store/product'][contains(.,'Products / Shop')]"))).build().perform();
	    	WebElement w1=(new WebDriverWait(driver,20).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='https://www.geaoftexas.com/store/product/control-components/signal-conditioning'][contains(.,'Signal Conditioning')]"))));
	    	w1.click();
	     	//WebDriverWait wait2 = new WebDriverWait(driver, 10);
	    	//wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//i[@class='fas fa-shopping-cart white-text  darken-blue'])[9]")));
	    	//driver.findElement(By.xpath("xpath_element_to_be_clicked")).click();
	    	driver.findElement(By.xpath("(//i[@class='fas fa-shopping-cart white-text  darken-blue'])[9]")).click();
	    		
	    		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
	    		String subWindowHandler = null;

					Set<String> handles = driver.getWindowHandles(); // get all window handles
					Iterator<String> iterator = handles.iterator();
						while (iterator.hasNext())
						{
							subWindowHandler = iterator.next();
						}
						driver.switchTo().window(subWindowHandler);
						Thread.sleep(2000);
						WebElement w2 = driver.findElement(By.xpath("//input[@id='products_quantity_24052']"));
				    	w2.clear();
				    	w2.sendKeys("2");
				    	driver.findElement(By.xpath("(//a[@class='quantylogo-cancel right white-text green'])[9]")).click();
				    	Thread.sleep(5000);
				    	driver.findElement(By.xpath("//button[@type='button'][contains(.,'OK')]")).click();
				    	driver.switchTo().window(parentWindowHandler);				    	
			
				    	
			// Product grid - product detail page to my cart
			driver.findElement(By.xpath("//p[contains(.,'RED TB100003')]")).click();
			WebElement pdpqty1=driver.findElement(By.name("product_det_qty"));
			pdpqty1.clear();
			pdpqty1.sendKeys("3");
			driver.findElement(By.xpath("//a[@title='Add Cart']")).click();
			driver.findElement(By.xpath("//button[@type='button'][contains(.,'OK')]")).click();
			
			//search a product and move to cart from product detail page
			driver.findElement(By.xpath("(//i[@class='fa fa-search'])[1]")).click();
			driver.findElement(By.id("search_keys")).sendKeys("MULTIVOLTAGE LEVEL CNTRL");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(.,'TUR MS91-12-R')]")).click();
			WebElement pdpqty2=driver.findElement(By.name("product_det_qty"));
			pdpqty2.clear();
			pdpqty2.sendKeys("4");
			driver.findElement(By.xpath("//a[@title='Add Cart']")).click();
			driver.findElement(By.xpath("//button[@type='button'][contains(.,'OK')]")).click();
			
			
			//product detail page to favorites
			driver.findElement(By.xpath("(//i[@class='fa fa-search'])[1]")).click();
			driver.findElement(By.id("search_keys")).sendKeys("Momentary Action Touch Button");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//a[contains(.,'BAN OTBVP6L')])[1]")).click();
			WebElement pdpqty3=driver.findElement(By.name("product_det_qty"));
			pdpqty3.clear();
			pdpqty3.sendKeys("4");
			driver.findElement(By.xpath("//a[contains(.,'Add to Favorites / BOM')]")).click();
			
			String parentWindowHandler1 = driver.getWindowHandle(); 
    		String subWindowHandler1 = null;

				Set<String> handles1 = driver.getWindowHandles(); 
				Iterator<String> iterator1 = handles1.iterator();
					while (iterator1.hasNext())
					{
						subWindowHandler1 = iterator1.next();
					}
					driver.switchTo().window(subWindowHandler1);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//span[contains(.,'Add product to favorites')]")).click();
					driver.findElement(By.xpath("//a[contains(.,'Save')]")).click();
			    	driver.switchTo().window(parentWindowHandler1);
			
			
			 //favorites to my cart
			driver.findElement(By.linkText("Favorites")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//i[@class='fas fa-shopping-cart']")).click();
			
	    
			//adding three product in a BOM and moving to cart
	    	//First product
			Thread.sleep(5000);
		    driver.findElement(By.xpath("(//i[@class='fa fa-search'])[1]")).click();
			driver.findElement(By.id("search_keys")).sendKeys("M9910464");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(.,'TUR THW-6-N1/2-A4-L100')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'Add to Favorites / BOM')]")).click();
			
			String parentWindowHandler2 = driver.getWindowHandle();
    		String subWindowHandler2 = null;

				Set<String> handles2 = driver.getWindowHandles(); 
				Iterator<String> iterator2 = handles2.iterator();
					while (iterator2.hasNext())
					{
						subWindowHandler2 = iterator2.next();
					}
					driver.switchTo().window(subWindowHandler2);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//span[contains(.,'Add to / Create BOM')]")).click();
						WebElement bom=driver.findElement(By.id("get_cate_names"));
						Select sbom=new Select(bom);
						sbom.selectByVisibleText("New BOM");
						driver.findElement(By.id("quantity_products")).sendKeys("1");
						driver.findElement(By.id("new_bom_names")).sendKeys("Turck products");
						driver.findElement(By.id("new_bom_desc")).sendKeys("Turck products regular buy weekly once");
						driver.findElement(By.xpath("//button[@id='sub_err']")).click();
			    	driver.switchTo().window(parentWindowHandler2);
			
			    	
			//Second product
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//i[@class='fa fa-search'])[1]")).click();
			driver.findElement(By.id("search_keys")).sendKeys("U0926-60");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(.,'TUR CA-2/FK 4.5')]")).click();
				driver.findElement(By.xpath("//a[contains(.,'Add to Favorites / BOM')]")).click();
					
					String parentWindowHandler3 = driver.getWindowHandle();
		    		String subWindowHandler3 = null;

						Set<String> handles3 = driver.getWindowHandles(); 
						Iterator<String> iterator3 = handles3.iterator();
							while (iterator3.hasNext())
							{
								subWindowHandler3 = iterator3.next();
							}
							driver.switchTo().window(subWindowHandler3);
							Thread.sleep(2000);
							driver.findElement(By.xpath("//span[contains(.,'Add to / Create BOM')]")).click();
								WebElement bom1=driver.findElement(By.id("get_cate_names"));
								Select sbom1=new Select(bom1);
								sbom1.selectByVisibleText("Turck products");
								driver.findElement(By.id("quantity_products")).sendKeys("2");
								driver.findElement(By.xpath("//button[@id='sub_err']")).click();
					    	driver.switchTo().window(parentWindowHandler3);
		
					    	
			//Third product
		   	Thread.sleep(5000);
			driver.findElement(By.xpath("(//i[@class='fa fa-search'])[1]")).click();
			driver.findElement(By.id("search_keys")).sendKeys("MINI TEMP TRANMITTER");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[contains(.,'TUR TTM150C-206A-CF-LI6-H1140-L150')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'Add to Favorites / BOM')]")).click();
									
						String parentWindowHandler4 = driver.getWindowHandle();
						String subWindowHandler4 = null;

							Set<String> handles4 = driver.getWindowHandles(); 
							Iterator<String> iterator4 = handles4.iterator();
							while (iterator4.hasNext())
							{
								subWindowHandler4 = iterator4.next();
							}
							driver.switchTo().window(subWindowHandler4);
							Thread.sleep(2000);
							driver.findElement(By.xpath("//span[contains(.,'Add to / Create BOM')]")).click();
							WebElement bom2=driver.findElement(By.id("get_cate_names"));
							Select sbom2=new Select(bom2);
							sbom2.selectByVisibleText("Turck products");
							driver.findElement(By.id("quantity_products")).sendKeys("3");
							driver.findElement(By.xpath("//button[@id='sub_err']")).click();
							driver.switchTo().window(parentWindowHandler4);	    	
		
							
			// bom to my cart
			Thread.sleep(5000);
			Actions action1 = new Actions(driver);
			action1.moveToElement(driver.findElement(By.xpath("//a[contains(.,'Account')]"))).build().perform();
			WebElement w3=(new WebDriverWait(driver,20).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(.,'My BOM')]"))));
			w3.click();	
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(.,'+')]")).click();
			driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/table/tbody/tr[1]/td[1]/div/label/span[1]")).click();
			driver.findElement(By.xpath("//a[contains(.,'Add to cart')]")).click();		
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//i[@title='View Cart']")).click();
			System.out.println("Test completed");
	    	
	}

}
