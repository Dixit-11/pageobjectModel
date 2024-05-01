package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;


public class NikeProductPageVerification extends Utils{

    private By _productName = By.xpath("//div[@class='item-grid']/div//h2");

        //create Object For Locator
        public void toVerifyProductNameContainsNike(){
            String expectedProductName = getTextFromElement(_productName);
            Assert.assertTrue(expectedProductName.startsWith("Nike"),"Product Name Does Not Contain Nike");
        }
        public void toVerifyProductUrlContainNike()
        {
            String URl = driver.getCurrentUrl();
            Assert.assertTrue(URl.contains("Nike"),"Your URL Does Not Contains Nike");
        }
    }
