package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowsers {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\seleniumChromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver= new ChromeDriver();
		driver.get("http://www.google.com");
		}
}

