package Selenium_Demo.SeleniumMavenDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.name("field-keywords")).sendKeys("dresses");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.close();

	}

}

