package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CameraAndPhotoPage extends Utils{
    private By _addToCartButton = (By.xpath ( "//button[@class='button-2 product-box-add-to-cart-button']" ));
    public void VerifyEachProductShouldHaveCartButton(){

        //Store Product TitleList
        List<WebElement> productTitleElementList = driver.findElements ( _addToCartButton );

        for (WebElement element:productTitleElementList){

            Assert.assertNotNull ( element.getText (),"one of the product Add to cart button is Missing" );
        }
        System.out.println ("one of the product Add to cart button is Missing");
    }

}
