package com.vmx.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ResultPage {
@FindBy(id="slider-range")
private WebElement priceSlider;

public WebElement getPriceSlider() {
	return priceSlider;
}

public void setPriceSlider(WebElement priceSlider) {
	priceSlider.click();
}
public ResultPage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}
}
