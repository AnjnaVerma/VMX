package com.vmx.resultPage;

import java.io.IOException;

import org.testng.annotations.Test;

import com.vmx.genericFile.BaseTest;
import com.vmx.genericFile.FileLib;
import com.vmx.genericFile.WebDriverCommonLib;
import com.vmx.home.Home;
import com.vmx.pages.ResultPage;

public class Result extends BaseTest {

@Test
public void result() throws IOException, InterruptedException
{
	Home h=new Home();
	h.homeSearch();
	Thread.sleep(3000);
	FileLib flib=new FileLib();
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	wlib.getPageTitle();
	wlib.verify(wlib.getPageTitle(), flib.getPropValue(PROP_PATH, "ResultTitle"),"ResultPage");
	Thread.sleep(5000);
	ResultPage rp=new ResultPage(driver);
	wlib.moveSlider();
	wlib.moveSlider();
}
	
}
	


