package bean;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class User {

	WebDriver driver;
	
	@FindBy(name="txtNM")
	@CacheLookup
	WebElement applicantName;
	
	@FindBy(id="txtFirstName")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(id="txtLastName")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(name="txtFtName")
	@CacheLookup
	WebElement fatherName;
	
	@FindBy(name="txtDOB")
	@CacheLookup
	WebElement dob;
	
	@FindBy(how=How.NAME, using="rdbML")
	@CacheLookup
	WebElement gender;
	
	@FindBy(name="txtMNo")
	@CacheLookup
	WebElement mobile;
	
	@FindBy(name="txtEmailID")
	@CacheLookup
	WebElement email;
	
	@FindBy(id="txtLndLine")
	@CacheLookup
	WebElement landline;
	
	@FindBy(name="rdbRAddress")
	@CacheLookup
	WebElement communication;
	
	@FindBy(id="txtAResidenceAdd")
	@CacheLookup
	WebElement address;

	@FindBy(how=How.ID, using="btnSubmit")
	@CacheLookup
	WebElement submit;
	
	public User(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver,  this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	
	public WebElement getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName.sendKeys(applicantName);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	public WebElement getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName.sendKeys(fatherName);
	}

	public WebElement getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob.sendKeys(dob);
	}

	public WebElement getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if(gender!="") {
			this.gender=driver.findElement(By.id("rdbMale"));
			this.gender.click();
		}
	}

	public WebElement getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile.sendKeys(mobile);
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public WebElement getLandline() {
		return landline;
	}

	public void setLandline(String landline) {
		this.landline.sendKeys(landline);
	}

	public WebElement getCommunication() {
		return communication;
	}

	public void setCommunication(String communication) {
		if(communication!="") {
			this.communication=driver.findElement(By.id("rdbResAddress"));
			this.communication.click();
		}
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address.sendKeys(address);
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit() {
		this.submit.click();
	}
	
	
}
