package com.usa.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.usa.Parent.Parent;

public class Utility extends Parent {

	public static WebElement Explicitwait(WebElement waitelement) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(waitelement));
		return element;

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
