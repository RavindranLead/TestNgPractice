package swag_Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.BaseClass1;
import io.github.bonigarcia.wdm.WebDriverManager;
import swag_Page_Objects.Swag_Login_Page_Objects;

public class SwagLogin_TC extends BaseClass1 {

	//	public void LoginSwag() {
	//		WebDriverManager.chromedriver().setup();
	//		WebDriver driver = new ChromeDriver();
	//		driver.get("https://www.saucedemo.com/v1/");
	//		driver.findElement(By.id("user-name")).sendKeys("Newworld");
	//		Swag_Login_Page_Objects swag = new Swag_Login_Page_Objects(driver);
	//		swag.getUserName().sendKeys("standard_user");
	//		swag.getPassWord().sendKeys("secret_sauce");
	//		swag.getLoginBtn().click();
	//		
	//		
	//	}
	@Test
	public void LoginSqag() {

		browserLaunch("chrome");
		getUrl("https://www.saucedemo.com");
		Swag_Login_Page_Objects swag = new Swag_Login_Page_Objects(driver);
		swag.getUserName().sendKeys("standard_user");
		swag.getPassWord().sendKeys("secret_sauce");
		swag.getLoginBtn().click();






	}



}
