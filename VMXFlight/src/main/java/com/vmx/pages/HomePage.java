package com.vmx.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

@FindBy(id="Radio3")
private WebElement oneWayRadioBtn;	
@FindBy(id="ctl00_ContentMain_txtFromCity")
private WebElement fromTextBx;
@FindBy(xpath="//a[.='Mumbai, India -Bombay(BOM)']")
private WebElement fromDropdown; 
@FindBy(id="ctl00_ContentMain_txtTOCity")
private WebElement toTextBx;
@FindBy(xpath="//a[.='New Delhi, India -Indira Gandhi Intl(DEL)']")
private WebElement toDropdown; 
@FindBy(id="txtDD")
private WebElement departDate;
@FindBy(xpath="//span[.='Next']")
private WebElement nextMonthBtn;
@FindBy(xpath="//td[@data-month='7']/a[.='15']")
private WebElement dateOfFlying;
@FindBy(xpath="//div[@class='fltsrchbtn']/a[.='Search']")
private WebElement searchBtn;

public WebElement getOneWayRadioBtn() {
	return oneWayRadioBtn;
}
public void setOneWayRadioBtn() {
	oneWayRadioBtn.click();
}
public WebElement getFromTextBx() {
	return fromTextBx;
}
public void setFromTextBx(String fromCity) {
	fromTextBx.sendKeys(fromCity);;
}
public WebElement getFromDropdown() {
	return fromDropdown;
}
public void setFromDropdown() {
	fromDropdown.click();
}
public WebElement getToTextBx() {
	return toTextBx;
}
public void setToTextBx(String toCity) {
	toTextBx.sendKeys(toCity);;
}
public WebElement getToDropdown() {
	return toDropdown;
}
public void setToDropdown() {
	toDropdown.click();
}
public WebElement getDepartDate() {
	return departDate;
}
public void setDepartDate(WebElement departDate) {
	departDate.click();
}
public WebElement getNextMonthBtn() {
	return nextMonthBtn;
}
public void setNextMonthBtn(WebElement nextMonthBtn) {
	nextMonthBtn.click();
}
public WebElement getDateOfFlying() {
	return dateOfFlying;
}
public void setDateOfFlying(WebElement dateOfFlying) {
	dateOfFlying.click();
}
public WebElement getSearchBtn() {
	return searchBtn;
}
public void setSearchBtn(WebElement searchBtn) {
	searchBtn.click();
}

public HomePage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}

public void search(String fromCity, String toCity) throws InterruptedException
{
	oneWayRadioBtn.click();
	fromTextBx.sendKeys(fromCity);
	Thread.sleep(2000);
	fromDropdown.click();
	Thread.sleep(2000);
toTextBx.sendKeys(toCity);
Thread.sleep(2000);
	toDropdown.click();
	Thread.sleep(2000);
	departDate.click();
	Thread.sleep(2000);
	nextMonthBtn.click();
	Thread.sleep(2000);
	dateOfFlying.click();
	Thread.sleep(2000);
	searchBtn.click();;

}

}
