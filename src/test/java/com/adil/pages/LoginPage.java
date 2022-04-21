package com.adil.pages;

import com.adil.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage () {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="user_login")
    public WebElement usernameInput;

    @FindBy(id="user_password")
    public WebElement passwordInput;

    @FindBy(name="submit")
    public WebElement submitButton;

    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitButton.click();
    }
}
