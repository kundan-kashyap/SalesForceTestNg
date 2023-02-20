package ObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {	
	public WebDriver driver;
	private By firstname=By.xpath("//input[@name='UserFirstName']");
	private By lastname=By.xpath("//input[@name='UserLastName']");
	private By email=By.xpath("//input[@name='UserEmail']");
	private By title=By.xpath("//select[@name='UserTitle']");
	private By company=By.xpath("//input[@name='CompanyName']");
	private By employe=By.xpath("//select[@name='CompanyEmployees']");
	private By phone=By.xpath("//input[@name='UserPhone']");
	private By country=By.xpath("//select[@name='CompanyCountry']");
	private By checkbox=By.xpath("(//div[@class='checkbox-ui'])[1]");
	private By start=By.xpath("//button[@name='start my free trial']");
	public SignUpPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement enterfirstname() {
		return driver.findElement(firstname);
	}
	public WebElement enterlastname() {
		return driver.findElement(lastname)
;}
	public WebElement enteremail() {
		return driver.findElement(email)
;	}
	public WebElement clickOntitle() {
return driver.findElement(title);
	}
	public WebElement entercompany() {
		return driver.findElement(company);
	}
	public WebElement clickOnemploye() {
return driver.findElement(employe)
;}
	public WebElement enterphone() {
return driver.findElement(phone)
;	}
	public WebElement clickOncountry() {
		return driver.findElement(country)
;	}
	public WebElement clickOncheckbox() {
		return driver.findElement(checkbox)
;	}
	public WebElement clickOnstart() {
		return driver.findElement(start)
;	}
	
	
	
}
