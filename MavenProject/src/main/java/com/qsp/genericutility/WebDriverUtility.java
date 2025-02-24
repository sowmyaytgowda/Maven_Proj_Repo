package com.qsp.genericutility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {

public void mouseOver(WebDriver driver,WebElement element) {
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
	
	
	}
public void rightclick(WebDriver driver){
		Actions act=new Actions(driver);
		act.contextClick().perform();

	
}
public void rightclick(WebDriver driver,WebElement element){
	Actions act=new Actions(driver);
	act.contextClick(element).perform();
}

public void dragAndDrop(WebDriver driver,WebElement source,WebElement target){
	Actions act=new Actions(driver);
	act.dragAndDrop(source, target).perform();
}
public void Scroll(WebDriver driver,int x,int y){
	Actions act=new Actions(driver);
	act.scrollByAmount(x, y).perform();
}

public void Scrollbyelement(WebDriver driver,WebElement element){
	Actions act=new Actions(driver);
	act.scrollToElement(element).perform();
}


public void selectDropdownByIndex(WebElement elemnet,int index) {
	Select s=new Select(elemnet);
	s.selectByIndex(index);
}

public void selectDropdownByvalue(WebElement elemnet,String value) {
	Select sel=new Select(elemnet);
	sel.selectByValue(value);
}

public void selectDropdownByVisibletext(WebElement elemnet,String text) {
	Select sel=new Select(elemnet);
	sel.selectByValue(text);
}

public void switchToFrame(WebDriver driver,int index) {
	driver.switchTo().frame(index);
}

public void switchToFrame(WebDriver driver,String name) {
	driver.switchTo().frame(name);
}

public void switchToFrame(WebDriver driver,WebElement element) {
	driver.switchTo().frame(element);
}

public void switchbackToWindow(WebDriver driver) {
	driver.switchTo().defaultContent();
}

public void screenshot(WebDriver driver) throws IOException {
	javaUtility jutil=new javaUtility();
	TakesScreenshot ts=(TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/"+jutil.getSystemTime()+".png");
	FileHandler.copy(temp, dest);
	
}

public void maximize(WebDriver driver) {
	driver.manage().window().maximize();
}

public Alert switchToalert(WebDriver driver) {
	return driver.switchTo().alert();
}

public void switchToAlertAndAccept(WebDriver driver) {
	driver.switchTo().alert().accept();
}
//important
public void switchToWindow(WebDriver driver,String expurl) {
	Set<String> allwind = driver.getWindowHandles();
	for(String id:allwind) {
		driver.switchTo().window(id);
		String acturl = driver.getCurrentUrl();
		if(acturl.contains(expurl)) {
			break;
		}
	}
}




}