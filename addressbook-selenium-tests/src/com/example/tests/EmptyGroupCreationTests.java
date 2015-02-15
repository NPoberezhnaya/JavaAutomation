package com.example.tests;

import org.testng.annotations.Test;

public class EmptyGroupCreationTests extends TestBase {
	@Test
	public void testNonEmptyGroupCreation() throws Exception {
		openMainPage();
		returnToGroupPage();
		initGroupCreation();
		GroupData group = new GroupData("", "", "");
		fillGroupForm(group);
		sumbitGroupCreation();
		returnToGroupPage();
	}

}
