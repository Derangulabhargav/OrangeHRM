package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeList {

	public EmployeeList(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	 
	
	@FindBy(xpath = "(//input[contains(@placeholder,'Type')])[1]")
	private WebElement EmpName;


	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement searchButton;
	
	@FindBy(xpath = "//button[text()=' Reset ']")
	private WebElement resetButton;
	
	public WebElement getEmpName() {
		return EmpName;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getResetButton() {
		return resetButton;
	}
	
	
	
}
