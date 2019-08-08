package pDetails;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import bean.Payment;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaymentDetailsStepDefinition {

	private WebDriver driver;
	private Payment payment;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Given("^user is on 'PaymentDetails' page$")
	public void user_is_on_PaymentDetails_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("D:\\Java Workspace\\Spring Workspace\\185857_UserInformation\\PaymentDetails.html");
		payment=new Payment(driver);
	}

	@When("^user doesnot enter card holder name$")
	public void user_doesnot_enter_card_holder_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		payment.setChName("");
		payment.setPaymentButton();
	}

	@Then("^display 'Please fill the Card Holder Name'$")
	public void display_Please_fill_the_Card_Holder_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please fill the Card holder name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user doesnot enter debit card number$")
	public void user_doesnot_enter_debit_card_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		payment.setChName("Naman Jain");
		payment.setcNumber("");
		payment.setPaymentButton();
	}

	@Then("^display 'Please fill the Debit card Number'$")
	public void display_Please_fill_the_Debit_card_Number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please fill the Debit card Number";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user doesnot enter cvv$")
	public void user_doesnot_enter_cvv() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		payment.setChName("Naman Jain");
		payment.setcNumber("1234567891234567");
		payment.setCvv("");
		payment.setPaymentButton();
	}

	@Then("^display 'Please fill the CVV'$")
	public void display_Please_fill_the_CVV() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please fill the CVV";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user doesnot enter expiration month$")
	public void user_doesnot_enter_expiration_month() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		payment.setChName("Naman Jain");
		payment.setcNumber("1234567891234567");
		payment.setCvv("123");
		payment.seteMonth("");
		payment.setPaymentButton();
	}

	@Then("^display 'Please fill expiration month'$")
	public void display_Please_fill_expiration_month() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please fill expiration month";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user doesnot enter expiration year$")
	public void user_doesnot_enter_expiration_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		payment.setChName("Naman Jain");
		payment.setcNumber("1234567891234567");
		payment.setCvv("123");
		payment.seteMonth("10");
		payment.seteYear("");
		payment.setPaymentButton();
	}

	@Then("^display 'Please fill expiration year'$")
	public void display_Please_fill_expiration_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please fill the expiration year";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters vaild payment details and clicks on 'Make Payment' button$")
	public void user_enters_vaild_payment_details_and_clicks_on_Make_Payment_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		payment.setChName("Naman Jain");
		payment.setcNumber("1234567891234567");
		payment.setCvv("123");
		payment.seteMonth("10");
		payment.seteYear("24");
		payment.setPaymentButton();
	}

	@Then("^display 'Pan Card Registration Done successfully !!!'$")
	public void display_Pan_Card_Registration_Done_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Pan Card Registration Done successfully !!!";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	
}
