package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_003 {

	@Test
	public void tc_003() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://thetestingworld.com/index.php?option=com_users&view=login&Itemid=587");
		
		driver.findElement(By.id("username")).sendKeys("tajinder@gmail.com");
		driver.findElement(By.id("password")).sendKeys("tajinder@gmail.com");
		driver.close();
	}
}
