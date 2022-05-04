package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class NokiaLumia extends Utility {
    By nokiatextvarify= By.xpath("//h1[text()='Nokia Lumia 1020']");
    By pricevarify= By.xpath("//div[@class='product-price']//span[text()=' $349.00 ']");
    By clearQTY= By.xpath("//input[@aria-label='Enter a quantity']");
    By qty2= By.xpath("//input[@aria-label='Enter a quantity']");
    By clickaddtoCart= By.xpath("//button[@id='add-to-cart-button-20']");
    By varifyproductadded= By.xpath("//p[text()='The product has been added to your ']");
    By clickgreenBtn= By.xpath("//span[@class='close']");
    By mousehoovertoshoppingcart= By.xpath("//span[@class='cart-label']");
    By clickGoToCart= By.xpath("//button[@class='button-1 cart-button']");

    public String varifyNokia(){
        return getTextFromElement(nokiatextvarify);
    }
    public String varifyprice(){
        return getTextFromElement(pricevarify);
    }
    public void quantityclear(){
        clearElementFromField(clearQTY);
    }
     public void setquantity2(String number){
        sendTextToElement(qty2,number);
     }
    public void goToCartClick(){
       clickOnElement(clickaddtoCart);
    }

    public String productaddedvarify(){
        return getTextFromElement(varifyproductadded);
    }
    public void setClicgreenbutton(){
        clickOnElement(clickgreenBtn);
    }
     public void shoppingcartMouseHoover(){
        mouseHoverToElement(mousehoovertoshoppingcart);
     }
    public void setClickaddtoCart(){
        clickOnElement(clickGoToCart);
    }



    //
//        2.8 Change quantity to 2
//        2.9 Click on “ADD TO CART” tab
//        2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
//        After that close the bar clicking on the cross button.
//        2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.















}
