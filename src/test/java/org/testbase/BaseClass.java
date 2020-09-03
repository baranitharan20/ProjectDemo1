package org.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	
	
	
		public static WebDriver driver;

		public WebDriver browserlaunch(String browser) {

			if (browser.equals("chrome")) {
				System.setProperty("webDriver.chrome.driver",
						"C:\\Users\\Rhombus Labs\\eclipse-workspace\\selenium\\Bharani\\btharan\\Facebookpom\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equals("firefox")) {
				System.setProperty("webDriver.chrome.driver",
						"C:\\Users\\Rhombus Labs\\eclipse-workspace\\selenium\\Bharani\\btharan\\Facebookpom\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equals("internet explore")) {
				System.setProperty("webDriver.chrome.driver",
						"C:\\Users\\Rhombus Labs\\eclipse-workspace\\selenium\\Bharani\\btharan\\Facebookpom\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				
			}
			return driver;
		}

		public void launchurl(String url) {
			driver.get(url);
		}


		public void login(WebElement e,String value) {
			e.sendKeys(value);
			

		}

		}




