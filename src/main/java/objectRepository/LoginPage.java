package objectRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericutilities.FileUtilities;

public class LoginPage {
	
	FileUtilities flib=new FileUtilities();
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement lgtbx;
	@FindBy(name="pwd")
	private WebElement untbx;
	@FindBy(id="loginButton")
	private WebElement lgbtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLgtbx() {
		return lgtbx;
	}

	public void setLgtbx(WebElement lgtbx) {
		this.lgtbx = lgtbx;
	}

	public WebElement getUntbx() {
		return untbx;
	}

	public void setUntbx(WebElement untbx) {
		this.untbx = untbx;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}

	public void setLgbtn(WebElement lgbtn) {
		this.lgbtn = lgbtn;
	}
	
	public void setLogin() throws IOException, InterruptedException {
		lgtbx.sendKeys(flib.getPropertyData("user"));
		untbx.sendKeys(flib.getPropertyData("pwd"));
		lgbtn.click();
	}

}
