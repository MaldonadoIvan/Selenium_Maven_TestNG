package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PageHome {
	private WebDriver driver;
	private By jobsDrop;
	
	public PageHome(WebDriver driver) {
		this.driver = driver;
		jobsDrop = By.id("menu_admin_Job");
	}
	
	public void selectJobs(String string) {
		Select selectJobList = new Select(driver.findElement(jobsDrop));
		selectJobList.selectByVisibleText(string);
	}
}
