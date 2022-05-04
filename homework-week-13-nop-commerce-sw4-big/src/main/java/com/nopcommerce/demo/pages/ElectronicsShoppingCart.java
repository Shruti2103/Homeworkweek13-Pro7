package com.nopcommerce.demo.pages;

import com.google.common.base.Verify;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsShoppingCart extends Utility {
     By varifyshoppingcart= By.xpath("//h1[text()='Shopping cart']");
     By varifyQty= By.xpath("//input[@class='qty-input']");
     By varifytotal= By.xpath("//span//strong[text()='$698.00']");
     By agreecondition =By.xpath("//input[@name='termsofservice']");
     By checkoutclickout= By.xpath("//h1[text()='Welcome, Please Sign In!']");

      public String shoppingCartVarrify(){
          return getTextFromElement(varifyshoppingcart);
      }
    public String quantityVarrify(){
        return getTextFromElement(varifyQty);
    }
    public String totalVarrify(){
        return getTextFromElement(varifytotal);
    }
    public void conditionagreeterms(){
        clickOnElement(agreecondition);
    }
    public void setCheckoutclickout(){
          clickOnElement(checkoutclickout);
    }



//2.12 Verify the message "Shopping cart"
//            2.13 Verify the quantity is 2
//            2.14 Verify the Total $698.00
//            2.15 click on checkbox “I agree with the terms of service”
//            2.16 Click on checkout
    //--------------------------------------
//“2.17 Verify the Text “Welcome, Please Sign In!”
//            2.18 Click on “REGISTER” tab






}
