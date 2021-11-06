package basicLocator;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xXPathFollowingSippling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("https://letskodeit.teachable.com/p/practice");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Der Bot wartet bis die Seite geladen ist bevor
		// er die Arbeit anfängt

//Wenn es mehrere MatchingNodes gibt muss man eine List erstellen

		List<WebElement> listeRadioButtons = d.findElements(By.xpath(
				"//legend[contains(text(),'Radio Button Example')]//following-sibling::label//following-sibling::input"));

		for (WebElement listeAutos : listeRadioButtons) {
			System.out.println(listeAutos.getAttribute("value"));
			listeAutos.click();
			Thread.sleep(3000);
		}
	}
}
