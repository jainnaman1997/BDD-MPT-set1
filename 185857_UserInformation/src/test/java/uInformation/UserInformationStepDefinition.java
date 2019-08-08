package uInformation;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import bean.User;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class UserInformationStepDefinition {

	private WebDriver driver;
	private User user;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Given("^user is on 'UserInformation' page$")
	public void user_is_on_UserInformation_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.get("D:\\Java Workspace\\Spring Workspace\\185857_UserInformation\\UserInformation.html");
		user=new User(driver);
	}

	@When("^user doesnot enter applicant name$")
	public void user_doesnot_enter_applicant_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setApplicantName("");
		user.setSubmit();
	}

	@Then("^display 'Please fill the Applicant Name'$")
	public void display_Please_fill_the_Applicant_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please fill the Applicant Name ";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user doesnot enter first name$")
	public void user_doesnot_enter_first_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setApplicantName("Naman Jain");
		user.setFirstName("");
		user.setSubmit();
	}

	@Then("^display 'Please fill the First Name'$")
	public void display_Please_fill_the_First_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please fill the First Name ";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user doesnot enter last name$")
	public void user_doesnot_enter_last_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setApplicantName("Naman Jain");
		user.setFirstName("Naman");
		user.setLastName("");
		user.setSubmit();
	}

	@Then("^display 'Please fill the Last Name'$")
	public void display_Please_fill_the_Last_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please fill the Last Name ";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user doesnot enter father name$")
	public void user_doesnot_enter_father_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setApplicantName("Naman Jain");
		user.setFirstName("Naman");
		user.setLastName("Jain");
		user.setFatherName("");
		user.setSubmit();
	}

	@Then("^display 'Please fill the Father Name'$")
	public void display_Please_fill_the_Father_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please fill the Father Name ";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user doesnot enter invalid date of birth$")
	public void user_doesnot_enter_invalid_date_of_birth() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setApplicantName("Naman Jain");
		user.setFirstName("Naman");
		user.setLastName("Jain");
		user.setFatherName("Rajive Jain");
		user.setDob("");
		user.setSubmit();
	}

	@Then("^display 'Please fill the Date of Birth'$")
	public void display_Please_fill_the_Date_of_Birth() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please fill the DOB";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters invalid date format for date of birth$")
	public void user_enters_invalid_date_format_for_date_of_birth() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setApplicantName("Naman Jain");
		user.setFirstName("Naman");
		user.setLastName("Jain");
		user.setFatherName("Rajive Jain");
		user.setDob("1997-24-04");
		user.setSubmit();
	}

	@Then("^display 'Invalid Date format'$")
	public void display_Invalid_Date_format() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please Enter valid date(dd-MM-yyyy)";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user doesnot select gender$")
	public void user_doesnot_select_gender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setApplicantName("Naman Jain");
		user.setFirstName("Naman");
		user.setLastName("Jain");
		user.setFatherName("Rajive Jain");
		user.setDob("24-04-1997");
		user.setGender("");
		user.setSubmit();
	}

	@Then("^display 'Please select the Gender'$")
	public void display_Please_select_the_Gender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please select the Gender";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user doesnot enter mobile number$")
	public void user_doesnot_enter_mobile_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setApplicantName("Naman Jain");
		user.setFirstName("Naman");
		user.setLastName("Jain");
		user.setFatherName("Rajive Jain");
		user.setDob("24-04-1997");
		user.setGender("Male");
		user.setMobile("");
		user.setSubmit();
	}

	@Then("^display 'Please fill MobileNo'$")
	public void display_Please_fill_MobileNo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please fill Mobile no";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user doesnot enter (\\d+) digit mobile number$")
	public void user_doesnot_enter_digit_mobile_number(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setApplicantName("Naman Jain");
		user.setFirstName("Naman");
		user.setLastName("Jain");
		user.setFatherName("Rajive Jain");
		user.setDob("24-04-1997");
		user.setGender("Male");
		user.setMobile("9458");
		user.setSubmit();
	}

	@Then("^display 'Please enter (\\d+) digit mobile no'$")
	public void display_Please_enter_digit_mobile_no(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please enter valid mobile no";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user doesnot enter mail id$")
	public void user_doesnot_enter_mail_id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setApplicantName("Naman Jain");
		user.setFirstName("Naman");
		user.setLastName("Jain");
		user.setFatherName("Rajive Jain");
		user.setDob("24-04-1997");
		user.setGender("Male");
		user.setMobile("9458509803");
		user.setEmail("");
		user.setSubmit();
	}

	@Then("^display 'Please fill the Mail Id'$")
	public void display_Please_fill_the_Mail_Id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please fill the Email id ";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^userdoesnot enter landline number$")
	public void userdoesnot_enter_landline_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setApplicantName("Naman Jain");
		user.setFirstName("Naman");
		user.setLastName("Jain");
		user.setFatherName("Rajive Jain");
		user.setDob("24-04-1997");
		user.setGender("Male");
		user.setMobile("9458509803");
		user.setEmail("naman.b.jaib@capgemini.com");
		user.setLandline("");
		user.setSubmit();
	}

	@Then("^display 'Please fill the LandLine no'$")
	public void display_Please_fill_the_LandLine_no() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="please fill the landline no";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user doesnot select communication$")
	public void user_doesnot_select_communication() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setApplicantName("Naman Jain");
		user.setFirstName("Naman");
		user.setLastName("Jain");
		user.setFatherName("Rajive Jain");
		user.setDob("24-04-1997");
		user.setGender("Male");
		user.setMobile("9458509803");
		user.setEmail("naman.b.jaib@capgemini.com");
		user.setLandline("2457631");
		user.setCommunication("");
		user.setSubmit();
	}

	@Then("^display 'Please select communication'$")
	public void display_Please_select_communication() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Please select the Type of Communication ";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user enters valid information and clicks on 'Submit' button$")
	public void user_enters_valid_information_and_clicks_on_Submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		user.setApplicantName("Naman Jain");
		user.setFirstName("Naman");
		user.setLastName("Jain");
		user.setFatherName("Rajive Jain");
		user.setDob("24-04-1997");
		user.setGender("Male");
		user.setMobile("9458509803");
		user.setEmail("naman.b.jaib@capgemini.com");
		user.setLandline("2457631");
		user.setCommunication("Residence");
		user.setAddress("Capgemini");
		user.setSubmit();
	}

	@Then("^display 'Personal details are validated' and navigate to 'PaymentDetails' page$")
	public void display_Personal_details_are_validated_and_navigate_to_PaymentDetails_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String expectedMessage="Personal details are validated.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.get("D:\\Java Workspace\\Spring Workspace\\185857_UserInformation\\PaymentDetails.html");
		driver.close();
	}

	
}
