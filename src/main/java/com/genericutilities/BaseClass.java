package com.genericutilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePage;
import objectRepository.LoginPage;



public class BaseClass {
	
	FileUtilities flib=new FileUtilities();
	WebdriverUtilities wlib=new WebdriverUtilities();
    public WebDriver driver;
    //public static WebDriver sdriver;
    
    //connect to db
    @BeforeSuite
    public void connectdb() {
    	
    	
    }
    
    
    //open browser
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void openbrowser(@Optional ("chrome") String browser) throws IOException {
		
		if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		else {
			System.out.println("invalid browser");
		}
		
		String url = flib.getPropertyData("url");
		driver.get(url);
        wlib.maximiseWindows(driver);
		wlib.impwait(driver);
		
	}
	
	
	//login to application
	
	@BeforeMethod
	public void login() throws IOException, InterruptedException {
		
		LoginPage l=new LoginPage(driver);
		l.setLogin();
		
	}
	
	//logout from application
	
	@AfterMethod
	public void logout() {
		HomePage hp=new HomePage(driver);
		hp.setLogout();
		
	}
	
	//close all browser
	
	@AfterClass
	public void close() {
	//	driver.quit();
	}
	
	//close db
	
	@AfterSuite
	public void disconnectTodb() {
		
	}

	

}
