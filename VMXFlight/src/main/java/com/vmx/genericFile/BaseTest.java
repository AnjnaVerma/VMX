package com.vmx.genericFile;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConsts{

	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() throws IOException
	{
	FileLib flib=new FileLib();
String browser = flib.getPropValue(PROP_PATH, "browser");
if(browser.equalsIgnoreCase("chrome"))
{
System.setProperty(CHROME_KEY, CHROME_VALUE);
driver=new ChromeDriver();
}
else if(browser.equalsIgnoreCase("firefox"))
{
System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
driver=new FirefoxDriver();
}
else
{
System.out.println("Enter valid browser name");	
}

String appUrl = flib.getPropValue(PROP_PATH, "url");
driver.get(appUrl);
driver.manage().window().maximize();
WebDriverCommonLib wlib=new WebDriverCommonLib();
wlib.verify(wlib.getPageTitle(), flib.getPropValue(PROP_PATH, "eHomeTitle"), "HomeTitle");
	}
	@AfterClass(enabled=false)
public void closeBrowser()
{
driver.quit();	
}
	
}
