package keywordDrivenFramework;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionKeywords {
	
	static Logger log = (Logger) LogManager.getLogger(ActionKeywords.class);
	public static WebDriver driver;
	
	
	public static void openBrowser() {
//		System.setProperty("webdriver.chrome.driver", "/Users/Malhotra/Selenium/chromedriver-mac-x64/chromedriver");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		System.out.println("\n Google chrome browser opened");
		log.info("Chrome Browser Opened");
	}
	
	public static void navigateToURL() {
		driver.get("https://www.saucedemo.com/");
//		System.out.println("\n Website link opened");
		log.info("Website opened and will wait for 5 seconds");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	public static void inputUserName() {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
//		System.out.println("\n Inputted user name - statndard_user");
		log.info("User Name inserted");
	}
	
	public static void inputPassword() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
//		System.out.println("\n Inputted password - secret_sauce");
		log.info("Password inserted.");
	}
	
	public static void clickToLogin() {
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
//		System.out.println("\n Logged in successfully");
		log.info("Login button clicked and navigated to home page.");
	}
	
	public static void clickToMenu() {
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
//		System.out.println("\n Menu clicked successfully");
		log.info("Menu button clicked");
	}

	public static void clickToLogout() {
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
//		System.out.println("\n Logged out successfully");
		log.info("User gets logged out successfully.");
	}
	
	public static void closeBrowser() {
		driver.quit();
//		System.out.println("\n Chrome browser closed successfully");
		log.info("Chrome browser closed successfully");
	}
}
