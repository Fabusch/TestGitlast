package basicLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocator {

	public static void main(String[] args) throws InterruptedException {
		// 1.Schritt wenn man mit Selenium arbeitet
		// Ein Treiber Objekt erzeugen

		WebDriver d = new ChromeDriver();
		d.get("http://uitestpractice.com/Students/Form");
		d.findElement(By.id("firstname")).sendKeys("Hallo");

		Thread.sleep(3000);

		d.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();

		Thread.sleep(3000);
		d.close();

		// d.findElement(By.linkText("Gmail")).click(); Funktioniert noch nicht so
		// wirklich...

		// d.findElement(By.partialLinkText("Über G")).click(); // Funktioniert
		// unterschied zum linkText muss man den
		// genauen TExt
		// hinschreiben und bei partiallinktext reichen einzelne Wörter

		// Name als Identifikatorfeld
		// d.findElement(By.className("btNl")).click();
		// d.findElement(By.xpath("//input[@name='btnk']")).click();

		// Mit Text lassen sich ohne AttributeAngabe und Pfadumwege Dinge anklicken
		// d.findElement(By.xpath("//a[contains(text(),'Über Google')]")).click();

		// a[contains(text(),'Über Google')

		// d.findElement(By.xpath("//a[contains(text(),'Über G' )]")).click();

		// Following Sibling nimmt auch die danachfolgenden Elemente mit + find Elements
		// d.findlegend[contains(text(),'Radio Button Example')]

	}
}
