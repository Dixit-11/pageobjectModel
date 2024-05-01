package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {
    BrowserManager browserManager = new BrowserManager ();



    @BeforeMethod
    // open Browser

    public void setUp() {
        browserManager.OpenBroser ();
    }

    @AfterMethod
    // Close all the browser open by Selenium
    public void tearDown(ITestResult result) {
        if (!result.isSuccess ()){
            takeScreenShot (result.getName ());
        }
        browserManager.close ();
    }
}
