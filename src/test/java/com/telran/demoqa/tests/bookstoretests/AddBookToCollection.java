package com.telran.demoqa.tests.bookstoretests;

import com.telran.demoqa.pages.BooksPage;
import com.telran.demoqa.pages.HomePage;
import com.telran.demoqa.pages.LoginPage;
import com.telran.demoqa.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddBookToCollection extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        new HomePage(driver).clickAvatarIcon();
        new BooksPage(driver).clickloginBtn();
        new LoginPage(driver).login("Natalia", "Natalia123%");

    }

    @Test
    public void addBookToCollectionTest (){
        String text = "Git";
        new BooksPage(driver).typeInSearchFieldInput(text).clickByFirstBook()
                .addToYourCollection().clickOnProfileButton();

        Assert.assertTrue(new BooksPage(driver).takeNameOfBook().contains(text));
    }
}


//addNewRecordButton