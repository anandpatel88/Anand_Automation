package com.Sikuli.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

public class Download
{
	@Test
	public void upload() throws SikuliException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		Screen sc=new Screen();
		Pattern download=new Pattern("C:\\Users\\anand.mohan.patel\\workspace2\\com.Sikuli.test\\Screenshot\\download.PNG");
		Pattern filedownload=new Pattern("C:\\Users\\anand.mohan.patel\\workspace2\\com.Sikuli.test\\Screenshot\\filedownload.PNG");
		sc.click(download);
		sc.wait(filedownload, 10000);
		sc.click(filedownload);
		
	}

}

