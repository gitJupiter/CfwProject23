package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.login_Page;

import static base.TestData.GLOBAL_EMAIL;
import static base.TestData.GLOBAL_PASSWORD;

public class login_Step {
    login_Page loginPage = new login_Page();
    @Given("I am at Raymour Homepage")
    public void iAmAtRaymourHomepage() {


    }
    @And("I Dismiss the pop up page")
    public void iDismissThePopUpPage() {
    loginPage.dismiss();
    }

    @And("I click on Account Dropdown Menu")
    public void iClickOnAccountDropdownMenu() {
    loginPage.dropDown();
    }

    @And("I click on Sign In Button")
    public void iClickOnSignInButton() {
    loginPage.SignInBtn();
    }


    @And("I enter my valid email address")
    public void iEnterMyValidEmailAddress() {
        loginPage.enterEmail(GLOBAL_EMAIL);
    }

    @And("I enter my valid password")
    public void iEnterMyValidPassword() {
        loginPage.enterPassword(GLOBAL_PASSWORD);
    }

    @When("I click on Login Button")
    public void iClickOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should be able to successfully login")
    public void iShouldBeAbleToSuccessfullyLogin() {

    }

    @And("I enter my invalid email address")
    public void iEnterMyInvalidEmailAddress() {
        loginPage.enterEmail("motorbyk@yahoo.com");
    }

    @Then("I should not be able to successfully login")
    public void iShouldNotBeAbleToSuccessfullyLogin() {
        loginPage.invalidEmailOrPasswordMsg();
    }

    @And("I enter my invalid password")
    public void iEnterMyInvalidPassword() {
        loginPage.enterPassword("abcabc000");

    }
}

