package command1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Visitstorfront {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/Software-selenium.exe");
		WebDriver  driver = new FirefoxDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); 
		
		
		
		
		
		
		
	}

}
