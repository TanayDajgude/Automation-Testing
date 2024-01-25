package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 1) Launch browser
2) open url
	URL: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
3) Provide username  - admin@yourstore.com
4) Provide password  - admin
5) Click on Login button 
6) Verify the title of dashboard page   
	Exp title : Dashboard / nopCommerce administration
7) Verify Dasboad
 */


public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		// 1) Launch Browser
		ChromeDriver driver = new ChromeDriver();
		
		// 2) Open URL 
		driver.get(" https://admin-demo.nopcommerce.com");
		Thread.sleep(5000);
		
		// 3) Provide username
		WebElement txtUsername = driver.findElement(By.name("Email"));
		txtUsername.clear();
		txtUsername.sendKeys("admin@yourstore.com");
		
		// 4) Provide Password
		WebElement txtPassword = driver.findElement(By.name("Password"));
		txtPassword.clear();
		txtPassword.sendKeys("admin");
		
		// 5) Click on login button
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();

		// 6) Verify Title of dashboard page
		String act_title = driver.getTitle();
		String exp_title = "Dashboard / nopCommerce administration";
		
		if(act_title.equals(exp_title))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		Thread.sleep(5000);
		
		// 7) Verify label Dashboard
		String act_label = "";
		try
		{
		act_label = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
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
		
		driver.quit();	
		}

}
