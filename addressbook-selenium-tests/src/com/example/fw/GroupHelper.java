package com.example.fw;

import org.openqa.selenium.By;
import com.example.tests.ParameterObject;

public class GroupHelper extends BaseHelper {

	public GroupHelper(ApplicationManager manager) {
		super(manager);
	}

	public void initGroupCreation() {
		click(By.name("new"));
	}

	public void fillGroupForm(ParameterObject group) {
		type(By.name("group_name"), group.groupname);
		type(By.name("group_header"), group.header);
		type(By.name("group_footer"), group.footer);
	}

	public void sumbitCreation() {
		click(By.name("submit"));
	}

	public void deleteGroup(int index) {
		selectGroupByIndex(index);
		click(By.name("delete"));
		
	}

	private void selectGroupByIndex(int index) {
		click(By.xpath("//input[@name='selected[]'][" + index + "]"));
	}

	public void editGroup(int index) {
		selectGroupByIndex(index);
		click(By.name("edit"));
	}

	public void updateGroup() {
		click(By.name("update"));
	}

}
