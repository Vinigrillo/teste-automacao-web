package pages;

import static apoio.DriverFactory.getDriver;

import org.junit.Assert;
import org.openqa.selenium.By;

public class AddSupplierPage {
	public void setName() {
		getDriver().findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("Vinicius");		
	}
	
	public void setLastName() {
		getDriver().findElement(By.xpath("//input[@name=\"lname\"]")).sendKeys("Grillo");	
	}
	
	public void setEmail() {
		getDriver().findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("vini_grillo@hotmail.com");
	}
	
	public void setPassword() {
		getDriver().findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("5r4e3w2q");
	}
	
	public void setCountry() {
		getDriver().findElement(By.xpath("//input[@id=\"s2id_autogen2\"]")).sendKeys("Brazil");
		getDriver().findElement(By.xpath("//option[@value=\"BR\"]")).click();
	}
	
	public void summit() {
		getDriver().findElement(By.xpath("//button[contains(.,\"Submit\")]")).click();
	}
	
	public void requiredEmail() {
		String texto = getDriver().findElement(By.xpath("//div[@class=\"alert alert-danger\"]/p")).getText();
		Assert.assertEquals("The Email field is required.", texto);
		
	}
}
