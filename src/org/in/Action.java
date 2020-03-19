package org.in;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\R SABRINATHAN\\eclipse1-workspace\\Selenuim\\add\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email=driver.findElement((By.id("email")));
		WebElement pwd=driver.findElement((By.id("pass")));
		
		Actions a=new Actions(driver);
		a.keyDown(email,Keys.SHIFT).sendKeys("sabari");
		a.keyUp(email,Keys.SHIFT).sendKeys("edfghjk");;
		a.keyDown(pwd,Keys.SHIFT).perform();
		a.keyUp(pwd,Keys.SHIFT).perform();
		
		
		
	}

}
