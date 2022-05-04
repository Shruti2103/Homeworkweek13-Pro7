package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class WelcomeStore extends Utility {

    By varifywelcometoStore= By.xpath("//h2[text()='Welcome to our store']");

    public String setvarrifywelcomeStore(){
        return getTextFromElement(varifywelcometoStore);
    }

     By logoutClick =By.xpath("//a[text()='Log out']");
       public void clicktologout(){
           clickOnElement(logoutClick);
       }



}
