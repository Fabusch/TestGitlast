package basicLocator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Precedingsibling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("https://letskodeit.teachable.com/p/practice");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Preceding::input gibt nicht die nachfolgenden sondern die davor folgenden
		// Elemente aus.

	}
}
