package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Electronics extends Utility {
    By pageHeader= By.xpath("//h1[text()='Electronics']");
    By electronicsmouseHoover= By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']");
    By cellPhoneMouseHoover=By.xpath("//ul[@class='top-menu notmobile']//a[text()='Cell phones ']");
    By cellPhoneClick= By.xpath("//ul[@class='top-menu notmobile']//a[text()='Cell phones ']");



    // varify the page for varification
    public String getPageheader(){
        return getTextFromElement(pageHeader);
    }

    public void setelectronicsmousehoover(){
        mouseHoverToElement(electronicsmouseHoover);
    }

    public void setCellPhoneMouseHoover(){
        mouseHoverToElement(cellPhoneMouseHoover);
    }
     public void setCellPhoneClick(){
        clickOnElement(cellPhoneClick);
     }



}
//1.	Test name text verified()
//        1.1 Mouse Hover on “Electronics” Tab
//        1.2 Mouse Hover on “Cell phones” and click
//        1.3 Verify the text “Cell phones”
//        2.	Test name verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()
//        2.1 Mouse Hover on “Electronics” Tab
//        2.2 Mouse Hover on “Cell phones” and click
//        2.3 Verify the text “Cell phones”
//        2.4 Click on List View Tab
//        2.5 Click on product name “Nokia Lumia 1020” link
