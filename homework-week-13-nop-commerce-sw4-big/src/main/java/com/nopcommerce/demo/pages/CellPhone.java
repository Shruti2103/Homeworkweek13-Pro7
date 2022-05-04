package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CellPhone extends Utility {

    By cellphonevarify= By.xpath("//h1[contains(text(),'Cell phones')]");
    By listviewgridclick=By.xpath("//a[@data-viewmode='list']");
    By nokiaLumbiaclick= By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/h2[1]/a[1]");



     public String varifycellphoneText(){
         return getTextFromElement(cellphonevarify);
     }
     public void clicklistgrid(){
         clickOnElement(listviewgridclick);
     }
      public void clicknokiaLumbia(){
         clickOnElement(nokiaLumbiaclick);
      }

}

