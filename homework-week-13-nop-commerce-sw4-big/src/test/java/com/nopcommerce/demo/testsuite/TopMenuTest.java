package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TopMenuTest extends TestBase {
    HomePage homepage = new HomePage();
    Computers computers = new Computers();
    Electronics electronics = new Electronics();
    Jewelry jewelry = new Jewelry();
    Books books = new Books();
    GiftCards giftCards = new GiftCards();
    DigitalDownload digitalDownload = new DigitalDownload();
    Appreal appreal = new Appreal();

    @Test//1.3
    public void verifyPageNavigation() {



        homepage.selectMenu("Computers");
        Assert.assertEquals(computers.getPageheader(), "Computers", "Not on Correct Page");

        homepage.selectMenu("Electronics");
        Assert.assertEquals(electronics.getPageheader(), "Electronics", "Not on Correct Page");

        homepage.selectMenu("Apparel");
        Assert.assertEquals(appreal.getPageheader(), "Apparel", "Not on Correct Page");

        homepage.selectMenu("Digital downloads");
        Assert.assertEquals(digitalDownload.getPageheader(), "Digital downloads", "Not on Correct Page");

        homepage.selectMenu("Books");
        Assert.assertEquals(books.getPageheader(), "Books", "Not on Correct Page");

        homepage.selectMenu("Jewelry");
        Assert.assertEquals(jewelry.getPageheader(), "Jewelry", "Not on Correct Page");

        homepage.selectMenu("Gift Cards");
        Assert.assertEquals(giftCards.getPageheader(), "Gift Cards", "Not on Correct Page");


    }


}



