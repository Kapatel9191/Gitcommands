package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demosite {

	public static void main(String[] args) {

System.setProperty("webdriver.gecko.driver", "C:/Software-selenium/geckodriver.exe");
WebDriver driver = new FirefoxDriver();

driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

	}

}
