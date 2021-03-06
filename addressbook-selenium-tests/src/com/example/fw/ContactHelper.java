package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.ContactData;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);

	}

	public void initContactModification(int i) {
		SelectContactByIndex(i);

	}

	private void SelectContactByIndex(int i) {
		click(By.cssSelector("[name='entry']:nth-of-type("+i+") [title='Edit']"));
	}

	public void initContactCreation() {
		click(By.linkText("add new"));
	}

	public void fillContactForm(ContactData contact) {
	
		type(By.name("firstname"), contact.firstName);
		type(By.name("lastname"), contact.lastName);
		type(By.name("address"), contact.address);
		type(By.name("home"), contact.homePhone);
		type(By.name("mobile"), contact.mobilePhone);
		type(By.name("work"), contact.workPhone);
		type(By.name("email"), contact.email);
		type(By.name("email2"), contact.email2);

		selectByText(By.name("bday"), contact.bday);
		selectByText(By.name("bmonth"), contact.bmonth);

		type(By.name("byear"), contact.byear);
		selectByText(By.name("new_group"), contact.newGroup);

		type(By.name("address2"), contact.address2);
		type(By.name("phone2"), contact.phone2);

	}

	public void sumbitContactModification() {
		click(By.cssSelector("[value='Update']"));
	}
	
	public void sumbitContactRemoval() {
		click(By.cssSelector("[value='Delete']"));
	}
	
	public void sumbitContactCreation() {
		click(By.name("submit"));
	}
///////////////////////
	public void deleteContact(int i) {
		sumbitContactRemoval();
	}
}
