package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helpers.Helpers;

public class PageLogin {
	private WebDriver driver;
	private By userField;
	private By passwordField;
	private By loginButton;
	public PageLogin(WebDriver driver) {
		this.driver = driver;
		userField = By.name("txtUsername");
		passwordField = By.name("txtPassword");
		loginButton = By.name("Submit");
	}
	
	public void login(String user, String pass) {
		driver.findElement(userField).sendKeys(user);
		driver.findElement(passwordField).sendKeys(pass);
		driver.findElement(loginButton).click();
		Helpers helper = new Helpers();
		helper.sleepSeconds(4);
	}
}
