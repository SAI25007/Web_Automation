package Selenium;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridParallelExecution {
	
	public String gridServer = "http://10.3.157.12:4444";
	
	@Test
	public void test1() throws MalformedURLException, InterruptedException {
	try {
		System.out.println("Test 1 Started");
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setBrowserName("chrome");
		desiredCapabilities.setPlatform(Platform.WIN10);
		
		WebDriver driver = new RemoteWebDriver(new URL(gridServer), desiredCapabilities);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("The title of the page is " +driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Test 1 Ended");
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
		
	}
	@Test
	public void test2() throws MalformedURLException, InterruptedException {
		try {
			System.out.println("Test 2 Started");
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setBrowserName("chrome");
			desiredCapabilities.setPlatform(Platform.WIN10);
			
			WebDriver driver = new RemoteWebDriver(new URL(gridServer), desiredCapabilities);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			System.out.println("The title of the page is " +driver.getTitle());
			Thread.sleep(2000);
			driver.quit();
			System.out.println("Test 2 Ended");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
			
		}
	@Test
	public void test3() throws MalformedURLException, InterruptedException {
		try {
			System.out.println("Test 3 Started");
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setBrowserName("chrome");
			desiredCapabilities.setPlatform(Platform.WIN10);
			
			WebDriver driver = new RemoteWebDriver(new URL(gridServer), desiredCapabilities);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			System.out.println("The title of the page is " +driver.getTitle());
			Thread.sleep(2000);
			driver.quit();
			System.out.println("Test 3 Ended");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
			
		}
	@Test
	public void test4() throws MalformedURLException, InterruptedException {
		try {
			System.out.println("Test 4 Started");
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setBrowserName("chrome");
			desiredCapabilities.setPlatform(Platform.WIN10);
			
			WebDriver driver = new RemoteWebDriver(new URL(gridServer), desiredCapabilities);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			System.out.println("The title of the page is " +driver.getTitle());
			Thread.sleep(2000);
			driver.quit();
			System.out.println("Test 4 Ended");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
			
		}
	@Test
	public void test5() throws MalformedURLException, InterruptedException {
		try {
			System.out.println("Test 5 Started");
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setBrowserName("chrome");
			desiredCapabilities.setPlatform(Platform.WIN10);
			
			WebDriver driver = new RemoteWebDriver(new URL(gridServer), desiredCapabilities);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			System.out.println("The title of the page is " +driver.getTitle());
			Thread.sleep(2000);
			driver.quit();
			System.out.println("Test 5 Ended");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
			
		}
}

