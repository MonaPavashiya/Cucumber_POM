package login_PomBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By Username = By.xpath("//input[@id='user-name']");
	By Password = By.xpath("//input[@id='password']");
	By login = By.xpath("//input[@id='login-button']");
	By reactButton = By.xpath("//button[@id='react-burger-menu-btn']");
	By logout = By.xpath("//a[@id='logout_sidebar_link']");
	
	public void entersername(String uname) {
		driver.findElement(Username).sendKeys(uname);
	}
	
	public void enterPasswordS(String pwd) {
		driver.findElement(Password).sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		driver.findElement(login).click();
	}
	
	public void clickOnReactButton() {
		driver.findElement(reactButton).click();
	}
	
	public void clickOnLogout() {
		driver.findElement(logout).click();
	}
}
