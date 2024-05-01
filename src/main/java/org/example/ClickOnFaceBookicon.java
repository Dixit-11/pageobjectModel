package org.example;

import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

public class ClickOnFaceBookicon extends Utils {
    public void VerifyFaceBookIconByClickingOn() {
        //Click on Facebook icon
        clickonElement ( By.xpath ( "//a[@href=\"http://www.facebook.com/nopCommerce\"] " ) );
        //Facebook Url https://www.facebook.com/nopCommerce
        //driver.switchTo ().window ( "url1" );
        String MainWindow = driver.getWindowHandle ();

        //TO handle all new open window.
        Set<String> s1 = driver.getWindowHandles ();
        Iterator<String> i1 = s1.iterator ();

        while (i1.hasNext ()) {
            String ChildWindow = i1.next ();
            if (!MainWindow.equalsIgnoreCase ( ChildWindow )) {

                //Switching to Child window
                driver.switchTo ().window ( ChildWindow );
                //Closing the Child window.
                driver.close ();
            }
        }
        //Switching to parent window
        driver.switchTo ().window ( MainWindow );
    }

}
