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

public class Activity9 {

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
      driver.findElement(By.xpath("//div[@class='wp-menu-name'][contains(.,'Job Listings')]")).click();
      driver.findElement(By.xpath("//a[contains(@class,'page-title-action')]")).click();
      driver.findElement(By.name("_company_website")).sendKeys("test");
      driver.findElement(By.name("_company_name")).sendKeys("test");
      driver.findElement(By.name("_job_location")).sendKeys("Bangalore");
      driver.findElement(By.xpath("//textarea[contains(@class,'editor-post-title__input')]")).sendKeys("Engineer");
      driver.findElement(By.xpath("//button[@type='button'][contains(.,'Publish…')]")).click();
      driver.findElement(By.xpath("//button[contains(@class,'components-button editor-post-publish-button editor-post-publish-button__button is-primary')]")).click();
      driver.findElement(By.xpath("//a[contains(@class,'components-button is-secondary')]")).click();
      Boolean result = driver.findElement(By.xpath("//h1[@class='entry-title'][contains(.,'Engineer')]")).isDisplayed();
      System.out.println(result);
      Assert.assertTrue(result);
  }
}
