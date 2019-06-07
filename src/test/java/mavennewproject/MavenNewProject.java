package mavennewproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenNewProject {
	@Test
	public void mavenproject()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@title='Get Selenium']")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}
}
