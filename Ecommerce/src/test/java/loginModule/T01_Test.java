package loginModule;

import java.io.IOException;


import org.testng.annotations.Test;

import GenericUtilities.BaseClass;
import GenericUtilities.UtilityMethods;
import objectRepository.LoginPage;

public class T01_Test extends BaseClass{
	@Test
	public void Validate1_whether_user_login_with_valid_credentials() throws IOException{
		LoginPage login=new LoginPage(driver);//creating the object for pom page
		UtilityMethods utility=new UtilityMethods();// used in base case and this is used for read data from property file
		login.getLoginLink().click();
		//Assert.assertEquals(true, false);//this is used to stop the next line execution
		//login.getEmailTextField().sendKeys(utility.ReadProperties("UserName"));
		//login.getPasswordTextField().sendKeys(utility.ReadProperties("PassWord"));
		login.getLoginButton().click();

	}
}
//utilitymethods r used to call the path present in the IAutoConstant
//(dataProvider="TestData",dataProviderClass=ReadExcel.class) this is for read the data from excel sheet