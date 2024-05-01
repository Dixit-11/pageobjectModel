package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AddProductintoCartResult extends Utils{
    String expectedNameOfProduct = "Build your own computer";
    public void VerifyProductNameAsYouAddProductInToCart(){
        waitUntilElementIsVisible ( 10, By.className ("product-name"));
        String actual = getTextFromElement ( By.className ("product-name"));
        Assert.assertEquals ( getTextFromElement ( By.className ("product-name")),expectedNameOfProduct);
    }


}
