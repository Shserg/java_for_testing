package com.example.fw;

import org.openqa.selenium.By;

public class NavigationHelper extends BaseHelper {

	public NavigationHelper(ApplicationManager manager) {
		super(manager);
	}

	public void openMainPage() {
		driver.get(manager.baseUrl + "/");
	}

	public void openGroupPage() {
		click(By.linkText("groups"));
	}		
}
