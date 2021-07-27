package com.telran.demoqa.tests.bookstoretests;

import com.telran.demoqa.pages.BooksPage;
import com.telran.demoqa.pages.HomePage;
import com.telran.demoqa.tests.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class SearchBookTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        new HomePage(driver).clickAvatarIcon();
    }

    @Test
    public void searchBookPositiveTest() throws IOException {
        String text = "Git";
        new BooksPage(driver).typeInSearchFieldInput(text).takeNameOfBook();
        Assert.assertTrue(new BooksPage(driver).takeNameOfBook().contains(text));
        new BooksPage(driver).takeScreenshotField(driver.findElement(By.xpath("//span[@class='mr-2']/a")));

    }

    @Test
    public void verifyEmptyFieldTest() {
        new BooksPage(driver).typeInSearchFieldInput("  ").verifyEmptyField();
        Assert.assertTrue(new BooksPage(driver).verifyEmptyField().contains(""));
    }
}
