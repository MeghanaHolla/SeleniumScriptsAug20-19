package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOn {
	
	@FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p > font")
	private WebElement errMsgBox;
	
	public SignOn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String getErrMsg() {
		return errMsgBox.getText();
	}
}
