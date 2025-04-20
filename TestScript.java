package OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestScript {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//login
		LoginPage lp = new LoginPage(driver);
		lp.getUserName().sendKeys("Admin");
		lp.getPassword().sendKeys("admin123");
		lp.getLoginButton().click();
		
		//pim
		HomePage hp = new HomePage(driver);
		hp.getPIMModule().click();
		
		//pim
		PIM p = new PIM(driver);
		p.getAddEmployee().click();
		
		//addemployee
		AddEmployee ad = new AddEmployee(driver);
		
		String []a= {"Mahendra","Upendra", "Venu", "Bhargav"};
		String []b= {".",".", ".", "."};
		String []c= {"G","K", "D","D"};
		
		for(int i=0;i<4;i++) {
			ad.getFirstName().sendKeys(a[i]);
			//Thread.sleep(3000);
			ad.getMiddleName().sendKeys(b[i]);
			//Thread.sleep(3000);
			ad.getLastName().sendKeys(c[i]);
			//Thread.sleep(3000);
			ad.getSavebutton().click();
			Thread.sleep(3000);
			p.getAddEmployee().click();
		}
		
		
		p.getEmployeeList().click();
		EmployeeList el = new EmployeeList(driver);
		
		for(int i=0;i<4;i++) {
		el.getEmpName().sendKeys(a[i]);
		Thread.sleep(2000);
		el.getSearchButton().click();
		Thread.sleep(2000);
		el.getResetButton().click();
		}
		
		//Logout
		p.getDropDown().click();
		p.getLogoutButton().click();
		
	}
	
	}
