package com.selenium.hcltech;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeWork {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divyasri.t\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(3000);
		System.out.println("there is 3 second time delay");
		//driver.findElement(By.id("")).sendKeys("divya");
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[22]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/a")).click();
		Thread.sleep(3000);
		WebElement alertBox = driver.findElement(By.xpath("/html/body/div[4]/div/div"));
		System.out.println(alertBox.getText()+"alert box is working properly");
		driver.switchTo().frame("mce_0_ifr");
		driver.switchTo().defaultContent();



	}

}
