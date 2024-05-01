package org.example;

import org.openqa.selenium.By;

import static org.example.RegisterPage.email;

public class LoginPage extends Utils {
    public void EnterYourLoginDetails() {
        // Enter Register Email
        typeText ( By.id ( "Email" ), email );
        // Type password
        typeText ( By.name ( "Password" ), "Test1234" );
        clickonElement ( By.xpath ( "//button[contains(@class,'login-button')]" ) );

    }
}
