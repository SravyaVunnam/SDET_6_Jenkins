package com.VTiger.TestCases;


import org.testng.annotations.Test;

import com.ObjectRepo.CreateNewOrgPage;
import com.ObjectRepo.HomePage;
import com.ObjectRepo.OrgInfoPage;
import com.Vtiger.genric.BaseTest;
import com.Vtiger.genric.JavaUtil;
import com.Vtiger.genric.TestData;


public class TC01VerifyingOrganizationCreatedOrNotTest extends  BaseTest{
        @Test
        public void CreatingOrg() throws Throwable
        {
        	
		
        HomePage homePage = new HomePage(driver);

		homePage.getOrglink().click();

		OrgInfoPage orgInfoPage= new OrgInfoPage(driver);
		orgInfoPage.getCreateorgbtn().click();

		TestData testData= new TestData();
		JavaUtil javaUtil = new JavaUtil();
		String orgname=testData.getOrganizationName()+javaUtil.createRandomnumber();
	
		CreateNewOrgPage createNewOrgPage = new CreateNewOrgPage(driver);

		createNewOrgPage.getOrgname().sendKeys(orgname);
		createNewOrgPage.getSaveorgbtn().click();
		
		Thread.sleep(4000);
		driver.navigate().refresh();

		homePage.getOrglink().click();
		
		orgInfoPage.searchforOrg(orgname, "accountname");

		Thread.sleep(3000);

		String actualorgname=orgInfoPage.getfirstOrg().getText();


		if (orgname.equals(actualorgname)) 
		{
			System.out.println("Tc Passes");
		}
		else {
			System.out.println("TC Fail");
		}

		
		
	}

}
