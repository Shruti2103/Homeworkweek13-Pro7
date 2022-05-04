package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import javafx.scene.control.Tab;
import org.openqa.selenium.By;

public class WelcomeSignIn extends Utility {
//   2.21Click on “CHECKOUT AS GUEST” Tab

    // For electronics varrify text and click on register button
      By varifywelcome= By.xpath("//h1[text()='Welcome, Please Sign In!']");
    By registerLink = By.xpath("//button[contains(text(),'Register')]");
    By clickCheckout= By.xpath("//button[@class='button-1 checkout-as-guest-button']");

   public void checkoutClick(){
      clickOnElement(clickCheckout);
   }

      public String welcomesignvarrify(){
       return getTextFromElement(varifywelcome);
      }

      public void clickonRegisterBtn(){
       clickOnElement(registerLink);
      }







}
