package com.selenium.hcltech;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCalculator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divyasri.t\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testsheepnz.github.io/BasicCalculator.html");
		//driver.findElement(By.id("")).sendKeys("divya");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.name("number1")).sendKeys("30");
		driver.findElement(By.name("number2")).sendKeys("30");
		driver.findElement(By.name("selectOperation")).click();
		driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]/option[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("calculateButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("intSelection")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("clearButton")).click();
	}

}
