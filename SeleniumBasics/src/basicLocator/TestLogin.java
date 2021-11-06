package basicLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("http://localhost:8090/JSFLoginExample");
		d.findElement(By.xpath("//tbody/tr[1]/td[7]/input[1]")).click();
		Thread.sleep(6000);

		d.findElement(By.id("form:id")).sendKeys("Hallo");
		Thread.sleep(3000);
		d.findElement(By.id("form:password")).sendKeys("Perta");
		Thread.sleep(3000);

		d.findElement(By.id("form:updateBtn")).click();

		Thread.sleep(3000);

		d.findElement(By.xpath("/html[1]/body[1]/form[1]/center[1]/input[1]")).click();
		Thread.sleep(3000);
		d.findElement(By.id("createStudentForm:name")).sendKeys("Hallo");
		Thread.sleep(3000);
		d.findElement(By.cssSelector(
				"form.form-horizontal div.form-group:nth-child(9) div.col-sm-4:nth-child(2) div.col-sm-2:nth-child(1) > input.btn.btn-success.btnWidth"))
				.click();
		;
		d.close();

	}
}