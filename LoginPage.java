package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name = "username")
	private WebElement UserName;
	
	@FindBy(name = "password")
	private WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement LoginButton;
	
	@FindBy(xpath = "//p[text()='Forgot your password? ']")
	private WebElement ForgotPassword;

	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public WebElement getForgotPassword() {
		return ForgotPassword;
	}

	
	
}
