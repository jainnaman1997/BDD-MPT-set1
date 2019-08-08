package bean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {

	WebDriver driver;
	
	@FindBy(name="txtFN")
	@CacheLookup
	WebElement chName;
	
	@FindBy(id="txtDebit")
	@CacheLookup
	WebElement cNumber;
	
	@FindBy(id="txtCvv")
	@CacheLookup
	WebElement cvv;
	
	@FindBy(xpath="//*[@name='month']")
	@CacheLookup
	WebElement eMonth;
	
	@FindBy(name="year")
	@CacheLookup
	WebElement eYear;

	@FindBy(id="btnPayment")
	@CacheLookup
	WebElement paymentButton;
	
	public Payment(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getChName() {
		return chName;
	}

	public void setChName(String chName) {
		this.chName.sendKeys(chName);
	}

	public WebElement getcNumber() {
		return cNumber;
	}

	public void setcNumber(String cNumber) {
		this.cNumber.sendKeys(cNumber);
	}

	public WebElement getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv.sendKeys(cvv);
	}

	public WebElement geteMonth() {
		return eMonth;
	}

	public void seteMonth(String eMonth) {
		this.eMonth.sendKeys(eMonth);
	}

	public WebElement geteYear() {
		return eYear;
	}

	public void seteYear(String eYear) {
		this.eYear.sendKeys(eYear);
	}

	public WebElement getPaymentButton() {
		return paymentButton;
	}

	public void setPaymentButton() {
		this.paymentButton.click();
	}
	
	
}
