package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//Check if logo is displayed or not
		boolean status = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).isDisplayed();
		System.out.println("Logo is displayed or not:"+status);
		
		//Check if search box is present and enabled
		WebElement sbox = driver.findElement(By.id("small-searchterms"));
		System.out.println("Searchbox is displayed:"+sbox.isDisplayed());
		System.out.println("Searchbox is enabled:"+sbox.isEnabled());
		
		// Check status of radio buttons
		WebElement male_rb = driver.findElement(By.id("gender-male"));
		WebElement female_rb = driver.findElement(By.id("gender-female"));
		System.out.println("Before Selection :");
		System.out.println(male_rb.isSelected());
		System.out.println(female_rb.isSelected());
		
		System.out.println("After Selection :");
		male_rb.click();
		System.out.println(male_rb.isSelected());
		System.out.println(female_rb.isSelected());
	}

}
