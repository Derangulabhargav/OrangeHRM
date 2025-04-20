package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployee {

	public AddEmployee(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name = "firstName")
	private WebElement FirstName;
	
	@FindBy(name = "middleName")
	private WebElement MiddleName;
	
	@FindBy(name = "lastName")
	private WebElement LastName;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
	private WebElement Id;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement Savebutton;
	
	@FindBy(xpath = "//button[text()=' Cancel ']")
	private WebElement cancleButton;

	

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getMiddleName() {
		return MiddleName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getId() {
		return Id;
	}

	public WebElement getSavebutton() {
		return Savebutton;
	}

	public WebElement getCancleButton() {
		return cancleButton;
	}
	
}
