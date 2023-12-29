package swag_Test_Cases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.github.dockerjava.api.model.Driver;

import commonFunctions.BaseClass1;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.codec.http.multipart.FileUpload;

public class SwagLogin extends BaseClass1{
	WebDriver driver;
	ExtentSparkReporter reporter = new ExtentSparkReporter("Report.html");
	ExtentReports extent = new ExtentReports();
	@BeforeTest
	public void BeforeTest() {
		extent.attachReporter(reporter);
	}

	@Test
	public void lognSwag() throws IOException {

		ExtentTest createTest = extent.createTest("Home Page Launching Scenario");
		createTest.pass("HomePage is Visible");
		ExtentTest createTest2 = extent.createTest("Payment page redirecting scenario");

		FileInputStream fis=new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(fis);
		String browser = properties.getProperty("Browser");
		String username = properties.getProperty("Username");
		String password = properties.getProperty("Password");
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();

		driver.get("https://saucedemo.com");
		
		screenShot("./img1.png");
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		ExtentTest createTest21 = extent.createTest("Payment page redirecting scenario");
		driver.findElement(By.id("password")).sendKeys(password);

	}
	@AfterTest
	public void afterTest() {
		extent.flush();

	}
}

