package com.vmx.home;

import org.testng.annotations.Test;

import com.vmx.genericFile.BaseTest;
import com.vmx.pages.HomePage;

public class Home extends BaseTest {
@Test
public void homeSearch() throws InterruptedException
{
		HomePage hp=new HomePage(driver);
		hp.search("bom", "del");
}

}
