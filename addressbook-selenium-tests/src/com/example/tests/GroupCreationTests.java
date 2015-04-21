package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
  @Test
  public void testNonEmptyGroupCration() throws Exception {
    openMainPage();
    openGroupPage();
    initGroupCreation();
    ParameterObject group = new ParameterObject();
    group.groupname = "group_name_1";
    group.header = "group_header_1";
    group.footer = "group_footer_1";
    fillGroupForm(group);
    sumbitCreation();
    openGroupPage();
  }
}
