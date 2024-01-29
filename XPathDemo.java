package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Build your own computer")).click();
		
		// Partial XPath
		String productname = driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[1]/h1")).getText();
		System.out.println(productname);
		
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.linkText("Digital Storm VANQUISH 3 Custom Performance PC")).click();
		
		// Full XPath
		String label = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[1]/h1")).getText();
		System.out.println(label);
		
		driver.quit();
	}

}
