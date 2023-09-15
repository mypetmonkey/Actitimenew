package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="gettingStartedShortcutsMenuCloseId")
	private WebElement cross;
	@FindBy(id="logoutLink")
	private WebElement logoutbtn;
	@FindBy(id="logo_aT")
	private WebElement gotohome;
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tasklink;
	@FindBy(xpath="//div[@class='title ellipsis']")
	private WebElement createnew;
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement createpro;
	@FindBy(xpath="//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
	private WebElement projectname;
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement customer;
	@FindBy(xpath="//div[@class='itemRow ']")
	private WebElement itemrow;
	@FindBy(xpath="//input[@class='newCustomerNameField newCustomer']")
	private WebElement custnameenter;
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement prodescription;
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder' and @placeholder='Enter task name']")
	private WebElement taskname;
	@FindBy(xpath="//td[@class='estimateCell']/input[@class='inputFieldWithPlaceholder']")
	private WebElement estimate;
	@FindBy(xpath="//button[text()='set deadline']")
	private WebElement deadline;
	@FindBy(id="ext-gen90")
	private WebElement nextdate;
	@FindBy(xpath="//span[text()='15']")
	private WebElement date;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createproject;
	
	

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public WebElement getCross() {
		return cross;
	}



	public void setCross(WebElement cross) {
		this.cross = cross;
	}



	public WebElement getLogoutbtn() {
		return logoutbtn;
	}


	public void setLogoutbtn(WebElement logoutbtn) {
		this.logoutbtn = logoutbtn;
	}


	public WebElement getGotohome() {
		return gotohome;
	}


	public void setGotohome(WebElement gotohome) {
		this.gotohome = gotohome;
	}


	public WebElement getTasklink() {
		return tasklink;
	}


	public void setTasklink(WebElement tasklink) {
		this.tasklink = tasklink;
	}


	public WebElement getCreatenew() {
		return createnew;
	}


	public void setCreatenew(WebElement createnew) {
		this.createnew = createnew;
	}


	public WebElement getCreatepro() {
		return createpro;
	}


	public void setCreatepro(WebElement createpro) {
		this.createpro = createpro;
	}


	public WebElement getProjectname() {
		return projectname;
	}


	public void setProjectname(WebElement projectname) {
		this.projectname = projectname;
	}


	public WebElement getCustomer() {
		return customer;
	}


	public void setCustomer(WebElement customer) {
		this.customer = customer;
	}


	public WebElement getItemrow() {
		return itemrow;
	}


	public void setItemrow(WebElement itemrow) {
		this.itemrow = itemrow;
	}


	public WebElement getCustnameenter() {
		return custnameenter;
	}


	public void setCustnameenter(WebElement custnameenter) {
		this.custnameenter = custnameenter;
	}


	public WebElement getProdescription() {
		return prodescription;
	}


	public void setProdescription(WebElement prodescription) {
		this.prodescription = prodescription;
	}


	public WebElement getTaskname() {
		return taskname;
	}


	public void setTaskname(WebElement taskname) {
		this.taskname = taskname;
	}


	public WebElement getEstimate() {
		return estimate;
	}


	public void setEstimate(WebElement estimate) {
		this.estimate = estimate;
	}


	public WebElement getDeadline() {
		return deadline;
	}


	public void setDeadline(WebElement deadline) {
		this.deadline = deadline;
	}


	
	public WebElement getNextdate() {
		return nextdate;
	}



	public void setNextdate(WebElement nextdate) {
		this.nextdate = nextdate;
	}



	public WebElement getDate() {
		return date;
	}



	public void setDate(WebElement date) {
		this.date = date;
	}



	public WebElement getCreateproject() {
		return createproject;
	}



	public void setCreateproject(WebElement createproject) {
		this.createproject = createproject;
	}



	//logout from application
	public void setLogout() {
		gotohome.click();
		logoutbtn.click();
	}

}
