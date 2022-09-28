package loginModule;


import org.testng.annotations.Test;

import GenericUtilities.BaseClass;
import GenericUtilities.ReadExcel;
import objectRepository.LoginPage;

public class T001_Test extends BaseClass {
	@Test(dataProvider="testdata", dataProviderClass=ReadExcel.class)
	public void checkdatafromexcel(String data,String data2) throws InterruptedException{
		LoginPage login=new LoginPage(driver);//creating the object for pom page
		//Thread.sleep(2000);
		login.getLoginLink().click();
		
		login.getEmailTextField().sendKeys(data);
		login.getPasswordTextField().sendKeys(data2);
		login.getLoginButton().click();
	
}
}
