package activities;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity8 {

  private WebDriver driver;
  

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\UmasreeP\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
      driver = new FirefoxDriver();
  }

  @AfterClass
  public void afterClass() {
      driver.quit();
  }

  @Test
  public void adminLogin() {

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get("https://alchemy.hguy.co/jobs/wp-admin");

      driver.findElement(By.id("user_login")).sendKeys("root");
      driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
      driver.findElement(By.id("wp-submit")).click();
      Boolean result = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).isDisplayed();
      System.out.println(result);
      Assert.assertTrue(result, "not found");
      
  }
}
