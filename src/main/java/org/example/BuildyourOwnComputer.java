package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BuildyourOwnComputer extends Utils {

    public void buildAComputer() {
        // Click on Build on Computer Function
        clickonElement ( By.xpath ( " // img[@title='Show details for Build your own computer']" ) );
        //select Processor from dropdown list
        Select ProductDropdown = new Select ( driver.findElement ( By.xpath ( "//select[@name='product_attribute_1']" ) ) );
        ProductDropdown.selectByValue ( "2" );
        //select Ram from Dropdown list
        Select RamDropdown = new Select ( driver.findElement ( By.xpath ( "//select[@name='product_attribute_2']" ) ) );
        RamDropdown.selectByIndex ( 1 );
        // Select HDD
        clickonElement ( By.xpath ( "//label[@for='product_attribute_3_7']" ) );
        // Select OS
        clickonElement ( By.xpath ( "//label[@for='product_attribute_4_9']" ) );
        // Select Software
        clickonElement ( By.xpath ( "//label[@for='product_attribute_4_9']" ) );
        //click on Add to Cart Button
        clickonElement ( By.xpath ( "//button[@class='button-1 add-to-cart-button']" ) );
        // Use Explicit Wait For 10 Seconds
        explicitWaitMethod ( By.xpath ( "//li[@id='topcartlink']" ) );
        //Click on Shopping Cart
        clickonElement ( By.xpath ( "//li[@id='topcartlink']" ) );

    }
}
