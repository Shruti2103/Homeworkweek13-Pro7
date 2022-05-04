package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ThankYou extends Utility {
    By varifyThankyou = By.xpath("//h1[text()='Thank you']");
    By varifyorder = By.xpath("//strong[text()='Your order has been successfully processed!']");
    By clickContinue = By.xpath("//button[@class='button-1 order-completed-continue-button']");

    public String thabkyouVarify() {
        return getTextFromElement(varifyThankyou);
    }

    public String setfolderVarify() {
        return getTextFromElement(varifyorder);
    }

    public void setClickContinue() {
        clickOnElement(clickContinue);
    }


}
