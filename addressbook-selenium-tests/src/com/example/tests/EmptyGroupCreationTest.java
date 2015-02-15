package com.example.tests;

import org.testng.annotations.Test;

public class EmptyGroupCreationTest extends TestBase  {
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
