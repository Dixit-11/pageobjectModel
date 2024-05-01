package org.example;

import org.openqa.selenium.By;

public class ComputerPage extends Utils {

    public void ClickOnDesktopFunction(){
        clickonElement ( By.xpath ( "//div[@class='item-grid']/div[1]/div" ) );
    }

}
