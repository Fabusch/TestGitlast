package seleniumtestforbuchverwaltung;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SeleniumIntegrationVorlage {

	WebDriver d = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(d, 5);
	private String baseUrl;

	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/C:\\Users\\suchan\\Desktop\\Selenium-Java\\chromedriver_win32 (2)\\chromedriver.exe");

		d = new ChromeDriver();
		baseUrl = "http://localhost:8090/JSFLoginExample/studentsList.xhtml";
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.get(baseUrl);

	}

	@Test
	private void changeTextField1() throws InterruptedException { // Funktioniert soweit
		d.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(d, 3);
		WebElement pressbuttonElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
				"table.table.table-striped.table-hover.table-bordered.tableUpdated:nth-child(2) tbody:nth-child(2) tr:nth-child(1) td:nth-child(7) > input.btn.btn-primary")));
		pressbuttonElement.click();
		Thread.sleep(50000);

	}

	@Test
	private void textChangeName() throws InterruptedException {
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait1 = new WebDriverWait(d, 4);
		WebElement textChanging3 = wait1
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='form:name-id']")));
		textChanging3.clear();
		textChanging3.sendKeys("ZEIG DICH");
		Thread.sleep(5000);
	}

	// @Test
	// private void textChangePassword() throws InterruptedException {
	// WebElement textChanging1 =
	// d.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/input[1]"));
	// textChanging1.clear();
	// textChanging1.sendKeys("Die Bären und die Henne");
	// Thread.sleep(2000);
	// }

	@Test
	private void pressButtonafterChange() throws InterruptedException { //

		d.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement buttonElement = (new WebDriverWait(d, 5).until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("/html[1]/body[1]/form[1]/div[7]/div[2]/input[1]"))));
		buttonElement.click();
		Thread.sleep(2000);

	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		d.close();
	}

}
