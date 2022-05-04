package com.nopcommerce.demo.testsuite;

import com.google.common.base.Verify;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {
    Electronics electronics=new Electronics();
    CellPhone cellPhone=new CellPhone();
    NokiaLumia nokiaLumia=new NokiaLumia();
    ElectronicsShoppingCart electronicsShoppingCart=new ElectronicsShoppingCart();
    ShoppingCart shoppingCart=new ShoppingCart();
    WelcomeSignIn welcomeSignIn=new WelcomeSignIn();
    Register register=new Register();
    Checkout checkout=new Checkout();
    ThankYou thankYou=new ThankYou();
    WelcomeStore welcomeStore=new WelcomeStore();
    HomePage homePage=new HomePage();

    @Test
    public void textverrified(){
     electronics.setelectronicsmousehoover();
     electronics.setCellPhoneMouseHoover();
     electronics.setCellPhoneClick();




    }
     @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()throws InterruptedException{


         String expectedMessage = "Cell phones";
         String actualMessage=  cellPhone.varifycellphoneText();
         Assert.assertEquals(actualMessage,expectedMessage,"Not navigate to page");
         electronics.setelectronicsmousehoover();
         electronics.setCellPhoneMouseHoover();
         electronics.setCellPhoneClick();
         String expectedMessage1 = "Cell phones";
         String actualMessage1=  cellPhone.varifycellphoneText();
         Assert.assertEquals(actualMessage1,expectedMessage1,"Not navigate to page");
         cellPhone.clicklistgrid();
         cellPhone.clicknokiaLumbia();
         Thread.sleep(3000);
         Assert.assertEquals(nokiaLumia.varifyNokia(),"Nokia Lumia 1020","Not navigate to page");
         Assert.assertEquals(nokiaLumia.varifyprice(),"$349.00","Not navigate to page");
         nokiaLumia.quantityclear();
         nokiaLumia.setquantity2("2");
         nokiaLumia.goToCartClick();
        Assert.assertEquals(nokiaLumia.productaddedvarify(),"The product has been added to your shopping cart","Not navigate to page");
        nokiaLumia.setClicgreenbutton();
        nokiaLumia.shoppingcartMouseHoover();
        nokiaLumia.setClickaddtoCart();
        Thread.sleep(1000);
        Assert.assertEquals(electronicsShoppingCart.shoppingCartVarrify(),"Shopping cart","Not navigate to page");
        Assert.assertEquals(electronicsShoppingCart.quantityVarrify(),"2","Not navigate to page");
        Assert.assertEquals(electronicsShoppingCart.totalVarrify(),"$698.00","Not navigate to page");
        electronicsShoppingCart.conditionagreeterms();
        electronicsShoppingCart.setCheckoutclickout();
//---------------------------------2.17-------Verrify the text welcome signin
       Thread.sleep(1000);
      Assert.assertEquals(welcomeSignIn.welcomesignvarrify(),"Welcome, Please Sign In!","Not navigate to page");
       welcomeSignIn.clickonRegisterBtn();
       Assert.assertEquals(register.verifyRegisterText(),"Register","Not navigate to page");
        register.enterFirstName("Jalpa");
        register.enterLastName("Nakrani");
         register.enterEmail("jalpanakrani@gmail.com");
        register.enterPassword("prime123");
        register.enterConfirmPW("prime123");
        register.clickOnRegisterBtn();// 2.21
         Thread.sleep(2000);
    Assert.assertEquals(shoppingCart.completeregistrationvarify(),"Your registration completed","Not navigate to page");
         shoppingCart.continueclick();
         Assert.assertEquals(shoppingCart.shoppingcartVarify(),"Shopping cart","Not navigate to page");
         shoppingCart.customerserviceclick();
         shoppingCart.clickCheckout();
         // checkout page for electronics starts
        //  Requirements for checkoutpage for electronics
//         2.27 Fill the Mandatory fields
//         2.28 Click on “CONTINUE”
//         2.29 Click on Radio Button “2nd Day Air ($0.00)”
//         2.30 Click on “CONTINUE”
//         2.31 Select Radio Button “Credit Card”
//         2.32 Select “Visa” From Select credit card dropdown
//         2.33 Fill all the details
//         2.34 Click on “CONTINUE”CHECKOUT”
//
//
//         2.35 Verify “Payment Method” is “Credit Card”
//         2.36 Verify “Shipping Method” is “2nd Day Air”
//         2.37 Verify Total is “$698.00”
//         2.38 Click on “CONFIRM”
//         2.39 Verify the Text “Thank You”
//         2.40 Verify the message “Your order has been successfully processed!”
//         2.41 Click on “CONTINUE”
            checkout.setFirstNmae("Jalpa");
            checkout.setLastName("Nakrani");
            checkout.setEmailField("jalpanakrani@gmail.com");
            checkout.setCountryField("United Kingdom");
            checkout.setcityName("London");
            checkout.addressdetail("16,lyon road");
            checkout.setPostalCode("ha1 3er");
            checkout.phoneNumberDetail("07458525489");
            checkout.setContinueClick();
            Thread.sleep(2000);
            checkout.secondairbuttonselect();
           checkout.aftersecondairbuttonContinueclick();
           checkout.creditcardbuttonclick();
          checkout.continueaftercredicardselection();
          checkout.visacardselectFromDroppdown("visa");
           Thread.sleep(1000);
           // credit card detail
         checkout.setCreditCardHolderName("Jalpa Nakrani");
         checkout.setCreditCardNumber("5555555555554444");
         checkout.setExpiryMonth("04");
         checkout.setExpiryyear("2025");
         checkout.setbackCreditCardNumber("420");
         checkout.setContinue();
         // varify detail
         String expectedMsg4 = "Credit Card";
         String actualMsg4 = checkout.paymentMethodvarify();
         Assert.assertEquals(expectedMsg4, actualMsg4, "Not navigate to shopping cart page");
         String expectedMsg5 = "Next Day Air";
         String actualMg5 = checkout.shippingMethodVarify();
         Assert.assertEquals(actualMg5, expectedMsg5, "Not navigate to shopping cart page");
      Assert.assertEquals(checkout.pricevarifyforelectronics(),"$698.00","Not navigate to shopping cart page");
         checkout.confirmclick();
          Assert.assertEquals(thankYou.thabkyouVarify(),"Thank you","Not navigate to shopping cart page");
          Assert.assertEquals(thankYou.setfolderVarify(),"Your order has been successfully processed!","Not navigate to shopping cart page");
          thankYou.setClickContinue();
          welcomeStore.setvarrifywelcomeStore();
          welcomeStore.clicktologout();
          Assert.assertEquals(homePage.urlvarify(),"https://demo.nopcommerce.com/","Not navigate to shopping cart page");
















         //------------------------------------------------

     }







}












