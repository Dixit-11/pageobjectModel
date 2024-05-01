package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils {
    private By _cameraAndPhotoPage = By.xpath ( "(//div[@class='item-grid']/div[1]" );
    public void clickOnCameraAndPhotoPage(){
        clickonElement ( _cameraAndPhotoPage );
    }
}
