package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTest2 extends TestBase {
	 @Test
	  public void testEmptyGroupCration() throws Exception {
	    openMainPage();
	    openGroupPage();
	    initGroupCreation();
		fillGroupForm(new ParameterObject ("", "", ""));
	    sumbitCreation();
	    openGroupPage();
	  }
}
