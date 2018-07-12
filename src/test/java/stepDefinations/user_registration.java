package stepDefinations;

import Screens.AuthorizationScreen;
import Screens.PolicyScreen;
import Screens.RegistrationScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.DriverRunner;
import org.testng.Assert;


public class user_registration extends DriverRunner {


    @Then("^User is on the registration screen$")
    public void user_is_on_the_registration_screen() throws Throwable {
        RegistrationScreen registrationScreen = new RegistrationScreen(driver);
    }

    @When("^user is typing (.+) and (.+)$")
    public void user_is_typing_and(String email, String password) throws Throwable {
        RegistrationScreen registrationScreen = new RegistrationScreen(driver);
        registrationScreen.typeEmail(email);
        registrationScreen.typePassword(password);
        registrationScreen.registerButtonClick();
    }

    @Then("^email error is equal to (.+) and password error equal to (.+)$")
    public void email_error_is_equal_to_and_password_error_equal_to(String emailerror, String passworderror) throws Throwable {
        RegistrationScreen registrationScreen = new RegistrationScreen(driver);
        registrationScreen.errorTextIs(emailerror);
        registrationScreen.errorTextIs(passworderror);
    }

    @And("^Fields are cleaned$")
    public void fields_are_cleaned() throws Throwable {
        RegistrationScreen registrationScreen = new RegistrationScreen(driver);
        registrationScreen.cleanFields();
    }

    @When("^User is entered \"([^\"]*)\" email and \"([^\"]*)\" password$")
    public void user_is_entered_something_email_and_something_password(String strArg1, String strArg2) throws Throwable {
        RegistrationScreen registrationScreen = new RegistrationScreen(driver);
        registrationScreen.typeEmail(strArg1);
        registrationScreen.typePassword(strArg2);
        registrationScreen.registerButtonClick();
    }

    @Then("^He see the password that equals to \"([^\"]*)\"$")
    public void he_see_the_password_that_equals_to_something(String strArg1) throws Throwable {
        RegistrationScreen registrationScreen = new RegistrationScreen(driver);
        registrationScreen.passwordTextIs(strArg1);
        registrationScreen.eyeButtonClick();
        registrationScreen.cleanFields();
    }

    @And("^Click to eye button$")
    public void click_to_eye_button() throws Throwable {
        RegistrationScreen registrationScreen = new RegistrationScreen(driver);
        registrationScreen.eyeButtonClick();
    }

    @When("^User is clicking on terms link$")
    public void user_is_clicking_on_terms_link() throws Throwable {
        RegistrationScreen registrationScreen = new RegistrationScreen(driver);
        PolicyScreen policyScreen = registrationScreen.termsClick();
    }

    @Then("^User is on the terms screen$")
    public void user_is_on_the_terms_screen() throws Throwable {
        PolicyScreen policyScreen = new PolicyScreen(driver);
        String header = policyScreen.headerText;
        Assert.assertEquals("Privacy policy", header);
    }

    @And("^User is back$")
    public void user_is_back() throws Throwable {
        PolicyScreen policyScreen = new PolicyScreen(driver);
        RegistrationScreen registrationScreen = policyScreen.backButtonClick();
    }

    @When("^User is clicking on account button$")
    public void user_is_clicking_on_account_button() throws Throwable {
        RegistrationScreen registrationScreen = new RegistrationScreen(driver);
        AuthorizationScreen authorizationScreen = registrationScreen.accountClick();
    }

    @Then("^User is on the authorization screen$")
    public void user_is_on_the_authorization_screen() throws Throwable {
        AuthorizationScreen authorizationScreen = new AuthorizationScreen(driver);
        String header = authorizationScreen.headerText;
        Assert.assertEquals("Войти", header);
    }

    @And("^He is back to registration$")
    public void he_is_back_to_registration() throws Throwable {
        AuthorizationScreen authorizationScreen = new AuthorizationScreen(driver);
        RegistrationScreen registrationScreen = authorizationScreen.registerClick();
    }
}
