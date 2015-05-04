package com.example.fw;

import org.openqa.selenium.By;
import com.example.tests.ParameterObject;

public class ContactHelper extends BaseHelper{

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void addNewUser() {
		click(By.linkText("add new"));
	}

	public void fillAddNewForm(ParameterObject group) {
	   type(By.name("firstname"), group.first_name);
	   type(By.name("lastname"), group.last_name);
	   type(By.name("address"), group.addres_primary);
	   type(By.name("home"), group.home_phone);
	   type(By.name("mobile"), group.mobile_phone);
	   type(By.name("work"), group.work_phone);
	   type(By.name("email"), group.email_primary);
	   type(By.name("email2"), group.email_secondary);
	   selectByText(By.name("bday"), group.day_of_birth);
	   selectByText(By.name("bmonth"), group.month_of_birth);
	   type(By.name("byear"), group.year_of_birth);
	   //selectByText(By.name("new_group"), group.which_of_group);
	   type(By.name("address2"), group.address_secondary);
	   type(By.name("phone2"), group.addres_home);
	    
	}

	public void returnToHomePage() {
		click(By.linkText("home page"));
	}

	public void editContact(int index) {
		click(By.xpath(".//tbody/tr[" + (1+index) + "]/td[7]//img"));
	}

	public void deleteContact() {
		click(By.xpath(".//div[4]/form[2]/input[2]"));
		}

	public void updateContact() {
		click(By.xpath(".//div[4]/form[1]/input[11]"));
	}
}
