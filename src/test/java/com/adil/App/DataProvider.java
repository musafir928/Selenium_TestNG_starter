package com.adil.App;

import com.adil.TestBase;
import com.adil.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProvider extends TestBase {
    @Test(dataProvider = "testData")
    public void test(String url, String expectedTitle) {
        driver.get(url);
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
    }

    @org.testng.annotations.DataProvider(name = "testData")
    public Object[][] testData() {
        return new Object[][] {
                {"google.com", "Google"},
                {"amazon.com", "Amazon"},
                {"bol.com", "Bol"},
                {"facebook", "Facebook"},
        };
    }
}
