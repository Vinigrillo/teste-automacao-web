package pages;

import static apoio.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class LoginPage {
	public void Logar() {
		getDriver().findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("admin@phptravels.com");
		getDriver().findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("demoadmin");
		getDriver().findElement(By.xpath("//button[contains(.,\"Login\")]")).click();
	}

}
