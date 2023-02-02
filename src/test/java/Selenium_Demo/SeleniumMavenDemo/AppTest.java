package Selenium_Demo.SeleniumMavenDemo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:/Users/Lenovo/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.name("field-keywords")).sendKeys("dresses");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.close();
  }
 
}
