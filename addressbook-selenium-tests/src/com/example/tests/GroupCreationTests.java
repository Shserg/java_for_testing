package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
  @Test
  public void testNonEmptyGroupCration() throws Exception {
    app.getNavigationHelper().openMainPage();
    app.getNavigationHelper().openGroupPage();
    app.getGroupHelper().initGroupCreation();
    ParameterObject group = new ParameterObject();
    group.groupname = "group_name_1";
    group.header = "group_header_1";
    group.footer = "group_footer_1";
    app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().sumbitCreation();
    app.getNavigationHelper().openGroupPage();
  }
}
