package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class LocatorsDemo2 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		// Find the total number of sliders on the home page
		
		List<WebElement> sliders = driver.findElements(By.className("homeslider-container"));
		System.out.println("Number of sliders on home page :"+sliders.size());
		
		// Find total number of images on home page
		// we use find by tagname because all images have same tag <img> 
		List<WebElement> num = driver.findElements(By.tagName("img"));
		System.out.println("Number of images on home page :"+num.size());
		
		//Find total number of links on home page
		// we use find by tagname because all links have same tag <a> 
		List<WebElement> lnk = driver.findElements(By.tagName("a"));
		System.out.println("Total Number of links on home page :"+lnk.size());
		
		driver.quit();
		
	}

}
