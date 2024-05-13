package org.example;

import io.opentelemetry.semconv.UrlAttributes;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import javax.print.DocFlavor;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils {
    LoadProp loadProp = new LoadProp ();


    String sauceUrl = "https://oauth-dixit.testing11-61880:4f785dd8-33a9-4b24-b093-e49eda25bf83@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

    boolean cloud = true;
   // String browser = loadProp.getProperty ( "browser" );
    String browser = System.getProperty ( "browser" );


    public void OpenBroser() {
        //running in cloud if cloud is true
        if (cloud) {
            System.out.println ( "Running in Cloud" );
            if (browser.equalsIgnoreCase ( "Chrome" )) {
                System.out.println ( "Browser is Chrome" );
                ChromeOptions browserOptions = new ChromeOptions ();
                browserOptions.setPlatformName ( "Windows 11" );
                browserOptions.setBrowserVersion ( "latest" );
                try {
                    driver = new RemoteWebDriver ( new URL ( sauceUrl ), browserOptions );
                } catch (MalformedURLException e) {
                    throw new RuntimeException ( e );
                }
            } else if (browser.equalsIgnoreCase ( "Firefox" )) {
                System.out.println ( "Your browser is Firefox" );
                FirefoxOptions browserOptions = new FirefoxOptions ();
                browserOptions.setPlatformName ( "Windows 11" );
                browserOptions.setBrowserVersion ( "124" );
                try {
                    driver = new RemoteWebDriver ( new URL ( sauceUrl ), browserOptions );
                } catch (MalformedURLException e) {
                    throw new RuntimeException ( e );
                }
            } else if (browser.equalsIgnoreCase ( "Safari" )) {
                System.out.println ( "Your browser is Safari" );
                SafariOptions browserOptions = new SafariOptions ();
                browserOptions.setPlatformName ( "macOS 10.15" );
                browserOptions.setBrowserVersion ( "13" );
                try {
                    driver = new RemoteWebDriver ( new URL ( sauceUrl ), browserOptions );
                } catch (MalformedURLException e) {
                    throw new RuntimeException ( e );
                }

            } else {
                System.out.println ( "Please Select Valid Browser" );
            }

            }
        else
        {
            System.out.println("Running In Local........");
            if(browser.equalsIgnoreCase("Chrome"))
            {
                //if Your Browser is Chrome In Properties
                driver = new ChromeDriver();
            }
            else if (browser.equalsIgnoreCase("Safari"))
            {
                //if Your Browser is Safari In Properties
                driver = new SafariDriver();
            }
            else if (browser.equalsIgnoreCase("Firefox"))
            {
                //if Your Browser is Firefox In Properties
                driver = new FirefoxDriver();
            }
            else
            {
                //if Your Browser is Different From All If Condition
                System.out.println("Please Select Valid Browser");
            }

            }

        // driver = new ChromeDriver ();
        driver.manage ().timeouts ().implicitlyWait ( 30, TimeUnit.SECONDS );
        driver.manage ().window ().maximize ();
        //type URL
        driver.get ( loadProp.getProperty ( "url" ) );
    }
    public void close() {
        driver.quit ();

    }

}



