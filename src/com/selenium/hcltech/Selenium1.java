package com.selenium.hcltech;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Selenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divyasri.t\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.id("")).sendKeys("divya");

	}

}
