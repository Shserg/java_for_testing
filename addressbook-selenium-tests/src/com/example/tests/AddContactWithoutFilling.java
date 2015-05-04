package com.example.tests;

import org.testng.annotations.Test;

public class AddContactWithoutFilling extends TestBase {
  @Test
  public void testNewUserCreationWithoutFilling() throws Exception {
	app.getNavigationHelper().openMainPage();
	app.getContactHelper().addNewUser();
    app.getGroupHelper().sumbitCreation();
    app.getContactHelper().returnToHomePage();
  }
}
