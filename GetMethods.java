package day5;

import java.util.Set;

import org.openqa.selenium.By;

/*
get(url)
getTitle()
getCurrentURL()
getPageSource()
getWindowHandle()
getwindowHandles()
*/


import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		System.out.println("Title of the page: "+driver.getTitle());
		
		System.out.println("Current URL of page :"+driver.getCurrentUrl());
		
		String ps = driver.getPageSource(); //gets the source-code of the page
		System.out.println(ps);
		System.out.println(ps.contains("html")); // to find particular thong present in code of page
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowids =driver.getWindowHandles();
		
		for(String winids:windowids)
		{
			System.out.println(winids);
		}
		
		

	}

}
