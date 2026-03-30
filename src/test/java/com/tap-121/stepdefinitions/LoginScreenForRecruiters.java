package com.tap121.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.tap121.pages.LoginScreenForRecruitersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginScreenForRecruiters extends DriverFactory {
LoginScreenForRecruitersPage loginScreenForRecruitersPage;
public LoginScreenForRecruiters() {
driver = DriverFactory.getDriver();
loginScreenForRecruitersPage = new LoginScreenForRecruitersPage(driver);
}
@Given("the recruiter is on the Login Screen")
public void the_recruiter_is_on_the_login_screen() {
loginScreenForRecruitersPage.navigateToLoginScreen();
}
@When("I enter a valid email ID {string} in the Email ID field")
public void i_enter_a_valid_email_id_in_the_email_id_field(String email) {
loginScreenForRecruitersPage.enterEmail(email);
}
@When("I enter a valid password {string} in the Password field")
public void i_enter_a_valid_password_in_the_password_field(String password) {
loginScreenForRecruitersPage.enterPassword(password);
}
@When("I click on the 'Show Password' option")
public void i_click_on_the_show_password_option() {
loginScreenForRecruitersPage.clickShowPassword();
}
@When("I click the Login button")
public void i_click_the_login_button() {
loginScreenForRecruitersPage.clickLoginButton();
}
@Then("the recruiter should be redirected to the dashboard")
public void the_recruiter_should_be_redirected_to_the_dashboard() {
"Dashboard is not displayed", loginScreenForRecruitersPage.isDashboardDisplayed();
}
@Then("the dashboard should load successfully without errors")
public void the_dashboard_should_load_successfully_without_errors() {
"Dashboard did not load successfully", loginScreenForRecruitersPage.isDashboardLoadedSuccessfully();
}
@When("the user leaves the Password field empty")
public void the_user_leaves_the_password_field_empty() {
loginScreenForRecruitersPage.leavePasswordFieldEmpty();
}
@Then("the Login button should be disabled")
public void the_login_button_should_be_disabled() {
"Login button is enabled when it should be disabled", loginScreenForRecruitersPage.isLoginButtonEnabled();
}
@When("the user enters a valid password in the Password field")
public void the_user_enters_a_valid_password_in_the_password_field() {
loginScreenForRecruitersPage.enterPassword("password123");
}
@Then("the Login button should be enabled")
public void the_login_button_should_be_enabled() {
"Login button is not enabled when it should be", loginScreenForRecruitersPage.isLoginButtonEnabled();
}
@When("I click on the 'Hide Password' option")
public void i_click_on_the_hide_password_option() {
loginScreenForRecruitersPage.clickHidePassword();
}
@Then("the password should be visible")
public void the_password_should_be_visible() {
"Password is not visible", loginScreenForRecruitersPage.isPasswordVisible();
}
@Then("the password should be hidden")
public void the_password_should_be_hidden() {
"Password is still visible", loginScreenForRecruitersPage.isPasswordVisible();
}
@When("the user checks the 'Remember Me' option")
public void the_user_checks_the_remember_me_option() {
loginScreenForRecruitersPage.checkRememberMe();
}
@Then("the user closes the browser and reopens it")
public void the_user_closes_the_browser_and_reopens_it() {
driver.quit();
driver = DriverFactory.getDriver();
}
@Then("the user navigates back to the application")
public void the_user_navigates_back_to_the_application() {
loginScreenForRecruitersPage.navigateToLoginScreen();
}
@Then("the user should be automatically logged in upon returning to the application")
public void the_user_should_be_automatically_logged_in_upon_returning_to_the_application() {
"User is not automatically logged in", loginScreenForRecruitersPage.isUserLoggedIn();
}

@Given("the user enters {string} in the email id field")
public void the_user_enters_in_the_email_id_field(String emailId) {
loginScreenForRecruiters.enterEmailId(emailId);
}
@When("i enter {string} in the password field")
public void i_enter_in_the_password_field(String password) {
loginScreenForRecruiters.enterPassword(password);
}
@When("the user clicks the login button")
public void the_user_clicks_the_login_button() {
loginScreenForRecruiters.clickLoginButton();
}
@Then("the user should be redirected to the dashboard")
public void the_user_should_be_redirected_to_the_dashboard() {
"Dashboard should be displayed after login", loginScreenForRecruiters.isDashboardDisplayed();
}
@Then("the dashboard loads successfully without errors")
public void the_dashboard_loads_successfully_without_errors() {
"Dashboard should load without errors", loginScreenForRecruiters.isDashboardLoadedSuccessfully();
}
}