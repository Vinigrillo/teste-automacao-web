package pages;

import static apoio.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class HomePage {
	
	public void Accounts() {
		getDriver().findElement(By.xpath("//*[@id=\"bs-navbar-collapse-1\"]/ul[1]/li[3]/a")).click();
	}
	
	public void Suppliers() {
		getDriver().findElement(By.xpath("//*[@id=\"bs-navbar-collapse-1\"]/ul[1]/li[3]/ul/li[2]/a")).click();
	}
}
