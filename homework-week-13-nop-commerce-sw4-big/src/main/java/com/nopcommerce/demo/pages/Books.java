package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Books extends Utility {
    By pageHeader= By.xpath("//h1[text()='Books']");
    // varify the page for varification
    public String getPageheader(){
        return getTextFromElement(pageHeader);
    }






}
