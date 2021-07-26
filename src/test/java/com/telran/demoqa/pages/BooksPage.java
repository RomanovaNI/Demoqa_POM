package com.telran.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends PageBase {
    public BooksPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "login")
    WebElement login;

    public LoginPage clickloginBtn(){
        clickOnElement(login);
        return new LoginPage(driver);
    }
}


