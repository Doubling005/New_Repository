package com.Utilities;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.Testbase.TestBase;

public class ScreenShotMethod extends TestBase {

	static String path = "C:\\Users\\Home\\eclipse-workspace\\testNGframework\\ScreenShot\\";

	public static void takeScreenshot(String filename) throws IOException  {

		TakesScreenshot take = (TakesScreenshot) driver;
		File source = take.getScreenshotAs(OutputType.FILE);

		File description = new File(path + filename + ".png");
		FileHandler.copy(source, description);
	}

}
