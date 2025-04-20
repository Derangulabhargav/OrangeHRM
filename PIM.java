package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIM {

	public PIM(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText = "Employee List")
	private WebElement EmployeeList;
	
	@FindBy(linkText = "Add Employee")
	private WebElement AddEmployee;
	
	@FindBy(linkText = "Logout")
	private WebElement LogoutButton;

	public WebElement getEmployeeList() {
		return EmployeeList;
	}

	public WebElement getAddEmployee() {
		return AddEmployee;
	}

	public WebElement getLogoutButton() {
		return LogoutButton;
	}
	
	
	
	
}
