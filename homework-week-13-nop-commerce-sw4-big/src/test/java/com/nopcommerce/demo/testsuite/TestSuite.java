package com.nopcommerce.demo.testsuite;

import com.google.common.base.Verify;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.pages.Desktop;
import com.nopcommerce.demo.testbase.TestBase;
import com.nopcommerce.demo.utility.Utility;
import org.junit.runner.Computer;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class TestSuite extends TestBase {
    HomePage homepage = new HomePage();
    Desktop desktop = new Desktop();
    Computers computers = new Computers();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    ShoppingCart shoppingCart = new ShoppingCart();
    WelcomeSignIn welcomeSignIn = new WelcomeSignIn();
    Checkout checkout = new Checkout();
    ThankYou thankYou = new ThankYou();
    WelcomeStore welcomeStore = new WelcomeStore();


    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        computers.getcomputerClick();
        computers.getDesktopClick();
        desktop.setSortByAToZ();
        desktop.setaddtoCart();
        Thread.sleep(2000);
        String expectedMessage = "Build your own computer";
        String actualMessage = buildYourOwnComputer.builYourOwnComputer();
        Assert.assertEquals(actualMessage, expectedMessage, "not on build your ownComputer");
        buildYourOwnComputer.setgHLIntelclick("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputer.setgb8click("8GB [+$60.00]");
        buildYourOwnComputer.hddRadioclick();
        buildYourOwnComputer.osRadioClick();
        //-------------------------------------------------Run till here

        buildYourOwnComputer.setTotalCommander();
        String expectedText = "$1,470.00";
        String actualText = buildYourOwnComputer.setvarifyPrice();
        Assert.assertEquals(actualText, expectedText, "Total price not matching");// This assert method is not working
        Thread.sleep(2000);
        shoppingCart.clearQuantity1();
        shoppingCart.addQuantity("2");
        shoppingCart.clickShoppingCart();
        String expectedPrice = "$2,950.00";
        String actualPrice = shoppingCart.varifyTotalPrice();
        Assert.assertEquals(actualPrice, expectedPrice, "Price Not matching");
        shoppingCart.serviceagreeset();
        shoppingCart.clickCheckout();
        welcomeSignIn.checkoutClick();
        Thread.sleep(2000);
        checkout.setFirstNmae("Jalpa");
        checkout.setLastName("Nakrani");
        checkout.setEmailField("jalpaNakrani@gmail.com");
        checkout.setCountryField("UnitedKingdom");
        checkout.setcityName("London");
        checkout.addressdetail("12, B");
        checkout.setPostalCode("Ha1 7lz");
        checkout.phoneNumberDetail("07252568945");
        checkout.setContinueClick();
        checkout.setCreditCardHolderName("Jalpa Nakrani");
        checkout.setCreditCardNumber("5555555555554444");
        checkout.setExpiryMonth("04");
        checkout.setExpiryyear("2025");
        checkout.setbackCreditCardNumber("420");
        checkout.setContinue();
        Thread.sleep(3000);
        String expectedMsg4 = "Credit Card";
        String actualMsg4 = checkout.paymentMethodvarify();
        Assert.assertEquals(expectedMsg4, actualMsg4, "Not navigate to shopping cart page");
        String expectedMsg5 = "Next Day Air";
        String actualMg5 = checkout.shippingMethodVarify();
        Assert.assertEquals(actualMg5, expectedMsg5, "Not navigate to shopping cart page");
        String expectedMsg6 = "$2,950.00";
        String actualMs6 = checkout.totalPriceVarify();
        Assert.assertEquals(actualMs6, expectedMsg6, "Not navigate to shopping cart page");
        checkout.confirmclick();
        Thread.sleep(2000);
        String expectedMsg7 = "Thank you";
        String actualMsg7 = thankYou.thabkyouVarify();
        Assert.assertEquals(actualMsg7, expectedMsg7, "Not navigate to shopping cart page");
        String expectedMsg8 = "Your order has been successfully processed!";
        String actualMsg8 = thankYou.setfolderVarify();
        thankYou.setClickContinue();
        welcomeSignIn.checkoutClick();
        String expectedMsg9 = "Welcome to our store";
        String actualMsg9 = welcomeStore.setvarrifywelcomeStore();
        Assert.assertEquals(actualMsg9, expectedMsg9, "Not navigate to shopping cart page");


    }


}



