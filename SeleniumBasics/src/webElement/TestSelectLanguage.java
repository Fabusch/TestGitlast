package webElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestSelectLanguage {

	private WebDriver d;
	private String baseUrl;

	@BeforeClass
	public void setUp() {
		d = new ChromeDriver();
		baseUrl = "https://www.wikipedia.org/";

		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.manage().window().maximize();

		d.get(baseUrl);

	}

	@Test
	public void testselectlang() throws InterruptedException {
		WebElement selectElement = d.findElement(By.id("searchLanguage"));
		// Neue Klasse Select wird angelegt
		Select selecting = new Select(selectElement);

		selecting.selectByValue("az");
		Thread.sleep(2000);
		selecting.selectByIndex(0); // Startet immer bei 0
		Thread.sleep(2000);
		selecting.selectByVisibleText("Dansk"); // Ist wie Text und sucht nach einem Wort zwischen geöffneter und
												// geschlossenem OptionTag kann für die Jsf Anwendung genutzt werden

	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		d.close();
	}
}
