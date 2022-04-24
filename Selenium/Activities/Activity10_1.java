package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


class Activity_10_1 {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		Actions actions = new Actions(driver);
		driver.get("https://www.training-support.net/selenium/input-events");
		
		String title = driver.getTitle();
		System.out.println("Page Tile is "+title);
		
		WebElement cube = driver.findElement(By.id("wrapD3Cube"));
		
		actions.click(cube);
		WebElement cubeVal = driver.findElement(By.className("active"));
        System.out.println("Left Click: " + cubeVal.getText());
        
        actions.doubleClick(cube).perform();
		WebElement cubeVal1 = driver.findElement(By.className("active"));
        System.out.println("Double Click: " + cubeVal1.getText());
		
        actions.contextClick(cube).perform();
        WebElement cubeVal2 = driver.findElement(By.className("active"));
        System.out.println("Right Click: " + cubeVal2.getText());
        
        driver.close();
		
		
		
	}

}
