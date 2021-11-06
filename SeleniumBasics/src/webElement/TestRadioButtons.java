package webElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestRadioButtons {

	// Annotation werden vor eine Methode geschrieben um zu zeigen was diese für
	// eine ist.

	private WebDriver driver;
	private String baseUrl;

	@BeforeClass
	public void setUp() {

		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/p/practice";

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize(); // Lässt die Seite auf Maximalgröße laden
		driver.get(baseUrl);
	}

	@Test
	public void testRadioButtons() {
		WebElement element = driver.findElement(By.id("benzradio"));
		element.click();

		Assert.assertTrue(element.isSelected());
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

	{

	}
}
