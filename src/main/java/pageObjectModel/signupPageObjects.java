package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signupPageObjects {

	public WebDriver driver; // This driver dont have scope;

	private By firstName = By.xpath("//input[@name='UserFirstName']");
	private By lastName = By.xpath("//input[@name='UserLastName']");
	private By jobTitle = By.xpath("//input[@name='UserTitle']");
	private By nextButton = By.xpath("//span[contains(text(),'Next')]");
	private By selectEmployee = By.xpath("//select[@name='CompanyEmployees']");
	private By selectCountry = By.xpath("//select[@name='CompanyCountry']");
	private By selectState = By.xpath("//select[@name='CompanyState']");
	private By companyName = By.xpath("//input[@name='CompanyName']");
	private By signupPageConfirmation=By.xpath("//h2[@id='answer-2-more-questions-and-well-get-you-into-your-free-trial']");

	public signupPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement enterFirstName() {

		return driver.findElement(firstName);

	}

	public WebElement enterLastName() {

		return driver.findElement(lastName);

	}

	public WebElement enterJobTitle() {

		return driver.findElement(jobTitle);

	}

	public WebElement clickOnNextButton() {

		return driver.findElement(nextButton);

	}

	public WebElement selectEmployees() {

		return driver.findElement(selectEmployee);

	}

	public WebElement selectCountry() {
		
		return driver.findElement(selectCountry);
	}
	
	public WebElement selectState() {
		
		return driver.findElement(selectState);
	}
	
	public WebElement enterCompanyName() {
		
		return driver.findElement(companyName);
	}
	public WebElement signupPageConfirmation() {
		
		return driver.findElement(signupPageConfirmation);
	}
}
