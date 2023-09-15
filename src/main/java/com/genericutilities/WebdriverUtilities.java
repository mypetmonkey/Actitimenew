package com.genericutilities;

import java.io.File;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;

public class WebdriverUtilities {
	
	public WebDriver driver;
	public WebElement ele;
	
	
	
	public void impwait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	public void maximiseWindows(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	
	
	public void explicitWaitForTitle(String title,WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	
	
	public void explicitWaitClickable(Locator locator, WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable((By) locator));
	}
	
	
	public void explicitWaitVisible(WebElement ele, WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	
	public void acceptAlertPopup() {
		driver.switchTo().alert().accept();
	}
	
	
	
	public void getTextFromPopup() {
		driver.switchTo().alert().getText();
	}
	
	
	public void dismissAlertPopup(){
		driver.switchTo().alert().dismiss();
	}
	
	
	public void moveToElement(WebDriver driver,WebElement ele ) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	
	
	public void dragAndDrop(WebElement src,WebElement dest) {
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		
	}
	
	
	
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions act=new Actions(driver);
		act.doubleClick(ele);
	}
	
	
	
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions act=new Actions(driver);
		act.contextClick(ele);
	}
	
	
	
	public void selectByIndex(int index, WebElement ele) {
		Select sel=new Select(ele);
		sel.selectByIndex(index);
	}
	
	
	public void selectByValue(WebElement ele, String value) {
		Select sel=new Select(ele);
		sel.selectByValue(value);
	}
	
	
	
	public void selectByVisibleText(WebElement ele,String text) {
		Select sel=new Select(ele);
		sel.selectByVisibleText(text);
	}
	
	
	
	public List<WebElement> getAllOptions(WebElement ele) {
		Select sel=new Select(ele);
		List<WebElement> alloptions = sel.getOptions();
		return alloptions;
	}
	
	
	
	
	public String FileUpload() {
		File f=new File(".\\src\\main\\resources\\reseme\\resume.docx");
		String path = f.getAbsolutePath();
		return path; 
	}
	
	
	
	public void frameByIndex(int index) {
		driver.switchTo().frame(index);
	}
	
	
	public void frameByIndex(String value) {
		driver.switchTo().frame(value);
	}
	
	
	
	public void frameByIndex(WebElement ele) {
		driver.switchTo().frame(ele);
	}
	
	
	
	public void gotoParentWindow() {
		driver.switchTo().defaultContent();
	}
	
	
	public void switcTohWindow(String partialTitle, WebDriver driver) {
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while(itr.hasNext()) {
			String winID= itr.next();
			String currentWindTitle = driver.switchTo().window(winID).getTitle();
			 if(currentWindTitle.contains(partialTitle))
				 break;
		}
	}
	
	
 

}
