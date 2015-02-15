package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {
	@Test
	public void testNonEmptyGroupCreation() throws Exception {
		openMainPage();
		returnToGroupPage();
		initGroupCreation();
		GroupData group = new GroupData();
		group.name = "group1";
		group.header = "header1";
		group.footer = "footer1";
		fillGroupForm(group);
		sumbitGroupCreation();
		returnToGroupPage();
	}
	
	@Test
	public void testEmptyGroupCreation() throws Exception {
		openMainPage();
		returnToGroupPage();
		initGroupCreation();
		GroupData group = new GroupData("", "", "");
		fillGroupForm(group);
		sumbitGroupCreation();
		returnToGroupPage();
	}
}
