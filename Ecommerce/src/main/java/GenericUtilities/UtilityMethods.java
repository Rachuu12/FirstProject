package GenericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods implements IAutoConstant{
	
	public String ReadProperties(String Property) throws IOException {// in this we read the property file
		FileInputStream file=new FileInputStream(PROPERTYFILEPATH1);
		Properties property=new Properties();
		property.load(file);
		String data = property.getProperty(Property);
		return data;
	}
	public Select SelectUtility(WebElement dropdown) {
		Select select=new Select(dropdown);
		return select;
	}
	public void HandlingDropdown(WebElement drop, String value) {
		Select select=new Select(drop);
		try {
			select.selectByValue(value);
		}catch(NoSuchElementException e) {
			select.selectByVisibleText(value);
		}catch (Exception e) {
			int index = Integer.parseInt(value);
			select.selectByIndex(index);
		}
	}

	
		
}



	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
