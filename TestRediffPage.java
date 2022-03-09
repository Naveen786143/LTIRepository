package com.Junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRediffPage {
	 static WebDriver driver;
@BeforeClass
  public  static void beforeClass()
  {
	System.setProperty("webdriver.chrome.driver","C:\\seleniumChromedriver\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
  }
 @Test
   public void checkTitle()
   {
	 String actTitle=driver.getTitle();
	 assertEquals("Rediffmail", actTitle);
   }
 @Test
 public void checkErrorMessage() {
	 driver.findElement(By.id("login1")).sendKeys("abc");
	 driver.findElement(By.id("password")).sendKeys("abc");
	 driver.findElement(By.name("proceed")).click();
	 String actERRMsg = driver.findElement(By.id("div_login_error")).getText();
	 assertTrue(actERRMsg.contains("Wrong username and password combination."));
 }
	 @AfterClass
	 public static void afterClass() {
		 driver.quit();
 }
}
