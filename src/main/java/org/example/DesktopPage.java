package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class DesktopPage extends Utils {
    public void verifyEachProductShouldHaveTitle() {
        //path of page for whole list of products
        clickonElement ( By.xpath ( "//div[@class='item-grid']/div[1] " ) );
        //Store list
        List<WebElement> productlist = driver.findElements ( By.xpath ( "//div[@class='item-grid']/div/div[1]/div[2]/h2" ) );
        for (WebElement element : productlist) {
            System.out.println (element.getText ());
            Assert.assertNotNull ( element.getText (), "Product name are not display" );
        }

    }

}
