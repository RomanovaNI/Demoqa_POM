package com.telran.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h5[contains(.,'Book Store Application')]")
    WebElement BookStoreApp;

    public BooksPage clickAvatarIcon(){
        clickWithAction(BookStoreApp,0,700);
        clickOnElement(BookStoreApp);

        return new BooksPage(driver);
    }

    //avatar mx-auto white
    //login
}
