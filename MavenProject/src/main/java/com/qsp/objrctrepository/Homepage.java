package com.qsp.objrctrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	@FindBy(linkText = "Log out")
	private WebElement logoutlink;

	@FindBy(partialLinkText = "BOOKS")
	private WebElement bookslink;

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getBookslink() {
		return bookslink;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computerLink;

	public WebElement getComputerLink() {
		return computerLink;
	}
	
	@FindBy(partialLinkText = "ELECTRONICS")
	private WebElement Electronicslink;

	public WebElement getElectronicslink() {
		return Electronicslink;
	}
	@FindBy(partialLinkText = "GIFT CARDS")
	private WebElement giftlink;

	public WebElement getGiftlink() {
		return giftlink;
	}

}
