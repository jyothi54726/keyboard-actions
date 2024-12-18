package keyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoComplete {

	public static void main(String[] args) throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.google.co.in");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("selenium suresh");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		System.out.println("Firsttiem down arrow pressed");
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		System.out.println("second time down arrow pressed");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		System.out.println("clicked on Enter button");
		driver.close();
	}
}
