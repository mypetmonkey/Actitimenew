package actitime;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.genericutilities.BaseClass;
import com.genericutilities.JavaUtilities;

import objectRepository.HomePage;

public class CreateNewProjectAndVerify extends BaseClass {
	
	@Test
	public void CreateAndVerifyProject_Test() throws InterruptedException {
		
		JavaUtilities jlib=new JavaUtilities();
		
		HomePage hp=new HomePage(driver);
		hp.getTasklink().click();
		hp.getCreatenew().click();
		hp.getCreatepro().click();;
		hp.getProjectname().sendKeys("online banking application"+jlib.getRandom());;
    // String expdata=hp.getProjectname().getText();
		hp.getCustomer().click();
		hp.getItemrow().click();
		hp.getCustnameenter().sendKeys("Rajhans"+jlib.getRandom());
		hp.getProdescription().sendKeys("just to test");
		hp.getTaskname().sendKeys("testing");
		//hp.getEstimate().sendKeys("1 year");
		hp.getDeadline().click();
		Thread.sleep(2000);
		for(int i=1;i<=12;i++) {
			hp.getNextdate().click();
			
		}
		hp.getDate().click();
		hp.getCreateproject().click();
		String actdata = driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']/div[@class='title']")).getText();
		//Assert.assertEquals(expdata, actdata);
		System.out.println(actdata);
		
	}

}
