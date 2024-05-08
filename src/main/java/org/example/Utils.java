package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utils extends BasePage {
    public static void clickonElement(By by) {
        driver.findElement ( by ).click ();
    }

    public static void typeText(By by, String text) {
        driver.findElement ( by ).sendKeys ( text );
    }

    public static String getTextFromElement(By by) {
        return driver.findElement ( by ).getText ();
    }

    public static String randomDate() {
        DateFormat dateFormat = new SimpleDateFormat ( "ddmmyyyyhhmm" );
        Date date = new Date ();
        return dateFormat.format ( date );
    }

    public static void selectbyVisibleText(By by, String text) {
        Select select = new Select ( driver.findElement ( by ) );
        select.selectByVisibleText ( text );
    }

    // Explicit wait Method 1 / Elements is Visible
    public static void waitUntilElementIsVisible(int time, By by) {
        WebDriverWait wait = new WebDriverWait ( driver, Duration.ofSeconds ( time ) );
        wait.until ( ExpectedConditions.visibilityOfElementLocated ( by ) );
    }

    //Explicit wait method 2 / Element is Clickable
    public static void waitUntilElementIsClickable(int time, By by) {
        WebDriverWait wait = new WebDriverWait ( driver, Duration.ofSeconds ( time ) );
        wait.until ( ExpectedConditions.elementToBeClickable ( by ) );
    }

    public static void selectByIndex(By by, int index) {
        Select select = new Select ( driver.findElement ( by ) );
        select.selectByIndex ( index );
    }

    public static void selcetByValue(By by, String text) {
        Select select = new Select ( driver.findElement ( by ) );
        select.selectByValue ( text );
    }

    // Explicit wait Method 3 / Driver wait
    public static void explicitWaitMethod(By by) {
        WebElement driverWait = new WebDriverWait ( driver, Duration.ofSeconds ( 10 ) ).until ( ExpectedConditions.elementToBeClickable ( by ) );
    }

    // textToBePresent 4
//    public static void waitUntiltextToBePresentInElementLocated(By by){
//        WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds ( 10 )).until (ExpectedConditions.textToBePresentInElementLocated ( by ));
//    }
    //5. alertIsPresent(): Waits for an alert to be present
    public static void alertIsPresent(By by) {
        WebDriverWait wait = new WebDriverWait ( driver, Duration.ofSeconds ( 10 ) );
        Alert alert = wait.until ( ExpectedConditions.alertIsPresent () );
    }

    //6. titleContains(String title): Waits for the title of the page to contain the specified text
    public static void titleContains(By by, String title) {
        WebDriverWait wait = new WebDriverWait ( driver, Duration.ofSeconds ( 10 ) );
        boolean result = wait.until ( ExpectedConditions.titleContains ( "expectedTitle" ) );
    }

    //7. invisibilityOfElementLocated
    public static void invisibilityOfElementLocated(By by) {
        WebDriverWait wait = new WebDriverWait ( driver, Duration.ofSeconds ( 10 ) );
        boolean result = wait.until ( ExpectedConditions.invisibilityOfElementLocated ( By.id ( "elementId" ) ) );

    }
    public static void alartMessageAccept(){
        driver.switchTo ().alert ().accept ();
    }
    public static void elementTobeClickableforCookied(){
        WebDriverWait wait = new WebDriverWait ( driver,Duration.ofSeconds ( 20 ) );
        wait.until ( ExpectedConditions.elementToBeClickable ( By.xpath ( "//div[@class='x1n2onr6 x1ja2u2z x78zum5 x2lah0s xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xn6708d x1ye3gou xtvsq51 x1r1pt67']" ) )).click ();
    }

    public static void takeScreenShot(String text) {
        //Convert web driver object to TakeScreenShot
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        // Call getScreenshot As method to create image file
        File SrcFile = screenshot.getScreenshotAs ( OutputType.FILE );
        //Move image file to new destination
        //copy file at destination
        try {
            FileUtils.copyFile ( SrcFile, new File ( "src\\Screenshot\\" + text + randomDate () + ".Png" ) );
        } catch (IOException e) {
            throw new RuntimeException ( e );
        }

    }


}
