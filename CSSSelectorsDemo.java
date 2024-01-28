package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// CSS Selector - tag and id (tag = input seperate by # and if=small-searchterms)
		WebElement w1 = driver.findElement(By.cssSelector("input#small-searchterms"));
		w1.sendKeys("MacBook");
		System.out.println("Element Found using tag and id");
		w1.clear();
		
		
		// CSS Selector - tag and class (seperated by .)
		WebElement w2 = driver.findElement(By.cssSelector("input.search-box-text "));
		w2.sendKeys("Samsung");
		w2.clear();
		System.out.println("Element Found using tag and class");
		
		//CSS Selector - tag and attribute (tag[attribute='value'])
		WebElement w3 = driver.findElement(By.cssSelector("input[name='q']"));
		w3.sendKeys("Nokia");
		w3.clear();
		System.out.println("Element Found using tag and attribute");
		
		//CSS Selector - tag, class and attribute (tag.class[attribute='value'])
		WebElement w4 = driver.findElement(By.cssSelector("input.search-box-text[name='q']"));
		w4.sendKeys("Nokia");
		System.out.println("Element Found using tag class and attribute");
		
		
	}

}
