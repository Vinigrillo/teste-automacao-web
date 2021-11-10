package pages;

import static apoio.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class SuppliersPage {

	public void Add() {
		getDriver().findElement(By.xpath("//button[contains(.,\"Add\")]")).click();
	}
}
