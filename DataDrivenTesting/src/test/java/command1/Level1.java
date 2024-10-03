package command1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Level1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:/Software-selenium/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
				
		driver.manage().window().maximize();
	}

}
