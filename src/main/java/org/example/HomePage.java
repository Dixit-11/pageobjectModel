package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    public void ClickonRegisterButton(){
        clickonElement ( By.linkText ( "Register" ));
    }
    public void ClickonLoginPage(){
        clickonElement ( By.className ("ico-login"));
    }
    public void ClickonComputerPage(){clickonElement ( By.xpath ( "(//a[@href=\"/computers\"])[1]" ) );}
    public void VerifyAlertMessageByClickONSearchButton(){
        //Click on Search Button
        clickonElement ( By.xpath ( "//button[@class='button-1 search-box-button']" ) );
        // Get Alert message
        driver.switchTo ().alert ();
        // Confirm Alert Message
        driver.switchTo ().alert ().accept ();
    }
    public void VerifyAlertMessageclickOnVoteButton() {
        //Click on Vote Button
        clickonElement ( By.xpath ( "//*[@id='vote-poll-1']" ) );
        // confirm Alert Message
        driver.switchTo ().alert ();
        // accept Alert message
        driver.switchTo ().alert ().accept ();
    }
    //Create Method For Click On Search Button
    public void clickOnSearchButton()
    {
        //Click On Search Button
        clickonElement (By.xpath("//button[@class='button-1 search-box-button']"));
    }
    //Create Method For Search Nike Product
    public void searchNikeProduct()
    {
        typeText(By.xpath("//input[@class='search-box-text ui-autocomplete-input']"),"Nike");
    }


}
