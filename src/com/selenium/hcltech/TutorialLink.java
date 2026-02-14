package com.selenium.hcltech;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divyasri.t\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
		driver.findElement(By.xpath("/html/body/main/div/div/div[2]/p[1]/a")).click();
        Thread.sleep(3000);
        driver.switchTo().window(driver.getWindowHandle());
        //driver.switch_to.window(driver.window_handles[0])
		String str=driver.getTitle();
		System.out.println(str);
		driver.findElmement(By.xpath("/html/body/main/div/div/div[2]/p[2]/a")).click();
		String st1=driver.getTitle();
		System.out.println(st1);
		if(str.equals("Selenium Practice - Links")&& st1.equals("Selenium Practice - Links")) {
			System.out.println("title pewrfectly matches");
		}
		else {
			System.out.println("title is not at all correct");
		}
		Thread.sleep(2000);
		driver.switchTo().window(driver.getWindowHandle());
//		//driver.findElement(By.xpath("//*[@id=\"created\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"created\"]")).click();
		WebElement alertBox = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]"));
		System.out.println(alertBox.getText()+"alert is working properly");
		driver.switchTo().frame("");
		driver.switchTo().defaultContent();
		System.out.println("quit");
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		

	}

}
