package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Stepdefs {

    CheckOut checkout = new CheckOut();

    @Given("^the following products:$")
    public void the_following_products(Map<String,Integer> products) throws Throwable {
        checkout.setProducts(products);
    }

    @When("^I order (\\d+) (.*)?")
    public void i_order_croissants(int quantity, String product) throws Throwable {
        checkout.setQuantity(product, quantity);
    }

    @Then("^the total should be £(\\d+)$")
    public void the_total_should_be_£(int expectedTotal) throws Throwable {
        assertEquals("The total is incorrect", expectedTotal, checkout.getTotal());
    }
}