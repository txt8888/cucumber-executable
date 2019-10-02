package org.phan.kata.cucumber.integration.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;

/**
 * Created by tcp on 09/14/2019.
 */
@Slf4j
public class DreamCarSteps {
    int amount = 0;

    @Given("^I have money$")
    public void iHaveMoney() {
    }

    @When("I buy a car")
    public void iBuyACar() {
    }

    @Then("it must be a Ferrari")
    public void itMustBeAFerrari() {
        Assert.assertTrue(true);
    }

    @Given("I have {int} dollars")
    public void iHaveMoneyInTheAmountOf(int amount) {
        this.amount = amount;
    }

    @Then("it has to be a {string}")
    public void itMustBeTheBestCarICanAfford(String car) {
        log.debug("http.ProxyHost = " + System.getProperty("http.ProxyHost"));

        if (this.amount >= 1000000) {
            Assert.assertEquals("Ferrari", car);
        } else if (this.amount >= 500000) {
            Assert.assertEquals("McLaren", car);
        } else if (this.amount >= 250000) {
            Assert.assertEquals("Acura NSX", car);
        } else if (this.amount >= 100000) {
            Assert.assertEquals("Mercedes Benz", car);
        } else if (this.amount >= 50000) {
            Assert.assertEquals("Corvette", car);
        } else {
            Assert.assertEquals("Camry", car);
        }
    }
}
