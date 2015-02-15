package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled2() throws Exception {
    driver.get(baseUrl + "/addressbookv4.1.4/");
    driver.findElement(By.linkText("add new")).click();
    driver.findElement(By.name("firstname")).clear();
    driver.findElement(By.name("firstname")).sendKeys("QQQ");
    driver.findElement(By.name("lastname")).clear();
    driver.findElement(By.name("lastname")).sendKeys("QQQQQ");
    driver.findElement(By.name("address")).clear();
    driver.findElement(By.name("address")).sendKeys("QQQQQQQQ");
    driver.findElement(By.name("home")).clear();
    driver.findElement(By.name("home")).sendKeys("QQQQQ");
    driver.findElement(By.name("mobile")).clear();
    driver.findElement(By.name("mobile")).sendKeys("QQQQ");
    driver.findElement(By.name("work")).clear();
    driver.findElement(By.name("work")).sendKeys("QQQQQQQQQQQQQQQQ");
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("QQQQQQQQ");
    driver.findElement(By.name("email2")).clear();
    driver.findElement(By.name("email2")).sendKeys("QQQQQQQQQQQQQQQQQQQ");
    new Select(driver.findElement(By.name("bday"))).selectByVisibleText("7");
    new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText("June");
    driver.findElement(By.name("byear")).clear();
    driver.findElement(By.name("byear")).sendKeys("1980");
    driver.findElement(By.name("address2")).clear();
    driver.findElement(By.name("address2")).sendKeys("2222222222");
    driver.findElement(By.name("phone2")).clear();
    driver.findElement(By.name("phone2")).sendKeys("2222222");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.linkText("home")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}