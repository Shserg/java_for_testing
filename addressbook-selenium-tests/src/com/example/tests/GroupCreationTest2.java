package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTest2 extends TestBase {
	 @Test
	  public void testEmptyGroupCration() throws Exception {
	    app.getNavigationHelper().openMainPage();
	    app.getNavigationHelper().openGroupPage();
	    app.getGroupHelper().initGroupCreation();
		app.getGroupHelper().fillGroupForm(new ParameterObject ("", "", ""));
	    app.getGroupHelper().sumbitCreation();
	    app.getNavigationHelper().openGroupPage();
	  }
}
