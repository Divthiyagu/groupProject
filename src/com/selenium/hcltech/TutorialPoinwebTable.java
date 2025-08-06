package com.selenium.hcltech;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialPoinwebTable {
	
	void edit(WebDriver driver) throws InterruptedException {
		
		
		driver.findElement(By.xpath("/html/body/main/div/div/div[4]/div/div/form/div[1]/div[1]/div/input")).sendKeys("Divya");
		driver.findElement(By.xpath("/html/body/main/div/div/div[4]/div/div/form/div[1]/div[2]/div/input")).sendKeys("sri");
		driver.findElement(By.xpath("/html/body/main/div/div/div[4]/div/div/form/div[1]/div[3]/div/input")).sendKeys("sri@gmail.com");
		driver.findElement(By.xpath("/html/body/main/div/div/div[4]/div/div/form/div[1]/div[4]/div/input")).sendKeys("22");
		driver.findElement(By.xpath("/html/body/main/div/div/div[4]/div/div/form/div[1]/div[5]/div/input")).sendKeys("22000");
		driver.findElement(By.xpath("/html/body/main/div/div/div[4]/div/div/form/div[1]/div[6]/div/input")).sendKeys("Automation");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/main/div/div/div[4]/div/div/div/button")).click();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divyasri.t\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"navMenus\"]/li[4]/a")).click();
		Thread.sleep(1000);
		
		//search
		
		driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/span[2]/div/input")).sendKeys("Cierra");
		driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/span[2]/div/button")).click();
		Thread.sleep(2000);
		
		//edit
		
		driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(2000);
		TutorialPoinwebTable n = new TutorialPoinwebTable();
		n.edit(driver);
		
		driver.findElement(By.xpath("//*[@id=\"staticEdit\"]/div/div/div/button")).click();
		Thread.sleep(2000);
		
		//delete
		driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[1]/td[7]/a[2]")).click();
			
		
		
		//add
		driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/span[1]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Sri");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("S");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sri.gmail.com");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Sri");
//		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Sri");
		

	}

}
