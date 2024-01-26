package day2;

// Website URL : "http://www.automationpractice.pl/index.php"

import org.openqa.selenium.By;

// Website URL : http://www.automationpractice.pl/index.php

import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		//find search bar
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirt");
		
		// search button
		driver.findElement(By.name("submit_search")).click();
		
		// link text and partial link text
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		driver.findElement(By.partialLinkText("Printed Chiffon")).click();		
		
		

	}

}
