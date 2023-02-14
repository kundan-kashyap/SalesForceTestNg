package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import Resource.BaseClass;
import Resource.CommonMethods;
import Resource.Constant;

public class VerifyLogin extends BaseClass {

	@Test(dataProvider="testData")
	public void Login(String username, String password) throws IOException {
	
		
		LoginPageObjects obj=new LoginPageObjects(driver);
		
		obj.enterUsername().sendKeys(username);
		
		obj.enterPassword().sendKeys(password);
		
		obj.clickOnLogin().click();
		
		/*SoftAssert a=new SoftAssert();
		String actual=obj.errortext().getText();
		String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		
		a.assertEquals(actual, expected,"error message is not matching");
		
		a.assertAll();*/
		CommonMethods.handleAssertions(obj.errortext().getText(), Constant.link, "error message is not matching");
	}
	@DataProvider
	public Object[][]testData(){
		Object[][]data=new Object[2][2];
		data[0][0]=Constant.username1;
		data[0][1]=Constant.pasword1;
		data[1][0]=Constant.username2;
		data[1][1]=Constant.password2;
		
		return data;
		
	}
	
}
