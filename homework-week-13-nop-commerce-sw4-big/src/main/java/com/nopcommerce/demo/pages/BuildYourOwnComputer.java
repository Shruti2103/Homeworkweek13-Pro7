package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utility {
    By varifybuildyourownComputer =By.xpath("//h1[contains(text(),'Build your own computer')]");
    By selectGHZIntel=By.xpath("//select[@id='product_attribute_1']");
    By select8GB=By.xpath("//select[@id='product_attribute_2']");
    By selectHDDradio=By.xpath("//input[@id='product_attribute_3_7']");
    By selectOSradio= By.xpath("//input[@id='product_attribute_4_9']");
    By selectMicrosoftOffice= By.xpath("//input[@id='product_attribute_5_10']");
    By totalCommander=By.xpath("//input[@id='product_attribute_5_12']");
    By varifyPrice=By.xpath("//span[@id='price-value-1']");
    By addtocartClick=By.xpath("//button[@id='add-to-cart-button-1']");
    By varifyproductaddedtoCart= By.xpath("//p[text()='The product has been added to your ']");
    By clickcrossButton=By.xpath("//span[@class='close']");
    By mousehooverShoppingCart=By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart=By.xpath("//button[@class='button-1 cart-button']");
    By varifyShoppingCart=By.xpath("//h1[contains(text(),'Shopping cart')]");




     public String builYourOwnComputer(){
        return getTextFromElement(varifybuildyourownComputer) ;

     }
     public void  setgHLIntelclick(String text){
        selectByVisibleTextFromDropDown(selectGHZIntel,text);
     }
     public void setgb8click(String text){
        selectByVisibleTextFromDropDown(select8GB,text);
     }
     public void hddRadioclick(){
        clickOnElement(selectHDDradio);
     }

      public void osRadioClick(){
         clickOnElement(selectOSradio);
      }
//-------------------------------------------------
      public void setSelectMicrosoftOffice(){
         clickOnElement(selectMicrosoftOffice);
      }

      public void setTotalCommander(){
         clickOnElement(totalCommander);
      }

      public String setvarifyPrice(){
         return getTextFromElement(varifyPrice);
      }
      public void setAddtocartClick(){
         clickOnElement(addtocartClick);
      }

      public String setvarifyproductaddedtocart(){
         return getTextFromElement(varifyproductaddedtoCart);
      }
      public void crossButtonclick(){
         clickOnElement(clickcrossButton);
      }

      public void setMousehooverShoppingCart(){
         mouseHoverToElement(mousehooverShoppingCart);
      }
      public void setGotoCart(){
         clickOnElement(goToCart);
      }
      public String shoppingCartVarrify(String text){
         return getTextFromElement(varifyShoppingCart);
      }








}
