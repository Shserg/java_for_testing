package com.example.tests;

import org.testng.annotations.Test;

public class AddContactWithoutFilling extends TestBase {
  @Test
  public void testNewUserCreationWithoutFilling() throws Exception {
	openMainPage();
	addNewUser();
    sumbitCreation();
    returnToHomePage();
  }
}
