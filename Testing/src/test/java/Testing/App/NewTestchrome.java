package Testing.App;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTestchrome {

	WebDriver driver;
	
@Test (priority=0)	
  public void testinguser() {
	  

		long start = System.currentTimeMillis();
		driver.manage().window().maximize();
	    driver.get("http://localhost:4200/home");
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		System.out.println("Total Time for user home page load = "+(totalTime*0.001)+" Seconds"); 
  }
	   

@Test (priority=1)	
public void testingadmin() {
	  

		long start = System.currentTimeMillis();
		driver.manage().window().maximize();
	    driver.get("http://localhost:4201/login");
		long finish = System.currentTimeMillis();
		long totalTime = finish - start; 
		System.out.println("Total Time for admin home page load = "+(totalTime*0.001)+" Seconds"); 
}
	   


@Test (priority=2)	
public void usersignin() {
	  
	     driver.get("http://localhost:4200/login");
	    driver.findElement(By.xpath("/html/body/app-root/html/body/div/app-login/div[1]/form/div[1]/div/input")).sendKeys("dinesh4c5@sasi.ac.in");
	    driver.findElement(By.xpath("/html/body/app-root/html/body/div/app-login/div[1]/form/div[2]/div/input")).sendKeys("Abcd@123");
	    driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
	    System.out.println("sucessfully user logged in ");
   }

   
@Test (priority=3)	
  public void adminsignin() {
	  
	     driver.get("http://localhost:4201/login");
	    driver.findElement(By.xpath("/html/body/app-root/app-login/div[1]/form/input[1]")).sendKeys("admin");
	    driver.findElement(By.xpath("/html/body/app-root/app-login/div[1]/form/input[2]")).sendKeys("admin");
	    driver.findElement(By.xpath("/html/body/app-root/app-login/div[1]/form/button")).click();
	    System.out.println("sucessfully admin logged in");
     }
  
	  
	  




  @BeforeMethod
	public void beforeMethod() {
		
	  
		System.setProperty("webdriver.chrome.driver", "D:\\Mycompany\\java-fsd\\practice\\phase5\\required\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
	}
  

	@AfterMethod
	public void afterMethod() {
		//driver.close();
		 driver = null;
	}
	
  
  
  
  
}
