package com.usa.Parent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.gargoylesoftware.htmlunit.WebConsole.Logger;

public class Parent {

	public static Logger log;
	public static Properties prop;
	public static FileInputStream file;
	public static WebDriver driver;

	@BeforeTest
	public void Hello() {
		
		prop = new Properties();
		try {
			FileInputStream file = new FileInputStream(
					System.getProperty("user.dir") + "./src/main/java/com/usa/config//fb.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
@Test
	public void yerr() {
		String Browsername = prop.getProperty("browser");

		if (Browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Munawar Hossain\\eclipse-workspace\\FBProject\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (Browsername.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Munawar Hossain\\eclipse-workspace\\FBProject\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	public void teardown() {
		driver.close();
	}

	public static void Screenshot(String methodname) {

		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File(
					"C:\\Users\\Munawar Hossain\\eclipse-workspace\\FBProject\\ScreenShot" + methodname + ".jpg"));
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
