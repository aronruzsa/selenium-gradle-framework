package stepdefinitions;

import static org.assertj.core.api.Assertions.assertThat;

import static stepdefinitions.Hook.getDriver;
import org.assertj.core.api.SoftAssertions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
    private LoginPage loginPage = new LoginPage(getDriver());

    @Given("the user goes to the login page")
    public void theUserGoesToTheLoginPage() {
        getDriver().get("https://www.saucedemo.com/");
    }

    @When("the user types {string} username and {string} password")
    public void theUserTypesUsernameAndPassword(String username, String password) {
        loginPage.typeUsernameAndPassword(username, password);
    }

    @When("the user clicks on the login button")
    public void theUserClicksOnTheLoginButton() {
        loginPage.clickOnLoginButton();
    }

    @Then("the user should be on the inventory page")
    public void theUserShouldBeOnTheInventoryPage() {
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String expectedTitle = "Swag Labs";
        String actualUrl = getDriver().getCurrentUrl();
        String actualTitle = getDriver().getTitle();

        SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(actualUrl).isEqualTo(expectedUrl);
            softly.assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

}
