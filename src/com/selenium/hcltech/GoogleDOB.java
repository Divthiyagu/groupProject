package com.selenium.hcltech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDOB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divyasri.t\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com");
		//driver.findElement(By.id("identifierId")).sendKeys("divya");
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[1]/div/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[2]/div/ul/li[1]/span[3]")).click();
		driver.findElement(By.id("firstName")).sendKeys("Divya");
		   WebElement next=driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span"));
		   next.click();
		   driver.findElement(By.xpath("//*[@id=\"month\"]/div/div[1]/div")).click();
		   driver.findElement(By.xpath("//*[@id=\"month\"]/div/div[2]/ul/li[1]")).click();
		   driver.findElement(By.id("day")).sendKeys("02");
		   
		

	}

}
