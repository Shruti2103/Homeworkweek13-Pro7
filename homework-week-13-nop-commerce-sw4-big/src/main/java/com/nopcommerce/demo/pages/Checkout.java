package com.nopcommerce.demo.pages;

import com.google.common.base.Verify;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Checkout extends Utility {

    // For Electronics using checkpot details here are requirement for Electronics
//    2.27 Fill the Mandatory fields
//	2.28 Click on “CONTINUE”
//            2.29 Click on Radio Button “2nd Day Air ($0.00)”
//            2.30 Click on “CONTINUE”
//            2.31 Select Radio Button “Credit Card”
//            2.32 Select “Visa” From Select credit card dropdown
//2.33 Fill all the details
//2.34 Click on “CONTINUE”CHECKOUT”
//
//
//            2.35 Verify “Payment Method” is “Credit Card”
//            2.36 Verify “Shipping Method” is “2nd Day Air”
//            2.37 Verify Total is “$698.00”
//            2.38 Click on “CONFIRM”
//            2.39 Verify the Text “Thank You”
//            2.40 Verify the message “Your order has been successfully processed!”
//            2.41 Click on “CONTINUE”


    By firstNmae = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By emailField = By.xpath("//input[@id='BillingNewAddress_Email']");
    By countryField = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By cityName = By.xpath("//input[@id='BillingNewAddress_City']");
    By address = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueClick = By.xpath("//div[@id='billing-buttons-container']//button[@class='button-1 new-address-next-step-button']");
    By nextDayAir = By.xpath("//input[@value='Next Day Air___Shipping.FixedByWeightByTotal']");
    By clickcontinue = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By radioButton = By.xpath("//input[@value='Payments.Manual']");
    By clickcreditcard = By.xpath("//button[@onclick='PaymentMethod.save()']");
    By masterCard = By.xpath("//select[@id='CreditCardType']\"), \"Master card");
    By namecreditcardholder = By.xpath("//input[@id='CardholderName']");
    By creditCardNumber = By.xpath("//input[@id='CardNumber']");
    By expiryMonth = By.xpath("//select[@id='ExpireMonth']");
    By expiryyear = By.xpath("//select[@id='ExpireYear']");
    By backCardNumber = By.xpath("//input[@id='CardCode']");
    By continuecredit = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By varifyPaymentMethod = By.xpath("//span[contains(text(),'Credit Card')]");
    By varifyShippingMethod = By.xpath("//li[@class='shipping-method']//span[contains(text(),'Next Day Air')]");
    By varifyTotalPrice = By.xpath("//td[@class='cart-total-right']//span[@class='value-summary']//strong");
    By clickConfirm = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
//--------------------------Electronics 2 requirements are as follows
    //   2.29 Click on Radio Button “2nd Day Air ($0.00)”
//            2.30 Click on “CONTINUE”
//            2.31 Select Radio Button “Credit Card”
//            2.32 Select “Visa” From Select credit card dropdown

    By secondddayAirBtn = By.xpath("//input[@value='2nd Day Air___Shipping.FixedByWeightByTotal']");
    By continueafterseconddayairbutton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    By creditcardbutton = By.xpath("//input[@value='Payments.Manual']");
    By continueaftercreditcardselection = By.xpath("//button[@onclick='PaymentMethod.save()']");
    By visaCard = By.xpath("//select[@id='CreditCardType']");
    By varifytotal= By.xpath("//td[@class='cart-total-right']//span[@class='value-summary']//strong");

    public String pricevarifyforelectronics(){
        return getTextFromElement(varifytotal);
    }

    public void secondairbuttonselect() {
        clickOnElement(secondddayAirBtn);
    }

    public void aftersecondairbuttonContinueclick() {
        clickOnElement(continueafterseconddayairbutton);

    }

    public void creditcardbuttonclick() {
        clickOnElement(creditcardbutton);
    }

    public void continueaftercredicardselection() {
        clickOnElement(continueaftercreditcardselection);
    }

    public void visacardselectFromDroppdown(String name) {
        selectByVisibleTextFromDropDown(visaCard, name);
    }

//----------------------------------------------------------------------------------------

    public void setFirstNmae(String name) {
        sendTextToElement(firstNmae, name);
    }

    public void setLastName(String name) {
        sendTextToElement(lastName, name);
    }

    public void setEmailField(String email) {
        sendTextToElement(emailField, email);
    }

    public void setCountryField(String countryName) {
        selectByVisibleTextFromDropDown(countryField, countryName);
    }

    public void setcityName(String city) {
        sendTextToElement(cityName, city);
    }

    public void addressdetail(String addressdetails) {
        sendTextToElement(address, addressdetails);
    }

    public void setPostalCode(String postcode) {
        sendTextToElement(postalCode, postcode);
    }

    public void phoneNumberDetail(String phone) {
        sendTextToElement(phoneNumber, phone);
    }

    public void setContinueClick() {
        clickOnElement(continueClick);
    }


    //------------------------------------------------
    public void setCreditCardHolderName(String name) {
        sendTextToElement(namecreditcardholder, name);
    }

    public void setCreditCardNumber(String number) {
        sendTextToElement(creditCardNumber, number);
    }

    public void setExpiryMonth(String month) {
        selectByVisibleTextFromDropDown(expiryMonth, month);
    }

    public void setExpiryyear(String year) {
        selectByVisibleTextFromDropDown(expiryyear, year);
    }

    public void setbackCreditCardNumber(String number) {
        sendTextToElement(backCardNumber, number);
    }

    public void setContinue() {
        clickOnElement(continuecredit);
    }

    public String paymentMethodvarify() {
        return getTextFromElement(varifyPaymentMethod);
    }

    public String shippingMethodVarify() {
        return getTextFromElement(varifyShippingMethod);
    }

    public String totalPriceVarify() {
        return getTextFromElement(varifyTotalPrice);
    }

    public void confirmclick() {
        clickOnElement(clickConfirm);
    }


}
