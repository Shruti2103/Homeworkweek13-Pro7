package com.nopcommerce.demo.pages;

import com.google.common.base.Verify;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCart extends Utility {
//    2.16 Change the Qty to "2" and Click on "Update shopping cart"
//	2.17 Verify the Total"$2,950.00"
//	2.18 click on checkbox “I agree with the terms of service”
//	2.19 Click on “CHECKOUT”
//	2.20 Verify the Text “Welcome, Please Sign In!”

    By changequantity = By.xpath("//input[@class='qty-input']");
    By quantitychange = By.xpath("//input[@class='qty-input']");
    By updateShoppingCart = By.xpath("//button[@id='updatecart']");
    By totalPriceVarify = By.xpath("//td[@class='subtotal']");
    By serviceAgree = By.xpath("//input[@id='termsofservice']");
    By checkOutClick = By.xpath("//button[@id='checkout']");
    //_----------------------------------------------------------------
    //Electronics test steps for leading to register user
    By varifyregistrationcomplete = By.xpath("");
    By clickcontinue = By.xpath("//div[text()='Your registration completed']");
    By varifyshoppingcart = By.xpath("//h1[text()='Shopping cart']");
    By clicktermsofServiceagree = By.xpath("//input[@name='termsofservice']");



    public void clearQuantity1() {
        clearElementFromField(changequantity);

    }

    public void addQuantity(String numbers) {
        sendTextToElement(quantitychange, numbers);
    }


    public void clickShoppingCart() {
        clickOnElement(updateShoppingCart);
    }

    public String varifyTotalPrice() {
        return getTextFromElement(totalPriceVarify);
    }

    public void serviceagreeset() {
        clickOnElement(serviceAgree);
    }

    public void clickCheckout() {
        clickOnElement(checkOutClick);
    }


//  Electronics test requirement
//2.22 Verify the message “Your registration completed”
//        2.23 Click on “CONTINUE” tab
//        2.24 Verify the text “Shopping cart”
//        2.25 click on checkbox “I agree with the terms of service”
//        2.26 Click on “CHECKOUT”

    public String completeregistrationvarify() {
        return getTextFromElement(varifyregistrationcomplete);
    }

    public void continueclick() {
        clickOnElement(clickcontinue);
    }

    public String shoppingcartVarify() {
        return getTextFromElement(varifyshoppingcart);
    }

    public void customerserviceclick() {
        clickOnElement(clicktermsofServiceagree);
    }


}