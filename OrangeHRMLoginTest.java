package day1;
/*
 Test case

--------
1) Launch browser
2) open url https://opensource-demo.orangehrmlive.com/
3) Provide username  - Admin
4) Provide password  - admin123
5) Click on Login button 
6) Verify the title of dashboard page
 	Expected title : OrangeHRM
7) close browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		//1) Launch Browser
		ChromeDriver driver = new ChromeDriver();
		
		//2) Open URL
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize(); //maximize the chrome window
		Thread.sleep(5000); 
		/*After launching url it will wait 5 seconds and then enter id & password otherwise statement
		 gets executed first and it gives error as nosuchelement bcoz the page loading takes time*/
		
		//3) Provide username - Admin
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//4) Provide Password - admin123
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//5) Click on login button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

		//6)Verify the title of dashboard page
	/*	String act_title = driver.getTitle();
		String expec_title = "OrangeHRM";
		
		if(act_title.equals(expec_title))
		{
			System.out.println("Test Case Passed");
			System.out.println("Title of Page :"+act_title);
		}
		else
		{
			System.out.println("Test Case Failed");
		}*/
		
		// for both login and home page the title is same so if we also enter wrong credentials the
		// test gets passed. So it is of no use. So try another method of validating dashboard label
		// after login
		Thread.sleep(5000);
		
		String act_label = "";
		try
		{
		act_label = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		}
		catch(Exception e)
		{
			
		}
		
		String exp_label = "Dashboard";
		
		if(act_label.equals(exp_label))
		{
			System.out.println("Test Passed");
			
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		
		//7) Close Browser
		//driver.close(); // gives error so use another 
		driver.quit();
	}

}
