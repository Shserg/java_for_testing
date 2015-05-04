package com.example.tests;

public class ParameterObject {
	public String groupname;
	public String header;
	public String footer;
	public String first_name;
	public String last_name;
	public String addres_primary;
	public String home_phone;
	public String mobile_phone;
	public String work_phone;
	public String email_primary;
	public String email_secondary;
	public String day_of_birth;
	public String month_of_birth;
	public String year_of_birth;
	public String which_of_group;
	public String address_secondary;
	public String addres_home;

	public ParameterObject(String first_name, String last_name,
			String addres_primary, String home_phone, String mobile_phone,
			String work_phone, String email_primary, String email_secondary,
			String day_of_birth, String month_of_birth, String year_of_birth,
			String which_of_group, String address_secondary, String addres_home) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.addres_primary = addres_primary;
		this.home_phone = home_phone;
		this.mobile_phone = mobile_phone;
		this.work_phone = work_phone;
		this.email_primary = email_primary;
		this.email_secondary = email_secondary;
		this.day_of_birth = day_of_birth;
		this.month_of_birth = month_of_birth;
		this.year_of_birth = year_of_birth;
		this.which_of_group = which_of_group;
		this.address_secondary = address_secondary;
		this.addres_home = addres_home;
	}
	public ParameterObject() {
		}
	public ParameterObject(String groupname, String header, String footer) {
		this.groupname = groupname;
		this.header = header;
		this.footer = footer;
	}
}