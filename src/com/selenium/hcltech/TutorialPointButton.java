package com.selenium.hcltech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TutorialPointButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divyasri.t\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"navMenus\"]/li[5]/a")).click();
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		
	}

}
