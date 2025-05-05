package com.qa.coi.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.coi.base.BaseTest;
import com.qa.coi.constants.AppConstants;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import static com.qa.coi.constants.AppConstants.*;

import java.util.List;

public class AccountPageTest extends BaseTest {
	
	@BeforeClass
	public void accPageSetup() {
		accPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Description("checking open cart Acc page title...")
	@Severity(SeverityLevel.MINOR)
	@Owner("Naveen")
	@Test
	public void accPageTitleTest() {
		Assert.assertEquals(accPage.getAccPageTitle(), HOME_PAGE_TITLE) ;
	}
	
	@Description("checking open cart acc page url ...")
	@Severity(SeverityLevel.MINOR)
	@Owner("Naveen")
	@Test
	public void accPageURLTest() {
		Assert.assertTrue(accPage.getAccPageURL().contains(HOME_PAGE_FRACTION_URL));
	}
	
	@Description("checking open cart acc page headers...")
	@Severity(SeverityLevel.MINOR)
	@Owner("Naveen")
	@Test
	public void accPageHeadersTest() {
		List<String> actHeaderList = accPage.getAccPageHeaders();
		Assert.assertEquals(actHeaderList, AppConstants.expectedAccPageHeadersList);
	}

}
