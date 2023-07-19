package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonMethods {

	public static void selectDropdown(WebElement element,int index) {
		
		WebElement a = element;
		Select s = new Select(a);
		s.selectByIndex(index);
		
	}
	public static void verifyAssertions(WebElement actual, String expectedText,String message) {
		
		WebElement a = actual;
		String actualText = a.getText();

		String ExpectedText = expectedText;

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualText, ExpectedText, message);
		
		//sa.assertAll();
	}
	
}
