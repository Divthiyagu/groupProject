package com.selenium.hcltech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorialspoint {
	
	void checkbox(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("c_bs_1")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"bs_1\"]/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"bf_1\"]/span[1]")).click();
		Thread.sleep(2000);
	}
	
	void radiobutton(WebDriver driver) {
		if(driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[5]/input")).isEnabled()) {
			System.out.println("enabled");
		}
		else {
			System.out.println("disbled");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divyasri.t\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		
		
		
		Thread.sleep(1000);
		driver.findElement(By.id("fullname")).sendKeys("Divya");
		driver.findElement(By.id("email")).sendKeys("divya@gmail.com");
		driver.findElement(By.id("address")).sendKeys("13,anna nagar,chennai");
		driver.findElement(By.id("password")).sendKeys("15679");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"TextForm\"]/div[5]/input")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"navMenus\"]/li[2]")).click();
		Tutorialspoint n = new Tutorialspoint();
		n.checkbox(driver);
		
		driver.findElement(By.xpath("//*[@id=\"navMenus\"]/li[3]/a")).click();
		n.radiobutton(driver);

	}

}
