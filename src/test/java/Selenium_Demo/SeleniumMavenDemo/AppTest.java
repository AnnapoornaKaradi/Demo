package Selenium_Demo.SeleniumMavenDemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
	  ChromeOptions options = new ChromeOptions();
	options.addArguments("start-maximized"); // open Browser in maximized mode
	options.addArguments("disable-infobars"); // disabling infobars
	options.addArguments("--disable-extensions"); // disabling extensions
	options.addArguments("--disable-gpu"); // applicable to windows os only
	options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
	options.addArguments("--no-sandbox"); // Bypass OS security model
	WebDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.name("field-keywords")).sendKeys("dresses");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.close();
  }
 
}
