package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PageHome {
	private WebDriver driver;
	private By adminList;
	private By jobsDrop;
	
	public PageHome(WebDriver driver) {
		this.driver = driver;
		adminList = By.id("menu_admin_viewAdminModule");
		jobsDrop = By.id("menu_admin_Job");
	}
	
	
	public void selectAdmin(String string) {
		Select selectAdminList = new Select(driver.findElement(adminList));
		selectAdminList.selectByVisibleText(string);
	}
	
	public void selectJobs(String string) {
		Select selectJobList = new Select(driver.findElement(jobsDrop));
		selectJobList.selectByVisibleText(string);
	}
}
