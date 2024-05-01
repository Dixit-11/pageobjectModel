package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils {
    LoadProp loadProp = new LoadProp ();
    String expectedMsg = loadProp.getProperty ( "ExpectedMsg" ) ;

    public void EnterRegitrationisSuccessfull() {
        waitUntilElementIsVisible ( 5, By.className ( "result" ) );

        String actual = getTextFromElement ( By.className ( "result" ) );
        Assert.assertEquals ( actual, expectedMsg, "You are not registered" );
    }
}
