package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_12_3 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions builder = new Actions(driver);
		
		driver.get("https://www.training-support.net/selenium/popups");
		
		String pageTitle = driver.getTitle();
		System.out.println("Title is "+pageTitle);
		
		WebElement signIn = driver.findElement(By.className("orange"));
		builder.moveToElement(signIn).pause(Duration.ofSeconds(1)).build().perform();
		String tooltipText = signIn.getAttribute("data-tooltip");
		System.out.println("Tooltip text: " + tooltipText);
		
		signIn.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
		
		driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(message);
        
        driver.close();
		
		
	}

}
