package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	public RegistrationPage(WebDriver driver) {// to the driver from baseclass
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Register")
	private WebElement RegisterLink;
	
	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getRadioButton() {
		return RadioButton;
	}

	public WebElement getFirstNameTextField() {
		return FirstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return LastNameTextField;
	}

	public WebElement getPassWordTextField() {
		return PassWordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return ConfirmPasswordTextField;
	}

	public WebElement getRegisterButton() {
		return RegisterButton;
	}
	@FindBy(id = "gender-female")
	private WebElement RadioButton;
	
	
	public WebElement getEmailTextField() {
		return EmailTextField;
	}
	@FindBy(id = "FirstName")
	private WebElement FirstNameTextField;
	
	@FindBy(id = "LastName")
	private WebElement LastNameTextField;
	
	@FindBy(id = "Email")
	private WebElement EmailTextField;
	
	@FindBy(id = "Password")
	private WebElement PassWordTextField;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement ConfirmPasswordTextField;
	
	@FindBy(xpath = "//input[@value='Register']")
	private WebElement RegisterButton;
}

