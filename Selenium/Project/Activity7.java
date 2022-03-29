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

public class Activity7 {

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
  public void postJob() {

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get("https://alchemy.hguy.co/jobs/");

      driver.findElement(By.linkText("Post a Job")).click();
      driver.findElement(By.id("create_account_email")).sendKeys("test15@gmail.com");
      driver.findElement(By.id("job_title")).sendKeys("Tester");
      driver.findElement(By.id("application")).sendKeys("test@gmail.com");
      //driver.switchTo().frame("job_description_ifr");
      WebElement element = driver.findElement(By.xpath("//iframe[@id='job_description_ifr']"));
      element.sendKeys("test");
      driver.findElement(By.id("company_name")).sendKeys("IBM");
      driver.findElement(By.name("submit_job")).click();
      driver.findElement(By.id("job_preview_submit_button")).click();
      //driver.findElement(By.linkText("Alchemy Jobs")).click();
      driver.findElement(By.linkText("Jobs")).click();
      Boolean result = driver.findElement(By.xpath("//h3[contains(text(),'tester')]")).isDisplayed();
      System.out.println(result);
      Assert.assertTrue(result, "not found");
      
  }
}
