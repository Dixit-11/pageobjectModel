package org.example;

import net.bytebuddy.build.Plugin;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homepage = new HomePage ();
    RegisterPage registerPage = new RegisterPage ();
    RegisterResultPage regiterResultPage = new RegisterResultPage ();
    LoginPage loginPage = new LoginPage ();
    ProductReferingToFriend productReferingToFriend = new ProductReferingToFriend ();
    BuildyourOwnComputer buildYourOwnComputer = new BuildyourOwnComputer ();
    AddProductintoCartResult addProductIntoCartResult = new AddProductintoCartResult ();

    @Test(priority = 1)
    //Register page
    public void verifyUserShouldRegisterSuccessfully() {
        // click on register button
        homepage.ClickonRegisterButton ();
        // Enter Registration details
        registerPage.enterRegistrationdetails ();
        // verify user register Successfully
        regiterResultPage.EnterRegitrationisSuccessfull ();
    }

    @Test(priority = 2)
    //click on Login page
    public void verifyUserShouldLoginSuccessfully() {

        homepage.ClickonLoginPage ();
        loginPage.EnterYourLoginDetails ();
    }

    @Test(priority = 3)
    //Refer a Product to Friend
    public void verifyRegisterusershouldReferAProduct() {
        productReferingToFriend.referProductToFriend ();
    }

    @Test(priority = 4)
    //Build own Computer
    public void UserShoulbeableToBuildOwnComputer() {
        buildYourOwnComputer.buildAComputer ();

    }

    @Test(priority = 5)
    // Add to cart Message should be appear
    public void verifyUserShoulseeAddtocartMessage() {
        addProductIntoCartResult.VerifyProductNameAsYouAddProductInToCart ();

    }


}
