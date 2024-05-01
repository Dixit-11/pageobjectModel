package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    public void ClickonRegisterButton(){
        clickonElement ( By.linkText ( "Register" ));
    }
    public void ClickonLoginPage(){
        clickonElement ( By.className ("ico-login"));
    }
}
