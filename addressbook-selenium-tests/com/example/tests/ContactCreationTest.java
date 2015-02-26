package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

	@Test
	public void testNonEmptyContactCreation() throws Exception {
		openMainPage();
		clickAddNewContact();
		ContactData newContact = new ContactData();
		newContact.firstName = "Anna";
		newContact.lastName = "Ivanova";
		newContact.address = "Deribasovskay street, 9, Odessa";
		newContact.address2 = "Deribasovskay street, 10, Odessa";
		newContact.bday = "9";
		newContact.bmonth = "July";
		newContact.byear = "1980";
		newContact.email = "anna@ukr.net";
		newContact.email2 = "ivanova@ukr.net";
		newContact.homePhone = "7191912";
		newContact.mobilePhone = "0984392992";
		newContact.newGroup = "";
		newContact.phone2 = "7199194";
		newContact.workPhone = "7199293";
		
		fillContactForm(newContact);
		sumbitGroupCreation();
		returnToMainPage();
	}
	
	@Test
	public void testEmptyContactCreation() throws Exception {
		openMainPage();
		clickAddNewContact();
		ContactData newContact = new ContactData("","","","","","","","","-","-","","","","");
		fillContactForm(newContact);
		sumbitGroupCreation();
		returnToMainPage();
	}

}