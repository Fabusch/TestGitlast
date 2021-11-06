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

public class NewTest {

	// 1. Web Element deklarieren
	private WebDriver d;
	private String baseUrl;

	@BeforeClass
	public void setUp() {
		d = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/p/practice";
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get(baseUrl);
	}

	@Test
	public void selectClass() {

		WebElement hondaElement = d.findElement(By.xpath("//option[@value='honda']"));
		hondaElement.click();

		Assert.assertEquals(hondaElement.getText(), "Honda");
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(1000);
		d.close();
	}

}
