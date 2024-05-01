package org.example;

import org.openqa.selenium.By;

import static org.example.Utils.clickonElement;
import static org.example.Utils.typeText;

public class ProductReferingToFriend {
    public void referProductToFriend() {
        // Click on product to refer
        clickonElement ( By.xpath ( "//img[@title='Show details for Apple MacBook Pro 13-inch']" ) );
        //Click on email friend
        clickonElement ( By.xpath ( "//button[normalize-space()='Email a friend']" ) );
        //Entre the friend email
        typeText ( By.xpath ( "//input[@id='FriendEmail']" ), "ddss@gmail.com" );
        //Click on send email button
        clickonElement ( By.xpath ( "//button[normalize-space()='Send email']" ) );

    }
}
