package com.autotrader.stepdefinitions;

import com.autotrader.pages.AutotraderPage;
import com.autotrader.utilities.MyDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.sql.DriverManager;

public class AutotraderSteps {

    AutotraderPage autotraderPage = new AutotraderPage(MyDriver.getDriver());



    @Given("User is in landing page")
    public void userIsInLandingPage() {
       // System.out.println("Landing page");
       // String actualTitle = MyDriver.getDriver().getTitle();
       // System.out.println(actualTitle);
        //String expectedTitle = "Cars for Sale - Used and New Cars, SUVs, and Trucks - Autotrader";
       // String expectedTitle = "DDD";
       // Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("Verify that {string} are present")
    public void verifyThatArePresent(String expected) {
      autotraderPage.VerificationByMakeByModelByAdvancedSearch(expected);
        System.out.println(autotraderPage.searchButton.getText());

    }



    @And("Verify that search button is present")
    public void verifyThatSearchButtonIsPresent() {
        autotraderPage.searchButton();
    }

    @Then("Verify that {string} and {string} is visible")
    public void verifyThatAndIsVisible(String make, String model) {
        autotraderPage.VerifyAnyMakeAnyModel(make,model);

    }

    @Given("User click on Advance link on the home page")
    public void userClickOnAdvanceLinkOnTheHomePage() {
    }

    @Then("User enter {string} in the zip code text box")
    public void userEnterInTheZipCodeTextBox(String arg0) {
    }

    @Then("User select {string} check box under {string}")
    public void userSelectCheckBoxUnder(String arg0, String arg1) {
    }

    @Then("User update year {string} to {string}")
    public void userUpdateYearTo(String arg0, String arg1) {
    }

    @Then("User select {string} car from Make, Model and Trim")
    public void userSelectCarFromMakeModelAndTrim(String arg0) {
    }

    @Then("User clicks Search Button")
    public void userClicksSearchButton() {
    }

    @Then("User verify that he is in the result page")
    public void userVerifyThatHeIsInTheResultPage() {
    }

    @Then("User verify that he sees only {string} cars in listing")
    public void userVerifyThatHeSeesOnlyCarsInListing(String arg0) {
    }

    @Then("Display in console, the number of cars listed in result page")
    public void displayInConsoleTheNumberOfCarsListedInResultPage() {
    }

    @Given("choose make as {string}")
    public void chooseMakeAs(String arg0) {
    }
}
