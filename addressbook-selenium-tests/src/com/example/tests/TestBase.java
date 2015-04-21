package com.example.tests;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

	protected static WebDriver driver;
	protected static String baseUrl;
	protected static boolean acceptNextAlert = true;
	protected static StringBuffer verificationErrors = new StringBuffer();

	@BeforeTest
	public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://localhost/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	protected void sumbitCreation() {
		driver.findElement(By.name("submit")).click();
	}

	protected void fillGroupForm(ParameterObject group) {
		driver.findElement(By.name("group_name")).clear();
	    driver.findElement(By.name("group_name")).sendKeys(group.groupname);
	    driver.findElement(By.name("group_header")).clear();
	    driver.findElement(By.name("group_header")).sendKeys(group.header);
	    driver.findElement(By.name("group_footer")).clear();
	    driver.findElement(By.name("group_footer")).sendKeys(group.footer);
	}

	protected void initGroupCreation() {
		driver.findElement(By.name("new")).click();
	}

	protected void openGroupPage() {
		driver.findElement(By.linkText("groups")).click();
	}

	protected void openMainPage() {
		driver.get(baseUrl + "/");
	}

	@AfterTest
	public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }

	protected void returnToHomePage() {
		driver.findElement(By.linkText("home page")).click();
	}

	protected void fillAddNewForm(ParameterObject group) {
	    driver.findElement(By.name("firstname")).clear();
	    driver.findElement(By.name("firstname")).sendKeys(group.first_name);
	    driver.findElement(By.name("lastname")).clear();
	    driver.findElement(By.name("lastname")).sendKeys(group.last_name);
	    driver.findElement(By.name("address")).clear();
	    driver.findElement(By.name("address")).sendKeys(group.addres_primary);
	    driver.findElement(By.name("home")).clear();
	    driver.findElement(By.name("home")).sendKeys(group.home_phone);
	    driver.findElement(By.name("mobile")).clear();
	    driver.findElement(By.name("mobile")).sendKeys(group.mobile_phone);
	    driver.findElement(By.name("work")).clear();
	    driver.findElement(By.name("work")).sendKeys(group.work_phone);
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys(group.email_primary);
	    driver.findElement(By.name("email2")).clear();
	    driver.findElement(By.name("email2")).sendKeys(group.email_secondary);
	    new Select(driver.findElement(By.name("bday"))).selectByVisibleText(group.day_of_birth);
	    new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText(group.month_of_birth);
	    driver.findElement(By.name("byear")).clear();
	    driver.findElement(By.name("byear")).sendKeys(group.year_of_birth);
	    new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(group.which_of_group);
	    driver.findElement(By.name("address2")).clear();
	    driver.findElement(By.name("address2")).sendKeys(group.address_secondary);
	    driver.findElement(By.name("phone2")).clear();
	    driver.findElement(By.name("phone2")).sendKeys(group.addres_home);
	}

	protected void addNewUser() {
		driver.findElement(By.linkText("add new")).click();
	}


}
