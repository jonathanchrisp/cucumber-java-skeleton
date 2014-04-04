package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;

public class Stepdefs {

    CheckOut checkout = new CheckOut();

    @Given("^an espresso costs £(\\d+)$")
    public void an_espresso_costs_£(int price) throws Throwable {
        checkout.setPriceOfEspresso(price);
    }

    @Given("^a croissant costs £(\\d+)$")
    public void a_croissant_costs_£(int price) throws Throwable {
        checkout.setPriceOfCroissant(price);
    }

    @When("^I order (\\d+) croissants$")
    public void i_order_croissants(int quanity) throws Throwable {
        checkout.setQuantityOfCroissant(quanity);
    }

    @When("^I order (\\d+) espresso$")
    public void i_order_espresso(int quanity) throws Throwable {
        checkout.setQuantityOfEspresso(quanity);
    }

    @Then("^the total should be £(\\d+)$")
    public void the_total_should_be_£(int expectedTotal) throws Throwable {
        assertEquals("The total is incorrect", expectedTotal, checkout.getTotal());
    }
}