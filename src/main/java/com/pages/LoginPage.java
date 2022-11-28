package com.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage(WebDriver driver){

        super(driver);

    }

    private By usernameField  = By.id("user-name");

    private By passwordField = By.cssSelector("input[type='password");

    private By loginButton = By.name("login-button");




    public void typeOnUsernameFieldName(String username){

        WebElement usernameField =
                driver.findElement(this.usernameField);

        usernameField.sendKeys(username);

        log.info(String.format("Typing username - %s", username ));
    }


    public void typeOnPasswordField(String password){

        WebElement usernameField =
                driver.findElement(this.passwordField);

        usernameField.sendKeys(password);

        log.info(String.format("Typing password - %s", password ));
    }

    public void clickOnLoginButton(){

        WebElement logInButtonCSS =
                driver.findElement(this.loginButton);

        log.info("Clicking on login button.");

        logInButtonCSS.click();
    }

    public boolean isLoginButtonVisible(){

        return driver.findElement(this.loginButton).isDisplayed();
    }
}
