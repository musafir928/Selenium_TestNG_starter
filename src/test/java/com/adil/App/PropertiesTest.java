package com.adil.App;

import com.adil.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class PropertiesTest {
    @Test
    public void printURL() {
        System.out.println("browserType: " + ConfigurationReader.get("browser"));
        System.out.println("url        : " + ConfigurationReader.get("url"));
        System.out.println("username   : " + ConfigurationReader.get("username"));
        System.out.println("password   : " + ConfigurationReader.get("password"));
    }
}
