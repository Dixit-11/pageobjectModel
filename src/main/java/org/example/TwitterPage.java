package org.example;

import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

public class TwitterPage extends Utils {
    public void VerifyTwitterPageByClickingOnIcon(){
        clickonElement ( By.xpath ( "//a[@href=\"https://twitter.com/nopCommerce\"]" ) );
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

