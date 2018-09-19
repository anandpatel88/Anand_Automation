package com.Sikuli.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

public class FileUpload
{
	@Test
	public void upload() throws SikuliException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand.mohan.patel\\Documents\\Anand\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/FileUpload.html");
		Screen sc=new Screen();
		Pattern browse=new Pattern("C:\\Users\\anand.mohan.patel\\workspace2\\com.Sikuli.test\\Screenshot\\browse.PNG");
		Pattern filename=new Pattern("C:\\Users\\anand.mohan.patel\\workspace2\\com.Sikuli.test\\Screenshot\\filename.PNG");
		Pattern open=new Pattern("C:\\Users\\anand.mohan.patel\\workspace2\\com.Sikuli.test\\Screenshot\\open.PNG");
		sc.click(browse);
		sc.type(filename, "C:\\Users\\anand.mohan.patel\\Desktop\\LWD.PNG");
		sc.click(open);
	}

}
