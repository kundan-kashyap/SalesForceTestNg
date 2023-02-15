package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	//this driver dont have scope
	//this is temprerory line
	public WebDriver driver;
	
	private By username=By.xpath("//input[@id='username']");
	private By password=By.xpath("//input[@id='password']");
	private By login=By.xpath("//input[@id='Login']");
	private By tryforFree=By.xpath("//a[@id='signup_link']");
	private By error=By.xpath("//div[@id='error']");
	
	public LoginPageObjects(WebDriver driver2) {
		
		this.driver=driver2;
		
	}
	public WebElement enterUsername() {
		return driver.findElement(username);
	}
	public WebElement enterPassword() {
		return driver.findElement(password);
	}
public WebElement clickOnLogin() {
	return driver.findElement(login);
}
public WebElement clickOntryforFree() {
	return driver.findElement(tryforFree);
}
public WebElement errortext() {
	return driver.findElement(error);
}
}
