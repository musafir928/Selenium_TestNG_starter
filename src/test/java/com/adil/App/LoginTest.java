package com.adil.App;

import com.adil.TestBase;
import com.adil.pages.LoginPage;
import com.adil.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void loginTest() {
        driver.get(ConfigurationReader.get("url"));

        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.get("username"),ConfigurationReader.get("password"));

    }
}
