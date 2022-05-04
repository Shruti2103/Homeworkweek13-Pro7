package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Desktop extends Utility {
  //  By priceOrder=By.xpath("");
//    By sortByLowtoHigh=By.xpath("");
 //   By clickBuildonyourComputer=By.xpath("");
      By pageHeader= By.xpath("//li[@class='inactive']//a[contains(text(),'Desktops ')]");
 //   By iteamTitle= By.xpath("");

      By sortByAToZ= By.xpath("//select[@id='products-orderby']");
      By addcart=By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");





    // varify the page for varification
    public String getPageheader(){
        return getTextFromElement(pageHeader);
    }
     public void setSortByAToZ(){
       clickOnElement(sortByAToZ);
     }
     public void setaddtoCart(){
        clickOnElement(addcart);
     }








}
