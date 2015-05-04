package com.example.tests;

import org.testng.annotations.Test;

public class AddContact extends TestBase {
  @Test
  public void testNewUserCreationWithFilling() throws Exception {
	app.getNavigationHelper().openMainPage();
	app.getContactHelper().addNewUser();
    app.getContactHelper().fillAddNewForm(new ParameterObject("Ivan", "Ivanov", "Moscva ul. uzhnai d.87", "4955555555", "9267777777", "4953333333", "work@gmail.com", "home@gmail.com", "15", "July", "2000", "group1", "moscva ul.Uznai d.45", "Moscva"));
    app.getGroupHelper().sumbitCreation();
    app.getContactHelper().returnToHomePage();
  }
}
