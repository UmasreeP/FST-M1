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

public class Activity4 {

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
  public void verifySecondHeading() {

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get("https://alchemy.hguy.co/jobs/");

      String Secondheading_text = "Quia quis non";
      WebElement heading_element = driver.findElement(By.xpath("//h2[contains(text(),'Quia quis non')]"));
      String text = heading_element.getText();
      System.out.println(text);

      assertEquals(Secondheading_text,text);
  }
}
