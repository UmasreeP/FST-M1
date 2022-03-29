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

public class Activity3 {

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
  public void getHeaderURL() {

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get("https://alchemy.hguy.co/jobs/");
      
      WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Alchemy Jobs')]"));
      String url = element.getAttribute("href");
      System.out.println(url);
  }
}
