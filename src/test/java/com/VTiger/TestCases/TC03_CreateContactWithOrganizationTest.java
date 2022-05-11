package com.VTiger.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ObjectRepo.ContactInfoPage;
import com.ObjectRepo.ContactOrgPopUp;
import com.ObjectRepo.CreateNewContactPage;
import com.ObjectRepo.HomePage;
import com.ObjectRepo.LoginPage;
import com.Vtiger.genric.TestData;
import com.Vtiger.genric.WebDriverUtil;

public class TC03_CreateContactWithOrganizationTest extends Browser{

	public static void main(String[] args) throws Throwable {
		Browser b=new Browser();
		b.OpenBrowser();

		WebDriverUtil webDriverUtil = new WebDriverUtil(driver);

		webDriverUtil.maxwindow();
		webDriverUtil.pageloadtimeout();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.logintoApp();

		

		webDriverUtil.maxwindow();
		webDriverUtil.pageloadtimeout();
		HomePage homePage = new HomePage(driver);
		homePage.getContactslink().click();

		ContactInfoPage conatctInfoPage = new  ContactInfoPage(driver);
		conatctInfoPage.getCreatecontactsimg().click();
		TestData testData= new TestData();

		String contactname=testData.getLastName();
		
		System.out.println(contactname);

		CreateNewContactPage createNewContactPage = new CreateNewContactPage(driver);
		createNewContactPage.getLastNameEdt().sendKeys(contactname);
		
		createNewContactPage.getOrganizationLookUpImage().click();

		Thread.sleep(2000);
		webDriverUtil.switchWindow("Accounts");
		
		Thread.sleep(4000);
		
		ContactOrgPopUp contactOrg_popup = new ContactOrgPopUp(driver);
		
		contactOrg_popup.searchandSelectforOrg("Mango");

		Thread.sleep(2000);
		webDriverUtil.switchWindow("Contacts");

		createNewContactPage.getSaveBtn().click();

		Thread.sleep(8000);

		String contactid=createNewContactPage.getcontactid().getText();

		System.out.println(contactid);
		driver.navigate().refresh();
		
		homePage.getContactslink().click();
		
		conatctInfoPage.checkcontactcreated(contactid);
		
		Thread.sleep(4000);
		
		String actualcontactlastname=conatctInfoPage.getactualcontact().getText();

		System.out.println(actualcontactlastname);
		
		if (actualcontactlastname.equals(contactname)) 
		{
			System.out.println("Tc Passes");
		}
		else {
			System.out.println("TC Fail");
		}

		homePage.logoutfromApp();

		Thread.sleep(10000);

		driver.close();




	}

}
