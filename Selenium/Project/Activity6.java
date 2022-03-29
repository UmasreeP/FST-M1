package activities;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {

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
  public void applyJob() {

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get("https://alchemy.hguy.co/jobs/");

      driver.findElement(By.linkText("Jobs")).click();
      driver.findElement(By.name("search_keywords")).sendKeys("Banking");
      driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
      driver.findElement(By.xpath("(//h3[contains(.,'BankingTestJob')])[1]")).click();
      driver.findElement(By.xpath("//input[contains(@type,'button')]")).click();
      WebElement element = driver.findElement(By.xpath("//a[@class='job_application_email'][contains(.,'abhiram@cklabs.com')]"));
      String email = element.getText();
      System.out.println(email);
  }
}
