package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class LoginScreenForRecruitersPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "emailField")
    private WebElement emailField;

    @FindBy(id = "passwordField")
    private WebElement passwordField;

    @FindBy(id = "showPasswordButton")
    private WebElement showPasswordButton;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "dashboard")
    private WebElement dashboard;

    @FindBy(id = "rememberMeCheckbox")
    private WebElement rememberMeCheckbox;

    @FindBy(id = "hidePasswordButton")
    private WebElement hidePasswordButton;

    public LoginScreenForRecruitersPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email) {
        try {
            elementUtils.clearAndSendKeys(emailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            elementUtils.clearAndSendKeys(passwordField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickShowPassword() {
        try {
            elementUtils.clickElement(showPasswordButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickLoginButton() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isDashboardDisplayed() {
        try {
            return elementUtils.isElementDisplayed(dashboard);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isLoginButtonEnabled() {
        try {
            return loginButton.isEnabled();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void leavePasswordFieldEmpty() {
        try {
            elementUtils.clearElement(passwordField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickHidePassword() {
        try {
            elementUtils.clickElement(hidePasswordButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isPasswordVisible() {
        try {
            String type = passwordField.getAttribute("type");
            return type.equals("text");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void checkRememberMe() {
        try {
            if (!rememberMeCheckbox.isSelected()) {
                elementUtils.clickElement(rememberMeCheckbox);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isUserLoggedIn() {
        try {
            return isDashboardDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void navigateToLoginScreen() {
        driver.get("http://localhost/login");
    }

    public boolean isDashboardLoadedSuccessfully() {
        return isDashboardDisplayed();
    }
}