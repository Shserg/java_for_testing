package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase{
@Test
public void modifySomeContact() {
	app.getNavigationHelper().openMainPage();
	app.getContactHelper().editContact(6);
	ParameterObject group = new ParameterObject();
	group.first_name = "1";
	app.getContactHelper().fillAddNewForm(group);
	app.getContactHelper().updateContact();
	
}
}
