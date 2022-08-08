package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helpers.Helpers;
import pages.PageHome;
import pages.PageLogin;

public class Tests {
	private WebDriver driver;
	@BeforeMethod
	public void setUp() {
		DesiredCapabilities caps = new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		Helpers helper = new Helpers();
		helper.sleepSeconds(4);
	}
	@Test
	public void pruebaUno() {
		PageLogin pageLogin = new PageLogin(driver);
		pageLogin.login("Admin", "admin123");
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1")).getText().contains("Dashboard"));
	}
	
	public void pruebaTres() {
		PageHome pagehome = new PageHome(driver);
		//pagehome.selectJobs("Job Titles");
		pagehome.selectAdmin("Admin");
		Helpers helper = new Helpers();
		helper.sleepSeconds(4);
		pagehome.selectJobs("Job");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
