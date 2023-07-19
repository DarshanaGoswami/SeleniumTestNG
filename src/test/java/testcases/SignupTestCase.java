package testcases;

import java.io.IOException;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
import Resources.BaseClass;
import Resources.commonMethods;
import Resources.constants;
import pageObjectModel.loginPageObjects;
import pageObjectModel.signupPageObjects;

public class SignupTestCase extends BaseClass {

	@Test
	public void verifySignup() throws IOException, InterruptedException {

		loginPageObjects lpo = new loginPageObjects(driver);
		lpo.clickOnTryForFree().click();

		signupPageObjects spo = new signupPageObjects(driver);

		Thread.sleep(1000);
		spo.enterFirstName().sendKeys(constants.firstName);

		spo.enterLastName().sendKeys(constants.lastName);

		spo.enterJobTitle().sendKeys(constants.jobTitle);

		spo.clickOnNextButton().click();

		commonMethods.selectDropdown(spo.selectEmployees(), 2);// employee dropdown

		spo.enterCompanyName().sendKeys("test");

		commonMethods.selectDropdown(spo.selectCountry(), 1);// country dropdown

		commonMethods.selectDropdown(spo.selectState(), 5);// state dropdown

		spo.clickOnNextButton().click();

		commonMethods.verifyAssertions(spo.signupPageConfirmation(), constants.expectedTextSignupText,
				"Valid signup text is not showing");

	}

}
