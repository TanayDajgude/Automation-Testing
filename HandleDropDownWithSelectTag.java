package day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownWithSelectTag {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		WebElement drpdwn = driver.findElement(By.id("country-list"));
		Select dropCountry = new Select(drpdwn);
		
		// 1) Selecting an option from the dropdown
		
		//dropCountry.selectByVisibleText("India");
		
		//dropCountry.selectByValue("5"); //use this only if value attribute is present in option tag
		
		//dropCountry.selectByIndex(2)

		//2) Find Total Number of Options in dropdown
		List<WebElement> options = dropCountry.getOptions();
		System.out.println("Total number of options :"+options.size());
		
		//3) Print all options from dropdown using enhanced for loop
		for(WebElement opt:options)
		{
			System.out.println(opt.getText());
		}
		
		//Print all options from dropdown using normal for loop
		
		for(int i=0; i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
	}

}
