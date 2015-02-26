package com.example.tests;

import org.testng.annotations.Test;

public class ContactRemovalTest extends TestBase {
	@Test
	public void deleteSomeContact() {
		app.getNavigationHelper().openMainPage();
		app.getContactHelper().initContactModification(2);
		app.getContactHelper().deleteContact(2);
		app.getNavigationHelper().returnToMainPage();
	}

}
