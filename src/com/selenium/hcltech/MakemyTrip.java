package com.selenium.hcltech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divyasri.t\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.makemytrip.com/");
//		driver.findElement(By.xpath("//*[@id=\\\"SW\\\"]/div[1]/div[2]/div[2]/div/section/span")).click();
//		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div/div[1]/ul/li[2]/span")).click();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.makemytrip.com/");
		
		System.out.println("Title : " + d.getTitle());
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/form/div[1]/div/input")).sendKeys("8925888447");
		d.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/span")).click();//cross
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div/div[1]/ul/li[2]/span")).click();
		Thread.sleep(3000);
		if(d.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div/div[1]/ul/li[2]/span")).isSelected()) {
			System.out.println("Selected round trip");
		}else {
			System.out.println("Selected one way");
		}
	}

}
