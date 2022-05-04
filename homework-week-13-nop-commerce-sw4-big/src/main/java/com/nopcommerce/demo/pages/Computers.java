package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Computers extends Utility {

    By pageHeader= By.xpath("//h1[text()='Computers']");
    By desktop= By.xpath("//li[@class='inactive']//a[contains(text(),'Desktops ')]");
    By computerClick=By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    By desktopClick=By.xpath("//li[@class='inactive']//a[contains(text(),'Desktops ')]");

      // varify the page for varification
     public String getPageheader(){
          return getTextFromElement(pageHeader);
     }

     public void getcomputerClick(){
         clickOnElement(computerClick);
     }
     public void getDesktopClick(){
         clickOnElement(desktopClick);
     }



}
