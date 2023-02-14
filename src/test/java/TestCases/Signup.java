package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ObjectModel.SignUpPageObject;
import PageObjectModel.LoginPageObjects;
import Resource.BaseClass;
import Resource.CommonMethods;
import Resource.Constant;

public class Signup extends BaseClass {
	@Test
	public void signup() throws IOException{
		
LoginPageObjects obj=new LoginPageObjects(driver);
obj.clickOntryforFree().click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

SignUpPageObject obj1=new SignUpPageObject(driver);

obj1.enterfirstname().sendKeys(Constant.firstname);
obj1.enterlastname().sendKeys(Constant.lastname);
obj1.enteremail().sendKeys(Constant.workmail);
obj1.clickOntitle().click();
//Select s=new Select(obj1.clickOntitle());
CommonMethods.selectDropdown(obj1.clickOntitle(), "Developer");
obj1.entercompany().sendKeys(Constant.company);
obj1.clickOnemploye().click();
//Select d=new Select(obj1.clickOnemploye());
CommonMethods.selectDropdown(obj1.clickOnemploye(), "950");
obj1.enterphone().sendKeys(Constant.phone);
obj1.clickOncountry().click();
//Select e=new Select(obj1.clickOncountry());
CommonMethods.selectDropdown(obj1.clickOncountry(), "IN");
obj1.clickOncheckbox().click();
obj1.clickOnstart().click();


	}

}
