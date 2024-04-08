package com.training.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	public void takescreenshot(WebDriver driver)
	{
		TakesScreenshot screenshot=((TakesScreenshot) driver);
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		//adding timestamp
		Date current=new Date();
		String timestamp=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(current);
		String userDir=System.getProperty("user.dir");
		String fileseparator=System.getProperty("file.separator");
		String filepath=userDir+fileseparator+"screenshots"+fileseparator+"Salesforce"+timestamp+".jpeg";
		File destFile=new File(filepath);
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
