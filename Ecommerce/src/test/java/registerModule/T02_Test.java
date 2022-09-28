package registerModule;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;
import GenericUtilities.UtilityMethods;
import objectRepository.LoginPage;
import objectRepository.RegistrationPage;

public class T02_Test extends BaseClass{
@Test
public void Validate_whether_user_Register_with_valid_credentials() throws IOException, InterruptedException {
	RegistrationPage register=new RegistrationPage(driver);//creating the object for pom page
	UtilityMethods utility=new UtilityMethods();// used in base case
	register.getRegisterLink().click();
	register.getRadioButton().click();
	register.getFirstNameTextField().sendKeys(utility.ReadProperties("FirstName"));
	register.getLastNameTextField().sendKeys(utility.ReadProperties("LastName"));
	register.getEmailTextField().sendKeys(utility.ReadProperties("Email"));
	register.getPassWordTextField().sendKeys(utility.ReadProperties("PassWord"));
	register.getConfirmPasswordTextField().sendKeys(utility.ReadProperties("ConfirmPassword"));
	register.getRegisterButton().click();
}
}
