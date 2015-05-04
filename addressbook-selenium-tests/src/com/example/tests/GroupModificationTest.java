package com.example.tests;

import org.testng.annotations.Test;

public class GroupModificationTest extends TestBase{
	@Test 
	public void modifySomeGroup() {
		app.getNavigationHelper().openMainPage();
	    app.getNavigationHelper().openGroupPage();
		app.getGroupHelper().editGroup(1);
		 ParameterObject group = new ParameterObject();
		    group.groupname = "1";
		    app.getGroupHelper().fillGroupForm(group);
		    app.getGroupHelper().updateGroup();
		app.getNavigationHelper().openGroupPage();
		app.getContactHelper().returnToHomePage();
	}

}
