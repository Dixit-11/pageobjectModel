package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils {
    LoadProp loadProp = new LoadProp ();
    String browser = "Chrome";
    public void OpenBroser(){
        //driver = new ChromeDriver ();
        //driver = new EdgeDriver ();
        //driver = new FirefoxDriver ();
        if (browser.equalsIgnoreCase ( "Chrome" ))
        {
            System.out.println ("Your browser is Chrome");
            driver = new ChromeDriver ();

        } else if (browser.equalsIgnoreCase ( "Edge" ))
        {
            System.out.println ("Your browser is Edge");
            driver = new EdgeDriver ();

        } else if (browser.equalsIgnoreCase ( "Firefox" ))
        {
            System.out.println ("Your browser is Friefox");
            driver = new FirefoxDriver ();
        }else
        {
            System.out.println ("Your browser name is wrong :" + browser);

        }

       // driver = new ChromeDriver ();
        driver.manage ().timeouts ().implicitlyWait ( 30, TimeUnit.SECONDS );
        driver.manage ().window ().maximize ();
        //type URL
        driver.get ( loadProp.getProperty ( "url" ));

    }
   public void close(){
             driver.quit ();
   }


    }

