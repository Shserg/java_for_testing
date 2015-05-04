package com.example.tests;

import org.testng.annotations.Test;

public class ContactRemovalTests extends TestBase{
	@Test
	public void removeSomeContact() {
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().editContact(1);
		app.getContactHelper().deleteContact();
		app.getContactHelper().returnToHomePage();
	}

}
