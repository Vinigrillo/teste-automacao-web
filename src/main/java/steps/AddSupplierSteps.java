package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddSupplierPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SuppliersPage;

public class AddSupplierSteps {

	@Given("that I have logged into the system")
	public void that_i_have_logged_into_the_system() throws InterruptedException {
		LoginPage login = new LoginPage();
		login.Logar();
	}

	@Given("click the accounts")
	public void click_the_accounts() {
		HomePage home = new HomePage();
		home.Accounts();
	}

	@Given("click the suppliers")
	public void click_the_suppliers() {
		HomePage home = new HomePage();
		home.Suppliers();
	}

	@Given("click the Add button")
	public void click_the_add_button() {
		SuppliersPage supplier = new SuppliersPage();
		supplier.Add();
	}

	@Given("fill out the form")
	public void fill_out_the_form() throws InterruptedException {
		AddSupplierPage add = new AddSupplierPage();
		add.setName();
		add.setLastName();
		add.setPassword();
		add.setCountry();
	}

	@When("I click submit button")
	public void i_click_submit_button() {
		AddSupplierPage add = new AddSupplierPage();
		add.summit();
	}

	@Then("I must validate the email field is required")
	public void i_must_validate_the_email_field_is_required() {
		AddSupplierPage add = new AddSupplierPage();
		add.requiredEmail();
	}

}
