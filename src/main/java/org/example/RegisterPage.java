package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends Utils {
    static LoadProp loadProp = new LoadProp ();

    // enter user Details
    public static   String email = loadProp.getProperty ( "email1" ) + randomDate () + loadProp.getProperty ( "email2" );


    public void enterRegistrationdetails() {

        //click on register button
        typeText ( By.id ( "FirstName" ), loadProp.getProperty ( "firstname" ) );
        //type lastname
        typeText ( By.id ( "LastName" ), loadProp.getProperty ( "secondname" ) );
        // Enter Date of birth
        Select dayDropdown = new Select ( driver.findElement ( By.name ( "DateOfBirthDay" ) ) );
        dayDropdown.selectByVisibleText ( "7" );
        // for my Ref
        //selectbyVisibleText ( By.name ("DateOfBirthDay"  ), "7");
        Select monthDropdown = new Select ( driver.findElement ( By.name ( "DateOfBirthMonth" ) ) );
        monthDropdown.selectByVisibleText ( "September" );
        //selectbyVisibleText ( By.name ( "DateOfBirthMonth" ), "September");
        Select yeardropdown = new Select ( driver.findElement ( By.name ( "DateOfBirthYear" ) ) );
        yeardropdown.selectByVisibleText ( "1990" );
        //selectbyVisibleText (By.name ( "DateOfBirthYear" ),"1990");
        //Email Id
        typeText ( By.id ( "Email" ), email );
        // Type password
        typeText ( By.name ( "Password" ), "Test1234" );
        // type Confirmpassword
        typeText ( By.name ( "ConfirmPassword" ), "Test1234" );

        clickonElement ( By.id ( "register-button" ) );


    }




}
